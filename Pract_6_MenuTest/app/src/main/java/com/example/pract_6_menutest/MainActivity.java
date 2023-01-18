package com.example.pract_6_menutest;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.mymenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.newb:
                Toast.makeText(this,"New Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this,"Share Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(this,"Delete Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this,"Save Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(this,"Search Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.exit:
                Toast.makeText(this,"Exit Selected",Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this,"Default",Toast.LENGTH_SHORT).show(); }
        return super.onOptionsItemSelected(item);
    }
}