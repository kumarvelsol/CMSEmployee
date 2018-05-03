package com.cms.velsol.cmsemployee.activites;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cms.velsol.cmsemployee.R;
import java.util.Calendar;

public class TodayCollectionActivity extends AppCompatActivity
{
    ImageView SelectTodaysCollectionDateImageBtn;
    int year,month,day;
    Calendar cal;
    TextView SelectedMonth,SelectedDayYear;
    String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.today_collection_layout);
        cal=Calendar.getInstance();
        SelectedMonth = (TextView) findViewById(R.id.today_collection_selected_month);
        SelectedDayYear = (TextView)findViewById(R.id.today_collection_selected_day_year);
        SelectTodaysCollectionDateImageBtn = (ImageView)findViewById(R.id.select_todays_date_for_collection_img);
        SelectTodaysCollectionDateImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                year=cal.get(Calendar.YEAR);
                month=cal.get(Calendar.MONTH);
                day=cal.get(Calendar.DAY_OF_WEEK);
                //date picker dialog showing
                DatePickerDialog dp=new DatePickerDialog(TodayCollectionActivity.this, new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2)
                    {
                        SelectedMonth.setText(months[i1]);
                        SelectedDayYear.setText(i2+" - "+i);
                        Toast.makeText(TodayCollectionActivity.this,month+"-"+day+"-"+year,Toast.LENGTH_LONG).show();
                    }
                },year,month,day);
                dp.show();
            }
        });
    }
}
