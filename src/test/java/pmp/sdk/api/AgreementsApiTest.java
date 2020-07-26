package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.Agreement;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgreementsApi
 */
public class AgreementsApiTest {

    private AgreementsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AgreementsApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void agreementsCreateTest() {
        Agreement data = null;
        // Agreement response = api.agreementsCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void agreementsDeleteTest() {
        String itemIdentifierInternal = null;
        // api.agreementsDelete(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void agreementsListTest() {
        // List<Agreement> response = api.agreementsList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void agreementsPartialUpdateTest() {
        String itemIdentifierInternal = null;
        Agreement data = null;
        // Agreement response = api.agreementsPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void agreementsReadTest() {
        String itemIdentifierInternal = null;
        // Agreement response = api.agreementsRead(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void agreementsUpdateTest() {
        String itemIdentifierInternal = null;
        Agreement data = null;
        // Agreement response = api.agreementsUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
}
