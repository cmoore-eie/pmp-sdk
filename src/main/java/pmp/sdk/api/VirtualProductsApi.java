package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import java.math.BigDecimal;
import pmp.sdk.model.VirtualProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface VirtualProductsApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return VirtualProduct
   */
  @RequestLine("POST /virtual-products/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualProduct virtualProductsCreate(VirtualProduct data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this virtual product. (required)
   */
  @RequestLine("DELETE /virtual-products/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void virtualProductsDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param withEffectiveDate  (optional)
   * @param withExpirationDate  (optional)
   * @param withCode  (optional)
   * @param withIdentifier  (optional)
   * @param withVersionNumber  (optional)
   * @param withItemStatus  (optional)
   * @param withProductCode  (optional)
   * @param withVirtualProductType  (optional)
   * @return List&lt;VirtualProduct&gt;
   */
  @RequestLine("GET /virtual-products/?with_effectiveDate={withEffectiveDate}&with_expirationDate={withExpirationDate}&with_code={withCode}&with_identifier={withIdentifier}&with_versionNumber={withVersionNumber}&with_itemStatus={withItemStatus}&with_productCode={withProductCode}&with_VirtualProductType={withVirtualProductType}")
  @Headers({
    "Accept: application/json",
  })
  List<VirtualProduct> virtualProductsList(@Param("with_effectiveDate") String withEffectiveDate, @Param("with_expirationDate") String withExpirationDate, @Param("with_code") String withCode, @Param("with_identifier") String withIdentifier, @Param("with_versionNumber") BigDecimal withVersionNumber, @Param("with_itemStatus") String withItemStatus, @Param("with_productCode") String withProductCode, @Param("with_VirtualProductType") String withVirtualProductType);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>virtualProductsList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualProductsListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>withEffectiveDate -  (optional)</li>
   *   <li>withExpirationDate -  (optional)</li>
   *   <li>withCode -  (optional)</li>
   *   <li>withIdentifier -  (optional)</li>
   *   <li>withVersionNumber -  (optional)</li>
   *   <li>withItemStatus -  (optional)</li>
   *   <li>withProductCode -  (optional)</li>
   *   <li>withVirtualProductType -  (optional)</li>
   *   </ul>
   * @return List&lt;VirtualProduct&gt;
   */
  @RequestLine("GET /virtual-products/?with_effectiveDate={withEffectiveDate}&with_expirationDate={withExpirationDate}&with_code={withCode}&with_identifier={withIdentifier}&with_versionNumber={withVersionNumber}&with_itemStatus={withItemStatus}&with_productCode={withProductCode}&with_VirtualProductType={withVirtualProductType}")
  @Headers({
  "Accept: application/json",
  })
  List<VirtualProduct> virtualProductsList(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>virtualProductsList</code> method in a fluent style.
   */
  public static class VirtualProductsListQueryParams extends HashMap<String, Object> {
    public VirtualProductsListQueryParams withEffectiveDate(final String value) {
      put("with_effectiveDate", EncodingUtils.encode(value));
      return this;
    }
    public VirtualProductsListQueryParams withExpirationDate(final String value) {
      put("with_expirationDate", EncodingUtils.encode(value));
      return this;
    }
    public VirtualProductsListQueryParams withCode(final String value) {
      put("with_code", EncodingUtils.encode(value));
      return this;
    }
    public VirtualProductsListQueryParams withIdentifier(final String value) {
      put("with_identifier", EncodingUtils.encode(value));
      return this;
    }
    public VirtualProductsListQueryParams withVersionNumber(final BigDecimal value) {
      put("with_versionNumber", EncodingUtils.encode(value));
      return this;
    }
    public VirtualProductsListQueryParams withItemStatus(final String value) {
      put("with_itemStatus", EncodingUtils.encode(value));
      return this;
    }
    public VirtualProductsListQueryParams withProductCode(final String value) {
      put("with_productCode", EncodingUtils.encode(value));
      return this;
    }
    public VirtualProductsListQueryParams withVirtualProductType(final String value) {
      put("with_VirtualProductType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this virtual product. (required)
   * @param data  (required)
   * @return VirtualProduct
   */
  @RequestLine("PATCH /virtual-products/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualProduct virtualProductsPartialUpdate(@Param("itemIdentifier") String itemIdentifier, VirtualProduct data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this virtual product. (required)
   * @return VirtualProduct
   */
  @RequestLine("GET /virtual-products/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  VirtualProduct virtualProductsRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this virtual product. (required)
   * @param data  (required)
   * @return VirtualProduct
   */
  @RequestLine("PUT /virtual-products/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualProduct virtualProductsUpdate(@Param("itemIdentifier") String itemIdentifier, VirtualProduct data);
}
