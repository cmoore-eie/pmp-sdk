package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.GeneralTerm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface GeneralTermsApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return GeneralTerm
   */
  @RequestLine("POST /general-terms/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GeneralTerm generalTermsCreate(GeneralTerm data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this general term. (required)
   */
  @RequestLine("DELETE /general-terms/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void generalTermsDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @return List&lt;GeneralTerm&gt;
   */
  @RequestLine("GET /general-terms/")
  @Headers({
    "Accept: application/json",
  })
  List<GeneralTerm> generalTermsList();

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this general term. (required)
   * @param data  (required)
   * @return GeneralTerm
   */
  @RequestLine("PATCH /general-terms/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GeneralTerm generalTermsPartialUpdate(@Param("itemIdentifier") String itemIdentifier, GeneralTerm data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this general term. (required)
   * @return GeneralTerm
   */
  @RequestLine("GET /general-terms/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  GeneralTerm generalTermsRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this general term. (required)
   * @param data  (required)
   * @return GeneralTerm
   */
  @RequestLine("PUT /general-terms/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GeneralTerm generalTermsUpdate(@Param("itemIdentifier") String itemIdentifier, GeneralTerm data);
}
