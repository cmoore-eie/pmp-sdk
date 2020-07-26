package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.Agreement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface AgreementsApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return Agreement
   */
  @RequestLine("POST /agreements/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Agreement agreementsCreate(Agreement data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this agreement. (required)
   */
  @RequestLine("DELETE /agreements/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void agreementsDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @return List&lt;Agreement&gt;
   */
  @RequestLine("GET /agreements/")
  @Headers({
    "Accept: application/json",
  })
  List<Agreement> agreementsList();

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this agreement. (required)
   * @param data  (required)
   * @return Agreement
   */
  @RequestLine("PATCH /agreements/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Agreement agreementsPartialUpdate(@Param("itemIdentifier") String itemIdentifier, Agreement data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this agreement. (required)
   * @return Agreement
   */
  @RequestLine("GET /agreements/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  Agreement agreementsRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this agreement. (required)
   * @param data  (required)
   * @return Agreement
   */
  @RequestLine("PUT /agreements/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Agreement agreementsUpdate(@Param("itemIdentifier") String itemIdentifier, Agreement data);
}
