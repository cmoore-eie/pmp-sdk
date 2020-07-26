package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.ConditionLogic;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConditionLogicApi
 */
public class ConditionLogicApiTest {

    private ConditionLogicApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ConditionLogicApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void conditionLogicCreateTest() {
        ConditionLogic data = null;
        // ConditionLogic response = api.conditionLogicCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void conditionLogicDeleteTest() {
        String itemIdentifierInternal = null;
        // api.conditionLogicDelete(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void conditionLogicListTest() {
        // List<ConditionLogic> response = api.conditionLogicList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void conditionLogicPartialUpdateTest() {
        String itemIdentifierInternal = null;
        ConditionLogic data = null;
        // ConditionLogic response = api.conditionLogicPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void conditionLogicReadTest() {
        String itemIdentifierInternal = null;
        // ConditionLogic response = api.conditionLogicRead(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void conditionLogicUpdateTest() {
        String itemIdentifierInternal = null;
        ConditionLogic data = null;
        // ConditionLogic response = api.conditionLogicUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
}
