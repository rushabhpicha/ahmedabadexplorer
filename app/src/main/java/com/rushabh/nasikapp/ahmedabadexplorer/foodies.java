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
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class foodies extends AppCompatActivity {
    Toolbar toolbar;
//    String name[] = {"Seasons Kitchens And Bar","Vaibhav Misal And Chinese","Udupi Tadkas Hariyaali pure Veg Restaurant"
//    ,"The Blue Pink Pure Veg Restaurant","Apple Mint Pure Veg Family Restaurant","Hotel Curry Leaves","New Rasoi Family Veg Restaurant",
//            "Morya Snacks","Hotel Purohit Dham","Purohit Thali Restaurant","Shalimar Restaurant"
//           ,"Chetna Dinning Hall","Leafy Veg","Smokin Joes Pizza","Panchvati Pure Veg Restaurant","MH-15 Family Restaurant"
//    ,"Hotel Radhika","Tadka Family Restaurant","Hotel Mathura Pure Veg","Hariyaali","Vaishali Family Restaurant","Sai Leela" +
//            " Family Restaurant","Madras Cafe Restaurant","Sai Jagat Pure Veg Restaurant","Hotel Sayaji","Vrindavan Family Restaurant"
//    };
////    String contact[]={"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:",
////            "Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:",
////            "Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:",
////            "Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"};
//    String address[] = {"Gangapur Road,Ayodhya Nagar","Lam Road,Nashik Road","Opposite Somani Garden,Nashik Road","Lam Road,Nashik Road",
//    "Shinde Pulse,Nashik Road","Nashik-Pune Highway,Nashik Road","Opposite Muktidham,Nashik Road","Tapovan Road,Tapovan","Mukti Dham,Nashik Road"
//            ,"Nashik Road,Bytco point","MG Road,Nashik Road","Sargade Galli","Jail Road,Nashik Road",
//    "Nashik-Pune Road,Bytco Point","Dr.Babasaheb Ambedkar Road,Road","Opp. Janlaxmi Bank,Jail Road","Ganesh Market,Nasik",
//    "Jail Road,Nashik Road","Datta Mandir Road,Back to Muktidham","MG Road,Nashik Road","Nashik Road,Bytco Point","Nashik Road,Jail Road",
//    "Dr. Ambedkar Road,Nashik Road","Bytco Point,Nashik Road","Nashik-Pune Highway,Nashik Road","Datta Mandir Road"};
//    String contact_no[]={"9850717626","9420577506","02532460666","02532473473","9404493959","02532468894"
//    ,"02532459348","9421232149","02532463883","02532463407","02532456300","09766156434","9766608008","02532462220","9975914500"
//    ,"9028187621","9823100142","02532453668","02532468333","02532456060","9881151134","02536464333","8087058596"
//    ,"9762725838","9890981017","9730073709"};
String name[] = {"The Philosophy Club","Brewers the Coffee Bar","Global Desi Tadka","Seva Cafe","Swati Snacks","The Black Cafe","The Green House","The Unforgettable","Turquoise Villa World Cafe","Village the Soul of India",
        "Jassi De Parathe","Mocha","Barbeque Nation - Ahmedabad - Drive-In Road","Momo Cafe","Rajwadu","Momo Cafe","Gopi Dining Hall","Toran Dining Hall","Dakshinayan Restaurant","River View Restaurant - Hotel Sarovar Portico",
        "Tinello","Atithi","The Green House","Pleasure Trove","Mirch Masala, Chandkheda","Sasuji Dining Hall","Yanki Sizzlers","That Place","M.A.D. by Tomato's","Swati Snacks"};

    String address[] = {"8 Sarthik Complex, Satellite","Usmanpura, Central Business Space",
            "4th floor, Gulmohar Park Mall","Shopper's Plaza 4th floor","Near Thakorbhai Hall,Law Garden",
            " C/G/F/8, Galaxy Tower","Opp. Sidi Saiyad Jali, Lal Darwaja","4, ATP Arcade, Nr. National Handloom","Center Point, Panchwati Circle",
            " Level 3, Himalaya Mall","107, Safal Pegasus",
            "Devashish Business Park","Shop No.3, Near Mile Stone Complex","Courtyard Ahmedabad",
            "Nr. Jivraj Tolnaka","Courtyard Ahmedabad, Pandurang Shastri Athavale Marg, Satellite","Opposite Town Hall, Ellisbridge",
            "Opposite Sales India, Ashram Road, Navrangpura, Shreyas Colony, Navrangpura","427 Sarthik complex, opp.Fun Republic ticket booking window, Behind Golden, Ramdev Nagar","Hotel Sarovar Portico, Bhavan's College Road, Bhadra, Khanpur",
            "Hyatt Regency Ahmedabad","Mohini, Opposite Shraddha Petrol Pump","The House of MG, Opp. Sidi Saiyed Jali",
            "Vishalpur, Ellisbridge","Chandkheda","Singaporean Avenue, Opp. Lal Bungalow",
            " Bhaikakanagar, Thaltej","Sarvottam Nagar Society, Navrangpura","Bodakdev",
            "Panchavati Road, Ellisbridge"};

    String contact_no[] = {"00918758421125","9824549077","09898705705"," +91-79-32954140","26405900","9728249999"," +91-79-25506946","07961906140"," 079-4037-3000","09558162625","099250 02706","099988 89997","1800 108 6060","079 6618 5000",
            "079 2664 3839","079 6618 5000","079 2657 6388","079 2754 2197","079 2692 0672","099242 43211","079 4017 1133","079 2685 8806","099099 70682","079 2657 4892","079 2397 2452","079 2640 5066","079 4038 1616","079 2642 2226","079 2685 7885",
            "079 2640 5900"};

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodies2);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Foodies");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ListView listView = (ListView) findViewById(R.id.linlay);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
//        button= (Button) findViewById(R.id.maps_foodies);

//      button.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Intent i=new Intent(foodies.this,map_foodies.class);
//              startActivity(i);
//          }
//      });
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
//            TextView textView1 = (TextView) view.findViewById(R.id.textView1);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            TextView call = (TextView) view.findViewById(R.id.call);
            TextView share = (TextView) view.findViewById(R.id.share);
            Typeface lato_bold = Typeface.createFromAsset(getAssets(), "font/Lato-Bold.ttf");
            Typeface lato_medium = Typeface.createFromAsset(getAssets(), "font/Lato-Medium.ttf");
            textView.setTypeface(lato_bold);
            textView2.setTypeface(lato_medium);
            textView3.setTypeface(lato_medium);
//            ImageView emergency_share = (ImageView) view.findViewById(R.id.emergency_share);
//            ImageView calling1= (ImageView) view.findViewById(R.id.calling);
//            emergency_share.setImageResource(share[position]);
//            calling1.setImageResource(calling[position]);
            textView.setText(name[position]);
//            textView1.setText(contact[position]);
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
      //      call.setBackgroundResource(R.drawable.highlight);
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
