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
public class TimeActivity extends AppCompatActivity{

    private GuiHelper guiHelper;
    private TextView display;
    private EditText distanceEdit;
    private EditText paceEdit;
    private Button button;
    private String distance;
    private String pace;
    private double time;

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            distance = distanceEdit.getText().toString();
            pace = paceEdit.getText().toString();
            guiHelper = new GuiHelper("time", distance, pace);
            time = guiHelper.helper();
            display.setText(Double.toString(time) + " hours");
        }
    };

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        display = (TextView)findViewById(R.id.timeBox);
        paceEdit = (EditText)findViewById(R.id.resultPaceBox);
        distanceEdit = (EditText)findViewById(R.id.distanceBox);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(listener);


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
            case R.id.calcPace:
                Intent intent2 = new Intent(this, PaceActivity.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
