package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.EncodingUtils;

import pmp.sdk.model.ItemLink;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public interface ItemLinksApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return ItemLink
   */
  @RequestLine("POST /item-links/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ItemLink itemLinksCreate(ItemLink data);

  /**
   * 
   * 
   * @param id A unique integer value identifying this item link. (required)
   */
  @RequestLine("DELETE /item-links/{id}/")
  @Headers({
    "Accept: application/json",
  })
  void itemLinksDelete(@Param("id") Integer id);

  /**
   * 
   * 
   * @return List&lt;ItemLink&gt;
   */
  @RequestLine("GET /item-links/")
  @Headers({
    "Accept: application/json",
  })
  List<ItemLink> itemLinksList();

  /**
   * 
   * 
   * @param id A unique integer value identifying this item link. (required)
   * @param data  (required)
   * @return ItemLink
   */
  @RequestLine("PATCH /item-links/{id}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ItemLink itemLinksPartialUpdate(@Param("id") Integer id, ItemLink data);

  /**
   * 
   * 
   * @param id A unique integer value identifying this item link. (required)
   * @return ItemLink
   */
  @RequestLine("GET /item-links/{id}/")
  @Headers({
    "Accept: application/json",
  })
  ItemLink itemLinksRead(@Param("id") Integer id);

  /**
   * 
   * 
   * @param id A unique integer value identifying this item link. (required)
   * @param data  (required)
   * @return ItemLink
   */
  @RequestLine("PUT /item-links/{id}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ItemLink itemLinksUpdate(@Param("id") Integer id, ItemLink data);
}
