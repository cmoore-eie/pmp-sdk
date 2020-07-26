package pmp.sdk.builders;

import pmp.sdk.model.ContractCover;

import java.util.UUID;

public class ContractCoverBuilder {

    ContractCover builtObject;

    public ContractCoverBuilder(){
        builtObject = new ContractCover();
    }

    public ContractCover getContractCover(){
        return builtObject;
    }

    public ContractCoverBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        withCoverageCode("CPBldgBusIncomeCov");
        withCoverIncluded(true);
        return this;
    }

    public ContractCoverBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public ContractCoverBuilder withCoverageCode(String inItem){
        builtObject.setCoverageCode(inItem);
        return this;
    }

    public ContractCoverBuilder withCoverIncluded(boolean inItem){
        builtObject.setCoverIncluded(inItem);
        return this;
    }
}
