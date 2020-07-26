package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.SchemeCondition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface SchemeConditionsApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return SchemeCondition
   */
  @RequestLine("POST /scheme-conditions/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SchemeCondition schemeConditionsCreate(SchemeCondition data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this scheme condition. (required)
   */
  @RequestLine("DELETE /scheme-conditions/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void schemeConditionsDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @return List&lt;SchemeCondition&gt;
   */
  @RequestLine("GET /scheme-conditions/")
  @Headers({
    "Accept: application/json",
  })
  List<SchemeCondition> schemeConditionsList();

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this scheme condition. (required)
   * @param data  (required)
   * @return SchemeCondition
   */
  @RequestLine("PATCH /scheme-conditions/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SchemeCondition schemeConditionsPartialUpdate(@Param("itemIdentifier") String itemIdentifier, SchemeCondition data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this scheme condition. (required)
   * @return SchemeCondition
   */
  @RequestLine("GET /scheme-conditions/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  SchemeCondition schemeConditionsRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this scheme condition. (required)
   * @param data  (required)
   * @return SchemeCondition
   */
  @RequestLine("PUT /scheme-conditions/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SchemeCondition schemeConditionsUpdate(@Param("itemIdentifier") String itemIdentifier, SchemeCondition data);
}
