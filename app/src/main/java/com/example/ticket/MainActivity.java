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
    private EditText arrivedate;
    private EditText arriveplace;
    private EditText depplace;
    private EditText depdate;

    private String name;
    private String arrivedat;
    private String arriveplac;
    private String depplac;
    private String depdat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEd = findViewById(R.id.name);
        arrivedate = findViewById(R.id.arrivedate);
        arriveplace = findViewById(R.id.arriveplace);
        depplace = findViewById(R.id.depplace);
        depdate = findViewById(R.id.depdate);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   name = nameEd.getText().toString();
                    arrivedat = arrivedate.getText().toString();
                    arriveplac = arriveplace.getText().toString();
                    depdat = depdate.getText().toString();
                    depplac = depplace.getText().toString();

                 if(name.isEmpty() == true){
                     Toast toast = Toast.makeText(getApplicationContext(), "введите ФИО", Toast.LENGTH_SHORT);
                   toast.show();
                }
                else if(depplac.isEmpty() == true){
                  Toast toast = Toast.makeText(getApplicationContext(), "введите место отправления", Toast.LENGTH_SHORT);
                toast.show();
                }
                else if(depdat.isEmpty() == true){
                  Toast toast = Toast.makeText(getApplicationContext(), "введите дату отправления", Toast.LENGTH_SHORT);
                toast.show();
                }
                 else if(arriveplac.isEmpty() == true){
                     Toast toast = Toast.makeText(getApplicationContext(), "введите место прибытия", Toast.LENGTH_SHORT);
                     toast.show();
                 }
                 else if(arrivedat.isEmpty() == true){
                     Toast toast = Toast.makeText(getApplicationContext(), "введите дату прибытия", Toast.LENGTH_SHORT);
                     toast.show();
                 }
                else {

                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    intent.putExtra("name", name);
                    intent.putExtra("arrivedat", arrivedat);
                    intent.putExtra("arriveplac", arriveplac);
                    intent.putExtra("depplac", depplac);
                    intent.putExtra("depdat", depdat);

                    startActivity(intent);
                }
            }
        });
    }
}