package com.sysco.api_automation.api.common;

public class Constant {
    Constant() {}

    public static final String API_HOST = System.getProperty("api.host", "http://dummy.restapiexample.com/api/");
    public static final String BASE_PATH = System.getProperty("api.base", "v1");


}
