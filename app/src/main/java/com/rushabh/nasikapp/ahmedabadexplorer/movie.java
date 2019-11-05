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

public class movie extends AppCompatActivity {
    Toolbar toolbar;
    String name[]={"Rajhans Cinemas","City Gold Media Ltd ","City Gold Entertainment Ltd- Motera ",
            "SB Multiplex ","Devi Multiplex ","Mohan Cinema ","Mira Cinema ","Sonal Cinema ","Wide Angle Multiplex ","Hanjar Cinema ","City Pulse Cinema ","Rajhans Cinemas ",
            "Imax Theatre ","Movieplex Cinema ","Gauri Cinema ","Usha Cinema ","City Gold Multiplex ","Revolution Cinema ","Photo Cine Service ","Usha Talkies ","Advance Talkies ",
            "Amber Cinema ","Amrapali Theatre ","Anand Cinema ","Anupam Cinema ","Apsara Cinema ","Aradhana Cinema ","Ashok Cinema ","Everest Theaters ","Galaxy Cinema ",
            "Gujarat Cine Enterprises Pvt Ltd ","Kamal Talkies ","Lalita Mahal Cinema ","Madhuram Theatre ","Mira Cinema ","Mohan Cinema ","Natraj","Natraj Cinema ",
            "Platinum Veneers Pvt Ltd ","Preeti Theaters ","Pratap Cinema ","Roopalee Cinema ","Relief Cinema ","Rupam Cinema ","Rosy Talkies ","Senovision Film Centre ",
            "Shalimar Theatre ","Shital Theatres ","Shiv Cinema ","Shree Cinema ","Sunset Drive-In Cinema Pvt Ltd ","Sonal Theatre ","Vasant Talkies "};


    String contact_no[]={"079 - 65223434"," 079 - 65424625","079 - 27507781",
            "079 - 23963168","079 - 22841386","079 - 22683228","079 - 25393450","079 - 26811926","079 - 40211000",
            "079 - 22941285","079 - 65136999","079 - 65223434","079 - 65220111","9712348888","079 - 22872444","079 - 22774583",
            "9173777700","079 - 25860909","079 - 22137072","079 - 22774583","079 - 25506435","079 - 22742192","079 - 22162618","079 - 22811420","079 - 22163211","079 - 25326900",
            "079 - 25327301","079 - 25356598","079 - 22374200","079 - 22840440","079 - 22163211","079 - 27506888","079 - 27523255","079 - 25624535","079 - 25393450",
            "079 - 22683228","079 - 26588400","079 - 26587808","079 - 27546325","079 - 27481275","079 - 25357594","079 - 25502516","079 - 25507748","079 - 25357705","079 - 22143586",
            "079 - 25465524","079 - 25350371","079 - 22161225","079 - 26589973","079 - 26579480","079 - 27454600","079 - 26811926","079 - 22133324"};

