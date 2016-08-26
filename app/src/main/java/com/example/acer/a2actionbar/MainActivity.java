package com.example.acer.a2actionbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    private RadioGroup radioSlovickaGroup;
    private RadioButton radioSlovickaButton;
    private Button btnDisplay;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        radioSlovickaGroup = (RadioGroup) findViewById(R.id.radioSlovicka);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioSlovickaGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioSlovickaButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(MainActivity.this,
                        radioSlovickaButton.getText(), Toast.LENGTH_SHORT).show();

            }

        });

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