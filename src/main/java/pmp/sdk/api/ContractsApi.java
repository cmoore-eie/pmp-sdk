package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.Contract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface ContractsApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return Contract
   */
  @RequestLine("POST /contracts/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Contract contractsCreate(Contract data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this contract. (required)
   */
  @RequestLine("DELETE /contracts/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void contractsDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param withCode  (optional)
   * @param withName  (optional)
   * @param withIdentifier  (optional)
   * @param withProductCode  (optional)
   * @return List&lt;Contract&gt;
   */
  @RequestLine("GET /contracts/?with_code={withCode}&with_name={withName}&with_identifier={withIdentifier}&with_productCode={withProductCode}")
  @Headers({
    "Accept: application/json",
  })
  List<Contract> contractsList(@Param("with_code") String withCode, @Param("with_name") String withName, @Param("with_identifier") String withIdentifier, @Param("with_productCode") String withProductCode);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>contractsList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractsListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>withCode -  (optional)</li>
   *   <li>withName -  (optional)</li>
   *   <li>withIdentifier -  (optional)</li>
   *   <li>withProductCode -  (optional)</li>
   *   </ul>
   * @return List&lt;Contract&gt;
   */
  @RequestLine("GET /contracts/?with_code={withCode}&with_name={withName}&with_identifier={withIdentifier}&with_productCode={withProductCode}")
  @Headers({
  "Accept: application/json",
  })
  List<Contract> contractsList(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>contractsList</code> method in a fluent style.
   */
  public static class ContractsListQueryParams extends HashMap<String, Object> {
    public ContractsListQueryParams withCode(final String value) {
      put("with_code", EncodingUtils.encode(value));
      return this;
    }
    public ContractsListQueryParams withName(final String value) {
      put("with_name", EncodingUtils.encode(value));
      return this;
    }
    public ContractsListQueryParams withIdentifier(final String value) {
      put("with_identifier", EncodingUtils.encode(value));
      return this;
    }
    public ContractsListQueryParams withProductCode(final String value) {
      put("with_productCode", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this contract. (required)
   * @param data  (required)
   * @return Contract
   */
  @RequestLine("PATCH /contracts/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Contract contractsPartialUpdate(@Param("itemIdentifier") String itemIdentifier, Contract data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this contract. (required)
   * @return Contract
   */
  @RequestLine("GET /contracts/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  Contract contractsRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this contract. (required)
   * @param data  (required)
   * @return Contract
   */
  @RequestLine("PUT /contracts/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Contract contractsUpdate(@Param("itemIdentifier") String itemIdentifier, Contract data);
}
