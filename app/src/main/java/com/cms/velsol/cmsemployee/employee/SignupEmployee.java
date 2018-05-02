package com.cms.velsol.cmsemployee.employee;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.cms.velsol.cmsemployee.R;
import com.cms.velsol.cmsemployee.apis.ApiClient;
import com.cms.velsol.cmsemployee.apis.ApiService;
import com.cms.velsol.cmsemployee.response.GetEmployeeResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignupEmployee extends AppCompatActivity
{
    EditText memployeeuserid,memployeeoperatorid;
    String operatorid,userid;
    Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_employee_activity);
        initview();

    }

    private void initview()
    {
             memployeeoperatorid=(EditText)findViewById(R.id.signup_employee_operatorid);
                 memployeeuserid=(EditText)findViewById(R.id.signup_employee_userid);


         memployeeoperatorid=(EditText)findViewById(R.id.operator_employee_input);
//        memployeeNameInput=(EditText)findViewById(R.id.name_employee_input);
//        empiamge=(ImageView)findViewById(R.id.image_employee);
//        memployeeID=(EditText)findViewById(R.id.empid_employee);
//        memployeePhoneInput=(EditText)findViewById(R.id.phonenumber_employee_input);
//        memployeeAddress=(EditText)findViewById(R.id.adrress_employee_input);
//        memployeeIDSpinner = (Spinner) findViewById(R.id.spinner_employee);
//        memployeePassword=(EditText)findViewById(R.id.password_employee_input);
//        memployeeIDProof=(EditText)findViewById(R.id.idproof_employee_input);
//        employeeradiogroup=(RadioGroup)findViewById(R.id.employee_radiogroup_select);
//        memployeesave=(Button)findViewById(R.id.add_employee_button);
//        memployeeclear=(Button)findViewById(R.id.clear_employee_button);
     submitbtn=(Button)findViewById(R.id.btn);
     submitbtn.setOnClickListener(new View.OnClickListener()
     {
         @Override
         public void onClick(View v)
         {
             testEmployee();
         }
     });

    }

    private void testEmployee()
    {
        userid=memployeeoperatorid.getText().toString().trim();
        operatorid=memployeeoperatorid.getText().toString().trim();
        getemployedetails();


    }

    private void getemployedetails()
    {
        ApiService getemp = ApiClient.getClient().create(ApiService.class);
        Call<GetEmployeeResponse> adds=getemp.getEmployeeDetails(userid,operatorid);
        adds.enqueue(new Callback<GetEmployeeResponse>()
        {
            @Override
            public void onResponse(Call<GetEmployeeResponse> call, Response<GetEmployeeResponse> response)
            {
                if(response.body().getResponse()==200)
                {
                    Snackbar snackbar = Snackbar.make(SignupEmployee.this.findViewById(android.R.id.content), ""+response.body().getResponse(), Snackbar.LENGTH_LONG);
                    snackbar.show();
                    memployeeoperatorid.setText(response.body().getEmployeeDetails().getOperator_id());
//                    memployeeNameInput.setText(response.body().getEmployeeDetails().getEmp_name());
//                    memployeePhoneInput.setText(response.body().getEmployeeDetails().getEmp_mobile());
//                    memployeeID.setText(response.body().getEmployeeDetails().getEmp_id());
//                    memployeeAddress.setText(response.body().getEmployeeDetails().getEmp_address());
//                    memployeePassword.setText(response.body().getEmployeeDetails().getEmp_password());
//                    memployeeIDProof.setText(response.body().getEmployeeDetails().getEmp_id());
//                    Picasso.with(AddEmployeeActivity.this).load(response.body().getEmployeeDetails().getEmp_img()).into(empiamge);
//                    image_url=response.body().getEmployeeDetails().getEmp_img();
//                    memployeesave.setText("Update");

                }
                else
                {

                    Snackbar snackbar = Snackbar.make(SignupEmployee.this.findViewById(android.R.id.content), ""+response.body().getResponse(), Snackbar.LENGTH_LONG);
                    snackbar.show();
                }

            }
            @Override
            public void onFailure(Call<GetEmployeeResponse> call, Throwable t)
            {
                Snackbar snackbar = Snackbar.make(SignupEmployee.this.findViewById(android.R.id.content), "Please Check Internet Connection", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }
}
