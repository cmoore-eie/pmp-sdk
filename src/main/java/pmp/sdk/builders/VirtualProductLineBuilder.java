package pmp.sdk.builders;

import pmp.sdk.model.VirtualProductLine;

import java.util.UUID;

public class VirtualProductLineBuilder {

    VirtualProductLine builtObject;

    public VirtualProductLineBuilder(){
        builtObject = new VirtualProductLine();
    }

    public VirtualProductLine getVirtualProductLine(){
        return builtObject;
    }

    public VirtualProductLineBuilder withDefaults(){
        withLineCode("CPLine");
        withLineAvailable(true);
        withItemIdentifier(UUID.randomUUID().toString());
        withPurge(false);
        return this;
    }

    public VirtualProductLineBuilder withAncestorItemIdentifier(String inItem){
        builtObject.setAncestorItemIdentifier(inItem);
        return this;
    }

    public VirtualProductLineBuilder withLineCode(String inItem){
        builtObject.setLineCode(inItem);
        return this;
    }

    public VirtualProductLineBuilder withLineAvailable(boolean inItem){
        builtObject.setLineAvailable(inItem);
        return this;
    }


    public VirtualProductLineBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }


    public VirtualProductLineBuilder withPurge(boolean inItem){
        builtObject.setPurge(inItem);
        return this;
    }

}
