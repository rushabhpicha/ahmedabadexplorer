package com.rushabh.nasikapp.ahmedabadexplorer.Express;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

class express_databae extends SQLiteOpenHelper {
    private static final String DB_NAME = "ExpressTrain.db";
    private static final int DB_VERSION = 1082;
    private Context myContext;

    public express_databae(Context ctx) {
        super(ctx, DB_NAME, null, DB_VERSION);
        this.myContext = ctx;
    }

    public void onCreate(SQLiteDatabase db) {
        createTables(db);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < newVersion) {
            db.execSQL("DROP TABLE IF EXISTS express");
            createTables(db);
        }
    }
    public void createTables(SQLiteDatabase database) {
        try {
            System.out.println("Creating tables");
            database.execSQL("create table if not exists express (_id integer primary key autoincrement,trainid integer,trainname text, stationname TEXT, arrival TIME,dateplus integer,sun TEXT,mon TEXT,tue TEXT,wed TEXT,thu TEXT,fri TEXT,sat TEXT)");
            //Bandra Terminus Mumbai- Bhavnagar- 19203
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Bandra Terminus','13:15','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Borivali','14:05','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Dahanu Road','15:39','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Vapi','16:20','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Navsari','17:57','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Surat','18:34','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Bharuch Jn','20:47','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Vadodara Jn','22:02','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Anand Jn','22:53','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Nadiad Jn','23:10','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Ahmedabad','00:05','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Viramgam Jn','01:15','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Jorawarnagar','02:48','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Botad Jn','03:45','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Dhola Jn','04:28','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Songadh','04:47','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Sihor Gujrat','04:59','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19203,'Bandra Terminus Mumbai Bhavnagar','Bhavnagar Terminus','06:00','1','-','Mon','-','-','-','-','-')");


//Ranakpur Express Mumbai- Bikaner- 14708


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Bandra Terminus','15:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Borivali','15:46','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Palghar','16:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Vapi','17:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Valsad','18:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Surat','19:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Bharuch','20:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Vadodara','21:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Anand Jn','22:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Nadiad Jn','22:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Ahmedabad','23:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Sabarmati','00:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Kalol','01:10','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Mahesana','01:52','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Palanpur','03:23','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Abu Road','04:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Sirohi Road','05:21','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Jawai Bandh','06:06','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Falna','06:28','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Rani','06:49','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Somesar','07:21','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Marwar','08:18','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Pali Marwar','08:44','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Luni','09:19','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Jodhpur','09:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Raika Bagh','10:05','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Gotan','11:37','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Merta Road','12:00','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Marwar Mundwa','12:38','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Nagaur','12:56','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Nokha','13:55','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Deshnok','14:22','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14708,'Ranakpur Express','Bikaner Jn','15:35','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Delhi Sabli Road Express PORBANDAR- DELHI- 19263

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Porbandar','15:10','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Wansjaliya','15:44','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Bhaunra','16:02','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Lalpur Jam','16:40','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Jamnagar','18:00','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Hapa','18:15','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Rajkot Jn','19:28','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Wankaner Jn','20:09','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Surendranagar','21:28','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Viramgam','23:04','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Ahmedabad','00:20','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Sabarmati Jn','01:09','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Mahesana Jn','02:38','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Palanpur Jn','04:13','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Abu Road','05:30','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Falna','07:19','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Marwar Jn','08:38','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Beawar','09:47','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Ajmer Jn','10:55','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Kishangarh','11:36','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Phulera','12:17','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Jaipur','13:10','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Alwar','15:40','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Khairthal','16:08','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Rewari','18:00','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Gurgaon','18:38','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Delhi Cantt','18:58','0','-','-','Tue','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19263,'Delhi Sabli Road Express','Delhi S Rohilla','19:33','0','-','-','Tue','-','-','-','Sat')");


//Porbandar Motihari Express- 19269


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Porbandar','15:10','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Bhaunra','16:02','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Jamnagar','17:58','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Rajkot Jn','19:28','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Wankaner','20:09','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Surendranagar','21:28','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Viramgam','23:03','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Ahmedabad','00:20','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Palanpur Jn','04:13','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Abu Road','05:30','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Marwar Jn','08:38','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Ajmer Jn','10:55','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Jaipur','13:10','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Bandikui Jn','14:30','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Alwar','15:40','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Rewari','18:00','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Gurgaon','18:38','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Delhi Cantt','18:58','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Delhi S Rohilla','19:33','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Delhi','20:00','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Moradabad','23:50','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Bareilly','01:22','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Shahjahanpur','02:35','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Lucknow Nr','05:15','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Gonda Jn','08:00','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Gorakhpur Jn','10:50','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Bagaha','14:09','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Narkatiaganj','14:56','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Bettiah','15:35','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Sugauli','15:55','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Bapudm Motihari','16:13','0','-','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19269,'Porbandar Motihari Express','Muzaffarpur Jn','18:10','0','-','-','-','-','Thu','Fri','-')");


