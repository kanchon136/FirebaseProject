package com.example.firebaseproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.util.Date;

public class Showing_Flights extends AppCompatActivity {

    private TextView text;
    private CalendarView calendar;
    private String Date = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing__flights);

        calendar = findViewById(R.id.calender);
        text = findViewById(R.id.select_date);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Date =dayOfMonth+"."+(month+1)+"/"+year;
                String selected_date = Date;

                int setDay = Integer.parseInt(selected_date.substring(0,selected_date.indexOf(".")));
                int selMonth = Integer.parseInt(selected_date.substring(selected_date.indexOf("/")+1,selected_date.indexOf("/")));
                int selYear = Integer.parseInt(selected_date.substring(selected_date.indexOf("/")+1));


            }
        });
    }

}