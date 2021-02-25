package com.example.firebaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class FlightDetails extends AppCompatActivity implements View.OnClickListener {
    private FirebaseDatabase db = FirebaseDatabase.getInstance();

    




    private EditText from;
    private EditText to;
    private EditText dep_time;
    private EditText land_time;
    private EditText duration;
    private EditText nameOfFlight;
    private EditText day;
    private EditText month;
    private EditText year;
    private EditText price;
    private Button ADD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_details);

        from = findViewById(R.id.add_from);
        to = findViewById(R.id.add_to);
        dep_time = findViewById(R.id.add_dep_time);
        land_time = findViewById(R.id.add_land_time);
        duration = findViewById(R.id.add_duration);
        nameOfFlight = findViewById(R.id.add_flight_name);
        day = findViewById(R.id.add_day);
        month = findViewById(R.id.add_month);
        year = findViewById(R.id.add_year);
        price = findViewById(R.id.add_price);
        ADD = findViewById(R.id.add_flight);

        ADD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final flight_info info = new flight_info();
        info.setFrom(from.getText().toString().trim());
        info.setTo(to.getText().toString().trim());
        info.setDay(day.getText().toString().trim());
        info.setMonth(month.getText().toString().trim());
        info.setYear(year.getText().toString().trim());
        info.setDep_time(dep_time.getText().toString().trim());
        info.setLan_time(land_time.getText().toString().trim());
        info.setDuration(duration.getText().toString().trim());
        info.setFliht_name(nameOfFlight.getText().toString().trim());
        info.setPrice(price.getText().toString().trim());

        try{
            Integer.parseInt(info.getDay());
            Integer.parseInt(info.getMonth());
            Integer.parseInt(info.getYear());
            Integer.parseInt(info.getDep_time());
            Integer.parseInt(info.getLan_time());
            Integer.parseInt(info.getDuration());
            Integer.parseInt(info.getFliht_name());
            Integer.parseInt(info.getPrice());

        }catch (Exception e){

        }

    }
}