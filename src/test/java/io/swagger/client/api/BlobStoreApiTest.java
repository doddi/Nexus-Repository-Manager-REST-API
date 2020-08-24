/*
 * Nexus Repository Manager REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.27.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BlobStoreQuotaResultXO;
import io.swagger.client.model.FileBlobStoreApiCreateRequest;
import io.swagger.client.model.FileBlobStoreApiModel;
import io.swagger.client.model.FileBlobStoreApiUpdateRequest;
import io.swagger.client.model.GenericBlobStoreApiResponse;
import io.swagger.client.model.GroupBlobStoreApiCreateRequest;
import io.swagger.client.model.GroupBlobStoreApiModel;
import io.swagger.client.model.GroupBlobStoreApiResponse;
import io.swagger.client.model.GroupBlobStoreApiUpdateRequest;
import io.swagger.client.model.S3BlobStoreApiModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlobStoreApi
 */
@Ignore
public class BlobStoreApiTest {

    private final BlobStoreApi api = new BlobStoreApi();

    /**
     * Create an S3 blob store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBlobStoreTest() throws ApiException {
        S3BlobStoreApiModel body = null;
        api.createBlobStore(body);

        // TODO: test validations
    }
    /**
     * Create a file blob store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFileBlobStoreTest() throws ApiException {
        FileBlobStoreApiCreateRequest body = null;
        api.createFileBlobStore(body);

        // TODO: test validations
    }
    /**
     * Create a group blob store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupBlobStoreTest() throws ApiException {
        GroupBlobStoreApiCreateRequest body = null;
        api.createGroupBlobStore(body);

        // TODO: test validations
    }
    /**
     * Delete a blob store by name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBlobStoreTest() throws ApiException {
        String name = null;
        api.deleteBlobStore(name);

        // TODO: test validations
    }
    /**
     * Fetch a S3 blob store configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBlobStoreTest() throws ApiException {
        String name = null;
        api.getBlobStore(name);

        // TODO: test validations
    }
    /**
     * Get a file blob store configuration by name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileBlobStoreConfigurationTest() throws ApiException {
        String name = null;
        FileBlobStoreApiModel response = api.getFileBlobStoreConfiguration(name);

        // TODO: test validations
    }
    /**
     * Get a group blob store configuration by name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupBlobStoreConfigurationTest() throws ApiException {
        String name = null;
        GroupBlobStoreApiModel response = api.getGroupBlobStoreConfiguration(name);

        // TODO: test validations
    }
    /**
     * List the blob stores
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBlobStoresTest() throws ApiException {
        List<GenericBlobStoreApiResponse> response = api.listBlobStores();

        // TODO: test validations
    }
    /**
     * Promote a blob store to a group blob store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void promoteBlobStoreToGroupTest() throws ApiException {
        String name = null;
        GroupBlobStoreApiResponse response = api.promoteBlobStoreToGroup(name);

        // TODO: test validations
    }
    /**
     * Get quota status for a given blob store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void quotaStatusTest() throws ApiException {
        String name = null;
        BlobStoreQuotaResultXO response = api.quotaStatus(name);

        // TODO: test validations
    }
    /**
     * Update an S3 blob store configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBlobStoreTest() throws ApiException {
        String name = null;
        S3BlobStoreApiModel body = null;
        api.updateBlobStore(name, body);

        // TODO: test validations
    }
    /**
     * Update a file blob store configuration by name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFileBlobStoreTest() throws ApiException {
        String name = null;
        FileBlobStoreApiUpdateRequest body = null;
        api.updateFileBlobStore(name, body);

        // TODO: test validations
    }
    /**
     * Update a group blob store configuration by name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupBlobStoreTest() throws ApiException {
        String name = null;
        GroupBlobStoreApiUpdateRequest body = null;
        api.updateGroupBlobStore(name, body);

        // TODO: test validations
    }
}
