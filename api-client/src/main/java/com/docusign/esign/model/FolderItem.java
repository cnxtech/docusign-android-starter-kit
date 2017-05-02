package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class FolderItem implements Serializable {

    @SerializedName("completedDateTime")
    private String completedDateTime = null;

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("customFields")
    private java.util.List<CustomFieldV2> customFields = new java.util.ArrayList<CustomFieldV2>();

    @SerializedName("description")
    private String description = null;

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("envelopeUri")
    private String envelopeUri = null;

    @SerializedName("is21CFRPart11")
    private String is21CFRPart11 = null;

    @SerializedName("isSignatureProviderEnvelope")
    private String isSignatureProviderEnvelope = null;

    @SerializedName("lastModified")
    private String lastModified = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("ownerName")
    private String ownerName = null;

    @SerializedName("pageCount")
    private Integer pageCount = null;

    @SerializedName("password")
    private String password = null;

    @SerializedName("senderEmail")
    private String senderEmail = null;

    @SerializedName("senderName")
    private String senderName = null;

    @SerializedName("sentDateTime")
    private String sentDateTime = null;

    @SerializedName("shared")
    private String shared = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("subject")
    private String subject = null;

    @SerializedName("templateId")
    private String templateId = null;

    @SerializedName("uri")
    private String uri = null;


    /**
     * Specifies the date and time this item was completed.
     **/
    @ApiModelProperty(value = "Specifies the date and time this item was completed.")
    public String getCompletedDateTime() {
        return completedDateTime;
    }

    public void setCompletedDateTime(String completedDateTime) {
        this.completedDateTime = completedDateTime;
    }


    /**
     * Indicates the date and time the item was created.
     **/
    @ApiModelProperty(value = "Indicates the date and time the item was created.")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }


    /**
     * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
     **/
    @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
    public java.util.List<CustomFieldV2> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(java.util.List<CustomFieldV2> customFields) {
        this.customFields = customFields;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * The envelope ID of the envelope status that failed to post.
     **/
    @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
    public String getEnvelopeUri() {
        return envelopeUri;
    }

    public void setEnvelopeUri(String envelopeUri) {
        this.envelopeUri = envelopeUri;
    }


    /**
     * When set to **true**, indicates that this module is enabled on the account.
     **/
    @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
    public String getIs21CFRPart11() {
        return is21CFRPart11;
    }

    public void setIs21CFRPart11(String is21CFRPart11) {
        this.is21CFRPart11 = is21CFRPart11;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsSignatureProviderEnvelope() {
        return isSignatureProviderEnvelope;
    }

    public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
        this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Name of the envelope owner.
     **/
    @ApiModelProperty(value = "Name of the envelope owner.")
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Name of the envelope sender.
     **/
    @ApiModelProperty(value = "Name of the envelope sender.")
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }


    /**
     * The date and time the envelope was sent.
     **/
    @ApiModelProperty(value = "The date and time the envelope was sent.")
    public String getSentDateTime() {
        return sentDateTime;
    }

    public void setSentDateTime(String sentDateTime) {
        this.sentDateTime = sentDateTime;
    }


    /**
     * When set to **true**, this custom tab is shared.
     **/
    @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }


    /**
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    /**
     * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
     **/
    @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FolderItem folderItem = (FolderItem) o;
        return Objects.equals(completedDateTime, folderItem.completedDateTime) &&
                Objects.equals(createdDateTime, folderItem.createdDateTime) &&
                Objects.equals(customFields, folderItem.customFields) &&
                Objects.equals(description, folderItem.description) &&
                Objects.equals(envelopeId, folderItem.envelopeId) &&
                Objects.equals(envelopeUri, folderItem.envelopeUri) &&
                Objects.equals(is21CFRPart11, folderItem.is21CFRPart11) &&
                Objects.equals(isSignatureProviderEnvelope, folderItem.isSignatureProviderEnvelope) &&
                Objects.equals(lastModified, folderItem.lastModified) &&
                Objects.equals(name, folderItem.name) &&
                Objects.equals(ownerName, folderItem.ownerName) &&
                Objects.equals(pageCount, folderItem.pageCount) &&
                Objects.equals(password, folderItem.password) &&
                Objects.equals(senderEmail, folderItem.senderEmail) &&
                Objects.equals(senderName, folderItem.senderName) &&
                Objects.equals(sentDateTime, folderItem.sentDateTime) &&
                Objects.equals(shared, folderItem.shared) &&
                Objects.equals(status, folderItem.status) &&
                Objects.equals(subject, folderItem.subject) &&
                Objects.equals(templateId, folderItem.templateId) &&
                Objects.equals(uri, folderItem.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completedDateTime, createdDateTime, customFields, description, envelopeId, envelopeUri, is21CFRPart11, isSignatureProviderEnvelope, lastModified, name, ownerName, pageCount, password, senderEmail, senderName, sentDateTime, shared, status, subject, templateId, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderItem {\n");

        sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
        sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
        sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
        sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
        sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
