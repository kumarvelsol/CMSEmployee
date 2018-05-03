package com.cms.velsol.cmsemployee.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.cms.velsol.cmsemployee.R;

public class HomeScreen extends AppCompatActivity {

    LinearLayout TodayCollectionHomeBtn, PaymentListHomeBtn, CollectionReportsHomeBtn, ServiceListHomeBtn, ServiceReportsHomeBtn, ServiceRequestsHomeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.home_screen_layout);
        initviews();
        OnClickViews();
    }
    public void initviews() {
        TodayCollectionHomeBtn = (LinearLayout) findViewById(R.id.home_employee_today_collection);
        PaymentListHomeBtn = (LinearLayout) findViewById(R.id.home_employee_payment_details);
        CollectionReportsHomeBtn = (LinearLayout) findViewById(R.id.home_employee_collection_reports);
        ServiceListHomeBtn = (LinearLayout) findViewById(R.id.home_employee_services);
        ServiceReportsHomeBtn = (LinearLayout) findViewById(R.id.home_employee_service_reports);
        ServiceRequestsHomeBtn = (LinearLayout) findViewById(R.id.home_employee_service_requests);
    }
    public void OnClickViews(){
        TodayCollectionHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,TodayCollectionActivity.class));
            }
        });
        PaymentListHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,PaymentDetailsActivity.class));
            }
        });
        CollectionReportsHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,CollectionReportsActivity.class));
            }
        });
        ServiceListHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,ServicesActivity.class));
            }
        });
        ServiceReportsHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,ServiceReportsActivity.class));
            }
        });
        ServiceRequestsHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,ServiceRequestsActivity.class));
            }
        });
    }
}
