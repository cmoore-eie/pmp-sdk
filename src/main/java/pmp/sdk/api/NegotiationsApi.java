package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.Negotiation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface NegotiationsApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return Negotiation
   */
  @RequestLine("POST /negotiations/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Negotiation negotiationsCreate(Negotiation data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this negotiation. (required)
   */
  @RequestLine("DELETE /negotiations/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void negotiationsDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @return List&lt;Negotiation&gt;
   */
  @RequestLine("GET /negotiations/")
  @Headers({
    "Accept: application/json",
  })
  List<Negotiation> negotiationsList();

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this negotiation. (required)
   * @param data  (required)
   * @return Negotiation
   */
  @RequestLine("PATCH /negotiations/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Negotiation negotiationsPartialUpdate(@Param("itemIdentifier") String itemIdentifier, Negotiation data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this negotiation. (required)
   * @return Negotiation
   */
  @RequestLine("GET /negotiations/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  Negotiation negotiationsRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this negotiation. (required)
   * @param data  (required)
   * @return Negotiation
   */
  @RequestLine("PUT /negotiations/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Negotiation negotiationsUpdate(@Param("itemIdentifier") String itemIdentifier, Negotiation data);
}
