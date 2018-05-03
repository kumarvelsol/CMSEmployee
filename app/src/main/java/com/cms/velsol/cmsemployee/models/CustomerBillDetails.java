package com.cms.velsol.cmsemployee.models;

/**
 * Created by user4 on 4/13/2018.
 */

public class CustomerBillDetails
{
    private String cust_plan_code;
    private String cust_plan_name;
    private String cust_plan_bill;
    private String cust_prev_due;
    private String cust_total;

    public String getCust_plan_name() {
        return cust_plan_name;
    }

    public void setCust_plan_name(String cust_plan_name) {
        this.cust_plan_name = cust_plan_name;
    }

    public String getCust_plan_bill() {
        return cust_plan_bill;
    }

    public void setCust_plan_bill(String cust_plan_bill) {
        this.cust_plan_bill = cust_plan_bill;
    }

    public String getCust_prev_due() {
        return cust_prev_due;
    }

    public void setCust_prev_due(String cust_prev_due) {
        this.cust_prev_due = cust_prev_due;
    }

    public String getCust_total() {
        return cust_total;
    }

    public void setCust_total(String cust_total) {
        this.cust_total = cust_total;
    }

    public String getCust_plan_code() {
        return cust_plan_code;
    }

    public void setCust_plan_code(String cust_plan_code) {
        this.cust_plan_code = cust_plan_code;
    }
}
