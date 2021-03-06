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
import pmp.sdk.model.CoverageDependencyChild;
import pmp.sdk.model.CoverageDependencyParent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CoverageDependency
 */
@JsonPropertyOrder({
  CoverageDependency.JSON_PROPERTY_ITEM_IDENTIFIER,
  CoverageDependency.JSON_PROPERTY_COVERAGE_CHILDREN,
  CoverageDependency.JSON_PROPERTY_COVERAGE_PARENTS,
  CoverageDependency.JSON_PROPERTY_COVERAGE_SELECTION,
  CoverageDependency.JSON_PROPERTY_EFFECTIVE_DATE,
  CoverageDependency.JSON_PROPERTY_EXPIRATION_DATE,
  CoverageDependency.JSON_PROPERTY_CODE,
  CoverageDependency.JSON_PROPERTY_LOCKED,
  CoverageDependency.JSON_PROPERTY_JSON_STRING,
  CoverageDependency.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  CoverageDependency.JSON_PROPERTY_VERSION_NUMBER,
  CoverageDependency.JSON_PROPERTY_ITEM_STATUS,
  CoverageDependency.JSON_PROPERTY_NAME,
  CoverageDependency.JSON_PROPERTY_COVERABLE,
  CoverageDependency.JSON_PROPERTY_PRODUCT_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class CoverageDependency {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_COVERAGE_CHILDREN = "coverageChildren";
  private List<CoverageDependencyChild> coverageChildren = new ArrayList<>();

  public static final String JSON_PROPERTY_COVERAGE_PARENTS = "coverageParents";
  private List<CoverageDependencyParent> coverageParents = new ArrayList<>();

  public static final String JSON_PROPERTY_COVERAGE_SELECTION = "coverageSelection";
  private List<CoverageDependencyParent> coverageSelection = new ArrayList<>();

  public static final String JSON_PROPERTY_EFFECTIVE_DATE = "effectiveDate";
  private String effectiveDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private JsonNullable<String> expirationDate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private Boolean locked;

  public static final String JSON_PROPERTY_JSON_STRING = "jsonString";
  private JsonNullable<String> jsonString = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER = "ancestorItemIdentifier";
  private JsonNullable<String> ancestorItemIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION_NUMBER = "versionNumber";
  private Integer versionNumber;

  /**
   * Gets or Sets itemStatus
   */
  public enum ItemStatusEnum {
    DRAFT("draft"),
    
    STAGE("stage"),
    
    APPROVED("approved");

    private String value;

    ItemStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ItemStatusEnum fromValue(String value) {
      for (ItemStatusEnum b : ItemStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ITEM_STATUS = "itemStatus";
  private ItemStatusEnum itemStatus;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COVERABLE = "coverable";
  private String coverable;

  public static final String JSON_PROPERTY_PRODUCT_CODE = "productCode";
  private String productCode;


  public CoverageDependency itemIdentifier(String itemIdentifier) {
    
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


  public CoverageDependency coverageChildren(List<CoverageDependencyChild> coverageChildren) {
    
    this.coverageChildren = coverageChildren;
    return this;
  }

  public CoverageDependency addCoverageChildrenItem(CoverageDependencyChild coverageChildrenItem) {
    this.coverageChildren.add(coverageChildrenItem);
    return this;
  }

   /**
   * Get coverageChildren
   * @return coverageChildren
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COVERAGE_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CoverageDependencyChild> getCoverageChildren() {
    return coverageChildren;
  }


  public void setCoverageChildren(List<CoverageDependencyChild> coverageChildren) {
    this.coverageChildren = coverageChildren;
  }


  public CoverageDependency coverageParents(List<CoverageDependencyParent> coverageParents) {
    
    this.coverageParents = coverageParents;
    return this;
  }

  public CoverageDependency addCoverageParentsItem(CoverageDependencyParent coverageParentsItem) {
    this.coverageParents.add(coverageParentsItem);
    return this;
  }

   /**
   * Get coverageParents
   * @return coverageParents
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COVERAGE_PARENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CoverageDependencyParent> getCoverageParents() {
    return coverageParents;
  }


  public void setCoverageParents(List<CoverageDependencyParent> coverageParents) {
    this.coverageParents = coverageParents;
  }


  public CoverageDependency coverageSelection(List<CoverageDependencyParent> coverageSelection) {
    
    this.coverageSelection = coverageSelection;
    return this;
  }

  public CoverageDependency addCoverageSelectionItem(CoverageDependencyParent coverageSelectionItem) {
    this.coverageSelection.add(coverageSelectionItem);
    return this;
  }

   /**
   * Get coverageSelection
   * @return coverageSelection
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COVERAGE_SELECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CoverageDependencyParent> getCoverageSelection() {
    return coverageSelection;
  }


  public void setCoverageSelection(List<CoverageDependencyParent> coverageSelection) {
    this.coverageSelection = coverageSelection;
  }


  public CoverageDependency effectiveDate(String effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public CoverageDependency expirationDate(String expirationDate) {
    this.expirationDate = JsonNullable.<String>of(expirationDate);
    
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getExpirationDate() {
        return expirationDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getExpirationDate_JsonNullable() {
    return expirationDate;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  public void setExpirationDate_JsonNullable(JsonNullable<String> expirationDate) {
    this.expirationDate = expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = JsonNullable.<String>of(expirationDate);
  }


  public CoverageDependency code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CoverageDependency locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public CoverageDependency jsonString(String jsonString) {
    this.jsonString = JsonNullable.<String>of(jsonString);
    
    return this;
  }

   /**
   * Get jsonString
   * @return jsonString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getJsonString() {
        return jsonString.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JSON_STRING)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getJsonString_JsonNullable() {
    return jsonString;
  }
  
  @JsonProperty(JSON_PROPERTY_JSON_STRING)
  public void setJsonString_JsonNullable(JsonNullable<String> jsonString) {
    this.jsonString = jsonString;
  }

  public void setJsonString(String jsonString) {
    this.jsonString = JsonNullable.<String>of(jsonString);
  }


  public CoverageDependency ancestorItemIdentifier(String ancestorItemIdentifier) {
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


  public CoverageDependency versionNumber(Integer versionNumber) {
    
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Get versionNumber
   * minimum: -2147483648
   * maximum: 2147483647
   * @return versionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public Integer getVersionNumber() {
    return versionNumber;
  }


  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  public CoverageDependency itemStatus(ItemStatusEnum itemStatus) {
    
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Get itemStatus
   * @return itemStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_STATUS)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public ItemStatusEnum getItemStatus() {
    return itemStatus;
  }


  public void setItemStatus(ItemStatusEnum itemStatus) {
    this.itemStatus = itemStatus;
  }


  public CoverageDependency name(String name) {
    
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


  public CoverageDependency coverable(String coverable) {
    
    this.coverable = coverable;
    return this;
  }

   /**
   * Get coverable
   * @return coverable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVERABLE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getCoverable() {
    return coverable;
  }


  public void setCoverable(String coverable) {
    this.coverable = coverable;
  }


  public CoverageDependency productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageDependency coverageDependency = (CoverageDependency) o;
    return Objects.equals(this.itemIdentifier, coverageDependency.itemIdentifier) &&
        Objects.equals(this.coverageChildren, coverageDependency.coverageChildren) &&
        Objects.equals(this.coverageParents, coverageDependency.coverageParents) &&
        Objects.equals(this.coverageSelection, coverageDependency.coverageSelection) &&
        Objects.equals(this.effectiveDate, coverageDependency.effectiveDate) &&
        Objects.equals(this.expirationDate, coverageDependency.expirationDate) &&
        Objects.equals(this.code, coverageDependency.code) &&
        Objects.equals(this.locked, coverageDependency.locked) &&
        Objects.equals(this.jsonString, coverageDependency.jsonString) &&
        Objects.equals(this.ancestorItemIdentifier, coverageDependency.ancestorItemIdentifier) &&
        Objects.equals(this.versionNumber, coverageDependency.versionNumber) &&
        Objects.equals(this.itemStatus, coverageDependency.itemStatus) &&
        Objects.equals(this.name, coverageDependency.name) &&
        Objects.equals(this.coverable, coverageDependency.coverable) &&
        Objects.equals(this.productCode, coverageDependency.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, coverageChildren, coverageParents, coverageSelection, effectiveDate, expirationDate, code, locked, jsonString, ancestorItemIdentifier, versionNumber, itemStatus, name, coverable, productCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageDependency {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    coverageChildren: ").append(toIndentedString(coverageChildren)).append("\n");
    sb.append("    coverageParents: ").append(toIndentedString(coverageParents)).append("\n");
    sb.append("    coverageSelection: ").append(toIndentedString(coverageSelection)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    jsonString: ").append(toIndentedString(jsonString)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coverable: ").append(toIndentedString(coverable)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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

