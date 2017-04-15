package com.actosoftcommunity.applytheme;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*//Check if we're running on Android 5.0 or higher
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            // Call some material design APIs here
        }
        else
        {
            // Implement this feature without material desing
        }*/

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setActionBar(toolbar); No se puede aplicar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Welcome!");
        toolbar.setSubtitle("Folks");

        // Compatibility with JAVA
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            toolbar.setElevation(10f);
        }
        else
        {
            // Implement this feature without material desing
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        String nsg = "";
        switch (item.getItemId())
        {
            case R.id.discard:
                nsg = "Delete";
                break;

            case R.id.search:
                nsg = "Search";
                break;

            case R.id.edit:
                nsg = "Edit";
                break;

            case R.id.Exit:
                nsg = "Exit";
                break;

            case R.id.settings:
                nsg = "Settings";
                break;
        }

        Toast.makeText(this, nsg + " clicked !", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
