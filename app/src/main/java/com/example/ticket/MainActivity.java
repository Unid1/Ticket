package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText nameEd;
    private EditText arrivedated;
    private EditText arriveplaced;
    private EditText depplaced;
    private EditText depdated;
    private EditText costd;

    private String name;
    private String arrivedate;
    private String arriveplace;
    private String depplace;
    private String depdate;
    private String cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEd = findViewById(R.id.name);
        arrivedated = findViewById(R.id.arrivedate);
        arriveplaced = findViewById(R.id.arriveplace);
        depplaced = findViewById(R.id.depplace);
        depdated = findViewById(R.id.depdate);
        costd = findViewById(R.id.cost);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   name = nameEd.getText().toString();
                    arrivedate = arrivedated.getText().toString();
                    arriveplace = arriveplaced.getText().toString();
                    depdate = depdated.getText().toString();
                    depplace = depplaced.getText().toString();
                    cost = costd.getText().toString();

                    Ticket ticket = new Ticket(name, arriveplace, depplace, arrivedate, depdate, cost);

                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    intent.putExtra("ticket",ticket);
                    startActivity(intent);


            }
        });
    }
}