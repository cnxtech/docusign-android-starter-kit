package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent. \n\nWhen the emailSettings information is used for an envelope, it only applies to that envelope. \n\n**IMPORTANT**: The emailSettings information is not returned in the GET for envelope status. Use GET /email_settings to return information about the emailSettings. \n\nEmailSettings consists of: \n\n* replyEmailAddressOverride - The Reply To email used for the envelope. DocuSign will verify that a correct email format is used, but does not verify that the email is active. Maximum Length: 100 characters.\n* replyEmailNameOverride - The name associated with the Reply To email address. Maximum Length: 100 characters.\n* bccEmailAddresses - An array of up to five email addresses to which the envelope is sent to as a BCC email. Only users with canManageAccount setting set to true can use this option. \nDocuSign verifies that the email format is correct, but does not verify that the email is active. Using this overrides the BCC for Email Archive information setting for this envelope. Maximum Length: 100 characters.\n*Example*: if your account has BCC for Email Archive set up for the email address \u2018archive@mycompany.com\u2019 and you send an envelope using the BCC Email Override to send a BCC email to \u2018salesarchive@mycompany.com\u2019, then a copy of the envelope is only sent to the \u2018salesarchive@mycompany.com\u2019 email address.
 **/
@ApiModel(description = "A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent. \n\nWhen the emailSettings information is used for an envelope, it only applies to that envelope. \n\n**IMPORTANT**: The emailSettings information is not returned in the GET for envelope status. Use GET /email_settings to return information about the emailSettings. \n\nEmailSettings consists of: \n\n* replyEmailAddressOverride - The Reply To email used for the envelope. DocuSign will verify that a correct email format is used, but does not verify that the email is active. Maximum Length: 100 characters.\n* replyEmailNameOverride - The name associated with the Reply To email address. Maximum Length: 100 characters.\n* bccEmailAddresses - An array of up to five email addresses to which the envelope is sent to as a BCC email. Only users with canManageAccount setting set to true can use this option. \nDocuSign verifies that the email format is correct, but does not verify that the email is active. Using this overrides the BCC for Email Archive information setting for this envelope. Maximum Length: 100 characters.\n*Example*: if your account has BCC for Email Archive set up for the email address \u2018archive@mycompany.com\u2019 and you send an envelope using the BCC Email Override to send a BCC email to \u2018salesarchive@mycompany.com\u2019, then a copy of the envelope is only sent to the \u2018salesarchive@mycompany.com\u2019 email address.")
public class EmailSettings implements Serializable {

    @SerializedName("bccEmailAddresses")
    private java.util.List<BccEmailAddress> bccEmailAddresses = new java.util.ArrayList<BccEmailAddress>();

    @SerializedName("replyEmailAddressOverride")
    private String replyEmailAddressOverride = null;

    @SerializedName("replyEmailNameOverride")
    private String replyEmailNameOverride = null;


    /**
     * A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.
     **/
    @ApiModelProperty(value = "A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.")
    public java.util.List<BccEmailAddress> getBccEmailAddresses() {
        return bccEmailAddresses;
    }

    public void setBccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
        this.bccEmailAddresses = bccEmailAddresses;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getReplyEmailAddressOverride() {
        return replyEmailAddressOverride;
    }

    public void setReplyEmailAddressOverride(String replyEmailAddressOverride) {
        this.replyEmailAddressOverride = replyEmailAddressOverride;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getReplyEmailNameOverride() {
        return replyEmailNameOverride;
    }

    public void setReplyEmailNameOverride(String replyEmailNameOverride) {
        this.replyEmailNameOverride = replyEmailNameOverride;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailSettings emailSettings = (EmailSettings) o;
        return Objects.equals(bccEmailAddresses, emailSettings.bccEmailAddresses) &&
                Objects.equals(replyEmailAddressOverride, emailSettings.replyEmailAddressOverride) &&
                Objects.equals(replyEmailNameOverride, emailSettings.replyEmailNameOverride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bccEmailAddresses, replyEmailAddressOverride, replyEmailNameOverride);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailSettings {\n");

        sb.append("    bccEmailAddresses: ").append(toIndentedString(bccEmailAddresses)).append("\n");
        sb.append("    replyEmailAddressOverride: ").append(toIndentedString(replyEmailAddressOverride)).append("\n");
        sb.append("    replyEmailNameOverride: ").append(toIndentedString(replyEmailNameOverride)).append("\n");
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
