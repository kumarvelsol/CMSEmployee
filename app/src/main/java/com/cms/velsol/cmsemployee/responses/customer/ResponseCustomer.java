package com.cms.velsol.cmsemployee.responses.customer;

import com.cms.velsol.cmsemployee.models.AllCustomer;

import java.util.List;

/**
 * Created by user4 on 4/11/2018.
 */

public class ResponseCustomer
{

    private List<AllCustomer> AllCustomers;
    private Integer response;

    public List<AllCustomer> getAllCustomers() {
        return AllCustomers;
    }

    public void setAllCustomers(List<AllCustomer> allCustomers) {
        AllCustomers = allCustomers;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }
}
