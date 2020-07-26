package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.ItemLinkDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface ItemLinkDefinitionsApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return ItemLinkDefinition
   */
  @RequestLine("POST /item-link-definitions/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ItemLinkDefinition itemLinkDefinitionsCreate(ItemLinkDefinition data);

  /**
   * 
   * 
   * @param id A unique integer value identifying this item link definition. (required)
   */
  @RequestLine("DELETE /item-link-definitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  void itemLinkDefinitionsDelete(@Param("id") Integer id);

  /**
   * 
   * 
   * @return List&lt;ItemLinkDefinition&gt;
   */
  @RequestLine("GET /item-link-definitions/")
  @Headers({
    "Accept: application/json",
  })
  List<ItemLinkDefinition> itemLinkDefinitionsList();

  /**
   * 
   * 
   * @param id A unique integer value identifying this item link definition. (required)
   * @param data  (required)
   * @return ItemLinkDefinition
   */
  @RequestLine("PATCH /item-link-definitions/{id}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ItemLinkDefinition itemLinkDefinitionsPartialUpdate(@Param("id") Integer id, ItemLinkDefinition data);

  /**
   * 
   * 
   * @param id A unique integer value identifying this item link definition. (required)
   * @return ItemLinkDefinition
   */
  @RequestLine("GET /item-link-definitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  ItemLinkDefinition itemLinkDefinitionsRead(@Param("id") Integer id);

  /**
   * 
   * 
   * @param id A unique integer value identifying this item link definition. (required)
   * @param data  (required)
   * @return ItemLinkDefinition
   */
  @RequestLine("PUT /item-link-definitions/{id}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ItemLinkDefinition itemLinkDefinitionsUpdate(@Param("id") Integer id, ItemLinkDefinition data);
}
