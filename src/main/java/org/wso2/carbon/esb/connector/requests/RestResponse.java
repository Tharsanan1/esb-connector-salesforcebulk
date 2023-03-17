/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.esb.connector.requests;

public class RestResponse {
    private int statusCode;
    private String response;
    private boolean isError;
    private String errorMessage;
    private String errorDetails;

    public RestResponse(int statusCode, String response) {
        this.statusCode = statusCode;
        this.response = response;
        this.isError = false;
    }

    public RestResponse(int statusCode, String errorMessage, String errorDetails) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
        this.isError = true;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponse() {

        return response;
    }

    public void setStatusCode(int statusCode) {

        this.statusCode = statusCode;
    }

    public void setResponse(String response) {

        this.response = response;
    }

    public boolean isError() {

        return isError;
    }

    public void setError(boolean error) {

        isError = error;
    }

    public String getErrorMessage() {

        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {

        this.errorMessage = errorMessage;
    }

    public String getErrorDetails() {

        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {

        this.errorDetails = errorDetails;
    }
}
