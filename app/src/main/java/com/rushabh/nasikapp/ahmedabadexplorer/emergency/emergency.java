package com.rushabh.nasikapp.ahmedabadexplorer.emergency;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.rushabh.nasikapp.ahmedabadexplorer.R;

public class emergency extends AppCompatActivity {
    Toolbar toolbar;
    ImageView airplane;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Emergency");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //setSupportActionBar(toolba
       // ImageView railway= (ImageView) findViewById(R.id.railway);
        ImageView blood_bank= (ImageView) findViewById(R.id.bloodbank);
       // airplane= (ImageView) findViewById(R.id.airplane);
        final ImageView government= (ImageView) findViewById(R.id.government);
        ImageView ambulance= (ImageView) findViewById(R.id.ambulance);
        final ImageView firebrigade= (ImageView) findViewById(R.id.firebrigade);
//        airplane.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent airplane=new Intent(emergency.this,com.example.picha.emergency.airplane.class);
//                startActivity(airplane);
//            }
//        });
        blood_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blood_bank=new Intent(emergency.this, com.rushabh.nasikapp.ahmedabadexplorer.emergency.bloodbank.class);
                startActivity(blood_bank);
            }
        });

        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ambulance=new Intent(emergency.this, com.rushabh.nasikapp.ahmedabadexplorer.emergency.ambulance.class);
                startActivity(ambulance);
            }
        });


        firebrigade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mseb=new Intent(emergency.this, com.rushabh.nasikapp.ahmedabadexplorer.emergency.fire_brigade.class);
                startActivity(mseb);
            }
        });

        government.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mseb=new Intent(emergency.this, com.rushabh.nasikapp.ahmedabadexplorer.emergency.government.class);
                startActivity(mseb);
            }
        });

//        railway.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mseb=new Intent(emergency.this,railway.class);
//                startActivity(mseb);
//            }
//        });
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
