package com.rushabh.nasikapp.ahmedabadexplorer;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class Nearest_Police_Station extends AppCompatActivity {
    ListView listView_autofare;
//    String data[]={"Gangapur Police Station","Ambad Police Station","Sarkarwada Police Station","Upnagar Police Station"
//            ,"Panchavati Police Station","Nashik Commissioner Office","Satpur Police Station"
//            ,"Mhasrul Police Station","Nashik Road Police Station","Upnagar Police Station","Ashwin Nagar Police Chauki",
//            "CBS Police Station Bhadrakali","Deolali Camp Police Chauki","Nashik Taluka Police Thana","College Road Police Chauki"
//            ,"Deolali Camp Police Station"};
//    String contact_no[]={"02532305242","0253 239 2233","0253 231 9621","0253 241 5641","0253 262 9831"
//            ,"0253 230 5247","0253 230 5237","0253 253 3233","0253 246 5533","02532415641","97621 00100","0253 230 5214","0253 249 1233"
//            ,"0253 230 9711","0253 230 5242","0253 249 1233"};
//    String contact[]={"Contact Number:","Contact Number:","Contact Number:","Contact Number:","Contact Number:","Contact Number:",
//            "Contact Number:","Contact Number:","Contact Number:","Contact Number:","Contact Number:","Contact Number:",
//            "Contact Number:","Contact Number:","Contact Number:","Contact Number:"};

    String data[]={"VEJALPUR Police Station",
            "ELLISBIDGE Police Station",
            "SATELLITE Police Station",
            "ANANDNAGAR Police Station",
            "VASTRAPUR Police Station",
            "NAVRANGPURA Police Station",
            "NARANPURA Police Station",
            "GHATLODIYA Police Station",
            "SOLA Police Station",
            "GUJARAT UNIVERSITY Police Station",
            "SABARMATI Police Station",
            "RANIP Police Station",
            "CHANDKHEDA Police Station",
            "MADHVPURA Police Station",
            "SHAHPUR Police Station",
            "KARANJ Police Station",
            "SHAHERKOTDA Police Station",
            "KHADIYA Police Station",
            "GAYAKVAD HAVELI Police Station",
            "DARIYAPUR Police Station",
            "SHAHIBAUG Police Station",
            "SARDARNAGAR Police Station",
            "NARODA Police Station",
            "MEGHANI NAGAR Police Station",
            "GOMATIPUR Police Station",
            "BAPUNAGAR Police Station",
            "RAKHIYAL Police Station	RAKHIYAL",
            "ODHAV Police Station",
            "AMRAIWADI Police Station",
            "KHOKHRA Police Station",
            "RAMOL Police Station",
            "VATVA Police Station",
            "MANINAGAR Police Station",
            "VATVA-GIDC",
            "ISHNPUR Police Station"};

    String contact_no[]={"079 26810614",
            "079 26570282",
            "079 26860333",
            "079- 26762250",
            "079- 26851902",
            "079-26463568",
            "079-27434174",
            "079-27489127",
            "079-27664452",
            "079-26304673",
            "079-27517166",
            "079-27551010",
            "079-23291275",
            "079-25620189",
            "079-25600367",
            "079-25501212",
            "079-22920007",
            "079-22161386",
            "079-25382257",
            "079-22161913",
            "079-22865312",
            "079-22864345",
            "079-22821480",
            "079-22680408",
            "079-22743609",
            "079-22700585",
            "079-22733600",
            "079-22971718",
            "079-22732332",
            "079-22762206",
            "079-25850300",
            "079-25710074",
            "(79)-25466392",
            "079-25830004",
            "079-25430180",
           };
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest__police__station);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Nearest Police Station");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ListView listView = (ListView) findViewById(R.id.linlay);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }
//
    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return contact_no.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.listview_without_address, null);
            final TextView textView = (TextView) view.findViewById(R.id.textView);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            TextView call = (TextView) view.findViewById(R.id.call);
            TextView share = (TextView) view.findViewById(R.id.share);
//            ImageView emergency_share = (ImageView) view.findViewById(R.id.emergency_share);
//            ImageView calling1= (ImageView) view.findViewById(R.id.calling);
//            emergency_share.setImageResource(share[position]);
//            calling1.setImageResource(calling[position]);
            textView.setText(data[position].substring(0, 1).toUpperCase() + data[position].substring(1).toLowerCase());
//            textView1.setText(contact[position]);
            textView2.setText(contact_no[position]);
//            textView3.setText(address[position]);

            Typeface lato_bold = Typeface.createFromAsset(getAssets(), "font/Lato-Bold.ttf");
            Typeface lato_medium = Typeface.createFromAsset(getAssets(), "font/Lato-Medium.ttf");
            textView.setTypeface(lato_bold);
            textView2.setTypeface(lato_medium);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + textView2.getText().toString()));
                    startActivity(intent);
                }
            });
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Name :" + textView.getText() + "\nContact No: " + textView2.getText());
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "The title");
                    startActivity(Intent.createChooser(shareIntent, "Share..."));
                }
            });
            return view;
        }
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