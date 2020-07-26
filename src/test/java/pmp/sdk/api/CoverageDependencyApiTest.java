package pmp.sdk.api;

import pmp.sdk.ApiClient;
import pmp.sdk.model.CoverageDependency;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CoverageDependencyApi
 */
public class CoverageDependencyApiTest {

    private CoverageDependencyApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CoverageDependencyApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void coverageDependencyCreateTest() {
        CoverageDependency data = null;
        // CoverageDependency response = api.coverageDependencyCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void coverageDependencyDeleteTest() {
        String itemIdentifierInternal = null;
        // api.coverageDependencyDelete(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void coverageDependencyListTest() {
        // List<CoverageDependency> response = api.coverageDependencyList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void coverageDependencyPartialUpdateTest() {
        String itemIdentifierInternal = null;
        CoverageDependency data = null;
        // CoverageDependency response = api.coverageDependencyPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void coverageDependencyReadTest() {
        String itemIdentifierInternal = null;
        // CoverageDependency response = api.coverageDependencyRead(itemIdentifierInternal);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void coverageDependencyUpdateTest() {
        String itemIdentifierInternal = null;
        CoverageDependency data = null;
        // CoverageDependency response = api.coverageDependencyUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    
}
