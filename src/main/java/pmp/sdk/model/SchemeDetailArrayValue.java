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
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SchemeDetailArrayValue
 */
@JsonPropertyOrder({
  SchemeDetailArrayValue.JSON_PROPERTY_ITEM_IDENTIFIER,
  SchemeDetailArrayValue.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  SchemeDetailArrayValue.JSON_PROPERTY_STRING_VALUE,
  SchemeDetailArrayValue.JSON_PROPERTY_BOOLEAN_VALUE,
  SchemeDetailArrayValue.JSON_PROPERTY_DATE_VALUE,
  SchemeDetailArrayValue.JSON_PROPERTY_INTEGER_VALUE,
  SchemeDetailArrayValue.JSON_PROPERTY_DECIMAL_VALUE,
  SchemeDetailArrayValue.JSON_PROPERTY_MONEY_VALUE,
  SchemeDetailArrayValue.JSON_PROPERTY_SCHEME_CALC_VALUE_TYPE,
  SchemeDetailArrayValue.JSON_PROPERTY_COMPARATOR,
  SchemeDetailArrayValue.JSON_PROPERTY_PARENT_CODE,
  SchemeDetailArrayValue.JSON_PROPERTY_SCHEME_DETAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class SchemeDetailArrayValue {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER = "ancestorItemIdentifier";
  private JsonNullable<String> ancestorItemIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STRING_VALUE = "stringValue";
  private JsonNullable<String> stringValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BOOLEAN_VALUE = "booleanValue";
  private JsonNullable<Boolean> booleanValue = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DATE_VALUE = "dateValue";
  private JsonNullable<Date> dateValue = JsonNullable.<Date>undefined();

  public static final String JSON_PROPERTY_INTEGER_VALUE = "integerValue";
  private JsonNullable<Integer> integerValue = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DECIMAL_VALUE = "decimalValue";
  private JsonNullable<String> decimalValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MONEY_VALUE = "moneyValue";
  private JsonNullable<String> moneyValue = JsonNullable.<String>undefined();

  /**
   * Gets or Sets schemeCalcValueType
   */
  public enum SchemeCalcValueTypeEnum {
    TEST("test");

    private String value;

    SchemeCalcValueTypeEnum(String value) {
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
    public static SchemeCalcValueTypeEnum fromValue(String value) {
      for (SchemeCalcValueTypeEnum b : SchemeCalcValueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SCHEME_CALC_VALUE_TYPE = "schemeCalcValueType";
  private JsonNullable<SchemeCalcValueTypeEnum> schemeCalcValueType = JsonNullable.<SchemeCalcValueTypeEnum>undefined();

  public static final String JSON_PROPERTY_COMPARATOR = "comparator";
  private String comparator;

  public static final String JSON_PROPERTY_PARENT_CODE = "parentCode";
  private String parentCode;

  public static final String JSON_PROPERTY_SCHEME_DETAIL = "schemeDetail";
  private JsonNullable<String> schemeDetail = JsonNullable.<String>undefined();


  public SchemeDetailArrayValue itemIdentifier(String itemIdentifier) {
    
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


  public SchemeDetailArrayValue ancestorItemIdentifier(String ancestorItemIdentifier) {
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


  public SchemeDetailArrayValue stringValue(String stringValue) {
    this.stringValue = JsonNullable.<String>of(stringValue);
    
    return this;
  }

   /**
   * Get stringValue
   * @return stringValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getStringValue() {
        return stringValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getStringValue_JsonNullable() {
    return stringValue;
  }
  
  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  public void setStringValue_JsonNullable(JsonNullable<String> stringValue) {
    this.stringValue = stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = JsonNullable.<String>of(stringValue);
  }


  public SchemeDetailArrayValue booleanValue(Boolean booleanValue) {
    this.booleanValue = JsonNullable.<Boolean>of(booleanValue);
    
    return this;
  }

   /**
   * Get booleanValue
   * @return booleanValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getBooleanValue() {
        return booleanValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BOOLEAN_VALUE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<Boolean> getBooleanValue_JsonNullable() {
    return booleanValue;
  }
  
  @JsonProperty(JSON_PROPERTY_BOOLEAN_VALUE)
  public void setBooleanValue_JsonNullable(JsonNullable<Boolean> booleanValue) {
    this.booleanValue = booleanValue;
  }

  public void setBooleanValue(Boolean booleanValue) {
    this.booleanValue = JsonNullable.<Boolean>of(booleanValue);
  }


  public SchemeDetailArrayValue dateValue(Date dateValue) {
    this.dateValue = JsonNullable.<Date>of(dateValue);
    
    return this;
  }

   /**
   * Get dateValue
   * @return dateValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Date getDateValue() {
        return dateValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_VALUE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<Date> getDateValue_JsonNullable() {
    return dateValue;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE_VALUE)
  public void setDateValue_JsonNullable(JsonNullable<Date> dateValue) {
    this.dateValue = dateValue;
  }

  public void setDateValue(Date dateValue) {
    this.dateValue = JsonNullable.<Date>of(dateValue);
  }


  public SchemeDetailArrayValue integerValue(Integer integerValue) {
    this.integerValue = JsonNullable.<Integer>of(integerValue);
    
    return this;
  }

   /**
   * Get integerValue
   * minimum: -2147483648
   * maximum: 2147483647
   * @return integerValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getIntegerValue() {
        return integerValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGER_VALUE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<Integer> getIntegerValue_JsonNullable() {
    return integerValue;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGER_VALUE)
  public void setIntegerValue_JsonNullable(JsonNullable<Integer> integerValue) {
    this.integerValue = integerValue;
  }

  public void setIntegerValue(Integer integerValue) {
    this.integerValue = JsonNullable.<Integer>of(integerValue);
  }


  public SchemeDetailArrayValue decimalValue(String decimalValue) {
    this.decimalValue = JsonNullable.<String>of(decimalValue);
    
    return this;
  }

   /**
   * Get decimalValue
   * @return decimalValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDecimalValue() {
        return decimalValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DECIMAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getDecimalValue_JsonNullable() {
    return decimalValue;
  }
  
  @JsonProperty(JSON_PROPERTY_DECIMAL_VALUE)
  public void setDecimalValue_JsonNullable(JsonNullable<String> decimalValue) {
    this.decimalValue = decimalValue;
  }

  public void setDecimalValue(String decimalValue) {
    this.decimalValue = JsonNullable.<String>of(decimalValue);
  }


  public SchemeDetailArrayValue moneyValue(String moneyValue) {
    this.moneyValue = JsonNullable.<String>of(moneyValue);
    
    return this;
  }

   /**
   * Get moneyValue
   * @return moneyValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getMoneyValue() {
        return moneyValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MONEY_VALUE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getMoneyValue_JsonNullable() {
    return moneyValue;
  }
  
  @JsonProperty(JSON_PROPERTY_MONEY_VALUE)
  public void setMoneyValue_JsonNullable(JsonNullable<String> moneyValue) {
    this.moneyValue = moneyValue;
  }

  public void setMoneyValue(String moneyValue) {
    this.moneyValue = JsonNullable.<String>of(moneyValue);
  }


  public SchemeDetailArrayValue schemeCalcValueType(SchemeCalcValueTypeEnum schemeCalcValueType) {
    this.schemeCalcValueType = JsonNullable.<SchemeCalcValueTypeEnum>of(schemeCalcValueType);
    
    return this;
  }

   /**
   * Get schemeCalcValueType
   * @return schemeCalcValueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SchemeCalcValueTypeEnum getSchemeCalcValueType() {
        return schemeCalcValueType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCHEME_CALC_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<SchemeCalcValueTypeEnum> getSchemeCalcValueType_JsonNullable() {
    return schemeCalcValueType;
  }
  
  @JsonProperty(JSON_PROPERTY_SCHEME_CALC_VALUE_TYPE)
  public void setSchemeCalcValueType_JsonNullable(JsonNullable<SchemeCalcValueTypeEnum> schemeCalcValueType) {
    this.schemeCalcValueType = schemeCalcValueType;
  }

  public void setSchemeCalcValueType(SchemeCalcValueTypeEnum schemeCalcValueType) {
    this.schemeCalcValueType = JsonNullable.<SchemeCalcValueTypeEnum>of(schemeCalcValueType);
  }


  public SchemeDetailArrayValue comparator(String comparator) {
    
    this.comparator = comparator;
    return this;
  }

   /**
   * Get comparator
   * @return comparator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPARATOR)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getComparator() {
    return comparator;
  }


  public void setComparator(String comparator) {
    this.comparator = comparator;
  }


  public SchemeDetailArrayValue parentCode(String parentCode) {
    
    this.parentCode = parentCode;
    return this;
  }

   /**
   * Get parentCode
   * @return parentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT_CODE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getParentCode() {
    return parentCode;
  }


  public void setParentCode(String parentCode) {
    this.parentCode = parentCode;
  }


  public SchemeDetailArrayValue schemeDetail(String schemeDetail) {
    this.schemeDetail = JsonNullable.<String>of(schemeDetail);
    
    return this;
  }

   /**
   * Get schemeDetail
   * @return schemeDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getSchemeDetail() {
        return schemeDetail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCHEME_DETAIL)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getSchemeDetail_JsonNullable() {
    return schemeDetail;
  }
  
  @JsonProperty(JSON_PROPERTY_SCHEME_DETAIL)
  public void setSchemeDetail_JsonNullable(JsonNullable<String> schemeDetail) {
    this.schemeDetail = schemeDetail;
  }

  public void setSchemeDetail(String schemeDetail) {
    this.schemeDetail = JsonNullable.<String>of(schemeDetail);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemeDetailArrayValue schemeDetailArrayValue = (SchemeDetailArrayValue) o;
    return Objects.equals(this.itemIdentifier, schemeDetailArrayValue.itemIdentifier) &&
        Objects.equals(this.ancestorItemIdentifier, schemeDetailArrayValue.ancestorItemIdentifier) &&
        Objects.equals(this.stringValue, schemeDetailArrayValue.stringValue) &&
        Objects.equals(this.booleanValue, schemeDetailArrayValue.booleanValue) &&
        Objects.equals(this.dateValue, schemeDetailArrayValue.dateValue) &&
        Objects.equals(this.integerValue, schemeDetailArrayValue.integerValue) &&
        Objects.equals(this.decimalValue, schemeDetailArrayValue.decimalValue) &&
        Objects.equals(this.moneyValue, schemeDetailArrayValue.moneyValue) &&
        Objects.equals(this.schemeCalcValueType, schemeDetailArrayValue.schemeCalcValueType) &&
        Objects.equals(this.comparator, schemeDetailArrayValue.comparator) &&
        Objects.equals(this.parentCode, schemeDetailArrayValue.parentCode) &&
        Objects.equals(this.schemeDetail, schemeDetailArrayValue.schemeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, ancestorItemIdentifier, stringValue, booleanValue, dateValue, integerValue, decimalValue, moneyValue, schemeCalcValueType, comparator, parentCode, schemeDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemeDetailArrayValue {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
    sb.append("    integerValue: ").append(toIndentedString(integerValue)).append("\n");
    sb.append("    decimalValue: ").append(toIndentedString(decimalValue)).append("\n");
    sb.append("    moneyValue: ").append(toIndentedString(moneyValue)).append("\n");
    sb.append("    schemeCalcValueType: ").append(toIndentedString(schemeCalcValueType)).append("\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    parentCode: ").append(toIndentedString(parentCode)).append("\n");
    sb.append("    schemeDetail: ").append(toIndentedString(schemeDetail)).append("\n");
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
