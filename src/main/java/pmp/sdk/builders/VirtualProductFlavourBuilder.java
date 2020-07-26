package pmp.sdk.builders;

import pmp.sdk.model.VirtualProduct;
import pmp.sdk.model.VirtualProductFlavour;

import java.util.ArrayList;
import java.util.UUID;

public class VirtualProductFlavourBuilder {

    VirtualProductFlavour builtObject;

    public VirtualProductFlavourBuilder(){
        builtObject = new VirtualProductFlavour();
    }

    public VirtualProductFlavour getVirtualProductFlavour(){
        return builtObject;
    }

    public VirtualProductFlavourBuilder withDefaults(){
        withCode("testvirtualproduct");
        withEffectiveDate("2020-01-01");
        withItemIdentifier(UUID.randomUUID().toString());
        withCode("base");
        withDefaultFlavour(true);
        withName("Base");
        withLineCode("CPLine");
        withPriority(10);

        return this;
    }

    public VirtualProductFlavourBuilder withAncestorItemIdentifier(String inItem){
        builtObject.setAncestorItemIdentifier(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withCode(String inItem){
        builtObject.setCode(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withCondition(String inItem){
        builtObject.setCondition(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withDefaultFlavour(boolean inItem){
        builtObject.setDefaultFlavour(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withEffectiveDate(String inItem){
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withExpirationDate(String inItem){
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withGrandfathering(VirtualProductFlavour.GrandfatheringEnum inItem){
        builtObject.setGrandfathering(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withLineCode(String inItem){
        builtObject.setLineCode(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withName(String inItem){
        builtObject.setName(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withPriority(int inItem){
        builtObject.setPriority(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withPurge(boolean inItem){
        builtObject.setPurge(inItem);
        return this;
    }

    public VirtualProductFlavourBuilder withRank(int inItem){
        builtObject.setRank(inItem);
        return this;
    }


/*    public VirtualProductFlavourBuilder withVirtualProductFlavours(VirtualProductFlavour inItem){
        if(virtualProduct.getVirtualProductFlavours() == null){
            virtualProduct.setVirtualProductFlavours(new ArrayList<VirtualProductFlavour>());
        }
        virtualProduct.addVirtualProductFlavoursItem(inItem);
        return this;
    }*/
}
