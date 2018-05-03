package com.cms.velsol.cmsemployee.responses.customer;


/**
 * Created by user4 on 4/13/2018.
 */

public class CustomerBillDetails
{
    //CustomerBillDetails
    private CustomerBillDetails CustomerBillDetails;

    public CustomerBillDetails getCustomerBillDetails() {
        return CustomerBillDetails;
    }

    public void setCustomerBillDetails(CustomerBillDetails customerBillDetails) {
        CustomerBillDetails = customerBillDetails;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }

    private Integer response;
}
