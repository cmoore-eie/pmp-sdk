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
 * ContractCover
 */
@JsonPropertyOrder({
  ContractCover.JSON_PROPERTY_ITEM_IDENTIFIER,
  ContractCover.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  ContractCover.JSON_PROPERTY_PURGE,
  ContractCover.JSON_PROPERTY_RETIRED,
  ContractCover.JSON_PROPERTY_COVERAGE_CODE,
  ContractCover.JSON_PROPERTY_COVER_INCLUDED,
  ContractCover.JSON_PROPERTY_CONTRACT_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class ContractCover {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER = "ancestorItemIdentifier";
  private JsonNullable<String> ancestorItemIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PURGE = "purge";
  private Boolean purge;

  public static final String JSON_PROPERTY_RETIRED = "retired";
  private Boolean retired;

  public static final String JSON_PROPERTY_COVERAGE_CODE = "coverageCode";
  private String coverageCode;

  public static final String JSON_PROPERTY_COVER_INCLUDED = "coverIncluded";
  private Boolean coverIncluded;

  public static final String JSON_PROPERTY_CONTRACT_VERSION = "contractVersion";
  private JsonNullable<String> contractVersion = JsonNullable.<String>undefined();


  public ContractCover itemIdentifier(String itemIdentifier) {
    
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


  public ContractCover ancestorItemIdentifier(String ancestorItemIdentifier) {
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


  public ContractCover purge(Boolean purge) {
    
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


  public ContractCover retired(Boolean retired) {
    
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


  public ContractCover coverageCode(String coverageCode) {
    
    this.coverageCode = coverageCode;
    return this;
  }

   /**
   * Get coverageCode
   * @return coverageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVERAGE_CODE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getCoverageCode() {
    return coverageCode;
  }


  public void setCoverageCode(String coverageCode) {
    this.coverageCode = coverageCode;
  }


  public ContractCover coverIncluded(Boolean coverIncluded) {
    
    this.coverIncluded = coverIncluded;
    return this;
  }

   /**
   * Get coverIncluded
   * @return coverIncluded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVER_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public Boolean getCoverIncluded() {
    return coverIncluded;
  }


  public void setCoverIncluded(Boolean coverIncluded) {
    this.coverIncluded = coverIncluded;
  }


  public ContractCover contractVersion(String contractVersion) {
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
    ContractCover contractCover = (ContractCover) o;
    return Objects.equals(this.itemIdentifier, contractCover.itemIdentifier) &&
        Objects.equals(this.ancestorItemIdentifier, contractCover.ancestorItemIdentifier) &&
        Objects.equals(this.purge, contractCover.purge) &&
        Objects.equals(this.retired, contractCover.retired) &&
        Objects.equals(this.coverageCode, contractCover.coverageCode) &&
        Objects.equals(this.coverIncluded, contractCover.coverIncluded) &&
        Objects.equals(this.contractVersion, contractCover.contractVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, ancestorItemIdentifier, purge, retired, coverageCode, coverIncluded, contractVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractCover {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    purge: ").append(toIndentedString(purge)).append("\n");
    sb.append("    retired: ").append(toIndentedString(retired)).append("\n");
    sb.append("    coverageCode: ").append(toIndentedString(coverageCode)).append("\n");
    sb.append("    coverIncluded: ").append(toIndentedString(coverIncluded)).append("\n");
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

