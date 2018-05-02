package com.cms.velsol.cmsemployee.response;

/**
 * Created by user3 on 4/25/2018.
 */

public class GetEmployeeResponse
{
     private EmployeeDetails EmployeeDetails;
    private Integer response;

    public EmployeeDetails getEmployeeDetails()
    {
        return EmployeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails)
    {
        this.EmployeeDetails = employeeDetails;
    }

    public Integer getResponse()
    {
        return response;
    }

    public void setResponse(Integer response)
    {
        this.response = response;
    }

}