//Ranakpur Express Bikaner- Mumbai- 14707

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Bikaner Jn','09:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Deshnok','09:56','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Nokha','10:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Nagaur','11:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Marwar Mundwa','11:41','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Merta Road','12:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Gotan','12:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Raika Bagh','13:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Jodhpur Jn','14:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Luni Jn','15:11','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Pali Marwar','15:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Marwar Jn','17:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Somesar','17:56','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Rani','17:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Falna','18:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Jawai Bandh','18:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Sirohi Road','18:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Abu Road','19:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Palanpur Jn','21:31','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Mahesana','22:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Kalol','23:31','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Sabarmati','23:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Ahmedabad','00:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Nadiad','01:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Anand Jn','02:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Vadodara','02:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Bharuch','03:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Surat','04:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Valsad','05:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Vapi','06:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Palghar','07:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Borivali','08:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(14707,'Ranakpur Express','Bandra Terminus','09:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Ahmedabad Anand Memu- 69106


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Ahmedabad','01:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Maninagar','01:19','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Vatva','01:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Geratpur','01:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Barejadi','01:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Kanil','01:47','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Nenpur','01:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Mahemdavad Kheda','01:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Gothaj','02:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Nadiad','02:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Utarsanda','02:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Kanjari Boriyav','02:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(69106,'Ahmedabad Anand Memu','Anand Jn','02:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Valsad Bikaner Special- 04738

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Valsad','19:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Navsari','20:05','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Surat','20:42','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Bharuch','21:33','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Vadodara','22:45','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Anand Jn','23:36','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Nadiad','23:53','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Ahmedabad','00:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Mahesana','03:02','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Palanpur Jn','05:00','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Abu Road','05:55','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Falna','07:52','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Rani','08:05','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Marwar Jn','09:05','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Pali Marwar','09:32','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Luni','10:13','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Jodhpur','10:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Gotan','12:24','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Merta Road','12:58','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Nagaur','14:21','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Nokha','15:23','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(04738,'Valsad Bikaner Special','Bikaner Jn','17:00','0','-','-','Tue','-','-','-','-')");


//Gandhidham Puri Express- 19453
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Gandhidham Bg','19:30','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Bhachau Bg','20:03','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Samakhiali','20:28','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Viramgam','23:20','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Ahmedabad','00:45','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Nadiad Jn','02:20','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Anand Jn','02:50','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Vadodara Jn','03:35','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Surat','06:37','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Nandurbar','10:45','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Amalner','12:55','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Jalgaon','14:05','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Bhusaval Jn','14:40','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Malkapur','15:33','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Akola Jn','16:40','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Badnera','18:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Wardha Jn','20:04','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Nagpur','22:00','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Gondia','23:55','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Durg','02:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Raipur','03:10','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Mahasamund','04:28','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Kantabanji','06:10','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Titlagarh','07:05','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Kesinga','07:30','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Muniguda','08:35','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Rayagada','09:55','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Parvatipuram','10:55','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Vizianagaram','12:25','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Srikakulam Road','13:43','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Palasa','15:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Sompeta','15:40','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Brahmapur','16:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Chhatrapur','16:36','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Balugaon','17:20','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Khurda Road','18:30','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Sakhi Gopal','19:19','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19453,'Gandhidham Puri Express','Puri','19:55','0','-','-','-','Wed','-','-','-')");


//Chennai Egmore Chennai- Jodhpur Express- 16125

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Chennai Egmore','15:15','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Gudur','17:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Nellore','18:17','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Vijayawada','22:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Khammam','23:30','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Warangal','00:58','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Balharshah','05:40','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Wardha','08:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Badnera','09:45','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Akola Jn','10:40','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Bhusaval Jn','12:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Jalgaon Jn','13:59','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Nandurbar','17:25','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Surat','21:17','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Vadodara Jn','23:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Ahmedabad','00:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Mahesana Jn','03:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Palanpur Jn','04:43','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Abu Road','06:05','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Sirohi Road','06:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Falna','07:34','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Marwar Jn','09:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Pali Marwar','09:24','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Luni','10:09','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(16125,'Chennai Jodhpur Express','Jodhpur Jn','10:50','0','-','-','-','-','-','-','Sat')");


//Secunderabad Bikaner Hyderabad- Bikaner- 17037

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Secunderabad','23:35','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Kazipet','01:48','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Sirpur Kagaznagar','04:08','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Balharshah','05:40','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Chandrapur','06:11','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Wardha','08:00','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Badnera','09:45','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Akola Jn','10:40','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Shegaon','11:14','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Malkapur','11:48','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Bhusaval Jn','12:50','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Jalgaon Jn','13:55','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Amalner','15:25','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Nandurbar','17:25','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Surat','21:17','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Vadodara Jn','23:00','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Ahmedabad','00:50','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Mahesana','03:00','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Palanpur Jn','04:43','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Abu Road','05:55','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Marwar Jn','09:00','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Pali Marwar','09:24','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Luni','10:10','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Jodhpur','10:50','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Merta Road','12:58','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Nagaur','14:12','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Nokha','15:11','0','-','-','Tue','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17037,'Hyderabad Bikaner Express','Bikaner Jn','17:00','0','-','-','Tue','Wed','-','-','-')");


//Chandigarh Bandra  Chandigarh- Mumbai Express- 22452

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Chandigarh','05:40','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Ambala Cant Jn','06:30','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Karnal','07:34','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Panipat Jn','08:03','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Delhi Cantt','09:58','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Gurgaon','10:25','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Rewari','11:35','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Narnaul','12:16','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Nim ka Thana','13:00','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Ringas Jn','13:50','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Phulera','15:03','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Ajmer Jn','16:30','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Marwar Jn','18:28','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Falna','19:15','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Abu Road','21:08','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Palanpur Jn','22:13','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Mahesana','23:23','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Ahmedabad','01:05','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Anand Jn','02:23','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Vadodara Jn','03:07','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Bharuch','04:04','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Surat','04:58','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Borivali','08:28','0','Sun','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22452,'Chandigarh Mumbai Express','Bandra Terminus','09:20','0','Sun','-','-','Wed','-','-','-')");


//Delhi S Rohilla- Bandra Terminus- 12215

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Delhi S Rohilla','09:20','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Delhi Cantt','09:36','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Gurgaon','09:59','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Rewari','10:45','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Alwar','11:42','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Jaipur','14:10','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Ajmer Jn','16:30','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Falna','19:15','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Abu Road','21:08','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Palanpur Jn','22:13','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Gandhinagar','00:14','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Ahmedabad','01:20','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Nadiad','02:08','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Vadodara','03:05','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Bharuch','03:54','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Surat','04:45','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Borivali','07:21','0','-','Mon','Tue','-','Thu','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12215,'Delhi S Rohilla Bandra Terminus Express','Bandra Terminus','08:10','0','-','Mon','Tue','-','Thu','-','Sat')");

