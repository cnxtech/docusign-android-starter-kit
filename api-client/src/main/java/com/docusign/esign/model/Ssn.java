package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Ssn implements Serializable {

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

    @SerializedName("bold")
    private String bold = null;

    @SerializedName("concealValueOnDocument")
    private String concealValueOnDocument = null;

    @SerializedName("conditionalParentLabel")
    private String conditionalParentLabel = null;

    @SerializedName("conditionalParentValue")
    private String conditionalParentValue = null;

    @SerializedName("customTabId")
    private String customTabId = null;

    @SerializedName("disableAutoSize")
    private String disableAutoSize = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("font")
    private String font = null;

    @SerializedName("fontColor")
    private String fontColor = null;

    @SerializedName("fontSize")
    private String fontSize = null;

    @SerializedName("italic")
    private String italic = null;

    @SerializedName("locked")
    private String locked = null;

    @SerializedName("maxLength")
    private Integer maxLength = null;

    @SerializedName("mergeField")
    private MergeField mergeField = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("originalValue")
    private String originalValue = null;

    @SerializedName("pageNumber")
    private String pageNumber = null;

    @SerializedName("recipientId")
    private String recipientId = null;

    @SerializedName("requireAll")
    private String requireAll = null;

    @SerializedName("required")
    private String required = null;

    @SerializedName("requireInitialOnSharedChange")
    private String requireInitialOnSharedChange = null;

    @SerializedName("senderRequired")
    private String senderRequired = null;

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

    @SerializedName("underline")
    private String underline = null;

    @SerializedName("validationMessage")
    private String validationMessage = null;

    @SerializedName("validationPattern")
    private String validationPattern = null;

    @SerializedName("value")
    private String value = null;

    @SerializedName("width")
    private Integer width = null;

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
     * When set to **true**, the information in the tab is bold.
     **/
    @ApiModelProperty(value = "When set to **true**, the information in the tab is bold.")
    public String getBold() {
        return bold;
    }

    public void setBold(String bold) {
        this.bold = bold;
    }


    /**
     * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.\n\nWhen an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.\n\nThis setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.
     **/
    @ApiModelProperty(value = "When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.\n\nWhen an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.\n\nThis setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.")
    public String getConcealValueOnDocument() {
        return concealValueOnDocument;
    }

    public void setConcealValueOnDocument(String concealValueOnDocument) {
        this.concealValueOnDocument = concealValueOnDocument;
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
     * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.
     **/
    @ApiModelProperty(value = "When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.")
    public String getDisableAutoSize() {
        return disableAutoSize;
    }

    public void setDisableAutoSize(String disableAutoSize) {
        this.disableAutoSize = disableAutoSize;
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
     * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.
     **/
    @ApiModelProperty(value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }


    /**
     * The font color used for the information in the tab.\n\nPossible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.
     **/
    @ApiModelProperty(value = "The font color used for the information in the tab.\n\nPossible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }


    /**
     * The font size used for the information in the tab.\n\nPossible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.
     **/
    @ApiModelProperty(value = "The font size used for the information in the tab.\n\nPossible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }


    /**
     * When set to **true**, the information in the tab is italic.
     **/
    @ApiModelProperty(value = "When set to **true**, the information in the tab is italic.")
    public String getItalic() {
        return italic;
    }

    public void setItalic(String italic) {
        this.italic = italic;
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
     * An optional value that describes the maximum length of the property when the property is a string.
     **/
    @ApiModelProperty(value = "An optional value that describes the maximum length of the property when the property is a string.")
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
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
     * The initial value of the tab when it was sent to the recipient.
     **/
    @ApiModelProperty(value = "The initial value of the tab when it was sent to the recipient. ")
    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
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
     * When set to **true** and shared is true, information must be entered in this field to complete the envelope.
     **/
    @ApiModelProperty(value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
    public String getRequireAll() {
        return requireAll;
    }

    public void setRequireAll(String requireAll) {
        this.requireAll = requireAll;
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
     * When set to **true**, the sender must populate the tab before an envelope can be sent using the template. \n\nThis value tab can only be changed by modifying (PUT) the template. \n\nTabs with a `senderRequired` value of true cannot be deleted from an envelope.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender must populate the tab before an envelope can be sent using the template. \n\nThis value tab can only be changed by modifying (PUT) the template. \n\nTabs with a `senderRequired` value of true cannot be deleted from an envelope.")
    public String getSenderRequired() {
        return senderRequired;
    }

    public void setSenderRequired(String senderRequired) {
        this.senderRequired = senderRequired;
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
     * When set to **true**, the information in the tab is underlined.
     **/
    @ApiModelProperty(value = "When set to **true**, the information in the tab is underlined.")
    public String getUnderline() {
        return underline;
    }

    public void setUnderline(String underline) {
        this.underline = underline;
    }


    /**
     * The message displayed if the custom tab fails input validation (either custom of embedded).
     **/
    @ApiModelProperty(value = "The message displayed if the custom tab fails input validation (either custom of embedded).")
    public String getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }


    /**
     * A regular expressionn used to validate input for the tab.
     **/
    @ApiModelProperty(value = "A regular expressionn used to validate input for the tab.")
    public String getValidationPattern() {
        return validationPattern;
    }

    public void setValidationPattern(String validationPattern) {
        this.validationPattern = validationPattern;
    }


    /**
     * Specifies the value of the tab.
     **/
    @ApiModelProperty(value = "Specifies the value of the tab. ")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Width of the tab in pixels.
     **/
    @ApiModelProperty(value = "Width of the tab in pixels.")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
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
        Ssn ssn = (Ssn) o;
        return Objects.equals(anchorCaseSensitive, ssn.anchorCaseSensitive) &&
                Objects.equals(anchorHorizontalAlignment, ssn.anchorHorizontalAlignment) &&
                Objects.equals(anchorIgnoreIfNotPresent, ssn.anchorIgnoreIfNotPresent) &&
                Objects.equals(anchorMatchWholeWord, ssn.anchorMatchWholeWord) &&
                Objects.equals(anchorString, ssn.anchorString) &&
                Objects.equals(anchorUnits, ssn.anchorUnits) &&
                Objects.equals(anchorXOffset, ssn.anchorXOffset) &&
                Objects.equals(anchorYOffset, ssn.anchorYOffset) &&
                Objects.equals(bold, ssn.bold) &&
                Objects.equals(concealValueOnDocument, ssn.concealValueOnDocument) &&
                Objects.equals(conditionalParentLabel, ssn.conditionalParentLabel) &&
                Objects.equals(conditionalParentValue, ssn.conditionalParentValue) &&
                Objects.equals(customTabId, ssn.customTabId) &&
                Objects.equals(disableAutoSize, ssn.disableAutoSize) &&
                Objects.equals(documentId, ssn.documentId) &&
                Objects.equals(errorDetails, ssn.errorDetails) &&
                Objects.equals(font, ssn.font) &&
                Objects.equals(fontColor, ssn.fontColor) &&
                Objects.equals(fontSize, ssn.fontSize) &&
                Objects.equals(italic, ssn.italic) &&
                Objects.equals(locked, ssn.locked) &&
                Objects.equals(maxLength, ssn.maxLength) &&
                Objects.equals(mergeField, ssn.mergeField) &&
                Objects.equals(name, ssn.name) &&
                Objects.equals(originalValue, ssn.originalValue) &&
                Objects.equals(pageNumber, ssn.pageNumber) &&
                Objects.equals(recipientId, ssn.recipientId) &&
                Objects.equals(requireAll, ssn.requireAll) &&
                Objects.equals(required, ssn.required) &&
                Objects.equals(requireInitialOnSharedChange, ssn.requireInitialOnSharedChange) &&
                Objects.equals(senderRequired, ssn.senderRequired) &&
                Objects.equals(shared, ssn.shared) &&
                Objects.equals(status, ssn.status) &&
                Objects.equals(tabId, ssn.tabId) &&
                Objects.equals(tabLabel, ssn.tabLabel) &&
                Objects.equals(tabOrder, ssn.tabOrder) &&
                Objects.equals(templateLocked, ssn.templateLocked) &&
                Objects.equals(templateRequired, ssn.templateRequired) &&
                Objects.equals(underline, ssn.underline) &&
                Objects.equals(validationMessage, ssn.validationMessage) &&
                Objects.equals(validationPattern, ssn.validationPattern) &&
                Objects.equals(value, ssn.value) &&
                Objects.equals(width, ssn.width) &&
                Objects.equals(xPosition, ssn.xPosition) &&
                Objects.equals(yPosition, ssn.yPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, bold, concealValueOnDocument, conditionalParentLabel, conditionalParentValue, customTabId, disableAutoSize, documentId, errorDetails, font, fontColor, fontSize, italic, locked, maxLength, mergeField, name, originalValue, pageNumber, recipientId, requireAll, required, requireInitialOnSharedChange, senderRequired, shared, status, tabId, tabLabel, tabOrder, templateLocked, templateRequired, underline, validationMessage, validationPattern, value, width, xPosition, yPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ssn {\n");

        sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
        sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
        sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
        sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
        sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
        sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
        sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
        sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
        sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
        sb.append("    concealValueOnDocument: ").append(toIndentedString(concealValueOnDocument)).append("\n");
        sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
        sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
        sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
        sb.append("    disableAutoSize: ").append(toIndentedString(disableAutoSize)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    font: ").append(toIndentedString(font)).append("\n");
        sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
        sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
        sb.append("    senderRequired: ").append(toIndentedString(senderRequired)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
        sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
        sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
        sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
        sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
        sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
        sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
        sb.append("    validationPattern: ").append(toIndentedString(validationPattern)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
