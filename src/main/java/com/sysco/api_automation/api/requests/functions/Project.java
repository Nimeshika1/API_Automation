package com.sysco.api_automation.api.requests.functions;

import com.jayway.restassured.response.Response;
import com.sysco.api_automation.api.common.URIs;
import com.sysco.api_automation.api.util.HeadersUtil;
import com.sysco.api_automation.api.util.RequestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;

public class Project {


    public static Response getRestAPISampleProjects() {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), "", URIs.retrieveProjectsURI(), RequestMethods.GET.toString(), null);

    }

    public static Response getRestAPISampleProjects(String uri) {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), null, uri, RequestMethods.GET.toString(), null);

    }
}
