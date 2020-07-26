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
import pmp.sdk.model.NegotiationSection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Negotiation
 */
@JsonPropertyOrder({
  Negotiation.JSON_PROPERTY_ITEM_IDENTIFIER,
  Negotiation.JSON_PROPERTY_NEGOTIATION_SECTIONS,
  Negotiation.JSON_PROPERTY_EFFECTIVE_DATE,
  Negotiation.JSON_PROPERTY_EXPIRATION_DATE,
  Negotiation.JSON_PROPERTY_CODE,
  Negotiation.JSON_PROPERTY_LOCKED,
  Negotiation.JSON_PROPERTY_JSON_STRING,
  Negotiation.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  Negotiation.JSON_PROPERTY_VERSION_NUMBER,
  Negotiation.JSON_PROPERTY_ITEM_STATUS,
  Negotiation.JSON_PROPERTY_INDIVIDUAL_POLICIES,
  Negotiation.JSON_PROPERTY_ACTIVE,
  Negotiation.JSON_PROPERTY_PRODUCT_CODE,
  Negotiation.JSON_PROPERTY_NEGOTIATION_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class Negotiation {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_NEGOTIATION_SECTIONS = "negotiationSections";
  private List<NegotiationSection> negotiationSections = new ArrayList<>();

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

  public static final String JSON_PROPERTY_INDIVIDUAL_POLICIES = "individualPolicies";
  private Boolean individualPolicies;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_PRODUCT_CODE = "productCode";
  private String productCode;

  /**
   * Gets or Sets negotiationStatus
   */
  public enum NegotiationStatusEnum {
    INPROGRESS("inprogress"),
    
    ACCEPTED("accepted"),
    
    CANCELLED("cancelled");

    private String value;

    NegotiationStatusEnum(String value) {
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
    public static NegotiationStatusEnum fromValue(String value) {
      for (NegotiationStatusEnum b : NegotiationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NEGOTIATION_STATUS = "negotiationStatus";
  private NegotiationStatusEnum negotiationStatus;


  public Negotiation itemIdentifier(String itemIdentifier) {
    
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


  public Negotiation negotiationSections(List<NegotiationSection> negotiationSections) {
    
    this.negotiationSections = negotiationSections;
    return this;
  }

  public Negotiation addNegotiationSectionsItem(NegotiationSection negotiationSectionsItem) {
    this.negotiationSections.add(negotiationSectionsItem);
    return this;
  }

   /**
   * Get negotiationSections
   * @return negotiationSections
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NEGOTIATION_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<NegotiationSection> getNegotiationSections() {
    return negotiationSections;
  }


  public void setNegotiationSections(List<NegotiationSection> negotiationSections) {
    this.negotiationSections = negotiationSections;
  }


  public Negotiation effectiveDate(String effectiveDate) {
    
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


  public Negotiation expirationDate(String expirationDate) {
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


  public Negotiation code(String code) {
    
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


  public Negotiation locked(Boolean locked) {
    
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


  public Negotiation jsonString(String jsonString) {
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


  public Negotiation ancestorItemIdentifier(String ancestorItemIdentifier) {
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


  public Negotiation versionNumber(Integer versionNumber) {
    
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


  public Negotiation itemStatus(ItemStatusEnum itemStatus) {
    
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


  public Negotiation individualPolicies(Boolean individualPolicies) {
    
    this.individualPolicies = individualPolicies;
    return this;
  }

   /**
   * Get individualPolicies
   * @return individualPolicies
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INDIVIDUAL_POLICIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIndividualPolicies() {
    return individualPolicies;
  }


  public void setIndividualPolicies(Boolean individualPolicies) {
    this.individualPolicies = individualPolicies;
  }


  public Negotiation active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Negotiation productCode(String productCode) {
    
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


  public Negotiation negotiationStatus(NegotiationStatusEnum negotiationStatus) {
    
    this.negotiationStatus = negotiationStatus;
    return this;
  }

   /**
   * Get negotiationStatus
   * @return negotiationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGOTIATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public NegotiationStatusEnum getNegotiationStatus() {
    return negotiationStatus;
  }


  public void setNegotiationStatus(NegotiationStatusEnum negotiationStatus) {
    this.negotiationStatus = negotiationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Negotiation negotiation = (Negotiation) o;
    return Objects.equals(this.itemIdentifier, negotiation.itemIdentifier) &&
        Objects.equals(this.negotiationSections, negotiation.negotiationSections) &&
        Objects.equals(this.effectiveDate, negotiation.effectiveDate) &&
        Objects.equals(this.expirationDate, negotiation.expirationDate) &&
        Objects.equals(this.code, negotiation.code) &&
        Objects.equals(this.locked, negotiation.locked) &&
        Objects.equals(this.jsonString, negotiation.jsonString) &&
        Objects.equals(this.ancestorItemIdentifier, negotiation.ancestorItemIdentifier) &&
        Objects.equals(this.versionNumber, negotiation.versionNumber) &&
        Objects.equals(this.itemStatus, negotiation.itemStatus) &&
        Objects.equals(this.individualPolicies, negotiation.individualPolicies) &&
        Objects.equals(this.active, negotiation.active) &&
        Objects.equals(this.productCode, negotiation.productCode) &&
        Objects.equals(this.negotiationStatus, negotiation.negotiationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, negotiationSections, effectiveDate, expirationDate, code, locked, jsonString, ancestorItemIdentifier, versionNumber, itemStatus, individualPolicies, active, productCode, negotiationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Negotiation {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    negotiationSections: ").append(toIndentedString(negotiationSections)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    jsonString: ").append(toIndentedString(jsonString)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    individualPolicies: ").append(toIndentedString(individualPolicies)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    negotiationStatus: ").append(toIndentedString(negotiationStatus)).append("\n");
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
