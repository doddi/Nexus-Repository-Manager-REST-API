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
import io.swagger.client.model.Request;
import io.swagger.client.model.SupportZipXO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SupportApi
 */
@Ignore
public class SupportApiTest {

    private final SupportApi api = new SupportApi();

    /**
     * Creates and downloads a support zip
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supportzipTest() throws ApiException {
        Request body = null;
        api.supportzip(body);

        // TODO: test validations
    }
    /**
     * Creates a support zip and returns the path
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supportzippathTest() throws ApiException {
        Request body = null;
        SupportZipXO response = api.supportzippath(body);

        // TODO: test validations
    }
}
