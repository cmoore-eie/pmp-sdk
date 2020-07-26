package pmp.sdk.builders;

import pmp.sdk.model.ContractAttachment;

import java.util.UUID;

public class ContractAttachmentBuilder {

    ContractAttachment builtObject;

    public ContractAttachmentBuilder(){
        builtObject = new ContractAttachment();
    }

    public ContractAttachment getContractAttachment(){
        return builtObject;
    }

    public ContractAttachmentBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        withCoverableCode("CPBuilding");
        withCoverableIncluded(true);
        return this;
    }

    public ContractAttachmentBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public ContractAttachmentBuilder withCoverableCode(String inItem){
        builtObject.setCoverableCode(inItem);
        return this;
    }

    public ContractAttachmentBuilder withCoverableIncluded(boolean inItem){
        builtObject.setCoverableIncluded(inItem);
        return this;
    }
}
