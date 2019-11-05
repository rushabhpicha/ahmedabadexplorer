package com.rushabh.nasikapp.ahmedabadexplorer.Express;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.rushabh.nasikapp.ahmedabadexplorer.R;

import java.util.ArrayList;

public class Express_main extends AppCompatActivity {

    ExpressAdapter expressAdapter;
    ArrayList<Express> ArrayList = new ArrayList();
    Context mContext;
    ProgressBar mMaterialProgressBar;
    RecyclerView recyclerView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_express_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Express Trains");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        expressAdapter=new ExpressAdapter(this,ArrayList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(expressAdapter);

        prepareExpressArray();
    }

    private void prepareExpressArray() {
        this.ArrayList.clear();
        this.ArrayList.add(new Express("Outgoing Trains", "(Ahmedabad to Outstation)", "", "o", "P"));
        this.ArrayList.add(new Express("Incoming Trains", "(Outstation to Ahmedabad)", "", "i", "P"));
        this.ArrayList.add(new Express("All Trains", "(All Express and Passenger trains)", "", "a", "P"));
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