//Ahmedabad Anand Dhamua Ahmedabad- Anand- 79430

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(79430,'Ahmedabad Anand Dhamau Express','Ahmedabad','02:00','0','-','Mon','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(79430,'Ahmedabad Anand Dhamau Express','Maninagar','02:09','0','-','Mon','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(79430,'Ahmedabad Anand Dhamau Express','Mahemdavad','02:39','0','-','Mon','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(79430,'Ahmedabad Anand Dhamau Express','Nadiad Jn','03:06','0','-','Mon','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(79430,'Ahmedabad Anand Dhamau Express','Anand Jn','03:35','0','-','Mon','-','Wed','-','Fri','-')");


//Mumbai- Bhuj  Kutch Express- 19131
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Bandra Terminus','17:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Borivali','17:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Vapi','19:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Valsad','20:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Navsari','20:59','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Surat','21:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Ankleshwar','22:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Bharuch','22:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Vadodara','23:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Anand Jn','00:19','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Nadiad','00:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Ahmedabad','01:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Viramgam Jn','03:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Dhrangadhra','04:11','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Halvad','04:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Maliya Miyana','05:22','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Samakhiali','06:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Bhachau','06:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Gandhidham','07:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Adipur','07:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Anjar','08:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1913,'Mumbai Bhuj Kutch Express','Bhuj','09:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Varanasi Okha Express- 19570

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Varanasi Jn','22:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Bhadohi','22:37','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Janghai Jn','23:06','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Allahabad Jn','00:40','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Kanpur Central','03:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Tundla Jn','08:53','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Agra Fort','09:40','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Gangapur City','12:48','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Sawai Madhopur','13:40','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Kota Jn','15:05','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Nagda Jn','18:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Ratlam','19:35','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Vadodara','23:30','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Anand Jn','00:28','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Ahmedabad ','01:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Viramgam Jn','03:16','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Surendranagar','04:14','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Rajkot Jn','06:13','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Hapa','07:42','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Jamnagar','08:04','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Khambhaliya','09:04','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Dwarka','10:19','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19570,'Varanasi Okha Express','Okha','11:45','0','-','-','-','-','-','-','Sat')");


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Bhavnagar Trmus','20:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Bhavnagar Para','20:34','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Sihor Gujrat','20:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Songadh','21:04','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Dhola Jn','21:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Botad Jn','22:04','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Ranpur','22:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Limbdi','22:44','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Jorawarnagar','23:04','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Viramgam','00:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Ahmedabad','01:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Nadiad Jn','02:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Anand Jn','03:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Vadodara Jn','04:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Surat','05:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Valsad','07:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Vapi','07:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Borivali','09:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Andheri','09:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12972,'Bhavnagar Trmus Bandra Terminus Express','Bandra Terminus','10:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Rameswaram Okha Express- 16733

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Rameswaram','21:30','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Mandapam','22:00','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Ramanathapuram','22:23','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Paramakkudi','22:53','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Manamadurai','23:20','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Madurai Jn','00:25','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Dindigul Jn','01:45','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Karur','03:15','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Erode','05:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Salem Jn','06:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Jolarpettai','07:58','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Katpadi Jn','09:30','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Tirupati','11:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Cuddapah','13:55','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Yerraguntla','14:29','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Dhone','18:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Kurnool Town','19:08','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Mahbubnagar','21:38','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Kacheguda','23:48','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Nizamabad','03:08','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Mudkhed','04:45','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Nanded','05:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Purna Jn','05:53','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Parbhani Jn','06:28','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Jalna','08:13','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Aurangabad','09:40','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Nagarsol','11:45','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Manmad Jn','12:30','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Jalgaon Jn','15:49','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Surat','22:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Vadodara','00:17','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Ahmedabad','02:15','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Viramgam Jn','03:55','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Surendranagar','04:59','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Wankaner Jn','06:51','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Rajkot Jn','08:00','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Hapa','09:36','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Jamnagar','09:54','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Khambhaliya','10:51','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Dwarka','12:52','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(16733,'Rameswaram Okha Express','Okha','13:45','0','-','-','-','-','-','Fri','-')");

//Ajmer Puri Express- 18422

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Ajmer Jn','16:00','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Beawar','16:56','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Marwar Jn','18:52','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Rani','19:29','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Falna','19:43','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Sirohi Road','20:34','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Abu Road','21:50','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Palanpur Jn','23:13','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Mahesana Jn','00:16','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Sabarmati Jn','01:36','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Ahmedabad','02:10','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Vadodara Jn','04:40','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Surat','06:37','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Nandurbar','10:45','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Amalner','12:55','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Jalgaon Jn','14:08','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Bhusaval Jn','14:40','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Malkapur','15:33','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Akola Jn','16:40','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Badnera Jn','18:15','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Wardha Jn','20:04','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express ','Nagpur','22:00','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Gondia Jn','23:55','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Durg','02:15','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Raipur Jn','03:10','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Mahasamund','04:28','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Khariarroad','05:22','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Kantabanji','06:15','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Titlagarh','07:05','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Balangir','08:30','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Bargarh Road','09:32','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Sambalpur','10:35','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Rairakhol','12:18','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Angul','14:15','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Talcher Road','14:28','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Dhenkanal','15:09','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Mancheswar','16:15','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Bhubneswar','16:25','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Khurda Road','17:10','0','-','-','Tue','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(18422,'Ajmer Puri Express','Puri','18:40','0','-','-','Tue','-','-','Fri','-')");


//Mumbai- Jamnagar Sanand Janata Express- 19017

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Bandra Terminus','17:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Borivali','18:18','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Palghar','19:12','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Dahanu Road','19:41','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Vapi','20:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Valsad','20:41','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Bilimora Jn','21:02','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Navsari','21:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Surat','21:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Kosamba Jn','22:27','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Ankleshwar','22:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Bharuch','22:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Vadodara','00:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Anand Jn','00:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Nadiad Jn','00:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Mahemdavad Kheda Rd','01:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Maninagar','01:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Ahmedabad','02:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Sanand','03:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Viramgam','03:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Lakhtar','04:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Surendranagar','04:46','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Muli Road','05:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Than Jn','05:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Daladi','05:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Wankaner','06:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Rajkot Jn','07:27','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Padadhari','08:04','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Hapa','08:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19017,'Sanand Janata Express','Jamnagar','09:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Ahmedabad Anand Memu- 69116


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(69116,'Ahmedabad Anand Memu','Ahmedabad','02:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(69116,'Ahmedabad Anand Memu','Maninagar','02:47','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(69116,'Ahmedabad Anand Memu','Barejadi','03:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(69116,'Ahmedabad Anand Memu','Mahemdavad','03:16','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(69116,'Ahmedabad Anand Memu','Nadiad Jn','03:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(69116,'Ahmedabad Anand Memu','Kanjari Boriyav','03:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(69116,'Ahmedabad Anand Memu','Anand Jn','04:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Delhi S Rohilla- Porbandar- 19264

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Delhi S Rohilla','08:20','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Delhi Cantt','08:35','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Palam','08:44','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Gurgaon','08:58','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Garhi Harsaru','09:09','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Rewari','10:00','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Khairthal','10:39','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Alwar','11:07','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Jaipur','13:10','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Phulera','14:05','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Kishangarh','14:44','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Ajmer Jn','15:50','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Beawar','16:56','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Sendra','17:11','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Marwar Jn','18:52','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Falna','19:43','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Abu Road','21:50','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Palanpur Jn','23:13','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Mahesana Jn','00:16','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Ahmedabad','02:10','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Viramgam Jn','04:07','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Surendranagar','05:31','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Wankaner Jn','06:50','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Rajkot Jn','08:00','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Hapa','09:35','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Jamnagar','09:53','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Lalpur Jam','10:47','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Bhaunra','11:23','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Wansjaliya','12:00','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19264,'Delhi Porbandar Express','Porbandar','12:55','0','-','Mon','-','-','Thu','-','-')");


//Bhuj Mumbai Kutch Express- 19132

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Bhuj','19:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Anjar','20:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Adipur','20:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Gandhidham Bg','20:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Bhachau Bg','21:46','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Samakhiali Bg','22:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Maliya Miyana','22:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Halvad','23:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Dhrangadhra','00:02','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Viramgam','01:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Ahmedabad','02:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Nadiad Jn','03:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Anand Jn','04:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Vadodara Jn','04:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Bharuch Jn','05:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Ankleshwar','06:02','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Surat','07:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Navasari','07:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Valsad','08:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Vapi','08:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Borivali','10:34','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19132,'Bhuj Mumbai Kutch Express','Bandra Terminus','11:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Bhavnagar Trmus Surat Link Express- 59230


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Bhavnagar Trmus','18:30','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Bhavnagar Para','18:34','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Vartej','18:45','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Kodiyar Mandir','19:00','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Sihor Gujrat','19:08','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Songadh','19:21','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Bajud','19:29','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Sanosra','19:35','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Dhola Jn','19:47','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Ujalvav','19:56','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Alampur','20:05','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Ningala Jn','20:13','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Lathidad','20:21','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Botad Jn','20:40','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Limbdi','23:48','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Wadhwan','00:07','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Jorawarnagar','00:13','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Viramgam Jn','01:55','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Ahmedabad','03:07','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Vadodara Jn','05:10','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59230,'Bhavnagar Surat Express','Surat','07:15','0','-','-','-','Wed','-','-','-')");


//Hapa Tirunelveli Express- 19578

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Hapa','21:20','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Rajkot','22:23','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Surendranagar','00:11','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Ahmedabad','03:07','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Vadodara Jn','05:10','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Ankleshwar','06:18','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Surat','07:15','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Vapi','08:35','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Vasai Road','11:20','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Panvel','13:10','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Ratnagiri','19:40','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Madgaon','23:35','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Karwar','00:40','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Udupi','04:00','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Mangalore','05:55','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Kasaragod','06:48','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Kannur','08:35','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Kozhikode','10:05','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Shoranur','11:40','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Thrissur','12:25','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Aluva','13:15','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Ernakulam','14:00','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Alleppey','15:17','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Kayankulam','16:15','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Kollam','17:15','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Trivandrum','19:00','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Nagarcoil','20:43','0','-','-','-','-','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19578,'Hapa Tirunelveli Express','Tirunelveli','22:20','0','-','-','-','-','-','Fri','Sat')");


//Porbandar- Kochuveli Express- 19262

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Porbandar','18:20','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Wansjaliya','18:53','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Jamnagar','20:58','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Hapa','21:10','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Rajkot Jn','22:23','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Surendranagar','00::11','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Viramgam Jn','01:55','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Ahmedabad','03:07','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Anand Jn','04:25','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Vadodara Jn','05:10','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Ankleshwar','06:18','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Surat','07:15','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Vasai Road','10:55','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Panvel','12:25','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Ratnagiri','18:25','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Madgaon','22:10','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Karwar','23:10','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Udupi','01:10','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Manglore Jn','03:00','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Kasaragod','03:53','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Kannur','05:15','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Kozhikode','06:50','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Tirur','07:33','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Shoranur','08:30','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Thrissur','09:10','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Ernakulam','11:05','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Alleppey','12:00','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Kayankulam','12:58','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Kollam','13:50','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19262,'Porbandar Kochuveli Express','Kochuveli','15:15','0','-','-','-','-','Thu','-','-')");



//Ahmedabad Patan Passenger- 59473


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Ahmedabad','03:30','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Sabarmati Jn','03:43','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Chandlodia','03:55','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Khodiyar','04:07','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Kalol','04:22','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Jhulasan','04:33','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Dangarwa','04:44','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Ambliyasan','04:55','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Jagudan','05:04','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Mahesana Jn','05:25','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Panchot','06:12','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Dhinoj','06:21','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Ranuj','06:47','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Sankhai','06:56','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(59473,'Ahmedabad Patan Passenger','Patan','07:10','0','-','-','Tue','-','-','-','Sat')");


//Jaipur- Yashwantpur Weekly Garibrath Express- 06512

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Jaipur','15:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Kishangarh','16:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Ajmer Jn','17:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Marwar Jn','19:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Falna','20:20','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Abu Road','22:00','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Palanpur Jn','23:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Mahesana Jn','00:55','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Sabarmati Jn','02:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Ahmedabad','03:10','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Nadiad Jn','04:11','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Anand Jn','04:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Vadodara Jn','05:10','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Surat','07:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Valsad','08:36','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Vapi','08:53','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Vasai Road','10:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Kalyan Jn','12:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Lonavala','14:10','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Pune Jn','15:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Kurduvadi','17:52','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Solapur Jn','19:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Bilaspur','23:10','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Bagalkot','01:20','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Gadag Jn','03:35','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Hubli Jn','06:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Haveri','07:48','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Davangere','09:00','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Birur Jn','10:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Arsikere Jn','11:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Tumkur','14:02','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(06512,'Jaipur Yashwantpur Garibrath Express','Yeshwantpur','15:10','0','-','-','Tue','-','-','-','-')");

//Varanasi- Surat Express- 12946

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Mahuva Jn','19:55','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Rajula Jn','20:21','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Savarkundla','21:56','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Lilia Mota','21:18','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Dhasa Jn','21:48','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Dhola Jn','22:12','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Botad Jn','22:50','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Limbdi','23:56','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Wadhwan','00:14','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Jorawarnagar','00:21','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Viramgam Jn','02:11','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Ahmedabad','03:20','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Vadodara Jn','05:15','0','Sun','-','Tue','Wed','-','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12946,'Varanasi Surat Express','Surat','07:15','0','Sun','-','Tue','Wed','-','Fri','Sat')");

