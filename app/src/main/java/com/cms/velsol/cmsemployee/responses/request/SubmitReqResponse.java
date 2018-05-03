package com.cms.velsol.cmsemployee.responses.request;

import java.util.ArrayList;

public class SubmitReqResponse
{
    private ArrayList<SubmittedRequest> SubmittedRequests;

    public ArrayList<SubmittedRequest> getSubmittedRequests() { return this.SubmittedRequests; }

    public void setSubmittedRequests(ArrayList<SubmittedRequest> SubmittedRequests) { this.SubmittedRequests = SubmittedRequests; }

    private int response;

    public int getResponse() { return this.response; }

    public void setResponse(int response) { this.response = response; }
}
