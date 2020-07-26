package pmp.sdk.builders;

import pmp.sdk.model.ContractAttachment;
import pmp.sdk.model.ContractCover;
import pmp.sdk.model.ContractVersion;

import java.util.ArrayList;
import java.util.UUID;

public class ContractVersionBuilder {

    ContractVersion builtObject;

    public ContractVersionBuilder(){
        builtObject = new ContractVersion();
    }

    public ContractVersionBuilder withDefaults(){
        withEffectiveDate("2019-11-21");
        withItemIdentifier(UUID.randomUUID().toString());
        withVersionNumber(1);
        withHiddenContract(false);
        withExistence(ContractVersion.ExistenceEnum.SUGGESTED);
        return this;
    }

    public ContractVersion getContractVersion(){
        return builtObject;
    }

    public ContractVersionBuilder withEffectiveDate(String inItem){
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public ContractVersionBuilder withExpirationDate(String inItem){
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public ContractVersionBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public ContractVersionBuilder withVersionNumber(int inItem){
        builtObject.setVersionNumber(inItem);
        return this;
    }

    public ContractVersionBuilder withHiddenContract(boolean inItem){
        builtObject.setHiddenContract(inItem);
        return this;
    }

    public ContractVersionBuilder withExistence(ContractVersion.ExistenceEnum inItem){
        builtObject.setExistence(inItem);
        return this;
    }

    public ContractVersionBuilder withContractCover(ContractCover inItem){
        if(builtObject.getContractCovers() == null){
            builtObject.setContractCovers(new ArrayList<ContractCover>());
        }
        builtObject.addContractCoversItem(inItem);
        return this;
    }

    public ContractVersionBuilder withContractAttachment(ContractAttachment inItem){
        if(builtObject.getContractAttachments() == null){
            builtObject.setContractAttachments(new ArrayList<ContractAttachment>());
        }
        builtObject.addContractAttachmentsItem(inItem);
        return this;
    }
}
