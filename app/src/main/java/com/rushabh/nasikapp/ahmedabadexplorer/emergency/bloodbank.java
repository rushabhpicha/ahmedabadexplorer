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


public class bloodbank extends AppCompatActivity {
    Toolbar toolbar;
//    String name[] = {"Arpan Blood Bank","Nashik Civil Hospital","Jankalyan Blood Bank","Cantonment Hospital","Upasani Blood Bank"};
////    String contact[] = {"Contact number:", "Contact number:","Contact number:","Contact number: ","Contact number:"};
//    String contact_no[] = {"02532576058", "02532572038","02532575249","02532481377","02532574867"};
//    String address[] = {"Opposite Dainik Gavkari Press,RK,422001","Nashik Road,Trimbak Road,422002","3,Shreenagar,Gangapur Road,422013",
//            "Vednar Road,Deolali,422401","Ravivar Karanja,422001"};

    String name[]={"Sheth V.S. General Hospital",
    "Smt. Laxmiben Chimanlal Lalbhai Blood Bank",
    "Sheth L.G. General Hospital And Blood Bank",
    "Civil Hospital(Asarwa)",
    "Civil Hospital(Sola)",
    "Indian Red Cross Society Blood Bank",
    "Gujarat Cancer Research Institute",
    "Smt. G R Doshi And Smt. K M Mehta Institute",
    "Dr. Jivraj Mehta Smarak Health Foundation"};

    String contact_no[]=
    {
        "079 26577621",
        "079 22164261",
        "079 25461380",
        "079 22683949",
        "079 27432584",
        "079 26651833",
        "079 22681451",
        "079 22687164",
        "079 22687164",
    };
    String address[]={"Ellisbridge City",
            "Saraspur",
            "Maninagar",
            "Asarwa",
            "GandhinagarSarkhej Highway",
            "Paldi",
            "Civil Hospital Campus",
            "Civil Hospital Compound, Asarwa",
            "Ratubhai Adani Arogyadham,Near Ayojan Nagar",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bloodbank);
        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contacts of Blood Bank");
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
//            TextView textView1 = (TextView) view.findViewById(R.id.textView1);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            TextView call = (TextView) view.findViewById(R.id.call);
            TextView share = (TextView) view.findViewById(R.id.share);
//            ImageView emergency_share = (ImageView) view.findViewById(R.id.emergency_share);
//            ImageView calling1= (ImageView) view.findViewById(R.id.calling);
//            emergency_share.setImageResource(share[position]);
//            calling1.setImageResource(calling[position]);
            textView.setText(name[position]);
 //           textView1.setText(contact[position]);
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
