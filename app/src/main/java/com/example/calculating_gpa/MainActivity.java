package com.example.calculating_gpa;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity {
EditText ed1, ed2, ed3,ed4,ed5,ed6;
double Grade1, Grade2, Grade3, Grade4, Grade5, avg, total;
Button btn;
LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ETSub1);
        ed2 = findViewById(R.id.ETSub2);
        ed3 = findViewById(R.id.ETSub3);
        ed4 = findViewById(R.id.ETSub4);
        ed5 = findViewById(R.id.ETSub5);
        ed6 = findViewById(R.id.ETCalculation);
        layout = findViewById(R.id.linearlayout);

        btn = findViewById(R.id.Btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Grade1 = Double.parseDouble(ed1.getText().toString());
                Grade2 = Double.parseDouble(ed2.getText().toString());
                Grade3 = Double.parseDouble(ed3.getText().toString());
                Grade4 = Double.parseDouble(ed4.getText().toString());
                Grade5 = Double.parseDouble(ed5.getText().toString());
                total = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5);
                avg = total/5.0;

                ed6.setText(String.valueOf(avg));

                empty();
                gradecheckvalidation();
                clear();
            }
        });

    }
public void gradecheckvalidation()
{
    double g1,g2,g3,g4,g5,gpa;

    g1= Double.parseDouble(ed1.getText().toString());
    g2= Double.parseDouble(ed2.getText().toString());
    g3= Double.parseDouble(ed3.getText().toString());
    g4= Double.parseDouble(ed4.getText().toString());
    g5= Double.parseDouble(ed5.getText().toString());

    gpa = (g1 + g2 + g3 + g4 + g5)/5.0;


    if (gpa >= 80 && gpa <=100)
    {
        layout.setBackgroundColor(Color.GREEN);
    }
    else if (gpa >= 61 && gpa <80)
    {
        layout.setBackgroundColor(Color.YELLOW);
    }
    else if ( gpa >= 0 && gpa < 61)
    {
        layout.setBackgroundColor(Color.RED);
    }
}
public void clear()
{
    ed1.setText("");
    ed2.setText("");
    ed3.setText("");
    ed4.setText("");
    ed5.setText("");

}
public void empty()
{
    if (ed1.length() == 0)
    {
        ed1.setError("Enter Grade");
    }

    if (ed2.length() == 0)
    {
        ed2.setError("Enter Grade");
    }

    if (ed3.length() == 0)
    {
        ed3.setError("Enter Grade");
    }

    if (ed4.length() == 0)
    {
        ed4.setError("Enter Grade");
    }

    if (ed5.length() == 0)
    {
        ed5.setError("Enter Grade");
    }


}

}