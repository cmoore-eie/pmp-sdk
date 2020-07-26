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
import pmp.sdk.model.NegotiationDetail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * NegotiationSection
 */
@JsonPropertyOrder({
  NegotiationSection.JSON_PROPERTY_ITEM_IDENTIFIER,
  NegotiationSection.JSON_PROPERTY_NEGOTIATION_DETAILS,
  NegotiationSection.JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER,
  NegotiationSection.JSON_PROPERTY_NEGOTIATION_X_M_L,
  NegotiationSection.JSON_PROPERTY_NAME,
  NegotiationSection.JSON_PROPERTY_NEGOTIATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-30T00:50:45.283009+02:00[Europe/Warsaw]")
public class NegotiationSection {
  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_NEGOTIATION_DETAILS = "negotiationDetails";
  private List<NegotiationDetail> negotiationDetails = new ArrayList<>();

  public static final String JSON_PROPERTY_ANCESTOR_ITEM_IDENTIFIER = "ancestorItemIdentifier";
  private JsonNullable<String> ancestorItemIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NEGOTIATION_X_M_L = "negotiationXML";
  private JsonNullable<String> negotiationXML = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NEGOTIATION = "negotiation";
  private JsonNullable<String> negotiation = JsonNullable.<String>undefined();


  public NegotiationSection itemIdentifier(String itemIdentifier) {
    
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


  public NegotiationSection negotiationDetails(List<NegotiationDetail> negotiationDetails) {
    
    this.negotiationDetails = negotiationDetails;
    return this;
  }

  public NegotiationSection addNegotiationDetailsItem(NegotiationDetail negotiationDetailsItem) {
    this.negotiationDetails.add(negotiationDetailsItem);
    return this;
  }

   /**
   * Get negotiationDetails
   * @return negotiationDetails
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NEGOTIATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<NegotiationDetail> getNegotiationDetails() {
    return negotiationDetails;
  }


  public void setNegotiationDetails(List<NegotiationDetail> negotiationDetails) {
    this.negotiationDetails = negotiationDetails;
  }


  public NegotiationSection ancestorItemIdentifier(String ancestorItemIdentifier) {
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


  public NegotiationSection negotiationXML(String negotiationXML) {
    this.negotiationXML = JsonNullable.<String>of(negotiationXML);
    
    return this;
  }

   /**
   * Get negotiationXML
   * @return negotiationXML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNegotiationXML() {
        return negotiationXML.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEGOTIATION_X_M_L)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getNegotiationXML_JsonNullable() {
    return negotiationXML;
  }
  
  @JsonProperty(JSON_PROPERTY_NEGOTIATION_X_M_L)
  public void setNegotiationXML_JsonNullable(JsonNullable<String> negotiationXML) {
    this.negotiationXML = negotiationXML;
  }

  public void setNegotiationXML(String negotiationXML) {
    this.negotiationXML = JsonNullable.<String>of(negotiationXML);
  }


  public NegotiationSection name(String name) {
    
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


  public NegotiationSection negotiation(String negotiation) {
    this.negotiation = JsonNullable.<String>of(negotiation);
    
    return this;
  }

   /**
   * Get negotiation
   * @return negotiation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNegotiation() {
        return negotiation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)

  public JsonNullable<String> getNegotiation_JsonNullable() {
    return negotiation;
  }
  
  @JsonProperty(JSON_PROPERTY_NEGOTIATION)
  public void setNegotiation_JsonNullable(JsonNullable<String> negotiation) {
    this.negotiation = negotiation;
  }

  public void setNegotiation(String negotiation) {
    this.negotiation = JsonNullable.<String>of(negotiation);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationSection negotiationSection = (NegotiationSection) o;
    return Objects.equals(this.itemIdentifier, negotiationSection.itemIdentifier) &&
        Objects.equals(this.negotiationDetails, negotiationSection.negotiationDetails) &&
        Objects.equals(this.ancestorItemIdentifier, negotiationSection.ancestorItemIdentifier) &&
        Objects.equals(this.negotiationXML, negotiationSection.negotiationXML) &&
        Objects.equals(this.name, negotiationSection.name) &&
        Objects.equals(this.negotiation, negotiationSection.negotiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdentifier, negotiationDetails, ancestorItemIdentifier, negotiationXML, name, negotiation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationSection {\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    negotiationDetails: ").append(toIndentedString(negotiationDetails)).append("\n");
    sb.append("    ancestorItemIdentifier: ").append(toIndentedString(ancestorItemIdentifier)).append("\n");
    sb.append("    negotiationXML: ").append(toIndentedString(negotiationXML)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negotiation: ").append(toIndentedString(negotiation)).append("\n");
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
