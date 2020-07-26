package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.SchemeCondition;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchemeConditionsApi
 */
public class SchemeConditionsApiTest {

    private SchemeConditionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SchemeConditionsApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemeConditionsCreateTest() {
        SchemeCondition data = null;
        // SchemeCondition response = api.schemeConditionsCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemeConditionsDeleteTest() {
        String itemIdentifierInternal = null;
        // api.schemeConditionsDelete(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemeConditionsListTest() {
        // List<SchemeCondition> response = api.schemeConditionsList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemeConditionsPartialUpdateTest() {
        String itemIdentifierInternal = null;
        SchemeCondition data = null;
        // SchemeCondition response = api.schemeConditionsPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemeConditionsReadTest() {
        String itemIdentifierInternal = null;
        // SchemeCondition response = api.schemeConditionsRead(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void schemeConditionsUpdateTest() {
        String itemIdentifierInternal = null;
        SchemeCondition data = null;
        // SchemeCondition response = api.schemeConditionsUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
}
