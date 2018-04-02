package ro.pub.cs.systems.eim.practicaltest01var07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {

    String no1;
    String no2;
    String no3;
    String no4;


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("no1", no1);
        outState.putString("no2", no2);
        outState.putString("no3", no3);
        outState.putString("no4", no4);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        no1 = savedInstanceState.getString("no1");
        no2 = savedInstanceState.getString("no2");
        no3 = savedInstanceState.getString("no3");
        no4 = savedInstanceState.getString("no4");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_main);
        final EditText elem1 = findViewById(R.id.elem1);
        final EditText elem2 = findViewById(R.id.elem2);
        final EditText elem3 = findViewById(R.id.elem3);
        final EditText elem4 = findViewById(R.id.elem4);

        Button send = findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PracticalTest01Var07MainActivity.this
                        , PracticalTest01Var07SecondaryActivity.class);

                no1 = elem1.getText().toString();
                no2 = elem2.getText().toString();
                no3 = elem3.getText().toString();
                no4 = elem4.getText().toString();

                if (android.text.TextUtils.isDigitsOnly(no1) &&
                            android.text.TextUtils.isDigitsOnly(no2) &&
                            android.text.TextUtils.isDigitsOnly(no3) &&
                            android.text.TextUtils.isDigitsOnly(no4)) {

                        intent.putExtra("e1", no1);
                        intent.putExtra("e2", no2);
                        intent.putExtra("e3", no3);
                        intent.putExtra("e4", no4);
                    }

                startActivity(intent);
            }
        });

    }
}
