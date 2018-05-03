package com.cms.velsol.cmsemployee.responses.request;

import java.util.ArrayList;

public class RequestResponse
{
    private ArrayList<AllRequest> AllRequests;

    public ArrayList<AllRequest> getAllRequests() { return this.AllRequests; }

    public void setAllRequests(ArrayList<AllRequest> AllRequests) { this.AllRequests = AllRequests; }

    private int response;

    public int getResponse() { return this.response; }

    public void setResponse(int response) { this.response = response; }
}
