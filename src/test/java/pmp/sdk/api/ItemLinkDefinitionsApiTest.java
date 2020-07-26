package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.ItemLinkDefinition;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemLinkDefinitionsApi
 */
public class ItemLinkDefinitionsApiTest {

    private ItemLinkDefinitionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ItemLinkDefinitionsApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinkDefinitionsCreateTest() {
        ItemLinkDefinition data = null;
        // ItemLinkDefinition response = api.itemLinkDefinitionsCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinkDefinitionsDeleteTest() {
        Integer id = null;
        // api.itemLinkDefinitionsDelete(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinkDefinitionsListTest() {
        // List<ItemLinkDefinition> response = api.itemLinkDefinitionsList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinkDefinitionsPartialUpdateTest() {
        Integer id = null;
        ItemLinkDefinition data = null;
        // ItemLinkDefinition response = api.itemLinkDefinitionsPartialUpdate(id, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinkDefinitionsReadTest() {
        Integer id = null;
        // ItemLinkDefinition response = api.itemLinkDefinitionsRead(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinkDefinitionsUpdateTest() {
        Integer id = null;
        ItemLinkDefinition data = null;
        // ItemLinkDefinition response = api.itemLinkDefinitionsUpdate(id, data);

        // TODO: test validations
    }

    
}
