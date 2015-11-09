package joseangelpardo.androidchangethemedynamic;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import joseangelpardo.androidchangethemedynamic.R;
import joseangelpardo.androidchangethemedynamic.Utils;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Utils.loadPreferences(getApplicationContext());
        setTheme(Utils.sTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        switch (v.getId())
        {
            case R.id.button1:
                Utils.sTheme = R.style.SecondTheme;
                Utils.savePreferences(getApplicationContext());
                break;
            case R.id.button2:
                Utils.sTheme = R.style.ThirdTheme;
                Utils.savePreferences(getApplicationContext());
                break;
            case R.id.button3:
                Utils.sTheme = R.style.FourTheme;
                Utils.savePreferences(getApplicationContext());
                break;
        }
        recreate();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
