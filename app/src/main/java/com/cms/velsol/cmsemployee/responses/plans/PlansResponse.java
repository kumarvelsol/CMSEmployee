package com.cms.velsol.cmsemployee.responses.plans;

import com.cms.velsol.cmsemployee.responses.customer.AllPlans;

import java.util.List;

/**
 * Created by user4 on 4/12/2018.
 */

public class PlansResponse
{
    private List<com.cms.velsol.cmsemployee.responses.customer.AllPlans> AllPlans;
    private Integer response;

    public List<AllPlans> getAllPlans()
    {
        return AllPlans;
    }
    public void setAllPlans(List<AllPlans> allPlans) {
        AllPlans = allPlans;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }
}
