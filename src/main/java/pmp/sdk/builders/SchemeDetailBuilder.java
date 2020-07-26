package pmp.sdk.builders;

import pmp.sdk.model.SchemeDetail;
import pmp.sdk.model.SchemeDetailArrayValue;
import pmp.sdk.model.SchemeDetailParam;

import java.util.UUID;

public class SchemeDetailBuilder {

    SchemeDetail builtObject;

    public SchemeDetailBuilder(){
        builtObject = new SchemeDetail();
    }

    public SchemeDetail getSchemeDetail(){
        return builtObject;
    }

    public SchemeDetailBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        withSchemeSourceType(SchemeDetail.SchemeSourceTypeEnum.COVERAGE);
        return this;
    }
    
    public SchemeDetailBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public SchemeDetailBuilder withAncestorItemIdentifier(String inItem){
        builtObject.setAncestorItemIdentifier(inItem);
        return this;
    }

    public SchemeDetailBuilder withStringValue(String inItem){
        builtObject.setStringValue(inItem);
        return this;
    }

    public SchemeDetailBuilder withBooleanValue(boolean inItem){
        builtObject.setBooleanValue(inItem);
        return this;
    }

/*    public SchemeDetailBuilder withDateValue(String inItem){
        builtObject.setDateValue(inItem);
        return this;
    }*/

    public SchemeDetailBuilder withIntegerValue(int inItem){
        builtObject.setIntegerValue(inItem);
        return this;
    }
/*            public SchemeDetailBuilder withdecimalValue(String inItem){
        builtObject.setEffectiveDate(inItem);
        return this;
    }*/

/*    public SchemeDetailBuilder withMoneyValue(String inItem){
        builtObject.setEffectiveDate(inItem);
        return this;
    }*/

    public SchemeDetailBuilder withSchemeCalcValueType(SchemeDetail.SchemeCalcValueTypeEnum inItem){
        builtObject.setSchemeCalcValueType(inItem);
        return this;
    }

    public SchemeDetailBuilder withComparator(String inItem){
        builtObject.setComparator(inItem);
        return this;
    }

    public SchemeDetailBuilder withParentCode(String inItem){
        builtObject.setParentCode(inItem);
        return this;
    }

    public SchemeDetailBuilder withCondition(String inItem){
        builtObject.setCondition(inItem);
        return this;
    }

    public SchemeDetailBuilder withForceValue(boolean inItem){
        builtObject.setForceValue(inItem);
        return this;
    }

    public SchemeDetailBuilder withTimeDuration(int inItem){
        builtObject.setTimeDuration(inItem);
        return this;
    }

/*    public SchemeDetailBuilder withCostDiscount(String inItem){
        builtObject.setCostDiscount(inItem);
        return this;
    }*/

    public SchemeDetailBuilder withMinMax(String inItem){
        builtObject.setMinMax(inItem);
        return this;
    }

    public SchemeDetailBuilder withCurrency(SchemeDetail.CurrencyEnum inItem){
        builtObject.setCurrency(inItem);
        return this;
    }

    public SchemeDetailBuilder withSchemeCostType(SchemeDetail.SchemeCostTypeEnum inItem){
        builtObject.setSchemeCostType(inItem);
        return this;
    }

    public SchemeDetailBuilder withSchemeOperatorType(SchemeDetail.SchemeOperatorTypeEnum inItem){
        builtObject.setSchemeOperatorType(inItem);
        return this;
    }

    public SchemeDetailBuilder withSchemeSourceType(SchemeDetail.SchemeSourceTypeEnum inItem){
        builtObject.setSchemeSourceType(inItem);
        return this;
    }

    public SchemeDetailBuilder withSchemeTimeframe(SchemeDetail.SchemeTimeframeEnum inItem){
        builtObject.setSchemeTimeframe(inItem);
        return this;
    }

    public SchemeDetailBuilder withSchemeValueType(SchemeDetail.SchemeValueTypeEnum inItem){
        builtObject.setSchemeValueType(inItem);
        return this;
    }

    public SchemeDetailBuilder withSchemeValidationType(SchemeDetail.SchemeValidationTypeEnum inItem){
        builtObject.setSchemeValidationType(inItem);
        return this;
    }

    public SchemeDetailBuilder withSchemeDetailParams(SchemeDetailParam inItem){
        builtObject.addSchemeDetailParamsItem(inItem);
        return this;
    }

    public SchemeDetailBuilder withSchemeDetailArrayValues(SchemeDetailArrayValue inItem){
        builtObject.addSchemeDetailArrayValuesItem(inItem);
        return this;
    }
}
