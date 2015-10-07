package edu.phambdvcu.pacecalc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by phambd on 10/6/15.
 */
public class DistanceActivity extends AppCompatActivity{

    private GuiHelper guiHelper;
    private TextView display;
    private EditText timeEdit;
    private EditText paceEdit;
    private Button button;
    private String time;
    private String pace;
    private double distance;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pace, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case R.id.calcDistance:
                Intent intent = new Intent(this, DistanceActivity.class);
                startActivity(intent);
                return true;
            case R.id.calcTime:
                Intent intent2 = new Intent(this, TimeActivity.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void calculate(View view) {
        display = (TextView)findViewById(R.id.resultPaceBox);
        timeEdit = (EditText)findViewById(R.id.timeBox);
        paceEdit = (EditText)findViewById(R.id.distanceBox);
        button = (Button)findViewById(R.id.button);
        time = timeEdit.getText().toString();
        pace = paceEdit.getText().toString();
        guiHelper = new GuiHelper("distance", time, pace);
        distance = guiHelper.helper();
        display.setText(Double.toString(distance) + " mph");
    }
}
