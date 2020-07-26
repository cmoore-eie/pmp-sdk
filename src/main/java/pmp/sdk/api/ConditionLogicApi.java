package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.ConditionLogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface ConditionLogicApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return ConditionLogic
   */
  @RequestLine("POST /condition-logic/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConditionLogic conditionLogicCreate(ConditionLogic data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this condition logic. (required)
   */
  @RequestLine("DELETE /condition-logic/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void conditionLogicDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @return List&lt;ConditionLogic&gt;
   */
  @RequestLine("GET /condition-logic/")
  @Headers({
    "Accept: application/json",
  })
  List<ConditionLogic> conditionLogicList();

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this condition logic. (required)
   * @param data  (required)
   * @return ConditionLogic
   */
  @RequestLine("PATCH /condition-logic/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConditionLogic conditionLogicPartialUpdate(@Param("itemIdentifier") String itemIdentifier, ConditionLogic data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this condition logic. (required)
   * @return ConditionLogic
   */
  @RequestLine("GET /condition-logic/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  ConditionLogic conditionLogicRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this condition logic. (required)
   * @param data  (required)
   * @return ConditionLogic
   */
  @RequestLine("PUT /condition-logic/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConditionLogic conditionLogicUpdate(@Param("itemIdentifier") String itemIdentifier, ConditionLogic data);
}
