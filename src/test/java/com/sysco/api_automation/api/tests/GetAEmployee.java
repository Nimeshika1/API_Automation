package com.sysco.api_automation.api.tests;

import com.jayway.restassured.response.Response;
import com.sysco.api_automation.api.data.EmployeeData;
import com.sysco.api_automation.api.util.TestBase;
import com.sysco.api_automation.api.common.StatusCodes;
import com.sysco.api_automation.api.requests.functions.Project;
import com.sysco.api_automation.api.response.model.ProjectModel;
import com.sysco.api_automation.api.util.ResponseUtil;
import com.sysco.api_automation.api.util.TestBase;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class GetAEmployee extends TestBase {
    static SoftAssert softAssert = new SoftAssert();
    static EmployeeData employeeData = new EmployeeData();
    @BeforeClass
    public static void initiate(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "  AEmployeeData - ValidAEmployeeData");
    }

    @Test(description = "Get a single employee data", alwaysRun = true)
    public static void testGetProject() throws JSONException {

        Response projectList = Project.getQcenterProjects("1");
        ProjectModel projectModel = (ProjectModel) ResponseUtil.getDataObjectValueInDataArray(projectList.asString(), 0, ProjectModel.class);
        softAssert.assertEquals(ResponseUtil.getStatus(projectList), StatusCodes.SUCCESS_200_CODE, "Status code should be 200");
        softAssert.assertEquals(projectModel.id, employeeData.id, "Should be equal");
        softAssert.assertEquals(projectModel.employee_name, employeeData.employee_name, "Should be equal");
        softAssert.assertEquals(projectModel.employee_salary, employeeData.employee_salary, "Should be equal");
        softAssert.assertEquals(projectModel.employee_age, employeeData.employee_age, "Should be equal");
        softAssert.assertEquals(projectModel.profile_image, employeeData.profile_image, "Should be equal");


    }
}
