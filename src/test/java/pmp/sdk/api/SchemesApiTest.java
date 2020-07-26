package pmp.sdk.api;

import org.junit.Assert;
import pmp.sdk.ApiClient;
import pmp.sdk.builders.SchemeBuilder;
import pmp.sdk.builders.SchemeDetailBuilder;
import pmp.sdk.model.Scheme;
import org.junit.Before;
import org.junit.Test;
import pmp.sdk.model.SchemeDetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchemesApi
 */
public class SchemesApiTest {

    private SchemesApi api;
    private Scheme scheme_data;
    private List<String> cleanupItems;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SchemesApi.class);
        cleanupItems = new ArrayList<String>();
        scheme_data = setupScheme();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemesCreateTest() {
        Scheme response = api.schemesCreate(scheme_data);
        Assert.assertEquals(response.getItemIdentifier(), scheme_data.getItemIdentifier());
        Assert.assertTrue(response.getSchemeDetails().size() > 0);
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemesDeleteTest() {
        Scheme response = api.schemesCreate(scheme_data);
        String itemIdentifier = scheme_data.getItemIdentifier();
        api.schemesDelete(itemIdentifier);
        List<Scheme> check_list = findVirtualProduct(scheme_data.getItemIdentifier());
        Assert.assertTrue(check_list.isEmpty());
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemesListTest() {
        maybeCreate();
        VirtualProductsApi.VirtualProductsListQueryParams query_params = new VirtualProductsApi.VirtualProductsListQueryParams();
        List<Scheme> response = api.schemesList(query_params);
        Assert.assertTrue(response.size() > 0);
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemesPartialUpdateTest() {
        String itemIdentifierInternal = null;
        Scheme data = null;
        // Scheme response = api.schemesPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemesReadTest() {
        maybeCreate();
        String itemIdentifier = scheme_data.getItemIdentifier();
        Scheme response = api.schemesRead(itemIdentifier);
        Assert.assertEquals(response.getItemIdentifier(), scheme_data.getItemIdentifier());
        cleanUp();
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemesUpdateTest() {
        String newName = "New Changed Scheme Name";
        maybeCreate();
        String itemIdentifier = scheme_data.getItemIdentifier();
        Scheme data = api.schemesRead(itemIdentifier);
        data.setName(newName);

        SchemeDetail newDetail = new SchemeDetailBuilder()
                .withDefaults()
                .withSchemeSourceType(SchemeDetail.SchemeSourceTypeEnum.ATTRIBUTE)
                .withParentCode("TestEntity")
                .withComparator("TestAttribute")
                .getSchemeDetail();

        data.addSchemeDetailsItem(newDetail);

        Scheme response = api.schemesUpdate(itemIdentifier, data);
        Scheme changed = api.schemesRead(itemIdentifier);
        Assert.assertEquals(changed.getName(), newName);
        Assert.assertTrue(changed.getSchemeDetails().size() == 2);
        cleanUp();
    }

    private Scheme setupScheme() {
        SchemeBuilder builder = new SchemeBuilder()
                .withDefaults()
                .withCode("testscheme")
                .withName("Test Scheme")
                .withSchemeDetails(new SchemeDetailBuilder()
                        .withDefaults()
                        .getSchemeDetail());

        Scheme data = builder.getScheme();
        cleanupItems.add(data.getItemIdentifier());
        return data;
    }

    private void cleanUp(){
        for(String identifier: cleanupItems) {
            SchemesApi.SchemesListQueryParams query_params = new SchemesApi.SchemesListQueryParams();
            query_params.withIdentifier(identifier);
            List<Scheme> itemList = api.schemesList(query_params);
            for (Scheme itemLoop : itemList) {
                api.schemesDelete(itemLoop.getItemIdentifier());
            }
        }
    }

    private void maybeCreate(){
        List<Scheme> check_list = findVirtualProduct(scheme_data.getItemIdentifier());
        if(check_list.isEmpty()){
            Scheme create_response = api.schemesCreate(scheme_data);
        }
    }

    private List<Scheme> findVirtualProduct(String inIdentifier){
        VirtualProductsApi.VirtualProductsListQueryParams check_query = new VirtualProductsApi.VirtualProductsListQueryParams();
        check_query.withIdentifier(scheme_data.getItemIdentifier());
        return api.schemesList(check_query);
    }

    
}