    String address[]={"Near Anil Starch Mill, Bapunagar","Opposite Motera Stadium, Motera","Ashram Road",
            "Bethakna Roda, Opposite Mahaprabhu Apartment, Naroda Road",
            "Jahangirpura Choktha Chawl, Asarwa Lakhajis","Maninagar","114, Matruchaya Complex, Revabhai Estate, Retina Foundation",
            "Zodiac Square, Ground Floor, Gurudwara Cross Road","Near Meter Gauge Railway Station, Saraspur","Shyamal Cross Road, Satellite",
            "Kalasagar Mall, Satadhar Cross Road, Naranpura","Sine City Main Road, Sola","Mehsana Highway, Station Road",
            "National Highway, Odhav, Ahmedabad, Gujarat - 382415","Usha Cinema Road, Near Gomtipur Gate, Gomtipur","Anil Star Road, Kapunager",
            "Barwi Tower, CTM Cross Road","1763, 1st Floor, Above Jayambe Electric St","Near Rajagar Rice Pulse Mills, Gomtipur",
            "Near Telegraph City Office, Bhadra","Near Manch Has Masjid, Saraspur","Chhikniwala Estate, Gomtipur, Ahmedabad, Gujarat - 380021","Near Police Station, Naroda Road, Ahmedabad, Gujarat - 380025",
            "Memco Khokhara","Opposite Pushpakunj Soc, Kankaria","Opposite Pushpakunj",
            "Gheekanta Road","Opposite Ashokwadi, Near Milan Cinema, Saraspur","National Highway, No. 8, Naroda Road",
            "Anupam Cinema, Opposite Bhalakia Mill Khokhra, Mahemdabad","Ramnagar Sabarmati","Kaligam, Near Central Bank Sabarmati",
            "Madhuram Theatre, Gheekanta","Maninagar","Jahangirpura Choktha Chawl, Asarwa Lakhajis",
            "Beside Guj Chamber Of Commerce, Ashram Road","Opposite Kunal Restaurant, Ashram Road","T/18, 3rd Floor, Vikram Chambers, Near Sales India, Ashram Road",
            "4, Pooja Appartment Nava Wadaj Road","Richy Road, Pratap Cinema, Gandhi Road","Roopalee Cinema Building, Lal Darwaja",
            "Relief Road","Relief Road","Opposite Sarangpur Gate","Anand Restaurant, Opposite Balvatika, Kankaria",
            "Gita Mandir Road, New Shahalam Darwaja","Gomtipur Road","Ashram Road, Opposite Natraj Cinema",
            "Opposite Gujarat Chamber Of Commerce, Ashram Road","Drive In Road, Gurukul","Near Hajikuva Kui Vasn A, Sarkhej Road, Vejalpu Crossing Road",
            "Near Idgah Chowky, Opposite Dariapur Gate","Opposite Sarangpur Gate"};
//    String name[] = {"INOX Cinema","Cinemax","PVR Cinemas","Mahalaxmi Theatre","Divya Big Cinema"};
//
//    String contact_no[] = {"0253 242 1111","0253 661 2020","0253 669 5225","0253 251 1936","093254 02677"};
//    String address[] = {"Nashik Pune road, Shivaji nagar","City Centre Mall,Lawate Nagar",
//    "Vitthal Charni Complex,Canada corner","Loksahakar Nagar","Cidco Nashik","Bhadrakali,Shalimar"};
//    String book_tickets[]={"book tickets","book tickets","book tickets","bookings:NA","bookings:NA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        ListView listView = (ListView) findViewById(R.id.linlay);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Movie Theatre");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

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
            view = getLayoutInflater().inflate(R.layout.listview_movie, null);
            //final WebView webView= (WebView) findViewById(R.id.webView);
            final TextView textView = (TextView) view.findViewById(R.id.textView);
  //          TextView textView1 = (TextView) view.findViewById(R.id.textView1);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            final TextView call = (TextView) view.findViewById(R.id.call);
            final TextView share = (TextView) view.findViewById(R.id.share);
//            TextView textView4 = (TextView) view.findViewById(R.id.book_tickets);
//            TextView location= (TextView) view.findViewById(R.id.location);
            textView.setText(name[position]);
//            textView1.setText(contact[position]);
            textView2.setText(contact_no[position]);
            textView3.setText(address[position]);
 //           textView4.setText(book_tickets[position]);
            Typeface lato_bold = Typeface.createFromAsset(getAssets(), "font/Lato-Bold.ttf");
            Typeface lato_medium = Typeface.createFromAsset(getAssets(), "font/Lato-Medium.ttf");
            textView.setTypeface(lato_bold);
            textView2.setTypeface(lato_medium);
            textView3.setTypeface(lato_medium);
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
            textView3.setOnClickListener(new View.OnClickListener() {
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
//        location.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        inNetworkConnected();
//    }
//
//            private boolean inNetworkConnected() {
//
//                    ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
//                    if(cm.getActiveNetworkInfo()!=null)
//                    {
//                        if (position == 0) {
//                            String url = "https://www.google.co.in/maps/place/INOX+Cinema/@19.978554,73.8057812," +
//                                    "17z/data=!3m1!4b1!4m5!3m4!1s0x3bddeafda601b20d:0xdc2714f7c6378eba!8m2!3d19.978554!4d73.8079699";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
//
//
//                        if (position == 1) {
//                            String url = "https://www.google.co.in/maps/place/Cinemax/@19.9785437,73.7729501,13z/data=!3m1!5s0x3bd" +
//                                    "deb70fa9ca425:0xf8ef09f759bfd7c4!4m8!1m2!2m1!1scinemax+nasik!3m4!1s0x3bddeb70eef9de0d:0x51c3ce9262356dec!8m2!3d19.990584!4d73.7605558";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
//
//                        if (position == 2) {
//                            String url = "https://www.google.co.in/maps/place/PVR+Cinemas,+College+Road/@19.9790396,73.7666236" +
//                                    ",13z/data=!4m8!1m2!2m1!1spv+cinemas+nasik!3m4!1s0x3bddeb994e48e08b:0xa13e6e2de7c8360e!8m2!3d20.0051321!4d73.7662546";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
//
//                        if (position == 3) {
//                            String url = "https://www.google.co.in/maps/place/Mahalaxmi+Theatre/@20.014338,7" +
//                                    "3.7945712,17z/data=!3m1!4b1!4m5!3m4!1s0x3bddea4d6f0a8b4b:0x55b9d78af40650!8m2!3d20.014338!4d73.7967599";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
//                        if (position == 4) {
//                            String url = "https://www.google.co.in/maps/place/DIVYA+BIG+Cinemas/@19.981469,73.756" +
//                                    "0872,15z/data=!4m5!3m4!1s0x0:0x9998bc97551fdf80!8m2!3d19.981469!4d73.7560872";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//
//                        }
//
//                    }
//                    else
//                    {
//                        Toast toast=Toast.makeText(movie.this, "Check Internet Connection", Toast.LENGTH_SHORT);
//                        toast.show();
//                        toast.setGravity(Gravity.CENTER, 0, 0);
//                    }
//                    return cm.getActiveNetworkInfo() != null;
//                }
//
//        });
//            textView4.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    inNetworkConnected();
//                }
//
//                private boolean inNetworkConnected() {
//                    ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
//                    if(cm.getActiveNetworkInfo()!=null)
//                    {
//                        if (position == 0) {
//                            String url = "https://in.bookmyshow.com/buytickets/inox-cinemas-nashik/cinema-nask-FMNK-MT/20170522";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
//
//
//                        if (position == 1) {
//                            String url = "https://in.bookmyshow.com/nashik/cinemas/cinemax-city-center-nashik/CXNC";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
//
//
//                        if (position == 2) {
//                            String url = "https://www.pvrcinemas.com/cinemasessions/Nashik/cinemax---city-center-mall,-nashik/NACC";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
//
////                        if (position == 3) {
////                            String url = "https://www.pvrcinemas.com/cinemasessions/Nashik/cinemax---city-center-mall,-nashik/NACC";
////                            Intent i = new Intent(Intent.ACTION_VIEW);
////                            i.setData(Uri.parse(url));
////                            startActivity(i);
////                        }
////                        if (position == 4) {
////                            String url = "https://in.bookmyshow.com/nashik/cinemas/carnival-divya/ADDV";
////                            Intent i = new Intent(Intent.ACTION_VIEW);
////                            i.setData(Uri.parse(url));
////                            startActivity(i);
////                        }
//                    }
//                    else
//                    {
//                        Toast toast=Toast.makeText(movie.this, "Check Internet Connection", Toast.LENGTH_SHORT);
//                        toast.show();
//                        toast.setGravity(Gravity.CENTER, 0, 0);
//                    }
//                    return cm.getActiveNetworkInfo() != null;
//                }
//            });
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
