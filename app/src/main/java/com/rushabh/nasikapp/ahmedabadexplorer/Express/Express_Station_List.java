package com.rushabh.nasikapp.ahmedabadexplorer.Express;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.rushabh.nasikapp.ahmedabadexplorer.R;


public class Express_Station_List extends AppCompatActivity {

    String source;
    public String type;
    String destination;
    EditText inputStation;
    ArrayAdapter<String> adapter;
    ListView listView_autofare;
    TextView title;
    Toolbar toolbar;
    String data[]={"Abu Road",
            "Adipur",
            "Agra Fort",
            "Ahmedabad",
            "Ajmer Jn",
            "Akola Jn",
            "Alampur",
            "Allahabad Jn",
            "Alleppey",
            "Aluva",
            "Alwar",
            "Amalner",
            "Ambala Cant Jn",
            "Anand Jn",
            "Andheri",
            "Angul",
            "Anjar",
            "Ankleshwar",
            "Aurangabad",
            "Badnera",
            "Badnera Jn",
            "Bagaha",
            "Bajud",
            "Balangir",
            "Balharshah",
            "Balugaon",
            "Bandikui Jn",
            "Bandra Terminus",
            "Bapudm Motihari",
            "Bareilly",
            "Barejadi",
            "Bargarh Road",
            "Beawar",
            "Bettiah",
            "Bhachau",
            "Bhachau Bg",
            "Bhadohi",
            "Bharuch",
            "Bharuch Jn",
            "Bhaunra",
            "Bhavnagar Para",
            "Bhavnagar Terminus",
            "Bhavnagar Trmus",
            "Bhubneswar",
            "Bhuj",
            "Bhusaval Jn",
            "Bikaner Jn",
            "Bilimora Jn",
            "Borivali",
            "Botad Jn",
            "Brahmapur",
            "Chandigarh",
            "Chandrapur",
            "Chennai Egmore",
            "Chhatrapur",
            "Cuddapah",
            "Dahanu Road",
            "Daladi",
            "Delhi",
            "Delhi Cantt",
            "Delhi S Rohilla",
            "Deshnok",
            "Dhenkanal",
            "Dhola Jn",
            "Dhone",
            "Dhrangadhra",
            "Dindigul Jn",
            "Durg",
            "Dwarka",
            "Ernakulam",
            "Erode",
            "Falna",
            "Gandhidham",
            "Gandhidham Bg",
            "Gandhinagar",
            "Gangapur City",
            "Garhi Harsaru",
            "Geratpur",
            "Gonda Jn",
            "Gondia",
            "Gondia Jn",
            "Gorakhpur Jn",
            "Gotan",
            "Gothaj",
            "Gudur",
            "Gurgaon",
            "Halvad",
            "Hapa",
            "Jaipur",
            "Jalgaon",
            "Jalgaon Jn",
            "Jalna",
            "Jamnagar",
            "Janghai Jn",
            "Jawai Bandh",
            "Jodhpur",
            "Jodhpur Jn",
            "Jolarpettai",
            "Jorawarnagar",
            "Kacheguda",
            "Kalol",
            "Kanil",
            "Kanjari Boriyav",
            "Kannur",
            "Kanpur Central",
            "Kantabanji",
            "Karnal",
            "Karur",
            "Karwar",
            "Kasaragod",
            "Katpadi Jn",
            "Kayankulam",
            "Kazipet",
            "Kesinga",
            "Khairthal",
            "Khambhaliya",
            "Khammam",
            "Khariarroad",
            "Khurda Road",
            "Kishangarh",
            "Kodiyar Mandir",
            "Kollam",
            "Kosamba Jn",
            "Kota Jn",
            "Kozhikode",
            "Kurnool Town",
            "Lakhtar",
            "Lalpur Jam",
            "Lathidad",
            "Limbdi",
            "Lucknow Nr",
            "Luni",
            "Luni Jn",
            "Madgaon",
            "Madurai Jn",
            "Mahasamund",
            "Mahbubnagar",
            "Mahemdavad",
            "Mahemdavad Kheda",
            "Mahemdavad Kheda Rd",
            "Mahesana",
            "Mahesana Jn",
            "Maliya Miyana",
            "Malkapur",
            "Manamadurai",
            "Mancheswar",
            "Mandapam",
            "Mangalore",
            "Maninagar",
            "Manmad Jn",
            "Marwar",
            "Marwar Jn",
            "Marwar Mundwa",
            "Merta Road",
            "Moradabad",
            "Mudkhed",
            "Muli Road",
            "Muniguda",
            "Muzaffarpur Jn",
            "Nadiad",
            "Nadiad Jn",
            "Nagarcoil",
            "Nagarsol",
            "Nagaur",
            "Nagda Jn",
            "Nagpur",
            "Nanded",
            "Nandurbar",
            "Narkatiaganj",
            "Narnaul",
            "Navasari",
            "Navsari",
            "Nellore",
            "Nenpur",
            "Nim ka Thana",
            "Ningala Jn",
            "Nizamabad",
            "Nokha",
            "Okha",
            "Padadhari",
            "Palam",
            "Palanpur",
            "Palanpur Jn",
            "Palasa",
            "Palghar",
            "Pali Marwar",
            "Panipat Jn",
            "Panvel",
            "Paramakkudi",
            "Parbhani Jn",
            "Parvatipuram",
            "Phulera",
            "Porbandar",
            "Puri",
            "Purna Jn",
            "Raika Bagh",
            "Raipur",
            "Raipur Jn",
            "Rairakhol",
            "Rajkot",
            "Rajkot Jn",
            "Ramanathapuram",
            "Rameswaram",
            "Rani",
            "Ranpur",
            "Ratlam",
            "Ratnagiri",
            "Rayagada",
            "Rewari",
            "Ringas Jn",
            "Sabarmati",
            "Sabarmati Jn",
            "Sakhi Gopal",
            "Salem Jn",
            "Samakhiali",
            "Samakhiali Bg",
            "Sambalpur",
            "Sanand",
            "Sanosra",
            "Sawai Madhopur",
            "Secunderabad",
            "Sendra",
            "Shahjahanpur",
            "Shegaon",
            "Shoranur",
            "Sihor Gujrat",
            "Sirohi Road",
            "Sirpur Kagaznagar",
            "Somesar",
            "Sompeta",
            "Songadh",
            "Srikakulam Road",
            "Sugauli",
            "Surat",
            "Surendranagar",
            "Talcher Road",
            "Than Jn",
            "Thrissur",
            "Tirunelveli",
            "Tirupati",
            "Titlagarh",
            "Trivandrum",
            "Tundla Jn",
            "Udupi",
            "Ujalvav",
            "Utarsanda",
            "Vadodara",
            "Vadodara Jn",
            "Valsad",
            "Vapi",
            "Varanasi Jn",
            "Vartej",
            "Vasai Road",
            "Vatva",
            "Vijayawada",
            "Viramgam",
            "Viramgam Jn",
            "Vizianagaram",
            "Wadhwan",
            "Wankaner",
            "Wankaner Jn",
            "Wansjaliya",
            "Warangal",
            "Wardha",
            "Wardha Jn",
            "Yerraguntla"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.express__station__list);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("List of Stations");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getWindow().setSoftInputMode(
//                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        listView_autofare= (ListView) findViewById(R.id.listview_autofare);
        title= (TextView) findViewById(R.id.title);
        inputStation= (EditText) findViewById(R.id.input);

        this.source = getIntent().getStringExtra("source");
        this.destination = getIntent().getStringExtra("destination");
        this.type = getIntent().getStringExtra("type");

        inputStation.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    adapter.getFilter().filter(s, new Filter.FilterListener() {
                        @Override
                        public void onFilterComplete(int count) {
                            if(count==0)
                            {
                                Toast toast = Toast.makeText(Express_Station_List.this, "No Station Found!", Toast.LENGTH_SHORT);
                                toast.show();
                                toast.setGravity(Gravity.CENTER, 0, 0);
                            }
                        }
                    });
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        if(type.equals("i"))
        {
            inputStation.setHint("You are at?");
        }
        if(type.equals("o"))
        {
            inputStation.setHint("Where you want to go?");
        }
        adapter=new ArrayAdapter<String>(this, R.layout.listview_for_picnicplaces, R.id.textView_picnic,data);
        listView_autofare.setAdapter(adapter);

        listView_autofare
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String station_name = (String) listView_autofare.getItemAtPosition(position);
                if (type.equals("i")) {
                    source = station_name;
                    destination="Ahmedabad";
                } else if (type.equals("o")) {
                    destination=station_name;
                    source="Ahmedabad";
                }
                Intent intent = new Intent(Express_Station_List.this, ListofExpress.class);
                intent.putExtra("source", source);
                intent.putExtra("destination", destination);
                intent.putExtra("type", "i");
                Express_Station_List.this.startActivity(intent);
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