//Jodhpur- Mumbai Suryanagari Express- 12479

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Jodhpur Jn','18:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Luni Jn','19:11','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Pali Marwar','19:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Marwar Jn','20:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Rani','21:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Falna','21:41','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Jawai Bandh','22:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Abu Road','23:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Palanpur Jn','00:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Mahesana Jn','01:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Ahmedabad','03:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Anand Jn','04:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Vadodara Jn','05:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Ankleshwar','06:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Surat','07:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Borivali','10:44','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(12479,'Jodhpur Mumbai Suryanagari Express','Bandra Terminus','11:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");

//Valsad Jodhpur Express- 19055

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Valsad','22:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Navsari','23:10','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Surat','23:45','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Bharuch Jn','00:34','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Vadodara Jn','01:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Anand Jn','02:15','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Nadiad Jn','02:32','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Ahmedabad','03:35','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Sabarmati Jn','04:16','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Mahesana Jn','05:53','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Palanpur Jn','07:46','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Abu Road','08:45','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Sirohi Road','09:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Falna','10:54','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Marwar Jn','12:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Pali Marwar','13:02','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Luni Jn','13:37','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)  values(19055,'Valsad Jodhpur Express','Jodhpur Jn','14:30','0','-','-','Tue','-','-','-','-')");


            //Nanded- Bikaner Express- 17623

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Nanded','09:00','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Purna','09:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Basmat','10:04','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Hingoli Deccan','11:00','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Washim','11:59','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Akola Jn','13:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Bhusaval Jn','15:45','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Jalgaon Jn','16:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Amalner','18:06','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Nandurbar','19:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Surat','23:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Bharuch Jn','00:34','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Vadodara Jn','01:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Anand Jn','02:15','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Nadiad Jn','02:32','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Ahmedabad','03:35','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Mahesana Jn','05:55','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Palanpur Jn','07:58','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Abu Road','08:45','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Sirohi Road','09:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Falna','10:54','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Marwar Jn','12:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Pali Marwar','13:02','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Luni','13:37','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Jodhpur Jn','14:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Merta Road','16:10','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Nagaur','16:58','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Nokha','18:03','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(17623,'Nanded Bikaner Express','Bikaner Jn','20:00','0','-','-','Tue','-','-','-','-')");


