package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.CoverageDependency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface CoverageDependencyApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return CoverageDependency
   */
  @RequestLine("POST /coverage-dependency/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CoverageDependency coverageDependencyCreate(CoverageDependency data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this coverage dependency. (required)
   */
  @RequestLine("DELETE /coverage-dependency/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void coverageDependencyDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @return List&lt;CoverageDependency&gt;
   */
  @RequestLine("GET /coverage-dependency/")
  @Headers({
    "Accept: application/json",
  })
  List<CoverageDependency> coverageDependencyList();

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this coverage dependency. (required)
   * @param data  (required)
   * @return CoverageDependency
   */
  @RequestLine("PATCH /coverage-dependency/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CoverageDependency coverageDependencyPartialUpdate(@Param("itemIdentifier") String itemIdentifier, CoverageDependency data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this coverage dependency. (required)
   * @return CoverageDependency
   */
  @RequestLine("GET /coverage-dependency/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  CoverageDependency coverageDependencyRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this coverage dependency. (required)
   * @param data  (required)
   * @return CoverageDependency
   */
  @RequestLine("PUT /coverage-dependency/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CoverageDependency coverageDependencyUpdate(@Param("itemIdentifier") String itemIdentifier, CoverageDependency data);
}
