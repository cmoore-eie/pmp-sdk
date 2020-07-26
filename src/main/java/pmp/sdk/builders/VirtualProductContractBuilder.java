package pmp.sdk.builders;

import pmp.sdk.ApiClient;
import pmp.sdk.api.ContractsApi;
import pmp.sdk.model.Contract;
import pmp.sdk.model.VirtualProductContract;

import java.util.UUID;

public class VirtualProductContractBuilder {

    VirtualProductContract builtObject;

    public VirtualProductContractBuilder(){
        builtObject = new VirtualProductContract();
    }

    public VirtualProductContract getVirtualProductContract(){
        return builtObject;
    }

    public VirtualProductContractBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        withPurge(false);
        return this;
    }

    public VirtualProductContractBuilder withAncestorItemIdentifier(String inItem){
        builtObject.setAncestorItemIdentifier(inItem);
        return this;
    }

    public VirtualProductContractBuilder withContractIdentifier(String inItem){
        builtObject.setContractIdentifier(inItem);
        return this;
    }

    public VirtualProductContractBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }


    public VirtualProductContractBuilder withPurge(boolean inItem){
        builtObject.setPurge(inItem);
        return this;
    }

    public VirtualProductContractBuilder withPriority(int inItem){
        builtObject.setPriority(inItem);
        return this;
    }

}
