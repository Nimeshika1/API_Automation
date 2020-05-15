package com.sysco.api_automation.api.requests.functions;

import com.jayway.restassured.response.Response;
import com.sysco.api_automation.api.common.URIs;
import com.sysco.api_automation.api.util.HeadersUtil;
import com.sysco.api_automation.api.util.RequestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;
import com.sysco.api_automation.api.common.URIs.*;

public class Project {


    public static Response getQcenterProjects() {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), "", URIs.retrieveProjectsURI(), RequestMethods.GET.toString(), null);

    }

    public static Response getQcenterProjects(String id) {
        RequestUtil.setRequestBaseUrls();
        String getEmployeeUrlFinal = URIs.retrieveProjectsURI().replace("{id}",id);
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), null, getEmployeeUrlFinal, RequestMethods.GET.toString(), null);

    }


}


