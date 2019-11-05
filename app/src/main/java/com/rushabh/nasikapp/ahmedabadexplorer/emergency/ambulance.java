package com.rushabh.nasikapp.ahmedabadexplorer.emergency;

import android.content.Intent;
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

import com.rushabh.nasikapp.ahmedabadexplorer.R;

public class ambulance extends AppCompatActivity {
    Toolbar toolbar;
//    String name[] = {"Nashik Ambulance Service", "Suvichar Hospital","Ashwini Accident Hospital","Krupaprasad",
//            "Parijat Hospital","Roshni Hospital","Shreeyas Hospital","DR Kakatkar Hospital","Nashik Civil Hospital","Gupte Hospital"
//    ,"Sahara Hospital","Soham Hospital","Sushrut Hospital","Shramik Sanjivani","Life Force","Jairam Hospital and Research center",
//            "ISP Hospital","Bahujan Yuva Sangathan","Vidya Vikas Hospital","Arogyashala Hospital","Ramalayam Hospital","Esi Hospital",
//            "Siddhi Hospital","City Care Hospital Chemist","Raje Bahadur Hospital","Shree Saibaba Heart Institute","Siddhivinayak Hospital"
//    ,"Name Foundation"};
////    String contact[] = {"Contact number:", "Contact number:","Contact number:","Contact number: ","Contact number:"
////            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
////            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
////            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
////            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"};
//    String contact_no[] = {"102", "2536454986","2532599994","2532575586","2551222344","2532596055","9970001414","2532574949","2532572038","2532572962",
//    "2532517777","2532314661","2532578091","2532314062","2533013232","2532462414","2532463721","2532563442","2532578141","2532574967","2532517251"
//    ,"2532350379","2532353077","2532505771","2532503201","2536692100","9850256869","2402501100"};
//    String address[] = {"NA", "Dwarka","Mumbai Naka","Old Agra Road","M G Road","Indira Nagar","TilakWadi","Trimbak Road","Gole Colony",
//    "Dindori Naka","Sharanpur Road","Sharanpur Road","Jail Road","Jail Road","Nashik Road","Nehru Nagar,Nashik-Pune Road","Ingale Nagar"
//    ,"Gangapur Road","Gangapur Road","Panchavati","Panchavati","Satpur","Satpur","Dwarka","Shalimar Chowk","Shalimar","Cidco","Nashik Pune Road,Shingada Talav"};

    String name[]={"Vital Care","Care Plus ICU On Wheels","Krishna Home Healthcare Services","Jay Mataji Ambulance Service"
    ,"Shri Mangalmurti Seva Trust","Shree Sai Krupa General Hospital","Manshi Ambulance Service","Neel and Needhi Ambulance Services",
    "Jan Seva","Sterling Hospital","Apollo Hospitals City Center","Civil Hospital","GVK Emergency Management",
    "Rudraksha Hospital","St Johns Ambulance","AIMS Ambulance Service","Shreeji Ambulance Services"};

    String contact_no[]={"(079) 49017962",
            "(079) 49015324",
            "(079) 49014986",
            "(079) 49017318",
            "(079) 49017395",
            "(079) 49014458",
            "(079) 49013228",
            "(079) 49010428",
            "(079) 49017978",
            "(079) 40011155",
            "(079) 66305800",
            "(079) 27664355",
            "(079) 22814896",
            "(079) 22841717",
            "(079) 26671710",
            "7878797822",
            "9825957225",};
    String address[]= {"Chandkheda",
            "Ghatlodia",
            "Naranpura",
            "Tapan Hospital",
            "A / 13, Krishna Estate Flat",
            "Rajendra Park Road",
            "Sushrut Hospital",
            "Near Railway Crossing,Maninagar",
            "Arbuda Society",
            "Behind Drive in Theatre",
            "1, Tulsibaug Society",
            "Near New High Court",
            "Naroda Road",
            "Jayvir Complex",
            "Narayan Nagar Road",
            "PN House, Opposite Jethabhai Park",
            "B/10,Nirali Flat",
            "Vejalpur",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambulance);
        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contacts of Ambulance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ListView listView = (ListView) findViewById(R.id.linlay);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }
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
            view = getLayoutInflater().inflate(R.layout.listview_emergency, null);
            final TextView textView = (TextView) view.findViewById(R.id.textView);
 //           TextView textView1 = (TextView) view.findViewById(R.id.textView1);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            TextView call = (TextView) view.findViewById(R.id.call);
            TextView share = (TextView) view.findViewById(R.id.share);
//            ImageView emergency_share = (ImageView) view.findViewById(R.id.emergency_share);
//            ImageView calling1= (ImageView) view.findViewById(R.id.calling);
//            emergency_share.setImageResource(share[position]);
//            calling1.setImageResource(calling[position]);
            textView.setText(name[position]);
  //          textView1.setText(contact[position]);
            textView2.setText(contact_no[position]);
            textView3.setText(address[position]);

            call.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+textView2.getText().toString()));
                    startActivity(intent);

                }
            });
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_TEXT,"Name :"+textView.getText()+"\nAddress :"+textView3.getText()+"\nContact No: "+textView2.getText());
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

