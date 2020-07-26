package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.ExternalProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface ExternalProductsApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return ExternalProduct
   */
  @RequestLine("POST /external-products/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExternalProduct externalProductsCreate(ExternalProduct data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this external product. (required)
   */
  @RequestLine("DELETE /external-products/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void externalProductsDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @return List&lt;ExternalProduct&gt;
   */
  @RequestLine("GET /external-products/")
  @Headers({
    "Accept: application/json",
  })
  List<ExternalProduct> externalProductsList();

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this external product. (required)
   * @param data  (required)
   * @return ExternalProduct
   */
  @RequestLine("PATCH /external-products/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExternalProduct externalProductsPartialUpdate(@Param("itemIdentifier") String itemIdentifier, ExternalProduct data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this external product. (required)
   * @return ExternalProduct
   */
  @RequestLine("GET /external-products/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  ExternalProduct externalProductsRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this external product. (required)
   * @param data  (required)
   * @return ExternalProduct
   */
  @RequestLine("PUT /external-products/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExternalProduct externalProductsUpdate(@Param("itemIdentifier") String itemIdentifier, ExternalProduct data);
}
