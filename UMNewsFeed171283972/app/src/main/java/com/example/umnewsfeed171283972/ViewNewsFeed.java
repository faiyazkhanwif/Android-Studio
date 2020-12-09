package com.example.umnewsfeed171283972;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//171283972
public class ViewNewsFeed extends AppCompatActivity {
    ListView mylist1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_news_feed);

        ListView listView = new ListView(this);
        String[] news = {"UM Scientists Discover First Ancient Elephant Fossil In Malaysia",
                "UM Lauds Life On Venus Discovery, Leads Malaysia In Astronomy Through MoU With EAO",
                "UM And Yale University To Establish A Research & Training Centre On HIV Implementation Science"
                , "UM Researchers Develop CoSMoS: Monitoring System For Hospital Covid19 Management",
                " UM Releases Joint Report With Clarivate To Evaluate Its Research And Innovation Footprint"};
        ArrayAdapter<String> newsAdapter = new ArrayAdapter<String>
                (ViewNewsFeed.this,R.layout.activity_view_news_feed,R.id.mylist,news);
        listView.setAdapter(newsAdapter);
    }
}