package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.Negotiation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NegotiationsApi
 */
public class NegotiationsApiTest {

    private NegotiationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(NegotiationsApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void negotiationsCreateTest() {
        Negotiation data = null;
        // Negotiation response = api.negotiationsCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void negotiationsDeleteTest() {
        String itemIdentifierInternal = null;
        // api.negotiationsDelete(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void negotiationsListTest() {
        // List<Negotiation> response = api.negotiationsList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void negotiationsPartialUpdateTest() {
        String itemIdentifierInternal = null;
        Negotiation data = null;
        // Negotiation response = api.negotiationsPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void negotiationsReadTest() {
        String itemIdentifierInternal = null;
        // Negotiation response = api.negotiationsRead(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void negotiationsUpdateTest() {
        String itemIdentifierInternal = null;
        Negotiation data = null;
        // Negotiation response = api.negotiationsUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
}
