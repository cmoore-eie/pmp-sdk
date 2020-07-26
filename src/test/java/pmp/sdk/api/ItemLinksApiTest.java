package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.ItemLink;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemLinksApi
 */
public class ItemLinksApiTest {

    private ItemLinksApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ItemLinksApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinksCreateTest() {
        ItemLink data = null;
        // ItemLink response = api.itemLinksCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinksDeleteTest() {
        Integer id = null;
        // api.itemLinksDelete(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinksListTest() {
        // List<ItemLink> response = api.itemLinksList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinksPartialUpdateTest() {
        Integer id = null;
        ItemLink data = null;
        // ItemLink response = api.itemLinksPartialUpdate(id, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinksReadTest() {
        Integer id = null;
        // ItemLink response = api.itemLinksRead(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void itemLinksUpdateTest() {
        Integer id = null;
        ItemLink data = null;
        // ItemLink response = api.itemLinksUpdate(id, data);

        // TODO: test validations
    }

    
}