//Puri- Gandhidham Bg Express- 19454


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Puri','09:05','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Sakhi Gopal','09:25','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Khurda Road','10:05','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Balugaon','11:20','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Chhatrapur','11:58','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Brahmapur','12:20','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Sompeta','12:59','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Palasa','13:43','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Srikakulam Road','14:40','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Vizianagaram Jn','15:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Parvatipuram','17:30','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Rayagada','18:25','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Muniguda','19:40','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Kesinga','20:40','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Titlagarh','21:10','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Kantabanji','21:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Mahasamund','00:03','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Raipur Jn','02:45','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Durg','04:05','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Gondia Jn','05:58','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Nagpur','08:20','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Wardha Jn','09:30','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Badnera Jn','11:20','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Akola Jn','12:19','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Malkapur','13:21','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Bhusaval Jn','14:15','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Jalgaon Jn','15:10','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Amalner','16:28','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Nandurbar','18:15','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Surat','23:27','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Vadodara Jn','01:23','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Anand Jn','02:03','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Nadiad Jn','02:20','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Ahmedabad','03:30','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Viramgam Jn','05:02','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Samakhiali BG','08:08','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Bhachau Bg','08:28','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19454,'Puri Gandhidham Express','Gandhidham Bg','09:30','0','-','-','-','-','-','-','Sat')");


//Puri- Okha Express- 18401

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Puri','09:05','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Sakhi Gopal','09:25','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Khurda Road','10:05','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Balugaon','11:21','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Chhatrapur','11:59','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Brahmpur','12:20','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Palasa','13:43','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Srikakulam Road','14:40','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Vizianagaram','15:50','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Visakhapatnam','17:15','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Anakapalle','18:32','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Samalkota Jn','19:57','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Rajahmundry','20:55','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Eluru','22:12','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Vijayawada','00:01','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Warangal','03:04','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Ramgundam','05:31','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Mancherial','05:41','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Sirpur Kagaznagar','06:34','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Balharshah','08:10','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Chandrapur','08:39','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Wardha Jn','10:42','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Badnera Jn','12:40','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Akola Jn','13:30','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Shegaon','14:04','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Malkapur','14:39','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Bhusaval Jn','15:45','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Jalgaon Jn','16:54','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Amalner','18:06','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Nandurbar','19:45','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Surat','23:40','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Vadodara Jn','01:40','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Ahmedabad','03:35','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Viramgam Jn','05:01','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Surendranagar','06:00','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Rajkot Jn','08:27','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Hapa','09:54','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Jamnagar','10:16','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Khambhaliya','11:35','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Dwarka','12:52','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1840,'Puri Okha Express','Okha','13:55','0','Sun','-','-','-','-','-','-')");


//Vishakapatnam- Gandhidham Bg Express- 18501

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Vishakapatnam','17:35','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Duvvada','18:08','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Samalkota Jn','19:55','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Rajahmundry','20:55','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Eluru','22:11','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Vijayawada','00:01','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Khammam','01:29','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Warangal','03:05','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Ramgundam','05:30','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Sirpur Kagaznagar','06:33','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Balharshah','08:10','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Wardha Jn','10:42','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Badnera Jn','12:40','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Akola Jn','13:30','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Malkapur','14:38','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Bhusaval Jn','15:45','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Jalgaon Jn','16:50','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Nandurbar','19:45','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Surat','23:40','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Ankleshwar','00:24','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Vadodara Jn','01:40','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Anand Jn','02:15','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Ahmedabad','03:35','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Viramgam Jn','05:00','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Dhrangadhra','06:01','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Maliya Miyana','07:09','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Samakhiali Bg','08:08','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Bhachau Bg','08:27','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(1850,'Vishakapatnam Gandhidham Bg Express','Gandhidham Bg','09:50','0','-','-','-','-','Thu','-','-')");


//Gandhidham Bg- Vishakhpatnam Express- 18502

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Gandhidham Bg','22:45','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Bhachau Bg','23:17','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Samakhiali Bg','23:46','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Maliya Miyana','00:22','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Dhrangadhra','01:25','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Viramgam Jn','02:55','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Ahmedabad','04:10','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Anand Jn','05:40','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Vadodara Jn','06:25','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Ankleshwar','07:24','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Surat','08:15','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Nandurbar','11:30','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Jalgaon Jn','14:53','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Bhusaval Jn','15:20','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Malkapur','16:13','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Akola Jn','17:15','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Badnera Jn','19:05','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Wardha Jn','20:28','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Balharshah','23:15','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Sirpur Kagaznagar','00:02','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Ramgundam','01:03','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Warangal','03:00','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Khammam','04:31','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Vijayawada','07:20','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Eluru','08:25','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Rajahmundry','10:23','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Samakota','11:02','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Duvvada','13:58','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(18502,'Gandhidham Bg Vishakapatnam Express','Vishakhapatnam','14:35','0','Sun','-','-','-','-','-','-')");


//Gandhidham Bg- Puri Express- 12993

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Gandhidham Bg','22:45','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Bhachau Bg','23:17','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Samakhiali','23:46','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Dhrangadhra','01:25','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Ahmedabad','04:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Anand Jn','05:40','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Vadodara Jn','06:25','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Surat','08:15','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Nandurbar','11:30','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Jalgaon Jn','14:50','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Bhusaval Jn','15:20','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Nagpur','21:40','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Gondia','23:38','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Durg','01:50','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Raipur Jn','02:40','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Khariarroad','04:43','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Kantabanji','05:30','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Titlagarh','06:15','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Balangir','07:30','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Bargarh Road','08:38','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Sambalpur','09:20','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Angul','12:15','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Talcher Road','12:28','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Dhenkanal','13:09','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Bhubaneshwar','14:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Khurda Road','15:00','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12993,'Gandhidham Bg Puri Express','Puri','16:10','0','-','-','-','-','-','Fri','-')");


// Jodhpur- Valsad Express- 19056

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Jodhpur Jn','16:25','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Luni Jn','16:51','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Pali Marwar','17:30','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Marwar Jn','18:52','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Falna','19:43','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Sirohi Road','20:34','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Abu Road','21:50','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Palanpur Jn','23:13','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Mahesana Jn','00:16','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Sabarmati Jn','02:08','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Ahmedabad','04:10','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Nadiad Jn','05:20','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Anand Jn','05:40','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Vadodara Jn','06:25','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Bharuch Jn','07:18','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Surat','08:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Navsari','08:41','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(19056,'Jodhpur Valsad Express','Valsad','09:25','0','-','-','-','Wed','-','-','-')");


