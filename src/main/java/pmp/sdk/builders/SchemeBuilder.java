package pmp.sdk.builders;

import java.util.UUID;
import pmp.sdk.model.Scheme;
import pmp.sdk.model.SchemeDetail;

public class SchemeBuilder {

    Scheme builtObject;

    public SchemeBuilder(){
        builtObject = new Scheme();
    }

    public Scheme getScheme(){
        return builtObject;
    }

    public SchemeBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        withCode("testscheme");
        withName("Test Scheme");
        withEffectiveDate("2020-01-01");
        withRenewalAvailable(false);
        withPrivate(false);
        return this;
    }

    public SchemeBuilder withEffectiveDate(String inItem){
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public SchemeBuilder withExpirationDate(String inItem){
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public SchemeBuilder withCode(String inItem){
        builtObject.setCode(inItem);
        return this;
    }

    public SchemeBuilder withLocked(boolean inItem){
        builtObject.setLocked(inItem);
        return this;
    }

    public SchemeBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public SchemeBuilder withAncestorItemIdentifier(String inItem){
        builtObject.setAncestorItemIdentifier(inItem);
        return this;
    }

    public SchemeBuilder withVersionNumber(int inItem){
        builtObject.setVersionNumber(inItem);
        return this;
    }

    public SchemeBuilder withItemStatus(Scheme.ItemStatusEnum inItem){
        builtObject.setItemStatus(inItem);
        return this;
    }

    public SchemeBuilder withName(String inItem){
        builtObject.setName(inItem);
        return this;
    }

    public SchemeBuilder withProductCode(String inItem){
        builtObject.setProductCode(inItem);
        return this;
    }

    public SchemeBuilder withRenewalAvailable(boolean inItem){
        builtObject.setRenewalAvailable(inItem);
        return this;
    }

    public SchemeBuilder withDescription(String inItem){
        builtObject.setDescription(inItem);
        return this;
    }

    public SchemeBuilder withPrivate(boolean inItem){
        builtObject.setPrivate(inItem);
        return this;
    }

    public SchemeBuilder withSchemeType(Scheme.SchemeTypeEnum inItem){
        builtObject.setSchemeType(inItem);
        return this;
    }

    public SchemeBuilder withCreateMethod(Scheme.CreateMethodEnum inItem){
        builtObject.setCreateMethod(inItem);
        return this;
    }

    public SchemeBuilder withSchemeDetails(SchemeDetail inItem){
        builtObject.addSchemeDetailsItem(inItem);
        return this;
    }

}
