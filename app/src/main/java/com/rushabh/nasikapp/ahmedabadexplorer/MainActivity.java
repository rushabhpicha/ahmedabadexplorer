package com.rushabh.nasikapp.ahmedabadexplorer;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rushabh.nasikapp.ahmedabadexplorer.Express.Express_main;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout dLayout;
    ImageView auto,express,news,emergency,foodies,movie,traffic,police_station,picnic;
    private boolean isFirstRun = true;
    private SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(true);

//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(true);
         toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);

        Typeface khandBold = Typeface.createFromAsset(getAssets(), "font/Lato-Bold.ttf");
        mTitle.setTypeface(khandBold);

        picnic= (ImageView) findViewById(R.id.picnic);
        auto= (ImageView) findViewById(R.id.auto);
        express= (ImageView) findViewById(R.id.express);
        news= (ImageView) findViewById(R.id.news);
        emergency= (ImageView) findViewById(R.id.emergency);
        foodies= (ImageView) findViewById(R.id.foodies);
        movie= (ImageView) findViewById(R.id.movie);
        traffic= (ImageView) findViewById(R.id.traffic_violation_fines);
        police_station= (ImageView) findViewById(R.id.nearestpolicestation);
        picnic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inNetworkConnected_picnic();
//                Intent i=new Intent(MainActivity.this,com.rushabh.nasikapp.ahmedabadexplorer.Picnic.class);
//                startActivity(i);
            }
        });
        police_station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Nearest_Police_Station.class);
                startActivity(i);
            }
        });
        traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,traffic_violation_fines.class);
                startActivity(i);
            }
        });
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,movie.class);
                startActivity(i);
            }
        });
        foodies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,foodies.class);
                startActivity(i);
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,com.rushabh.nasikapp.ahmedabadexplorer.emergency.emergency.class);
                startActivity(i);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inNetworkConnected_news();
            }
        });
        express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent auto=new Intent(MainActivity.this,Express_main.class);
                startActivity(auto);
            }
        });
        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent auto=new Intent(MainActivity.this,auto.class);
                startActivity(auto);
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dLayout.openDrawer(Gravity.LEFT);
            }
        });
        license();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private boolean inNetworkConnected_news() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm.getActiveNetworkInfo() != null) {
            Intent railways = new Intent(MainActivity.this, News_Main.class);
            startActivity(railways);

        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Check Internet Connection", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
        return cm.getActiveNetworkInfo() != null;
    }
    private boolean inNetworkConnected_picnic() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm.getActiveNetworkInfo() != null) {
            Intent railways = new Intent(MainActivity.this, Picnic.class);
            startActivity(railways);

        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Check Internet Connection", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
        return cm.getActiveNetworkInfo() != null;
    }

    private void license() {
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        isFirstRun = prefs.getBoolean("isFirstRun", true);
        if(isFirstRun){
            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this,R.style.AlertDialogCustom);
            alertDialog.setTitle("Terms and Conditions");
            String alert1 = "Please read these terms and conditions carefully before using this application.Your access to " +
                    "and the use of the service is conditioned on your acceptance of and compliance with these terms.These terms apply " +
                    "to all visitors,users and others who access or use the service." +
                    "This app has been designed to provide you information about the city of Ahmedabad.If you find any wrong information " +
                    "or have any feedback or comments then please contact us.Most of the features of this app can work offline." +
                    "This app does not collect any personal information.The developer does not and will not undertake any legal responsibility" +
                    " with regards to this app and the information available in it.Please use the app with your own prudence and responsibility.";
            alertDialog.setMessage(alert1);
            alertDialog.setCancelable(false);

            alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            AlertDialog alert = alertDialog.create();
            alert.show();
        }

        isFirstRun = false;

        prefs.edit().putBoolean("isFirstRun", isFirstRun).commit();
    }

    public boolean onContextItemSelected(MenuItem item)
    {
        return super.onContextItemSelected(item);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share_app:
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String sAux = "#AhmedabadExplorer\nLet me recommend you this application to access available resources in Ahmedabad city." +
                            "Get to know the railway timings,exact auto fare, traffic violation fines" +
                            ",police stations,emergency contacts,news,picnic spots" +
                            ",best hotels.\nIt is very useful,intuitive and simple to use.\n#MustForanAhmedabadi\n\n";
                    sAux = sAux + "https://play.google.com/store/apps/details?id=com.rushabh.nasikapp.ahmedabadexplorer";
                    i.putExtra(Intent.EXTRA_TEXT, sAux);
                    startActivity(Intent.createChooser(i, "choose one"));
                } catch (Exception e) {
                    //e.toString();
                }
                break;
            case R.id.contact_us:
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9167211958"));
                startActivity(intent);
                break;
            case R.id.feedback:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "rushabhpicha12@gmail.com"));
                intent1.putExtra(Intent.EXTRA_SUBJECT, "Subject of feedback:-");
                intent1.putExtra(Intent.EXTRA_TEXT, "Content of feedback:-");
                startActivity(intent1);
                break;
            case R.id.terms_and_conditions:
                AlertDialog.Builder a = new AlertDialog.Builder(MainActivity.this,R.style.AlertDialogCustom);
                a.setTitle("Terms and Conditions");
                a.setMessage("Please read these terms and condition carefully before using this application.Your access to " +
                        "and the use of the service is conditioned on your acceptance of and compliance with these Terms.These Terms apply " +
                        "to all visitors,users and others who access or use the service.\n\n" +
                        "This app has been designed to provide you information about the city of Ahmedabad.If you find any wrong information " +
                        "or have any feedback or comments then please contact us.Almost all the features of this app can work offline." +
                        "This app does not collect any personal information.The developer does not and will not undertake any legal responsibility" +
                        " with regards to this app and the information available in it.Please use the app with your own prudence and responsibility.");
                a.setCancelable(false);

                a.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alert = a.create();
                alert.show();
                break;
            case R.id.advertise_with_us:
                Intent inte = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "rushabhpicha12@gmail.com"));
                inte.putExtra(Intent.EXTRA_SUBJECT, "Subject Of Advertisement:-");
                inte.putExtra(Intent.EXTRA_TEXT, "Content Of Advertisement:-");
                startActivity(inte);
                break;

            case R.id.rate_us:
                Uri uri = Uri.parse("market://details?id=" + this.getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + this.getPackageName())));
                }
        }
        return super.onOptionsItemSelected(item);
    }
    @ Override
    public void onBackPressed() {
        new AlertDialog.Builder(this,R.style.AlertDialogCustom)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