//Madgaon- Hapa  Shrungavarpukta Express- 22907

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Madgaon','10:40','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Thivim','11:30','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Kudal','12:28','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Ratnagiri','15:05','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Khed','16:40','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Panvel','19:50','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Vasai Road','21:15','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Vapi','22:47','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Surat','00:15','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Bharuch','01:04','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Vadodara Jn','02:05','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Anand Jn','02:47','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Nadiad Jn','03:04','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Ahmedabad','04:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Viramgam Jn','05:35','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Surendranagar','06:34','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Rajkot Jn','08:37','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22907,'Madgaon Hapa Shrungavarpukta Express','Hapa','10:20','0','-','-','-','-','-','Fri','-')");


//Bhuj Dadar Express- 12960

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Bhuj','18:30','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Gandhidham Bg','19:25','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Bhachau Bg','20:21','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Samakhiali Bg','20:50','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Santalpur','22:04','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Radhanpur','22:38','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Diyodar','23:12','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Bhildi','23:37','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Disa','23:53','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Palanpur Jn','01:05','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Mahesana Jn','02:36','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Ahmedabad','04:20','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Nadiad Jn','05:20','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Anand Jn','05:40','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Vadodara Jn','06:25','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Surat','08:15','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Vasai Road','11:02','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Borivali','11:21','0','-','Mon','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12960,'Bhuj Dadar Express','Dadar','12:00','0','-','Mon','-','-','Thu','-','-')");


//Bikaner- Dadar Settigunta Express- 12489

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Bikaner Jn','13:40','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Nagaur','15:23','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Jodhpur Jn','18:05','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Luni Jn','18:47','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Samdhari Jn','19:41','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Mokalsar','20:26','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Jalor','20:56','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Modran','21:31','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Marwar Bhinmal','22:02','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Raniwara','22:40','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Dhanera','23:21','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Bhildi','00:10','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Palanpur Jn','01:13','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Ahmedabad','04:20','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Nadiad Jn','05:20','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Anand Jn','05:40','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Vadodara Jn','06:25','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Surat','08:15','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Borivali','11:21','0','-','-','Tue','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12489,'Bikaner Dadar Settigunta Express','Dadar','12:00','0','-','-','Tue','-','-','-','Sat')");


//Okha- Gorakhpur Express- 15046

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Okha','19:15','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Dwarka','19:48','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Khambhaliya','21:06','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Jamnagar','21:59','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Hapa','22:16','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Rajkot Jn','23:50','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Wankaner Jn','00:38','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Surendranagar','01:59','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Viramgam Jn','03:20','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Ahmedabad','04:35','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Anand Jn','06:18','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Vadodara Jn','07:05','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Godhra Jn','08:38','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Ratlam Jn','11:30','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Nagda Jn','12:35','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Ujjain Jn','14:25','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Maksi','15:48','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Shajapur','16:16','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Biyavra Rajgarh','17:43','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Ruthiyai','19:25','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Guna','20:10','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Ashok Nagar','21:13','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Mungaoli','21:58','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Bina Jn','23:55','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Jhansi Jn','03:05','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Gwalior','04:25','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Morena','05:00','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Dhaulpur','05:30','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Agra Cantt','07:00','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Raja Ki Mandi','07:17','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Etawah','09:23','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Kanpur  Central','11:50','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Lucknow Ne','1e:35','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Badshahnagar','14:23','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Barabanki','15:03','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Gonda Jn','16:35','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Basti','18:15','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(15046,'Okha Gorakhpur Express','Gorakhpur Jn','20:00','0','Sun','-','-','-','-','-','-')");




//Ahmedabad- Mahesana Pass Mg- 52910

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Ahmedabad','04:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Sabarmati Jn','05:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Chandkhera','05:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Khodiyar','05:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Saijserthard','05:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Kalol','05:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Pansar','06:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Jhulasan','06:09','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Ghumasan','06:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Dangarwa','06:31','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Kaiyalsedhavi','06:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Ambliyasan','06:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Jagudan','07:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(52910,'Ahmedabad Mahesana Pass Mg','Mahesana Jn','07:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");



//Ajmer- Dadar Express- 12990

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Ajmer Jn','19:20','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Beawar','20:04','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Sojat Road','20:54','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Marwar Jn','21:24','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Rani','22:25','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Falna','22:49','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Jawai Bandh','23:05','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Sirohi Road','23:42','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Abu Road','00:30','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Palanpur Jn','01:51','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Chhapi','02:07','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Unjha','02:38','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Mahesana','03:04','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Ahmedabad','04:35','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Nadiad J ','05:50','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Anand Jn','06:10','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Vadodara Jn','06:55','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Bharuch','07:48','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Surat','08:50','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Navsari','09:16','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Valsad','09:50','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Borivali','11:57','0','Sun','-','-','Wed','-','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(12990,'Ajmer Dadar Express','Dadar','12:40','0','Sun','-','-','Wed','-','Fri','-')");


//Bikaner- Bandra Terminus Settigunta Express- 22473

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Bikaner Jn','14:50','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Nokha','15:40','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Nagaur','16:25','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Merta Road','17:20','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Jodhpur Jn','19:10','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Luni Jn','20:04','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Pali Marwar','20:34','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Marwar Jn','21:24','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Abu Road','00:30','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Palanpur Jn','01:51','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Sidhpur','02:19','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Unjha','02:38','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Mahesana Jn','03:04','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Ahmedabad','04:35','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Nadiad Jn','05:50','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Anand Jn','06:10','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Vadodara Jn','06:55','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Bharuch','07:48','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Surat','08:50','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Navsari','09:16','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Valsad','09:50','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Borivali','11:57','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22473,'Bikaner Bandra Terminus Settigunta Express','Bandra Terminus','12:45','0','-','Mon','-','-','-','-','-')");


//Hapa- Bilaspur Express- 22939

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Hapa','22:25','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Rajkot Jn','23:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Wankaner Jn','00:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Surendranagar','02:01','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Viramgam Jn','03:22','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Ahmedabad','04:35','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Nadiad Jn','05:52','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Anand Jn','06:12','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Vadodara Jn','06:55','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Bharuch','07:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Surat','08:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Nandurbar','11:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Amalner','13:55','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Jalgaon Jn','14:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Bhusaval Jn','15:20','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Akola Jn','17:15','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Badnera Jn','19:05','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Wardha Jn','20:27','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Nagpur','21:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Gondia Jn','23:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Durg','01:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Raipur Jn','02:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat) values(22939,'Hapa Bilaspur Express','Bilaspur Jn','04:50','0','-','-','Tue','-','-','-','-')");



//Hapa Bilaspur SF Special- 09535

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Hapa','22:25','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Rajkot Jn','23:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Wankaner Jn','00:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Surendranagar','01:59','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Viramgam Jn','03:20','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Ahmedabad','04:35','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Nadiad Jn','05:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Anand Jn','06:10','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Vadodara Jn','06:55','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Bharuch','07:48','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Surat','08:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Nandurbar','11:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Amalner','13:55','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Jalgaon Jn','14:53','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Bhusaval Jn','15:20','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Akola Jn','17:15','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Badnera Jn','19:05','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Wardha Jn','20:27','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Nagpur','21:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Gondia Jn','23:38','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Durg','01:50','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Raipur Jn','02:53','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(09535,'Hapa Bilaspur SF Special','Bilaspur Jn','04:50','0','-','-','Tue','-','-','-','-')");


