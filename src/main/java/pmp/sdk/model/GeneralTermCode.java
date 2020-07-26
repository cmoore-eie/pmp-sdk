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


package pmp.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * GeneralTermCode
 */
@JsonPropertyOrder({
  GeneralTermCode.JSON_PROPERTY_ITEM_IDENTIFIER,
  GeneralTermCode.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  GeneralTermCode.JSON_PROPERTY_CODE,
  GeneralTermCode.JSON_PROPERTY_EXTERNAL_REFERENCE,
  GeneralTermCode.JSON_PROPERTY_PROCESS_ORDER,
  GeneralTermCode.JSON_PROPERTY_CHANNEL,
  GeneralTermCode.JSON_PROPERTY_GENERAL_TERM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class GeneralTermCode {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER = "ancestorItemIdentifier";
  private JsonNullable<String> ancestorItemIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_EXTERNAL_REFERENCE = "externalReference";
  private String externalReference;

  public static final String JSON_PROPERTY_PROCESS_ORDER = "processOrder";
  private JsonNullable<Integer> processOrder = JsonNullable.<Integer>undefined();

  /**
   * Gets or Sets channel
   */
  public enum ChannelEnum {
    DIGITAL("digital"),
    
    CALLCENTERCALL_CENTER("callcenterCall Center"),
    
    AGENT("agent"),
    
    BROKER("broker"),
    
    DOCUMENT("document");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHANNEL = "Channel";
  private ChannelEnum channel;

  public static final String JSON_PROPERTY_GENERAL_TERM = "generalTerm";
  private JsonNullable<String> generalTerm = JsonNullable.<String>undefined();


  public GeneralTermCode itemIdentifier(String itemIdentifier) {
    
    this.itemIdentifier = itemIdentifier;
    return this;
  }

   /**
   * Get itemIdentifier
   * @return itemIdentifier
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemIdentifier() {
    return itemIdentifier;
  }


  public void setItemIdentifier(String itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
  }


  public GeneralTermCode ancestorItemIdentifier(String ancestorItemIdentifier) {
    this.ancestorItemIdentifier = JsonNullable.<String>of(ancestorItemIdentifier);
    
    return this;
  }

   /**
   * Get ancestorItemIdentifier
   * @return ancestorItemIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getAncestorItemIdentifier() {
        return ancestorItemIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getAncestorItemIdentifier_JsonNullable() {
    return ancestorItemIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER)
  public void setAncestorItemIdentifier_JsonNullable(JsonNullable<String> ancestorItemIdentifier) {
    this.ancestorItemIdentifier = ancestorItemIdentifier;
  }

  public void setAncestorItemIdentifier(String ancestorItemIdentifier) {
    this.ancestorItemIdentifier = JsonNullable.<String>of(ancestorItemIdentifier);
  }


  public GeneralTermCode code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GeneralTermCode externalReference(String externalReference) {
    
    this.externalReference = externalReference;
    return this;
  }

   /**
   * Get externalReference
   * @return externalReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getExternalReference() {
    return externalReference;
  }


  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }


  public GeneralTermCode processOrder(Integer processOrder) {
    this.processOrder = JsonNullable.<Integer>of(processOrder);
    
    return this;
  }

   /**
   * Get processOrder
   * minimum: -2147483648
   * maximum: 2147483647
   * @return processOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getProcessOrder() {
        return processOrder.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROCESS_ORDER)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<Integer> getProcessOrder_JsonNullable() {
    return processOrder;
  }
  
  @JsonProperty(JSON_PROPERTY_PROCESS_ORDER)
  public void setProcessOrder_JsonNullable(JsonNullable<Integer> processOrder) {
    this.processOrder = processOrder;
  }

  public void setProcessOrder(Integer processOrder) {
    this.processOrder = JsonNullable.<Integer>of(processOrder);
  }


  public GeneralTermCode channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  public GeneralTermCode generalTerm(String generalTerm) {
    this.generalTerm = JsonNullable.<String>of(generalTerm);
    
    return this;
  }

   /**
   * Get generalTerm
   * @return generalTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getGeneralTerm() {
        return generalTerm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GENERAL_TERM)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getGeneralTerm_JsonNullable() {
    return generalTerm;
  }
  
  @JsonProperty(JSON_PROPERTY_GENERAL_TERM)
  public void setGeneralTerm_JsonNullable(JsonNullable<String> generalTerm) {
    this.generalTerm = generalTerm;
  }

  public void setGeneralTerm(String generalTerm) {
    this.generalTerm = JsonNullable.<String>of(generalTerm);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralTermCode generalTermCode = (GeneralTermCode) o;
    return Objects.equals(this.itemIdentifier, generalTermCode.itemIdentifier) &&
        Objects.equals(this.ancestorItemIdentifier, generalTermCode.ancestorItemIdentifier) &&
        Objects.equals(this.code, generalTermCode.code) &&
        Objects.equals(this.externalReference, generalTermCode.externalReference) &&
        Objects.equals(this.processOrder, generalTermCode.processOrder) &&
        Objects.equals(this.channel, generalTermCode.channel) &&
        Objects.equals(this.generalTerm, generalTermCode.generalTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, ancestorItemIdentifier, code, externalReference, processOrder, channel, generalTerm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralTermCode {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    processOrder: ").append(toIndentedString(processOrder)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    generalTerm: ").append(toIndentedString(generalTerm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

