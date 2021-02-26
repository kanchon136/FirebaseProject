package com.example.firebaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class Selection_of_Flight extends AppCompatActivity {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private String Date_sel;
    private CollectionReference date;
    private TextView available_flights;
    private EditText selected_flight;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_of__flight);

        selected_flight = findViewById(R.id.selected_flight);
        available_flights = findViewById(R.id.available_flights);
        next = findViewById(R.id.next);
        Intent intent_prev = getIntent();
        final Passenger passenger = (Passenger) intent_prev.getSerializableExtra("passenger");
        Date_sel = passenger.getDat_day()+"."+passenger.getDate_month()+"."+passenger.getDate_year();
        date = db.collection(Date_sel);

        final  String from = passenger.getFrom_place();
        final  String to = passenger.getTo_place();
        final String[] aval_flights = new String[50];
        final  String[] price = new String[50];
        final String[] dep = new String[50];
        final  String[] land = new String[50];
        final String[] duration = new String[50];
        // Start the new code 26/ 02 /21

    }
}