//Bhagat Ki Kothi- Bandra Terminus Express- 19066

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Bhagat Ki Kothi','19:20','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Marwar Jn','21:24','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Abu Road','00:30','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Mahesana Jn','03:06','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Ahmedabad','04:35','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Vadodara','06:55','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Surat','08:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Valsad','09:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Borivali','11:57','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19066,'Bhagat Ki Kothi Bandra Terminus Express','Bandra Terminus','12:45','0','-','-','-','-','-','-','Sat')");


//Ahmedabad- Mumbai Karnavati Express- 12934

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Ahmedabad','04:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Nadiad Jn','05:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Anand Jn','05:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Vadodara Jn','06:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Bharuch','07:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Surat','08:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Valsad','09:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Vapi','09:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Borivali','11:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12934,'Ahmedabad Mumbai Karnavati Express','Mumbai Central','12:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Mumbai- Veraval Saurashtra Mail- 19005

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Mumbai Central','20:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Dadar','20:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Borivali','21:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Palghar','22:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Vapi','23:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Valsad','23:32','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Surat','00:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Bharuch','01:31','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Vadodara Jn','02:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Anand Jn','03:06','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Nadiad Jn','03:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Ahmedabad','04:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Sanand','05:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Viramgam Jn','06:17','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Lakhtar','07:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Surendranagar','07:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Thane Jn','08:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Wankaner Jn','08:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Rajkot Jn','10:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Bhakti Nagar','11:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Padadhari','11:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Gondal','12:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Gomta','12:22','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Jam Wanthali','12:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Virpur','12:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Alia Bada','12:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Navagadh','12:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Hapa','11:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Jetalsar','13:02','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Jamnagar','12:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Junagadh Jn','13:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Kanalas','12:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Badodar','14:34','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Khambhaliya','13:06','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Keshod','14:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Maliya Hatina','14:59','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Chorvad Road','15:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Bhatiya','14:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Veraval','15:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Dwarka','14:46','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Mithapur','15:12','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19005,'Mumbai Veraval Saurashtra Mail','Okha','15:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Asansol- Bhavnagar Parasnath Express- 12942

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Asansol Jn','19:50','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Dhanbad Jn','20:43','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Parasnath','21:38','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Koderma','22:30','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Gaya Jn','23:48','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Dehri On Sone','00:54','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Sasaram','01:10','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Bhabua Road','01:47','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Mughal Sarai','03:07','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Allahabad Jn','05:30','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Kanpur Central','08:00','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Tundla Jn','11:35','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Agra Fort','12:25','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Shri Mahavirji','15:02','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Gangapur City','15:34','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Sawai Madhopur','16:20','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Kota Jn','17:40','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Ramganj Mandi','19:17','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Bhawani Mandi','19:17','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Nagda Jn','21:40','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Ratlam Jn','22:30','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Dahod','00:01','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Vadodara Jn','02:25','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Nadiad Jn','03:37','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Ahmedabad','04:55','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Viramgam Jn','06:31','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Jorawarnagar Jn','08:24','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Botad Jn','09:34','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Dhola Jn','10:24','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Songadh','10:46','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12942,'Asansol Bhavnagar Parasnath Express','Bhavnagar Terminus','11:35','0','-','-','-','-','Thu','-','-')");



// Mumbai- Jaipur Aravali Express- 19707


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Bandra Terminus','21:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Andheri','21:19','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Borivali','21:41','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Dahanu Road','22:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Vapi','23:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Navsari','00:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Surat','00:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Ankleshwar','01:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Bharuch Jn','01:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Vadodara Jn','02:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Anand Jn','03:27','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Nadiad Jn','03:47','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Ahmedabad','05:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Sabarmati Jn','05:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Kalol','06:04','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Mahesana Jn','06:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Unjha','07:16','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Sidhpur','07:46','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Chhapi','08:16','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Palanpur Jn','09:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Abu Road','10:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Swarupganj','10:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Sirohi Road','10:56','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Nana','11:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Mori Bera','11:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Jawai Bandh','11:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Falna','11:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Rani','12:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Jawali','12:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Somesar','12:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Marwar Jn','13:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Sojat Road','14:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Beawar','14:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Ajmer Jn','16:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Kishangarh','17:04','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Naraina','17:34','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Phulera Jn','17:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Asalpur Jobner','18:06','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19707,'Mumbai Jaipur Aravali Express','Jaipur','18:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


// Bhuj- Bandra Terminus Express- 19116

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Bhuj','22:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Anjar','22:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Adipur','23:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Gandhidham Bg','23:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Bhachau Bg','00:11','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Samakhiali BG','00:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Maliya Miyana','01:17','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Halvad','01:56','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Dhrangadhra','02:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Viramgam Jn','03:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Ahmedabad','05:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Maninagar','05:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Nadiad Jn','06:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Anand Jn','06:34','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Vadodara Jn','07:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Vishvamitri','07:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Miyagam Karjan','07:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Palej','08:02','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Bharuch Jn','08:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Ankleshwar Jn','08:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Kosamba Jn','09:16','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Surat','09:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Navsari','10:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Bilimora Jn','10:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Valsad','11:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Vapi','11:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Dahanu Road','12:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Borivali','13:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19116,'Bhuj Bandra Terminus Express','Bandra Terminus','14:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


// Ahmedabad- Vadodara Memu- 69114

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Ahmedabad','05:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Maninagar','05:44','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Vatva','05:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Geratpur','06:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Barejadi','06:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Kanil','06:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Nenpur','06:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Mahemdavad Kheda Rd','06:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Gothaj','06:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Nadiad Jn','06:47','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Utarsanda','06:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Kanjari Boriyav','06:59','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Anand Jn','07:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Vadod','07:18','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Adas Road','07:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Vasad Jn','07:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Nandesari','07:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Ranoli','07:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Bajva','08:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(69114,'Ahmedabad Vadodara Memu','Vadodara Jn','08:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


// Mumbai- Bhavnagar Express- 12971

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Bandra Terminus','21:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Andheri','21:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Borivali','22:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Vapi','00:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Valsad','00:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Surat','01:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Vadodara Jn','03:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Anand Jn','04:02','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Nadiad Jn','04:19','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Ahmedabad','05:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Viramgam Jn','06:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Jorawarnagar','08:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Limbdi','08:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Ranpur','08:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Botad Jn','09:06','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Dhola Jn','09:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Songadh','10:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Sihor Gujrat','10:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Bhavnagar Para','10:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1297,'Mumbai Bhavnagar Express','Bhavnagar Trmus','11:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


// Ahmedabad- Mumbai Central Double Decker Express- 12932


            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Ahmedabad','06:00','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Nadiad Jn','06:40','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Anand Jn','06:57','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Vadodara Jn','07:40','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Bharuch Jn','08:29','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Surat','09:22','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Valsad','10:14','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Vapi','10:32','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Borivali','12:16','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12932,'Ahmedabad Mumbai Central Express ','Mumbai Central','13:00','0','-','Mon','Tue','Wed','Thu','Fri','Sat')");


