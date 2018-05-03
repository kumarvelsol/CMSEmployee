package com.cms.velsol.cmsemployee.responses.customer;

/**
 * Created by user4 on 4/12/2018.
 */

public class AllPlans
{

    private String plan_name;

    private String plan_code;

    private String plan_duration;

    private String plan_amount;

    private String plan_act_date;

    private String plan_status;

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public String getPlan_code() {
        return plan_code;
    }

    public void setPlan_code(String plan_code) {
        this.plan_code = plan_code;
    }

    public String getPlan_duration() {
        return plan_duration;
    }

    public void setPlan_duration(String plan_duration) {
        this.plan_duration = plan_duration;
    }

    public String getPlan_amount() {
        return plan_amount;
    }

    public void setPlan_amount(String plan_amount) {
        this.plan_amount = plan_amount;
    }

    public String getPlan_act_date() {
        return plan_act_date;
    }

    public void setPlan_act_date(String plan_act_date) {
        this.plan_act_date = plan_act_date;
    }

    public String getPlan_status() {
        return plan_status;
    }

    public void setPlan_status(String plan_status) {
        this.plan_status = plan_status;
    }
}
