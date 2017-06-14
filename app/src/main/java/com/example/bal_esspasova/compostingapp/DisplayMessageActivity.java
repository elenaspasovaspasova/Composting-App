package com.example.bal_esspasova.compostingapp;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DisplayMessageActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Button level1 = (Button)findViewById(R.id.level1);
        Button level2 = (Button)findViewById(R.id.level2);
        level1.setOnClickListener(changeToFirstFloor);
        level2.setOnClickListener(changeToSecondFloor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.searchView);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setInitialImage();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        //connects searchable config to the searchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));

        return true;
    }


    private void setInitialImage() {
        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
        imageView.setImageResource(R.drawable.floor1);

    }

    private View.OnClickListener changeToFirstFloor = new View.OnClickListener() {
        public void onClick(View v) {
            final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
            imageView.setImageResource(R.drawable.floor1);
        }
    };

    private View.OnClickListener changeToSecondFloor = new View.OnClickListener() {
        public void onClick(View v) {
            final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
            imageView.setImageResource(R.drawable.floor2);
        }
    };

//    private void levelOne() {
//        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
//        imageView.setImageResource(R.drawable.floor1);
//    }
//
//    private void levelTwo() {
//        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
//        imageView.setImageResource(R.drawable.floor2);
//    }



}
