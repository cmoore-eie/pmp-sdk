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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ItemLinkDefinitionDetail
 */
@JsonPropertyOrder({
  ItemLinkDefinitionDetail.JSON_PROPERTY_ID,
  ItemLinkDefinitionDetail.JSON_PROPERTY_CODE,
  ItemLinkDefinitionDetail.JSON_PROPERTY_NAME,
  ItemLinkDefinitionDetail.JSON_PROPERTY_VALUE,
  ItemLinkDefinitionDetail.JSON_PROPERTY_VALUE_TYPE,
  ItemLinkDefinitionDetail.JSON_PROPERTY_ITEM_LINK_DEFINITION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class ItemLinkDefinitionDetail {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  /**
   * Gets or Sets valueType
   */
  public enum ValueTypeEnum {
    STRING("string"),
    
    OBJECT("object"),
    
    CALCULATED("calculated"),
    
    OTHER("other"),
    
    LIST("list"),
    
    STRING_MULTILINE("string_multiline"),
    
    BOOLEAN("boolean"),
    
    INTEGER("integer"),
    
    INTEGER_RANGE("integer_range"),
    
    INTEGER_SET("integer_set"),
    
    MONEY_RANGE("money_range"),
    
    MONEY_SET("money_set"),
    
    LONG("long"),
    
    DECIMAL("decimal"),
    
    DATE("date"),
    
    MONEY("money"),
    
    TYPEKEY("typekey"),
    
    OPTION("option"),
    
    LABEL("label"),
    
    LOCATION("location"),
    
    MONEY_USD("money_usd"),
    
    MONEY_EUR("money_eur"),
    
    MONEY_GBP("money_gbp"),
    
    PERCENT("percent"),
    
    PERCENTDEC("percentdec"),
    
    YEAR("year"),
    
    ADDRESS("address"),
    
    AFPFUNCTION("afpfunction");

    private String value;

    ValueTypeEnum(String value) {
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
    public static ValueTypeEnum fromValue(String value) {
      for (ValueTypeEnum b : ValueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VALUE_TYPE = "valueType";
  private ValueTypeEnum valueType;

  public static final String JSON_PROPERTY_ITEM_LINK_DEFINITION = "itemLinkDefinition";
  private Integer itemLinkDefinition;


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




  public ItemLinkDefinitionDetail code(String code) {
    
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


  public ItemLinkDefinitionDetail name(String name) {
    
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


  public ItemLinkDefinitionDetail value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ItemLinkDefinitionDetail valueType(ValueTypeEnum valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public ValueTypeEnum getValueType() {
    return valueType;
  }


  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }


  public ItemLinkDefinitionDetail itemLinkDefinition(Integer itemLinkDefinition) {
    
    this.itemLinkDefinition = itemLinkDefinition;
    return this;
  }

   /**
   * Get itemLinkDefinition
   * @return itemLinkDefinition
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_LINK_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getItemLinkDefinition() {
    return itemLinkDefinition;
  }


  public void setItemLinkDefinition(Integer itemLinkDefinition) {
    this.itemLinkDefinition = itemLinkDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemLinkDefinitionDetail itemLinkDefinitionDetail = (ItemLinkDefinitionDetail) o;
    return Objects.equals(this.id, itemLinkDefinitionDetail.id) &&
        Objects.equals(this.code, itemLinkDefinitionDetail.code) &&
        Objects.equals(this.name, itemLinkDefinitionDetail.name) &&
        Objects.equals(this.value, itemLinkDefinitionDetail.value) &&
        Objects.equals(this.valueType, itemLinkDefinitionDetail.valueType) &&
        Objects.equals(this.itemLinkDefinition, itemLinkDefinitionDetail.itemLinkDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, value, valueType, itemLinkDefinition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemLinkDefinitionDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    itemLinkDefinition: ").append(toIndentedString(itemLinkDefinition)).append("\n");
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