// Ahmedabad- Kolkata Express- 19413

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Ahmedabad','06:05','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Sabarmati Jn','06:22','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Mahesana Jn','07:40','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Unjha','08:05','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Sidhpur','08:25','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Palanpur Jn','09:23','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Abu Road','10:22','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Sirohi Road','11:35','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Falna','12:18','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Marwar Jn','13:08','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Beawar','14:40','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Ajmer Jn','15:55','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Bhilwara','18:35','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Chittaurgarh','19:55','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Nimach','20:51','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Mandasor','21:46','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Ratlam Jn','23:25','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Nagda Jn','00:31','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Ujjain Jn','01:35','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Bhopal Jn','06:45','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Bina Jn','09:35','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Saugor','10:57','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Damoh','12:18','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Katni Murwara','14:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Singrauli','21:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Chopan','22:43','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Garwa Road','02:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Daltonganj','03:00','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Barka Kana','06:15','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Phusro','08:23','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Dhanbad Jn','10:35','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Asansol','11:58','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Durgapur','12:33','0','-','-','-','Wed','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19413,'Ahmedabad Kolkata Express ','Kolkata','15:15','0','-','-','-','Wed','-','-','-')");


// Ahmedabad- Sultanpur Express - 19403

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Ahmedabad','06:05','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Sabarmati Jn','06:20','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Mahesana Jn','07:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Palanpur Jn','09:23','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Abu Road','10:22','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Falna','12:18','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Marwar Jn','13:08','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Ajmer Jn','15:55','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Jaipur','18:00','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Alwar','20:27','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Rewari','22:00','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Gurgaon','22:41','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Delhi Cantt','22:59','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Delhi','23:45','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Moradabad','03:40','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Bareilly','05:20','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Lucknow Nr','09:30','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Nihalgarh','10:57','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Musafir Khana','11:05','0','-','-','Tue','-','-','-','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(19403,'Ahmedabad Sultanpur Express ','Sultanpur','11:05','0','-','-','Tue','-','-','-','-')");


// Ahmedabad- Jodhpur Passenger- 54804

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Ahmedabad','06:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Sabarmati Jn','06:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Chandlodia','06:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Khodiyar','06:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Kalol','07:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Jhulasan','07:22','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Dangarwa','07:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Ambliyasan','07:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Jagudan','08:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Mahesana Jn','08:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Unjha','09:09¥','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Kamli','09:18','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Sidhpur','09:27','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Dharewada','09:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Chhapi','09:46','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Umardashi','09:56','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Palanpur Jn','10:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Karjoda','10:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Chitrasani','10:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Iqbal Gadh','10:59','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Sarotra Road','11:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Shri Amirgadh','11:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Maval','11:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Abu Road','11:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Morthala','12:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Kivarli','12:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Bhimana','12:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Swarupganj','12:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Banas','13:17','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Sirohi Road','13:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Keshavganj','13:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Nana','14:34','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Kottarakkara','15:09','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Mori Bera','15:17','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Jawai Bandh','15:27','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Biroliya','15:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Falna','15:47','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Khimel','15:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Rani','16:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Bhagwanpura','16:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Jawali','16:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Sonesar','16:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Bhinwaliya','16:41','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Banta Raghunathgarh','16:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Auwa','16:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Marwar Jn','17:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Rajkiawas','17:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Bomadra','17:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Pali Marwar','18;08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Kairla','18:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Rohat','18:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Luni Jn','18:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Hanwant','19:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Salawas','19:18','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Basni','19:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Bhagat Ki Kothi','20:04','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(54804,'Ahmedabadodhpur Passenger','Jodhpur Jn','20:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


// Ahmedabad- Chennai Navjeevan Express - 12655

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Ahmedabad','06:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Nadiad Jn','07:22','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Anand Jn','07:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Vadodara Jn','08:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Ankleshwar Jn','09:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Surat','10:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Udhna Jn','10:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Vyara','11:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Nandurbar','13:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Dondaicha','13:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Amalner','15:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Jalgaon Jn','16:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Bhusaval Jn','17:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Malkapur','18:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Nandura','18:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Shegaon','19:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Akola Jn','19:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Murtajapur','20:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Badnera Jn','21:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Dhamangaon','21:51','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Wardha Jn','22:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Hinganghat','23:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Warora','23:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Chandrapur','00:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Balharshah','01:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Sirpur Kagaznagar','02:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Mancherial','02:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Warangal','04:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Mahbubabad','05:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Khammam','06:04','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Vijayawada Jn','11:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Tenali Jn','09:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Bapatla','09:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Chirala','10:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Ongole','10:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Kavali','11:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Nellore','12:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Gudur Jn','13:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(12655,'Ahmedabad Chennai Navjeevan Express','Chennai Central ','16:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


// Bareilly- Bhuj Ala Hazrat Express - 14311

            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Bareilly','06:05','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Milak','06:40','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Rampur','07:00','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Moradabad','08:05','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Amroha','08:43','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Hapur','09:43','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Pilkhua','09:59','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Ghaziabad','10:48','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Delhi','11:25','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Delhi S Rohilla','11:55','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Delhi Cantt','12:13','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Palam','12:21','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Gurgaon','12:35','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Garhi Harsaru','12:46','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Pataudi Road','13:03','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Rewari','13:45','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Khirthal','14:24','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Alwar','14:47','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Malakhera','15:08','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Rajgarh','15:23','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Bandikui Jn','15:45','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Dausa','16:10','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Gandhinagar','17:00','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Jaipur','17:20','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Phulera','18:10','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Naraina','18:21','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Kishangarh','18:54','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Ajmer Jn','20:05','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Beawar','20:57','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Marwar Jn','22:21','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Falna','23:38','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Abu Road','01:07','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Palanpur Jn','02:40','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Mahesana Jn','04:08','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Ahmedabad','06:15','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Viramgam Jn','07:56','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Dhrangadhra','09:08','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Halvad','09:38','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Maliya Miyana','10:18','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Samakhiali BG','11:12','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Bhachau Bg','11:29','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Gandhidham Bg','12:15','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Adipur','12:48','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Anjar','13:00','0','Sun','-','-','-','Thu','Fri','-')");
            database.execSQL("insert into express (trainid,trainname,stationname,arrival,dateplus,sun,mon,tue,wed,thu,fri,sat)values(1431,'Bareilly Bhuj Ala Hazrat Express','Bhuj','14:00','0','Sun','-','-','-','Thu','Fri','-')");




            Log.d("express", "express Table created!");
        } catch (Exception ex) {
            Log.d("express", "express Error in DBHelper.onCreate() : " + ex.getMessage());
        }
    }
}

