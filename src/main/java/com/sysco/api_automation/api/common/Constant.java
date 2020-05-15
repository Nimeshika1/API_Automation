package com.sysco.api_automation.api.common;

public class Constant {
    Constant() {}

    public static final String API_HOST = System.getProperty("api.host", "https://syscoqcenterapi.sysco.com/qcenter_admin_api/");
    public static final String BASE_PATH = System.getProperty("api.base", "");


}
