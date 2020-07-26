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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class RequestInterceptorReplaceBody implements RequestInterceptor {

    private String _body;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        if (this._body != null) {
            if (requestTemplate != null) {
                requestTemplate.body(this._body);
                this._body = null;
            }
        }
    }

    public void setBody(String body){
        _body = body;
    }
}