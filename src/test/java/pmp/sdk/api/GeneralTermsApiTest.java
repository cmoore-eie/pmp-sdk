package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.GeneralTerm;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneralTermsApi
 */
public class GeneralTermsApiTest {

    private GeneralTermsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GeneralTermsApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void generalTermsCreateTest() {
        GeneralTerm data = null;
        // GeneralTerm response = api.generalTermsCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void generalTermsDeleteTest() {
        String itemIdentifierInternal = null;
        // api.generalTermsDelete(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void generalTermsListTest() {
        // List<GeneralTerm> response = api.generalTermsList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void generalTermsPartialUpdateTest() {
        String itemIdentifierInternal = null;
        GeneralTerm data = null;
        // GeneralTerm response = api.generalTermsPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void generalTermsReadTest() {
        String itemIdentifierInternal = null;
        // GeneralTerm response = api.generalTermsRead(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void generalTermsUpdateTest() {
        String itemIdentifierInternal = null;
        GeneralTerm data = null;
        // GeneralTerm response = api.generalTermsUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
}
