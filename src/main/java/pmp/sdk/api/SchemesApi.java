package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.Scheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface SchemesApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return Scheme
   */
  @RequestLine("POST /schemes/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Scheme schemesCreate(Scheme data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this scheme. (required)
   */
  @RequestLine("DELETE /schemes/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void schemesDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param withCode  (optional)
   * @param withName  (optional)
   * @param withIdentifier  (optional)
   * @param withProductCode  (optional)
   * @return List&lt;Scheme&gt;
   */
  @RequestLine("GET /schemes/?with_code={withCode}&with_name={withName}&with_identifier={withIdentifier}&with_productCode={withProductCode}")
  @Headers({
    "Accept: application/json",
  })
  List<Scheme> schemesList(@Param("with_code") String withCode, @Param("with_name") String withName, @Param("with_identifier") String withIdentifier, @Param("with_productCode") String withProductCode);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>schemesList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SchemesListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>withCode -  (optional)</li>
   *   <li>withName -  (optional)</li>
   *   <li>withIdentifier -  (optional)</li>
   *   <li>withProductCode -  (optional)</li>
   *   </ul>
   * @return List&lt;Scheme&gt;
   */
  @RequestLine("GET /schemes/?with_code={withCode}&with_name={withName}&with_identifier={withIdentifier}&with_productCode={withProductCode}")
  @Headers({
  "Accept: application/json",
  })
  List<Scheme> schemesList(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>schemesList</code> method in a fluent style.
   */
  public static class SchemesListQueryParams extends HashMap<String, Object> {
    public SchemesListQueryParams withCode(final String value) {
      put("with_code", EncodingUtils.encode(value));
      return this;
    }
    public SchemesListQueryParams withName(final String value) {
      put("with_name", EncodingUtils.encode(value));
      return this;
    }
    public SchemesListQueryParams withIdentifier(final String value) {
      put("with_identifier", EncodingUtils.encode(value));
      return this;
    }
    public SchemesListQueryParams withProductCode(final String value) {
      put("with_productCode", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this scheme. (required)
   * @param data  (required)
   * @return Scheme
   */
  @RequestLine("PATCH /schemes/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Scheme schemesPartialUpdate(@Param("itemIdentifier") String itemIdentifier, Scheme data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this scheme. (required)
   * @return Scheme
   */
  @RequestLine("GET /schemes/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  Scheme schemesRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this scheme. (required)
   * @param data  (required)
   * @return Scheme
   */
  @RequestLine("PUT /schemes/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Scheme schemesUpdate(@Param("itemIdentifier") String itemIdentifier, Scheme data);
}
