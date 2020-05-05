package com.example.naaristandforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class Home extends AppCompatActivity {


    private SpaceNavigationView space;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        space = (SpaceNavigationView) findViewById(R.id.space);

        space.showIconOnly();
        space.initWithSaveInstanceState(savedInstanceState);
        space.addSpaceItem(new SpaceItem("Home", R.drawable.ic_home_black_24dp));
        space.addSpaceItem(new SpaceItem("Profile", R.drawable.ic_person_black_24dp));
        space.addSpaceItem(new SpaceItem("Share", R.drawable.ic_home_black_24dp));
        space.addSpaceItem(new SpaceItem("Settings", R.drawable.border));

        space.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(Home.this, "centre button", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), tips.class);
                startActivity(intent);


            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Toast.makeText(Home.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(Home.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();


            }
        });

    }
}
