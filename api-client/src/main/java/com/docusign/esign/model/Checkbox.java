package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Checkbox implements Serializable {

    @SerializedName("anchorCaseSensitive")
    private String anchorCaseSensitive = null;

    @SerializedName("anchorHorizontalAlignment")
    private String anchorHorizontalAlignment = null;

    @SerializedName("anchorIgnoreIfNotPresent")
    private String anchorIgnoreIfNotPresent = null;

    @SerializedName("anchorMatchWholeWord")
    private String anchorMatchWholeWord = null;

    @SerializedName("anchorString")
    private String anchorString = null;

    @SerializedName("anchorUnits")
    private String anchorUnits = null;

    @SerializedName("anchorXOffset")
    private String anchorXOffset = null;

    @SerializedName("anchorYOffset")
    private String anchorYOffset = null;

    @SerializedName("conditionalParentLabel")
    private String conditionalParentLabel = null;

    @SerializedName("conditionalParentValue")
    private String conditionalParentValue = null;

    @SerializedName("customTabId")
    private String customTabId = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("locked")
    private String locked = null;

    @SerializedName("mergeField")
    private MergeField mergeField = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("pageNumber")
    private String pageNumber = null;

    @SerializedName("recipientId")
    private String recipientId = null;

    @SerializedName("required")
    private String required = null;

    @SerializedName("requireInitialOnSharedChange")
    private String requireInitialOnSharedChange = null;

    @SerializedName("selected")
    private String selected = null;

    @SerializedName("shared")
    private String shared = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("tabId")
    private String tabId = null;

    @SerializedName("tabLabel")
    private String tabLabel = null;

    @SerializedName("tabOrder")
    private String tabOrder = null;

    @SerializedName("templateLocked")
    private String templateLocked = null;

    @SerializedName("templateRequired")
    private String templateRequired = null;

    @SerializedName("xPosition")
    private String xPosition = null;

    @SerializedName("yPosition")
    private String yPosition = null;


    /**
     * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
     **/
    @ApiModelProperty(value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
    public String getAnchorCaseSensitive() {
        return anchorCaseSensitive;
    }

    public void setAnchorCaseSensitive(String anchorCaseSensitive) {
        this.anchorCaseSensitive = anchorCaseSensitive;
    }


    /**
     * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
     **/
    @ApiModelProperty(value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
    public String getAnchorHorizontalAlignment() {
        return anchorHorizontalAlignment;
    }

    public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
        this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    }


    /**
     * When set to **true**, this tab is ignored if anchorString is not found in the document.
     **/
    @ApiModelProperty(value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
    public String getAnchorIgnoreIfNotPresent() {
        return anchorIgnoreIfNotPresent;
    }

    public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
        this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    }


    /**
     * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
     **/
    @ApiModelProperty(value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
    public String getAnchorMatchWholeWord() {
        return anchorMatchWholeWord;
    }

    public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
        this.anchorMatchWholeWord = anchorMatchWholeWord;
    }


    /**
     * Anchor text information for a radio button.
     **/
    @ApiModelProperty(value = "Anchor text information for a radio button.")
    public String getAnchorString() {
        return anchorString;
    }

    public void setAnchorString(String anchorString) {
        this.anchorString = anchorString;
    }


    /**
     * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
     **/
    @ApiModelProperty(value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
    public String getAnchorUnits() {
        return anchorUnits;
    }

    public void setAnchorUnits(String anchorUnits) {
        this.anchorUnits = anchorUnits;
    }


    /**
     * Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.
     **/
    @ApiModelProperty(value = "Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.")
    public String getAnchorXOffset() {
        return anchorXOffset;
    }

    public void setAnchorXOffset(String anchorXOffset) {
        this.anchorXOffset = anchorXOffset;
    }


    /**
     * Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.
     **/
    @ApiModelProperty(value = "Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.")
    public String getAnchorYOffset() {
        return anchorYOffset;
    }

    public void setAnchorYOffset(String anchorYOffset) {
        this.anchorYOffset = anchorYOffset;
    }


    /**
     * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
     **/
    @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
    public String getConditionalParentLabel() {
        return conditionalParentLabel;
    }

    public void setConditionalParentLabel(String conditionalParentLabel) {
        this.conditionalParentLabel = conditionalParentLabel;
    }


    /**
     * For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n
     **/
    @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n")
    public String getConditionalParentValue() {
        return conditionalParentValue;
    }

    public void setConditionalParentValue(String conditionalParentValue) {
        this.conditionalParentValue = conditionalParentValue;
    }


    /**
     * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.
     **/
    @ApiModelProperty(value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
    public String getCustomTabId() {
        return customTabId;
    }

    public void setCustomTabId(String customTabId) {
        this.customTabId = customTabId;
    }


    /**
     * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
     **/
    @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
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
     * When set to **true**, the signer cannot change the data of the custom tab.
     **/
    @ApiModelProperty(value = "When set to **true**, the signer cannot change the data of the custom tab.")
    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public MergeField getMergeField() {
        return mergeField;
    }

    public void setMergeField(MergeField mergeField) {
        this.mergeField = mergeField;
    }


    /**
     * Specifies the tool tip text for the tab.
     **/
    @ApiModelProperty(value = "Specifies the tool tip text for the tab.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Specifies the page number on which the tab is located.
     **/
    @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
     **/
    @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }


    /**
     * When set to **true**, the signer is required to fill out this tab
     **/
    @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }


    /**
     * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
     **/
    @ApiModelProperty(value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
    public String getRequireInitialOnSharedChange() {
        return requireInitialOnSharedChange;
    }

    public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
        this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    }


    /**
     * When set to **true**, the checkbox is selected.
     **/
    @ApiModelProperty(value = "When set to **true**, the checkbox is selected.")
    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
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
     * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. \n\n \n
     **/
    @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. \n\n \n")
    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }


    /**
     * The label string associated with the tab.
     **/
    @ApiModelProperty(value = "The label string associated with the tab.")
    public String getTabLabel() {
        return tabLabel;
    }

    public void setTabLabel(String tabLabel) {
        this.tabLabel = tabLabel;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTabOrder() {
        return tabOrder;
    }

    public void setTabOrder(String tabOrder) {
        this.tabOrder = tabOrder;
    }


    /**
     * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
    public String getTemplateLocked() {
        return templateLocked;
    }

    public void setTemplateLocked(String templateLocked) {
        this.templateLocked = templateLocked;
    }


    /**
     * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
    public String getTemplateRequired() {
        return templateRequired;
    }

    public void setTemplateRequired(String templateRequired) {
        this.templateRequired = templateRequired;
    }


    /**
     * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
     **/
    @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
    public String getXPosition() {
        return xPosition;
    }

    public void setXPosition(String xPosition) {
        this.xPosition = xPosition;
    }


    /**
     * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
     **/
    @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
    public String getYPosition() {
        return yPosition;
    }

    public void setYPosition(String yPosition) {
        this.yPosition = yPosition;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Checkbox checkbox = (Checkbox) o;
        return Objects.equals(anchorCaseSensitive, checkbox.anchorCaseSensitive) &&
                Objects.equals(anchorHorizontalAlignment, checkbox.anchorHorizontalAlignment) &&
                Objects.equals(anchorIgnoreIfNotPresent, checkbox.anchorIgnoreIfNotPresent) &&
                Objects.equals(anchorMatchWholeWord, checkbox.anchorMatchWholeWord) &&
                Objects.equals(anchorString, checkbox.anchorString) &&
                Objects.equals(anchorUnits, checkbox.anchorUnits) &&
                Objects.equals(anchorXOffset, checkbox.anchorXOffset) &&
                Objects.equals(anchorYOffset, checkbox.anchorYOffset) &&
                Objects.equals(conditionalParentLabel, checkbox.conditionalParentLabel) &&
                Objects.equals(conditionalParentValue, checkbox.conditionalParentValue) &&
                Objects.equals(customTabId, checkbox.customTabId) &&
                Objects.equals(documentId, checkbox.documentId) &&
                Objects.equals(errorDetails, checkbox.errorDetails) &&
                Objects.equals(locked, checkbox.locked) &&
                Objects.equals(mergeField, checkbox.mergeField) &&
                Objects.equals(name, checkbox.name) &&
                Objects.equals(pageNumber, checkbox.pageNumber) &&
                Objects.equals(recipientId, checkbox.recipientId) &&
                Objects.equals(required, checkbox.required) &&
                Objects.equals(requireInitialOnSharedChange, checkbox.requireInitialOnSharedChange) &&
                Objects.equals(selected, checkbox.selected) &&
                Objects.equals(shared, checkbox.shared) &&
                Objects.equals(status, checkbox.status) &&
                Objects.equals(tabId, checkbox.tabId) &&
                Objects.equals(tabLabel, checkbox.tabLabel) &&
                Objects.equals(tabOrder, checkbox.tabOrder) &&
                Objects.equals(templateLocked, checkbox.templateLocked) &&
                Objects.equals(templateRequired, checkbox.templateRequired) &&
                Objects.equals(xPosition, checkbox.xPosition) &&
                Objects.equals(yPosition, checkbox.yPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, conditionalParentLabel, conditionalParentValue, customTabId, documentId, errorDetails, locked, mergeField, name, pageNumber, recipientId, required, requireInitialOnSharedChange, selected, shared, status, tabId, tabLabel, tabOrder, templateLocked, templateRequired, xPosition, yPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Checkbox {\n");

        sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
        sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
        sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
        sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
        sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
        sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
        sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
        sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
        sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
        sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
        sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
        sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
        sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
        sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
        sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
        sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
        sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
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
