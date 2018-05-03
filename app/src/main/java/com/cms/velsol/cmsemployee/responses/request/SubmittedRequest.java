package com.cms.velsol.cmsemployee.responses.request;

public class SubmittedRequest
{
    private String customer_id;

    public String getCustomerId() { return this.customer_id; }

    public void setCustomerId(String customer_id) { this.customer_id = customer_id; }

    private String customer_name;

    public String getCustomerName() { return this.customer_name; }

    public void setCustomerName(String customer_name) { this.customer_name = customer_name; }

    private String customer_mobile;

    public String getCustomerMobile() { return this.customer_mobile; }

    public void setCustomerMobile(String customer_mobile) { this.customer_mobile = customer_mobile; }

    private String request_type;

    public String getRequestType() { return this.request_type; }

    public void setRequestType(String request_type) { this.request_type = request_type; }

    private String request_id;

    public String getRequestId() { return this.request_id; }

    public void setRequestId(String request_id) { this.request_id = request_id; }

    private String request_message;

    public String getRequestMessage() { return this.request_message; }

    public void setRequestMessage(String request_message) { this.request_message = request_message; }

    private String request_date;

    public String getRequestDate() { return this.request_date; }

    public void setRequestDate(String request_date) { this.request_date = request_date; }
}
