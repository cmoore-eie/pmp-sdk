/*
 * Snippets API
 * Test description
 *
 * The version of the OpenAPI document: v1
 * Contact: contact@snippets.local
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pmp.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import pmp.sdk.model.ItemLinkDefinitionDetail;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ItemLinkDefinition
 */
@JsonPropertyOrder({
  ItemLinkDefinition.JSON_PROPERTY_ID,
  ItemLinkDefinition.JSON_PROPERTY_ITEM_LINK_DEFINITION_DETAILS,
  ItemLinkDefinition.JSON_PROPERTY_IDENTIFIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class ItemLinkDefinition {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ITEM_LINK_DEFINITION_DETAILS = "itemLinkDefinitionDetails";
  private List<ItemLinkDefinitionDetail> itemLinkDefinitionDetails = new ArrayList<>();

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public Integer getId() {
    return id;
  }




  public ItemLinkDefinition itemLinkDefinitionDetails(List<ItemLinkDefinitionDetail> itemLinkDefinitionDetails) {
    
    this.itemLinkDefinitionDetails = itemLinkDefinitionDetails;
    return this;
  }

  public ItemLinkDefinition addItemLinkDefinitionDetailsItem(ItemLinkDefinitionDetail itemLinkDefinitionDetailsItem) {
    this.itemLinkDefinitionDetails.add(itemLinkDefinitionDetailsItem);
    return this;
  }

   /**
   * Get itemLinkDefinitionDetails
   * @return itemLinkDefinitionDetails
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_LINK_DEFINITION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ItemLinkDefinitionDetail> getItemLinkDefinitionDetails() {
    return itemLinkDefinitionDetails;
  }


  public void setItemLinkDefinitionDetails(List<ItemLinkDefinitionDetail> itemLinkDefinitionDetails) {
    this.itemLinkDefinitionDetails = itemLinkDefinitionDetails;
  }


  public ItemLinkDefinition identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemLinkDefinition itemLinkDefinition = (ItemLinkDefinition) o;
    return Objects.equals(this.id, itemLinkDefinition.id) &&
        Objects.equals(this.itemLinkDefinitionDetails, itemLinkDefinition.itemLinkDefinitionDetails) &&
        Objects.equals(this.identifier, itemLinkDefinition.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemLinkDefinitionDetails, identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemLinkDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemLinkDefinitionDetails: ").append(toIndentedString(itemLinkDefinitionDetails)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

