package ro.pub.cs.systems.eim.practicaltest01var07;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

/**
 * Created by student on 02.04.2018.
 */

public class PracticalTest01Var07SecondaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_practical_test01_var07_secondary);
        final Integer e1 = Integer.parseInt((String) extras.get("e1"));
        final Integer e2 = Integer.parseInt((String) extras.get("e2"));
        final Integer e3 = Integer.parseInt((String) extras.get("e3"));
        final Integer e4 = Integer.parseInt((String) extras.get("e4"));

        TextView v1 = findViewById(R.id.e1);
        v1.setText(""+e1);

        TextView v2 = findViewById(R.id.e2);
        v2.setText(""+e2);

        TextView v3 = findViewById(R.id.e3);
        v3.setText(""+e3);

        TextView v4 = findViewById(R.id.e4);
        v4.setText(""+e4);


        Button sum = findViewById(R.id.buttonSum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer sum = e1+e2+e3+e4;
                TextView result = findViewById(R.id.result);
                result.setText(""+sum);
                Toast.makeText(PracticalTest01Var07SecondaryActivity.this, sum.toString(), LENGTH_LONG).show();
            }
        });


        Button product = findViewById(R.id.buttonProduct);
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer prod = e1*e2*e3*e4;
                TextView result = findViewById(R.id.result);
                result.setText(""+prod);
                Toast.makeText(PracticalTest01Var07SecondaryActivity.this, prod.toString(), LENGTH_LONG).show();
            }
        });

    }
}
