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
 * CoverageDependencyParent
 */
@JsonPropertyOrder({
  CoverageDependencyParent.JSON_PROPERTY_ITEM_IDENTIFIER,
  CoverageDependencyParent.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  CoverageDependencyParent.JSON_PROPERTY_COVERAGE_CODE,
  CoverageDependencyParent.JSON_PROPERTY_LEFT_PARENTHESIS,
  CoverageDependencyParent.JSON_PROPERTY_RIGHT_PARENTHESIS,
  CoverageDependencyParent.JSON_PROPERTY_ITEM_SEQUENCE,
  CoverageDependencyParent.JSON_PROPERTY_CONDITION_LOGIC,
  CoverageDependencyParent.JSON_PROPERTY_COVERAGE_DEPENDENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class CoverageDependencyParent {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER = "ancestorItemIdentifier";
  private JsonNullable<String> ancestorItemIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COVERAGE_CODE = "coverageCode";
  private String coverageCode;

  public static final String JSON_PROPERTY_LEFT_PARENTHESIS = "leftParenthesis";
  private String leftParenthesis;

  public static final String JSON_PROPERTY_RIGHT_PARENTHESIS = "rightParenthesis";
  private String rightParenthesis;

  public static final String JSON_PROPERTY_ITEM_SEQUENCE = "itemSequence";
  private Integer itemSequence;

  /**
   * Gets or Sets conditionLogic
   */
  public enum ConditionLogicEnum {
    AND("and"),
    
    OR("or"),
    
    NOTNOT("notNot");

    private String value;

    ConditionLogicEnum(String value) {
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
    public static ConditionLogicEnum fromValue(String value) {
      for (ConditionLogicEnum b : ConditionLogicEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CONDITION_LOGIC = "conditionLogic";
  private JsonNullable<ConditionLogicEnum> conditionLogic = JsonNullable.<ConditionLogicEnum>undefined();

  public static final String JSON_PROPERTY_COVERAGE_DEPENDENCY = "coverageDependency";
  private JsonNullable<String> coverageDependency = JsonNullable.<String>undefined();


  public CoverageDependencyParent itemIdentifier(String itemIdentifier) {
    
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


  public CoverageDependencyParent ancestorItemIdentifier(String ancestorItemIdentifier) {
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


  public CoverageDependencyParent coverageCode(String coverageCode) {
    
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


  public CoverageDependencyParent leftParenthesis(String leftParenthesis) {
    
    this.leftParenthesis = leftParenthesis;
    return this;
  }

   /**
   * Get leftParenthesis
   * @return leftParenthesis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEFT_PARENTHESIS)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getLeftParenthesis() {
    return leftParenthesis;
  }


  public void setLeftParenthesis(String leftParenthesis) {
    this.leftParenthesis = leftParenthesis;
  }


  public CoverageDependencyParent rightParenthesis(String rightParenthesis) {
    
    this.rightParenthesis = rightParenthesis;
    return this;
  }

   /**
   * Get rightParenthesis
   * @return rightParenthesis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RIGHT_PARENTHESIS)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getRightParenthesis() {
    return rightParenthesis;
  }


  public void setRightParenthesis(String rightParenthesis) {
    this.rightParenthesis = rightParenthesis;
  }


  public CoverageDependencyParent itemSequence(Integer itemSequence) {
    
    this.itemSequence = itemSequence;
    return this;
  }

   /**
   * Get itemSequence
   * minimum: -2147483648
   * maximum: 2147483647
   * @return itemSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public Integer getItemSequence() {
    return itemSequence;
  }


  public void setItemSequence(Integer itemSequence) {
    this.itemSequence = itemSequence;
  }


  public CoverageDependencyParent conditionLogic(ConditionLogicEnum conditionLogic) {
    this.conditionLogic = JsonNullable.<ConditionLogicEnum>of(conditionLogic);
    
    return this;
  }

   /**
   * Get conditionLogic
   * @return conditionLogic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public ConditionLogicEnum getConditionLogic() {
        return conditionLogic.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONDITION_LOGIC)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<ConditionLogicEnum> getConditionLogic_JsonNullable() {
    return conditionLogic;
  }
  
  @JsonProperty(JSON_PROPERTY_CONDITION_LOGIC)
  public void setConditionLogic_JsonNullable(JsonNullable<ConditionLogicEnum> conditionLogic) {
    this.conditionLogic = conditionLogic;
  }

  public void setConditionLogic(ConditionLogicEnum conditionLogic) {
    this.conditionLogic = JsonNullable.<ConditionLogicEnum>of(conditionLogic);
  }


  public CoverageDependencyParent coverageDependency(String coverageDependency) {
    this.coverageDependency = JsonNullable.<String>of(coverageDependency);
    
    return this;
  }

   /**
   * Get coverageDependency
   * @return coverageDependency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCoverageDependency() {
        return coverageDependency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COVERAGE_DEPENDENCY)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getCoverageDependency_JsonNullable() {
    return coverageDependency;
  }
  
  @JsonProperty(JSON_PROPERTY_COVERAGE_DEPENDENCY)
  public void setCoverageDependency_JsonNullable(JsonNullable<String> coverageDependency) {
    this.coverageDependency = coverageDependency;
  }

  public void setCoverageDependency(String coverageDependency) {
    this.coverageDependency = JsonNullable.<String>of(coverageDependency);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageDependencyParent coverageDependencyParent = (CoverageDependencyParent) o;
    return Objects.equals(this.itemIdentifier, coverageDependencyParent.itemIdentifier) &&
        Objects.equals(this.ancestorItemIdentifier, coverageDependencyParent.ancestorItemIdentifier) &&
        Objects.equals(this.coverageCode, coverageDependencyParent.coverageCode) &&
        Objects.equals(this.leftParenthesis, coverageDependencyParent.leftParenthesis) &&
        Objects.equals(this.rightParenthesis, coverageDependencyParent.rightParenthesis) &&
        Objects.equals(this.itemSequence, coverageDependencyParent.itemSequence) &&
        Objects.equals(this.conditionLogic, coverageDependencyParent.conditionLogic) &&
        Objects.equals(this.coverageDependency, coverageDependencyParent.coverageDependency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, ancestorItemIdentifier, coverageCode, leftParenthesis, rightParenthesis, itemSequence, conditionLogic, coverageDependency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageDependencyParent {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    coverageCode: ").append(toIndentedString(coverageCode)).append("\n");
    sb.append("    leftParenthesis: ").append(toIndentedString(leftParenthesis)).append("\n");
    sb.append("    rightParenthesis: ").append(toIndentedString(rightParenthesis)).append("\n");
    sb.append("    itemSequence: ").append(toIndentedString(itemSequence)).append("\n");
    sb.append("    conditionLogic: ").append(toIndentedString(conditionLogic)).append("\n");
    sb.append("    coverageDependency: ").append(toIndentedString(coverageDependency)).append("\n");
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
