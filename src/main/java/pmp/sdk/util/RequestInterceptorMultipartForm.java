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

import feign.RequestInterceptor;
import feign.RequestTemplate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class RequestInterceptorMultipartForm implements RequestInterceptor {

    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_TYPE_TEXT = "Content-Type: text/plain;";
    private static final String CONTENT_TYPE_JSON = "Content-Type: application/json;";
    private static final String MULTI_PART_FORM = "multipart/form-data";

    @Override
    public void apply(RequestTemplate requestTemplate) {

        if (requestTemplate == null) {
            return;
        }

        if (!isMultipart(requestTemplate)) {
            return;
        }

        byte[] data = requestTemplate.body();

        if (data == null) {
            return;
        }

        String body = new String(data);

        if (body.length() < 1) {
            return;
        }

        String tmp = replaceContentType(body);
        requestTemplate.body(tmp);

    }

    private boolean isMultipart(RequestTemplate requestTemplate) {
        boolean rtnCode = false;

        Map<String, Collection<String>> headers = requestTemplate.headers();

        Collection<String> contentType = headers.get(CONTENT_TYPE);

		if(contentType == null){
			return rtnCode;
		}

        Iterator<String> it = contentType.iterator();
        while (it.hasNext()) {
            String type = it.next();
            int loc = type.indexOf(MULTI_PART_FORM);
            if (loc > -1) {
                rtnCode = true;
                break;
            }
        }

        return rtnCode;
    }

    private String replaceContentType(String data) {

		if(data == null){
			return data;
		}

        StringBuilder buf = new StringBuilder();

        int loc = 0;
        while (loc > -1) {
            loc = data.indexOf(CONTENT_TYPE_TEXT);
            if (loc > -1) {
                buf.append(data.substring(0, loc));
                buf.append(CONTENT_TYPE_JSON);
                buf.append(data.substring(loc + CONTENT_TYPE_TEXT.length()));
                break;
            } else {
                buf.append(data);
            }
        }
        return buf.toString();
    }

}
