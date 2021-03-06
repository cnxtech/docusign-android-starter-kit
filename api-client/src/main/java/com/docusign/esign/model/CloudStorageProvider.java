package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CloudStorageProvider implements Serializable {

    @SerializedName("authenticationUrl")
    private String authenticationUrl = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("redirectUrl")
    private String redirectUrl = null;

    @SerializedName("service")
    private String service = null;

    @SerializedName("serviceId")
    private String serviceId = null;


    /**
     * The authentication URL used for the cloud storage provider. This information is only included in the response if the user has not passed authentication for the cloud storage provider. If the redirectUrl query string is provided, the returnUrl is appended to the authenticationUrl.
     **/
    @ApiModelProperty(value = "The authentication URL used for the cloud storage provider. This information is only included in the response if the user has not passed authentication for the cloud storage provider. If the redirectUrl query string is provided, the returnUrl is appended to the authenticationUrl. ")
    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    public void setAuthenticationUrl(String authenticationUrl) {
        this.authenticationUrl = authenticationUrl;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     * The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.\n\nThe redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.
     **/
    @ApiModelProperty(value = "The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.\n\nThe redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.")
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }


    /**
     * The service name for the cloud storage provider.
     **/
    @ApiModelProperty(value = "The service name for the cloud storage provider.")
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }


    /**
     * The DocuSign generated ID for the cloud storage provider
     **/
    @ApiModelProperty(value = "The DocuSign generated ID for the cloud storage provider")
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudStorageProvider cloudStorageProvider = (CloudStorageProvider) o;
        return Objects.equals(authenticationUrl, cloudStorageProvider.authenticationUrl) &&
                Objects.equals(errorDetails, cloudStorageProvider.errorDetails) &&
                Objects.equals(redirectUrl, cloudStorageProvider.redirectUrl) &&
                Objects.equals(service, cloudStorageProvider.service) &&
                Objects.equals(serviceId, cloudStorageProvider.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationUrl, errorDetails, redirectUrl, service, serviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudStorageProvider {\n");

        sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
