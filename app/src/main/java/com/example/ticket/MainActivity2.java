package com.example.ticket;

import static com.example.ticket.R.id.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    private TextView textView1;
    private TextView textView2;

    private String name;
    private String arrivedat;
    private String arriveplac;
    private String depplac;
    private String depdat;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView3);
        textView1 = findViewById(R.id.textView4);
        textView2 = findViewById(R.id.textView5);

        Bundle bundle = getIntent().getExtras();

        name = bundle.getString("name");
        arrivedat = bundle.getString("arrivedat");
        arriveplac = bundle.getString("arriveplac");
        depplac = bundle.getString("depplac");
        depdat = bundle.getString("depdat");

        textView.setText(name);
        textView1.setText("отправление " + depdat + " " + depplac +"\n");
        textView2.setText("прибытие " + arrivedat + " " + arriveplac + "\n");

        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}