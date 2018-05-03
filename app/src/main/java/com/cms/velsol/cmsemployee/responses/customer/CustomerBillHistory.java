package com.cms.velsol.cmsemployee.responses.customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by user4 on 4/16/2018.
 */

public class CustomerBillHistory
{
    @SerializedName("CustomerBillHistory")
    @Expose
    private List<CustomerBillHistory> CustomerBillHistory;
    @SerializedName("cms_customer_name")
    @Expose
    private String cms_customer_name;
    @SerializedName("cms_customer_mobile")
    @Expose
    private String cms_customer_mobile;
    @SerializedName("response")
    @Expose
    private Integer response;

    public List<CustomerBillHistory> getCustomerBillHistory() {
        return CustomerBillHistory;
    }

    public void setCustomerBillHistory(List<CustomerBillHistory> customerBillHistory) {
        CustomerBillHistory = customerBillHistory;
    }

    public String getCms_customer_name() {
        return cms_customer_name;
    }

    public void setCms_customer_name(String cms_customer_name) {
        this.cms_customer_name = cms_customer_name;
    }

    public String getCms_customer_mobile() {
        return cms_customer_mobile;
    }

    public void setCms_customer_mobile(String cms_customer_mobile) {
        this.cms_customer_mobile = cms_customer_mobile;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }
}
