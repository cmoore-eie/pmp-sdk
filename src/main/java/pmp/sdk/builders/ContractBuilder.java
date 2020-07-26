package pmp.sdk.builders;

import pmp.sdk.ApiClient;
import pmp.sdk.api.ContractsApi;
import pmp.sdk.model.Contract;
import pmp.sdk.model.ContractVersion;

import java.util.ArrayList;
import java.util.UUID;

public class ContractBuilder {

    Contract builtObject;

    public ContractBuilder(){
        builtObject = new Contract();
    }

    public ContractBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        withCode("testcontract");
        withName("Test Contract");
        withProductCode("CommercialProperty");
        withVersionNumber(1);
        withLocked(false);
        return this;
    }

    public Contract getContract(){
        return builtObject;
    }

    public ContractBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public ContractBuilder withCode(String inItem){
        builtObject.setCode(inItem);
        return this;
    }

    public ContractBuilder withName(String inItem){
        builtObject.setName(inItem);
        return this;
    }

    public ContractBuilder withProductCode(String inItem){
        builtObject.setProductCode(inItem);
        return this;
    }

    public ContractBuilder withLocked(boolean inItem){
        builtObject.setLocked(inItem);
        return this;
    }

    public ContractBuilder withVersionNumber(int inItem){
        builtObject.setVersionNumber(inItem);
        return this;
    }

    public ContractBuilder withContractVersion(ContractVersion inItem){
        if(builtObject.getContractVersions() == null){
            builtObject.setContractVersions(new ArrayList<ContractVersion>());
        }
        builtObject.addContractVersionsItem(inItem);
        return this;
    }

    public Contract update(){
        ContractsApi api = new ApiClient().buildClient(ContractsApi.class);
        Contract response = api.contractsCreate(builtObject);
        return response;
    }
}
