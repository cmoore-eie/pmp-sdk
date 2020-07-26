package pmp.sdk.api;

import org.junit.Assert;
import pmp.sdk.ApiClient;
import pmp.sdk.builders.ContractAttachmentBuilder;
import pmp.sdk.builders.ContractBuilder;
import pmp.sdk.builders.ContractCoverBuilder;
import pmp.sdk.builders.ContractVersionBuilder;
import pmp.sdk.model.Contract;
import org.junit.Before;
import org.junit.Test;
import pmp.sdk.model.ContractAttachment;
import pmp.sdk.model.ContractCover;
import pmp.sdk.model.ContractVersion;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * API tests for ContractsApi
 */
public class ContractsApiTest {

    private ContractsApi api;
    private Contract contract_data;
    private List<String> cleanupItems;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ContractsApi.class);
        cleanupItems = new ArrayList<String>();
        contract_data = setupContract();
    }

    @Test
    public void contractCleanUpTest() {
        maybeCreate();
        cleanUp();
        VirtualProductsApi.VirtualProductsListQueryParams query_params = new VirtualProductsApi.VirtualProductsListQueryParams();
        List<Contract> itemList = api.contractsList(query_params);
        boolean found = false;
        for(Contract item: itemList){
            if(cleanupItems.contains(item.getItemIdentifier())){
                found = true;
            }
        }
        Assert.assertFalse(found);
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void contractsCreateTest() {
        Contract response = api.contractsCreate(contract_data);
        Assert.assertEquals(response.getItemIdentifier(), contract_data.getItemIdentifier());
        Assert.assertTrue(response.getContractVersions().size() == 3);
        Assert.assertTrue(response.getContractVersions().get(0).getContractCovers().size() > 0);
        Assert.assertTrue(response.getContractVersions().get(0).getContractAttachments().size() > 0);
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void contractsDeleteTest() {
        Contract response = api.contractsCreate(contract_data);
        String itemIdentifier = contract_data.getItemIdentifier();
        api.contractsDelete(itemIdentifier);
        List<Contract> check_list = findContract(contract_data.getItemIdentifier());
        Assert.assertTrue(check_list.isEmpty());
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void contractsListTest() {
        maybeCreate();
        ContractsApi.ContractsListQueryParams query_params = new ContractsApi.ContractsListQueryParams();
        List<Contract> response = api.contractsList(query_params);
        Assert.assertTrue(response.size() > 0);
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void contractsPartialUpdateTest() {
        String itemIdentifierInternal = null;
        Contract data = null;
        // Contract response = api.contractsPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void contractsReadTest() {
        maybeCreate();
        String itemIdentifier = contract_data.getItemIdentifier();
        Contract response = api.contractsRead(itemIdentifier);
        Assert.assertEquals(response.getItemIdentifier(), contract_data.getItemIdentifier());
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void contractsUpdateTest() {
        maybeCreate();
        //
        // Change Data on the Virtual Product
        //
        String itemIdentifier = contract_data.getItemIdentifier();
        Contract data = api.contractsRead(itemIdentifier);
        data.setName("Changed Name");
        data.setLocked(true);
        String findIdentifier = data.getContractVersions().get(0).getItemIdentifier();
        ContractVersion version = findVersionForIdentifier(data, findIdentifier);
        version.setHiddenContract(true);

        ContractVersion new_version = new ContractVersionBuilder()
                .withDefaults()
                .withContractAttachment(new ContractAttachmentBuilder()
                        .withDefaults()
                        .getContractAttachment())
                .getContractVersion();

        data.addContractVersionsItem(new_version);

//        VirtualProductLine line = findLineForLineCode(data, "CPLine");
//        line.setLineCode("IMLine");
        //
        // Add a New flavour to the Virtual Product
        //
//        VirtualProductFlavour new_flavour = new VirtualProductFlavour();
//        new_flavour.itemIdentifier(UUID.randomUUID().toString());
//        new_flavour.code("newflavour");
//        new_flavour.defaultFlavour(false);
//        new_flavour.effectiveDate("2019-11-21");
//        new_flavour.name("New Flavour");
//        new_flavour.lineCode("CPLine");
//        new_flavour.priority(10);
//        data.addVirtualProductFlavoursItem(new_flavour);
        //
        // Delete existing flavour, we mark the flavour for purge and let PMPS take care of the deletion from the
        // database
        //
//        VirtualProductFlavour deleteFlavour = findFlavourForName(data, "VIP");
//        deleteFlavour.setPurge(true);

        Contract response = api.contractsUpdate(itemIdentifier, data);
        Contract changed = api.contractsRead(itemIdentifier);
        ContractVersion changedVersion = findVersionForIdentifier(changed, findIdentifier);
        Assert.assertEquals(changed.getName(), "Changed Name");
        Assert.assertTrue(changed.getLocked());
        Assert.assertNotNull(changedVersion);
//        Assert.assertTrue(changed.getVirtualProductFlavours().size() == 2);
//        Assert.assertNotNull(findLineForLineCode(changed, "IMLine"));
        cleanUp();
    }

    private Contract setupContract(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format( new Date()   );

        ContractBuilder contractBuilder = new ContractBuilder()
                .withDefaults();

        contractBuilder.withContractVersion(new ContractVersionBuilder()
                .withDefaults()
                .withExistence(ContractVersion.ExistenceEnum.ELECTABLE)
                .withContractCover(new ContractCoverBuilder()
                        .withDefaults()
                        .getContractCover())
                .withContractAttachment(new ContractAttachmentBuilder()
                        .withDefaults()
                        .getContractAttachment())
                .getContractVersion()
        );

        contractBuilder.withContractVersion(new ContractVersionBuilder()
                .withDefaults()
                .withExistence(ContractVersion.ExistenceEnum.REQUIRED)
                .withContractCover(new ContractCoverBuilder()
                        .withDefaults()
                        .getContractCover())
                .withContractAttachment(new ContractAttachmentBuilder()
                        .withDefaults()
                        .getContractAttachment())
                .getContractVersion()
        );

        contractBuilder.withContractVersion(new ContractVersionBuilder()
                .withDefaults()
                .withExistence(ContractVersion.ExistenceEnum.SUGGESTED)
                .withContractCover(new ContractCoverBuilder()
                        .withDefaults()
                        .getContractCover())
                .withContractAttachment(new ContractAttachmentBuilder()
                        .withDefaults()
                        .getContractAttachment())
                .getContractVersion()
        );

        Contract data = contractBuilder.getContract();

        cleanupItems.add(data.getItemIdentifier());

        return data;
    }

    /**
     * Remove the ones that have been created for the test and leave what was in the database before
     */
    private void cleanUp(){
        for(String identifier: cleanupItems) {
            VirtualProductsApi.VirtualProductsListQueryParams query_params = new VirtualProductsApi.VirtualProductsListQueryParams();
            query_params.withIdentifier(identifier);
            List<Contract> itemList = api.contractsList(query_params);
            for (Contract itemLoop : itemList) {
                api.contractsDelete(itemLoop.getItemIdentifier());
            }
        }
    }

    private void maybeCreate(){
        List<Contract> check_list = findContract(contract_data.getItemIdentifier());
        if(check_list.isEmpty()){
            Contract create_response = api.contractsCreate(contract_data);
        }
    }

    private List<Contract> findContract(String inIdentifier){
        ContractsApi.ContractsListQueryParams check_query = new ContractsApi.ContractsListQueryParams();
        check_query.withIdentifier(contract_data.getItemIdentifier());
        List<Contract> check_list = api.contractsList(check_query);
        return check_list;
    }

    private ContractVersion findVersionForIdentifier(Contract inContract, String inIdentifire){
        for(ContractVersion itemloop : inContract.getContractVersions()){
            if(itemloop.getItemIdentifier().equalsIgnoreCase(inIdentifire)){
                return itemloop;
            }
        }
        return null;
    }

    
}
