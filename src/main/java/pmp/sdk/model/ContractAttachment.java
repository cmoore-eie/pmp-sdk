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
 * ContractAttachment
 */
@JsonPropertyOrder({
  ContractAttachment.JSON_PROPERTY_ITEM_IDENTIFIER,
  ContractAttachment.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  ContractAttachment.JSON_PROPERTY_PURGE,
  ContractAttachment.JSON_PROPERTY_RETIRED,
  ContractAttachment.JSON_PROPERTY_COVERABLE_CODE,
  ContractAttachment.JSON_PROPERTY_COVERABLE_INCLUDED,
  ContractAttachment.JSON_PROPERTY_CONTRACT_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class ContractAttachment {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER = "ancestorItemIdentifier";
  private JsonNullable<String> ancestorItemIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PURGE = "purge";
  private Boolean purge;

  public static final String JSON_PROPERTY_RETIRED = "retired";
  private Boolean retired;

  public static final String JSON_PROPERTY_COVERABLE_CODE = "coverableCode";
  private String coverableCode;

  public static final String JSON_PROPERTY_COVERABLE_INCLUDED = "coverableIncluded";
  private Boolean coverableIncluded;

  public static final String JSON_PROPERTY_CONTRACT_VERSION = "contractVersion";
  private JsonNullable<String> contractVersion = JsonNullable.<String>undefined();


  public ContractAttachment itemIdentifier(String itemIdentifier) {
    
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


  public ContractAttachment ancestorItemIdentifier(String ancestorItemIdentifier) {
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


  public ContractAttachment purge(Boolean purge) {
    
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


  public ContractAttachment retired(Boolean retired) {
    
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


  public ContractAttachment coverableCode(String coverableCode) {
    
    this.coverableCode = coverableCode;
    return this;
  }

   /**
   * Get coverableCode
   * @return coverableCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVERABLE_CODE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getCoverableCode() {
    return coverableCode;
  }


  public void setCoverableCode(String coverableCode) {
    this.coverableCode = coverableCode;
  }


  public ContractAttachment coverableIncluded(Boolean coverableIncluded) {
    
    this.coverableIncluded = coverableIncluded;
    return this;
  }

   /**
   * Get coverableIncluded
   * @return coverableIncluded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVERABLE_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public Boolean getCoverableIncluded() {
    return coverableIncluded;
  }


  public void setCoverableIncluded(Boolean coverableIncluded) {
    this.coverableIncluded = coverableIncluded;
  }


  public ContractAttachment contractVersion(String contractVersion) {
    this.contractVersion = JsonNullable.<String>of(contractVersion);
    
    return this;
  }

   /**
   * Get contractVersion
   * @return contractVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getContractVersion() {
        return contractVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTRACT_VERSION)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getContractVersion_JsonNullable() {
    return contractVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTRACT_VERSION)
  public void setContractVersion_JsonNullable(JsonNullable<String> contractVersion) {
    this.contractVersion = contractVersion;
  }

  public void setContractVersion(String contractVersion) {
    this.contractVersion = JsonNullable.<String>of(contractVersion);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractAttachment contractAttachment = (ContractAttachment) o;
    return Objects.equals(this.itemIdentifier, contractAttachment.itemIdentifier) &&
        Objects.equals(this.ancestorItemIdentifier, contractAttachment.ancestorItemIdentifier) &&
        Objects.equals(this.purge, contractAttachment.purge) &&
        Objects.equals(this.retired, contractAttachment.retired) &&
        Objects.equals(this.coverableCode, contractAttachment.coverableCode) &&
        Objects.equals(this.coverableIncluded, contractAttachment.coverableIncluded) &&
        Objects.equals(this.contractVersion, contractAttachment.contractVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, ancestorItemIdentifier, purge, retired, coverableCode, coverableIncluded, contractVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractAttachment {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    purge: ").append(toIndentedString(purge)).append("\n");
    sb.append("    retired: ").append(toIndentedString(retired)).append("\n");
    sb.append("    coverableCode: ").append(toIndentedString(coverableCode)).append("\n");
    sb.append("    coverableIncluded: ").append(toIndentedString(coverableIncluded)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
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

