package com.cms.velsol.cmsemployee.apis;



import com.cms.velsol.cmsemployee.response.GetEmployeeResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Kumar on 3/12/2018.
 */

public interface ApiService
{


    @FormUrlEncoded
    @POST("getEmployee.php")
    Call<GetEmployeeResponse> getEmployeeDetails(@Field("emp_id") String userid, @Field("operator_id") String operator_id);

    @FormUrlEncoded
    @POST("addEmployee.php")
    Call<MSG> uploadEmployee(@Field("emp_id") String emp_id, @Field("emp_name") String emp_name,
                             @Field("emp_mobile") String emp_mobile, @Field("emp_pos") String emp_pos,
                             @Field("emp_des") String emp_des, @Field("emp_address") String emp_address, @Field("emp_password") String emp_password,
                             @Field("emp_id_type") String emp_id_type, @Field("emp_id_num") String emp_id_num, @Field("emp_work_collection") String emp_work_collection, @Field("emp_work_service") String emp_work_service);
       @FormUrlEncoded
    @POST("assignRequestToEmployee.php")
    Call<MSG> requestAssigneeToEmployee (@Field("operator_id") String operator_id, @Field("cust_id") String cust_id,
                                         @Field("request_id") String request_id, @Field("admin_name") String admin_name,
                                         @Field("emp_id") String emp_id, @Field("emp_mobile") String emp_mobile,
                                         @Field("emp_name") String emp_name, @Field("target_date") String target_date);
}
