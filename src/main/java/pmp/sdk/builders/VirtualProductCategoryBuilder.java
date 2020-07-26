package pmp.sdk.builders;

import pmp.sdk.model.VirtualProductCategory;
import pmp.sdk.model.VirtualProductContract;

import java.util.UUID;

public class VirtualProductCategoryBuilder {

    VirtualProductCategory builtObject;

    public VirtualProductCategoryBuilder(){
        builtObject = new VirtualProductCategory();
    }

    public VirtualProductCategory getVirtualProductCategory(){
        return builtObject;
    }

    public VirtualProductCategoryBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        withPurge(false);
        withCode("testcategory");
        withName("Test Category");
        withPriority(10);
        return this;
    }

    public VirtualProductCategoryBuilder withAncestorItemIdentifier(String inItem){
        builtObject.setAncestorItemIdentifier(inItem);
        return this;
    }

    public VirtualProductCategoryBuilder withCode(String inItem){
        builtObject.setCode(inItem);
        return this;
    }

    public VirtualProductCategoryBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public VirtualProductCategoryBuilder withName(String inItem){
        builtObject.setName(inItem);
        return this;
    }


    public VirtualProductCategoryBuilder withPurge(boolean inItem){
        builtObject.setPurge(inItem);
        return this;
    }

    public VirtualProductCategoryBuilder withPriority(int inItem){
        builtObject.setPriority(inItem);
        return this;
    }

}
