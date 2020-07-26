/*
 * Snippets API
 * Test description
 *
 * The version of the OpenAPI document: v1
 * Contact: contact@snippets.local
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pmp.sdk.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.threetenbp.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.threetenbp.ser.InstantSerializer;
import com.fasterxml.jackson.datatype.threetenbp.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.threetenbp.ser.ZonedDateTimeSerializer;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class RestObjectMapper {

    public static ObjectMapper serializingObjectMapper()
    {
        ObjectMapper objectMapper = new ObjectMapper();

        LocalDateTimeSerializer localDateTimeSerializer = new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS[xxx]"));
        LocalDateTimeDeserializer localDateTimeDeserializer = new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS[xxx]"));
        ZonedDateTimeSerializer zonedDateTimeSerializer = new ZonedDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS[xxx]"));
        OffsetDateTimeSerializer offsetDateTimeSerializer = new OffsetDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS[xxx]"));
        OffsetDateTimeDeserializer offsetDateTimeDeserializer = new OffsetDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS[xxx]"));

        JavaTimeModule javaTimeModule = new JavaTimeModule();

        javaTimeModule.addSerializer(OffsetDateTime.class, offsetDateTimeSerializer);
        javaTimeModule.addSerializer(ZonedDateTime.class, zonedDateTimeSerializer);
        javaTimeModule.addSerializer(LocalDateTime.class, localDateTimeSerializer);
        javaTimeModule.addDeserializer(OffsetDateTime.class, offsetDateTimeDeserializer);
        javaTimeModule.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        javaTimeModule.addSerializer(Instant.class, InstantSerializer.INSTANCE);

        objectMapper.registerModule(javaTimeModule);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
        objectMapper.enable(SerializationFeature.WRITE_DATES_WITH_ZONE_ID);

        return objectMapper;
    }

}