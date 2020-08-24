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
import io.swagger.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
@Ignore
public class StatusApiTest {

    private final StatusApi api = new StatusApi();

    /**
     * Health check endpoint that returns the results of the system status checks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemStatusChecksTest() throws ApiException {
        Map<String, Result> response = api.getSystemStatusChecks();

        // TODO: test validations
    }
    /**
     * Health check endpoint that validates server can respond to read requests
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isAvailableTest() throws ApiException {
        api.isAvailable();

        // TODO: test validations
    }
    /**
     * Health check endpoint that validates server can respond to read and write requests
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isWritableTest() throws ApiException {
        api.isWritable();

        // TODO: test validations
    }
}
