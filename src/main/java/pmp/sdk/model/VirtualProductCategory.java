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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * VirtualProductCategory
 */
@JsonPropertyOrder({
  VirtualProductCategory.JSON_PROPERTY_ITEM_IDENTIFIER,
  VirtualProductCategory.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  VirtualProductCategory.JSON_PROPERTY_PURGE,
  VirtualProductCategory.JSON_PROPERTY_RETIRED,
  VirtualProductCategory.JSON_PROPERTY_NAME,
  VirtualProductCategory.JSON_PROPERTY_CODE,
  VirtualProductCategory.JSON_PROPERTY_PRIORITY,
  VirtualProductCategory.JSON_PROPERTY_VIRTUAL_PRODUCT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class VirtualProductCategory {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER = "ancestorItemIdentifier";
  private JsonNullable<String> ancestorItemIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PURGE = "purge";
  private Boolean purge;

  public static final String JSON_PROPERTY_RETIRED = "retired";
  private Boolean retired;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private JsonNullable<Integer> priority = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_VIRTUAL_PRODUCT = "virtualProduct";
  private JsonNullable<String> virtualProduct = JsonNullable.<String>undefined();


  public VirtualProductCategory itemIdentifier(String itemIdentifier) {
    
    this.itemIdentifier = itemIdentifier;
    return this;
  }

   /**
   * Get itemIdentifier
   * @return itemIdentifier
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemIdentifier() {
    return itemIdentifier;
  }


  public void setItemIdentifier(String itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
  }


  public VirtualProductCategory ancestorItemIdentifier(String ancestorItemIdentifier) {
    this.ancestorItemIdentifier = JsonNullable.<String>of(ancestorItemIdentifier);
    
    return this;
  }

   /**
   * Get ancestorItemIdentifier
   * @return ancestorItemIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getAncestorItemIdentifier() {
        return ancestorItemIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getAncestorItemIdentifier_JsonNullable() {
    return ancestorItemIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER)
  public void setAncestorItemIdentifier_JsonNullable(JsonNullable<String> ancestorItemIdentifier) {
    this.ancestorItemIdentifier = ancestorItemIdentifier;
  }

  public void setAncestorItemIdentifier(String ancestorItemIdentifier) {
    this.ancestorItemIdentifier = JsonNullable.<String>of(ancestorItemIdentifier);
  }


  public VirtualProductCategory purge(Boolean purge) {
    
    this.purge = purge;
    return this;
  }

   /**
   * Get purge
   * @return purge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PURGE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public Boolean getPurge() {
    return purge;
  }


  public void setPurge(Boolean purge) {
    this.purge = purge;
  }


  public VirtualProductCategory retired(Boolean retired) {
    
    this.retired = retired;
    return this;
  }

   /**
   * Get retired
   * @return retired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETIRED)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public Boolean getRetired() {
    return retired;
  }


  public void setRetired(Boolean retired) {
    this.retired = retired;
  }


  public VirtualProductCategory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VirtualProductCategory code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public VirtualProductCategory priority(Integer priority) {
    this.priority = JsonNullable.<Integer>of(priority);
    
    return this;
  }

   /**
   * Get priority
   * minimum: -2147483648
   * maximum: 2147483647
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getPriority() {
        return priority.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<Integer> getPriority_JsonNullable() {
    return priority;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  public void setPriority_JsonNullable(JsonNullable<Integer> priority) {
    this.priority = priority;
  }

  public void setPriority(Integer priority) {
    this.priority = JsonNullable.<Integer>of(priority);
  }


  public VirtualProductCategory virtualProduct(String virtualProduct) {
    this.virtualProduct = JsonNullable.<String>of(virtualProduct);
    
    return this;
  }

   /**
   * Get virtualProduct
   * @return virtualProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getVirtualProduct() {
        return virtualProduct.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIRTUAL_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getVirtualProduct_JsonNullable() {
    return virtualProduct;
  }
  
  @JsonProperty(JSON_PROPERTY_VIRTUAL_PRODUCT)
  public void setVirtualProduct_JsonNullable(JsonNullable<String> virtualProduct) {
    this.virtualProduct = virtualProduct;
  }

  public void setVirtualProduct(String virtualProduct) {
    this.virtualProduct = JsonNullable.<String>of(virtualProduct);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualProductCategory virtualProductCategory = (VirtualProductCategory) o;
    return Objects.equals(this.itemIdentifier, virtualProductCategory.itemIdentifier) &&
        Objects.equals(this.ancestorItemIdentifier, virtualProductCategory.ancestorItemIdentifier) &&
        Objects.equals(this.purge, virtualProductCategory.purge) &&
        Objects.equals(this.retired, virtualProductCategory.retired) &&
        Objects.equals(this.name, virtualProductCategory.name) &&
        Objects.equals(this.code, virtualProductCategory.code) &&
        Objects.equals(this.priority, virtualProductCategory.priority) &&
        Objects.equals(this.virtualProduct, virtualProductCategory.virtualProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, ancestorItemIdentifier, purge, retired, name, code, priority, virtualProduct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualProductCategory {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    purge: ").append(toIndentedString(purge)).append("\n");
    sb.append("    retired: ").append(toIndentedString(retired)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    virtualProduct: ").append(toIndentedString(virtualProduct)).append("\n");
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

