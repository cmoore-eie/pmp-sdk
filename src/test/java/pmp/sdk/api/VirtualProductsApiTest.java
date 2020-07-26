package pmp.sdk.api;

import org.junit.Assert;
import pmp.sdk.ApiClient;
import pmp.sdk.builders.*;
import pmp.sdk.model.*;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * API tests for VirtualProductsApi
 */
public class VirtualProductsApiTest {

    private VirtualProductsApi api;
    private VirtualProduct vp_data;
    private List<String> cleanupItems;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(VirtualProductsApi.class);
        cleanupItems = new ArrayList<String>();
        vp_data = setupVirtualProduct();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void virtualProductsCreateTest() {
        VirtualProduct response = api.virtualProductsCreate(vp_data);
        Assert.assertEquals(response.getItemIdentifier(), vp_data.getItemIdentifier());
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void virtualProductsDeleteTest() {
        VirtualProduct response = api.virtualProductsCreate(vp_data);
        String itemIdentifier = vp_data.getItemIdentifier();
        api.virtualProductsDelete(itemIdentifier);
        List<VirtualProduct> check_list = findVirtualProduct(vp_data.getItemIdentifier());
        Assert.assertTrue(check_list.isEmpty());
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void virtualProductsListTest() {
        maybeCreate();
        VirtualProductsApi.VirtualProductsListQueryParams query_params = new VirtualProductsApi.VirtualProductsListQueryParams();
        List<VirtualProduct> response = api.virtualProductsList(query_params);
        Assert.assertTrue(response.size() > 0);
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void virtualProductsPartialUpdateTest() {
        String itemIdentifier = null;
        VirtualProduct data = null;
        // VirtualProduct response = api.virtualProductsPartialUpdate(itemIdentifier, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void virtualProductsReadTest() {
        maybeCreate();
        String itemIdentifier = vp_data.getItemIdentifier();
        VirtualProduct response = api.virtualProductsRead(itemIdentifier);
        Assert.assertEquals(response.getItemIdentifier(), vp_data.getItemIdentifier());
        cleanUp();
    }

    @Test
    public void virtualProductsCleanUpTest() {
        maybeCreate();
        cleanUp();
        VirtualProductsApi.VirtualProductsListQueryParams query_params = new VirtualProductsApi.VirtualProductsListQueryParams();
        List<VirtualProduct> itemList = api.virtualProductsList(query_params);
        boolean found = false;
        for(VirtualProduct item: itemList){
            if(cleanupItems.contains(item.getItemIdentifier())){
                found = true;
            }
        }
        Assert.assertFalse(found);
    }

    
    /**
     * Tests for changes, deletions of child elements, addition of child elements
     * and change to child elements
     */
    @Test
    public void virtualProductsUpdateTest() {
        maybeCreate();
        //
        // Change Data on the Virtual Product
        //
        String itemIdentifier = vp_data.getItemIdentifier();
        VirtualProduct data = api.virtualProductsRead(itemIdentifier);
        data.setName("Changed Name");
        data.setLocked(true);

        VirtualProductFlavour flavour = findFlavourForName(data, "Base");
        flavour.setName("Changed Flavour Name");

        VirtualProductLine line = findLineForLineCode(data, "CPLine");
        line.setLineCode("IMLine");
        //
        // Add a New flavour to the Virtual Product
        //
        VirtualProductFlavour new_flavour = new VirtualProductFlavourBuilder()
                .withItemIdentifier(UUID.randomUUID().toString())
                .withCode("newflavour")
                .withDefaultFlavour(false)
                .withEffectiveDate("2019-11-21")
                .withName("New Flavour")
                .withLineCode("CPLine")
                .withPriority(10).getVirtualProductFlavour();

        data.addVirtualProductFlavoursItem(new_flavour);
        //
        // Delete existing flavour, we mark the flavour for purge and let PMPS take care of the deletion from the
        // database
        //
        VirtualProductFlavour deleteFlavour = findFlavourForName(data, "VIP");
        deleteFlavour.setPurge(true);

        VirtualProduct response = api.virtualProductsUpdate(itemIdentifier, data);
        VirtualProduct changed = api.virtualProductsRead(itemIdentifier);
        VirtualProductFlavour changedFlavour = findFlavourForName(changed, "Changed Flavour Name");
        Assert.assertEquals(changed.getName(), "Changed Name");
        Assert.assertTrue(changed.getLocked());
        Assert.assertNotNull(changedFlavour);
        Assert.assertTrue(changed.getVirtualProductFlavours().size() == 2);
        Assert.assertTrue(changed.getVirtualProductContracts().size() == 1);
        Assert.assertTrue(changed.getVirtualProductCategories().size() == 1);
        Assert.assertNotNull(findLineForLineCode(changed, "IMLine"));
        cleanUp();
    }

    private VirtualProduct setupVirtualProduct(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format( new Date()   );

        Contract contract = new ContractBuilder().withDefaults().update();

        VirtualProductBuilder builder = new VirtualProductBuilder()
                .withDefaults()
                .withCode("smallcommercialproperty")
                .withName("Small Commercial Property")
                .withVirtualProductLine(new VirtualProductLineBuilder()
                        .withDefaults()
                        .getVirtualProductLine())
                .withVirtualProductFlavours(new VirtualProductFlavourBuilder()
                        .withDefaults()
                        .getVirtualProductFlavour())
                .withVirtualProductFlavours(new VirtualProductFlavourBuilder()
                        .withDefaults()
                        .withCode("vip")
                        .withName("VIP")
                        .withDefaultFlavour(false)
                        .getVirtualProductFlavour())
                .withVirtualProductContract(new VirtualProductContractBuilder()
                        .withDefaults()
                        .withContractIdentifier(contract.getItemIdentifier())
                        .getVirtualProductContract())
                .withVirtualProductCategory(new VirtualProductCategoryBuilder()
                        .withDefaults()
                        .getVirtualProductCategory());

        VirtualProduct data = builder.getVirtualProduct();

        cleanupItems.add(data.getItemIdentifier());

        return data;
    }

    private void maybeCreate(){
        List<VirtualProduct> check_list = findVirtualProduct(vp_data.getItemIdentifier());
        if(check_list.isEmpty()){
            VirtualProduct create_response = api.virtualProductsCreate(vp_data);
        }
    }

    private List<VirtualProduct> findVirtualProduct(String inIdentifier){
        VirtualProductsApi.VirtualProductsListQueryParams check_query = new VirtualProductsApi.VirtualProductsListQueryParams();
        check_query.withIdentifier(vp_data.getItemIdentifier());
        return api.virtualProductsList(check_query);
    }

    private VirtualProductFlavour findFlavourForName(VirtualProduct inVP, String inCheckItem){
        for(VirtualProductFlavour itemloop : inVP.getVirtualProductFlavours()){
            if(itemloop.getName().equalsIgnoreCase(inCheckItem)){
                return itemloop;
            }
        }
        return null;
    }

    private VirtualProductLine findLineForLineCode(VirtualProduct inVP, String inCheckItem){
        for(VirtualProductLine itemloop : inVP.getVirtualProductLines()){
            if(itemloop.getLineCode().equalsIgnoreCase(inCheckItem)){
                return itemloop;
            }
        }
        return null;
    }

    /**
     * Remove the ones that have been created for the test and leave what was in the database before
     */
    private void cleanUp(){
        for(String identifier: cleanupItems) {
            VirtualProductsApi.VirtualProductsListQueryParams query_params = new VirtualProductsApi.VirtualProductsListQueryParams();
            query_params.withIdentifier(identifier);
            List<VirtualProduct> itemList = api.virtualProductsList(query_params);
            for (VirtualProduct itemLoop : itemList) {
                api.virtualProductsDelete(itemLoop.getItemIdentifier());
            }
        }
    }

    
}
