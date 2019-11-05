package com.rushabh.nasikapp.ahmedabadexplorer;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class auto extends AppCompatActivity {

    Toolbar toolbar;
    EditText kilometers;
    TextView fare_t;
    Button answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Auto Fare");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView enter= (TextView) findViewById(R.id.enter);
        Typeface lato_bold = Typeface.createFromAsset(getAssets(), "font/Lato-Bold.ttf");
        enter.setTypeface(lato_bold);
        kilometers = (EditText) findViewById(R.id.kilometers);
        fare_t = (TextView) findViewById(R.id.fare);
        answer = (Button) findViewById(R.id.button);

        fare_t.setTypeface(lato_bold);

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String km_string = kilometers.getText().toString();
                double fare;
                double surplus;

                try {
                    double km = Double.parseDouble(km_string);
                    if(km<100) {
                        if (km == 0.1 || km == 0.2 || km == 0.3 || km == 0.4 || km == 0.5 || km == 0.6 || km == 0.7 || km == 0.8 || km == 0.9 || km == 1.0 || km == 1.1 || km == 1.2 || km == 1.3 || km == 1.4) {
                            fare_t.setText("Fare is Rs 11.");
                        } else if (km > 1.4) {
                            surplus = (double) (km - 1.4);
                            fare = (int) (11 + (surplus * 7.5));
                            fare_t.setText("Your fare is Rs "+(int) fare + ".");
                        }
                    }
                    else{
                        fare_t.setText("");
                        Toast.makeText(auto.this, "Number of kilometers beyond expected", Toast.LENGTH_LONG).show();
                    }

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

}
