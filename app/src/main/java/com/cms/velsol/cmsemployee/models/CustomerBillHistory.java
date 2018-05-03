package com.cms.velsol.cmsemployee.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by user4 on 4/16/2018.
 */

public class CustomerBillHistory
{
    @SerializedName("cms_plan_code")
    @Expose
    private String cms_plan_code;
    @SerializedName("cms_plan_name")
    @Expose
    private String cms_plan_name;
    @SerializedName("cmst_paid_amount")
    @Expose
    private String cmst_paid_amount;
    @SerializedName("cms_payment_collected_by")
    @Expose
    private String cms_payment_collected_by;
    @SerializedName("cms_payment_collected_date")
    @Expose
    private String cms_payment_collected_date;

    public String getCms_plan_code() {
        return cms_plan_code;
    }

    public void setCms_plan_code(String cms_plan_code) {
        this.cms_plan_code = cms_plan_code;
    }

    public String getCms_plan_name() {
        return cms_plan_name;
    }

    public void setCms_plan_name(String cms_plan_name) {
        this.cms_plan_name = cms_plan_name;
    }

    public String getCmst_paid_amount() {
        return cmst_paid_amount;
    }

    public void setCmst_paid_amount(String cmst_paid_amount) {
        this.cmst_paid_amount = cmst_paid_amount;
    }

    public String getCms_payment_collected_by() {
        return cms_payment_collected_by;
    }

    public void setCms_payment_collected_by(String cms_payment_collected_by) {
        this.cms_payment_collected_by = cms_payment_collected_by;
    }

    public String getCms_payment_collected_date() {
        return cms_payment_collected_date;
    }

    public void setCms_payment_collected_date(String cms_payment_collected_date) {
        this.cms_payment_collected_date = cms_payment_collected_date;
    }
}
