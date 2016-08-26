package com.example.acer.a2actionbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;





public class Slovicka extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slovicka);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.uroven_menu:
                Intent intenturoven = new Intent(this, MainActivity.class);
                startActivity(intenturoven);
                return true;
            case R.id.slovicka_menu:
                Intent intentslovicka = new Intent(this, Slovicka.class);
                startActivity(intentslovicka);
                return true;
            case R.id.procvicuj_menu:
                Intent intentprocvicuj = new Intent(this, Procvicuj.class);
                startActivity(intentprocvicuj);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}