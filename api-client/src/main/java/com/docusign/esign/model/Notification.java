package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A complex element that specifies the notification options for the envelope. It consists of:\n\n* useAccountDefaults - When set to **true**, the account default notification settings are used for the envelope. \n* reminders - A complex element that specifies reminder settings for the envelope. It consists of: \n\n   * reminderEnabled - When set to **true**, a reminder message is sent to the recipient.\n   * reminderDelay - An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient. \n   * reminderFrequency - An interger that sets the interval, in days, between reminder emails. \n\n* expirations - A complex element that specifies the expiration settings for the envelope. It consists of:\n\n   * expireEnabled - When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used. \n   * expireAfter - An integer that sets the number of days the envelope is active.\n   * expireWarn - An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.
 **/
@ApiModel(description = "A complex element that specifies the notification options for the envelope. It consists of:\n\n* useAccountDefaults - When set to **true**, the account default notification settings are used for the envelope. \n* reminders - A complex element that specifies reminder settings for the envelope. It consists of: \n\n   * reminderEnabled - When set to **true**, a reminder message is sent to the recipient.\n   * reminderDelay - An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient. \n   * reminderFrequency - An interger that sets the interval, in days, between reminder emails. \n\n* expirations - A complex element that specifies the expiration settings for the envelope. It consists of:\n\n   * expireEnabled - When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used. \n   * expireAfter - An integer that sets the number of days the envelope is active.\n   * expireWarn - An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.")
public class Notification implements Serializable {

    @SerializedName("expirations")
    private Expirations expirations = null;

    @SerializedName("reminders")
    private Reminders reminders = null;

    @SerializedName("useAccountDefaults")
    private String useAccountDefaults = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public Expirations getExpirations() {
        return expirations;
    }

    public void setExpirations(Expirations expirations) {
        this.expirations = expirations;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Reminders getReminders() {
        return reminders;
    }

    public void setReminders(Reminders reminders) {
        this.reminders = reminders;
    }


    /**
     * When set to **true**, the account default notification settings are used for the envelope.
     **/
    @ApiModelProperty(value = "When set to **true**, the account default notification settings are used for the envelope.")
    public String getUseAccountDefaults() {
        return useAccountDefaults;
    }

    public void setUseAccountDefaults(String useAccountDefaults) {
        this.useAccountDefaults = useAccountDefaults;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Notification notification = (Notification) o;
        return Objects.equals(expirations, notification.expirations) &&
                Objects.equals(reminders, notification.reminders) &&
                Objects.equals(useAccountDefaults, notification.useAccountDefaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirations, reminders, useAccountDefaults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Notification {\n");

        sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
        sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
        sb.append("    useAccountDefaults: ").append(toIndentedString(useAccountDefaults)).append("\n");
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
