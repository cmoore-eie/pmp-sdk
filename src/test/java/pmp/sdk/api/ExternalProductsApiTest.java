package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.ExternalProduct;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalProductsApi
 */
public class ExternalProductsApiTest {

    private ExternalProductsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ExternalProductsApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void externalProductsCreateTest() {
        ExternalProduct data = null;
        // ExternalProduct response = api.externalProductsCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void externalProductsDeleteTest() {
        String itemIdentifierInternal = null;
        // api.externalProductsDelete(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void externalProductsListTest() {
        // List<ExternalProduct> response = api.externalProductsList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void externalProductsPartialUpdateTest() {
        String itemIdentifierInternal = null;
        ExternalProduct data = null;
        // ExternalProduct response = api.externalProductsPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void externalProductsReadTest() {
        String itemIdentifierInternal = null;
        // ExternalProduct response = api.externalProductsRead(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void externalProductsUpdateTest() {
        String itemIdentifierInternal = null;
        ExternalProduct data = null;
        // ExternalProduct response = api.externalProductsUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
}
