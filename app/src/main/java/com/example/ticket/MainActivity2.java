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
    private TextView textView3;


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView3);
        textView1 = findViewById(R.id.textView4);
        textView2 = findViewById(R.id.textView5);
        textView3 = findViewById(R.id.textView6);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            Ticket ticket = (Ticket) bundle.getSerializable("ticket");
            textView.setText(ticket.getName());
            textView1.setText("отправление " + ticket.getDepdate() + " " + ticket.getDepplace() +"\n");
            textView2.setText("прибытие " + ticket.getArrivedate() + " " + ticket.getArriveplace() + "\n");
            textView3.setText("стоимость" +" " + ticket.getCost() + " " + "рублей");
        }


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