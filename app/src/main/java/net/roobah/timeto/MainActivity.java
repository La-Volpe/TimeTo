package net.roobah.timeto;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Date;
//import android.view.Menu;
//import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View:
        final ProgressBar prec1 = (ProgressBar) findViewById(R.id.prec1);
        prec1.setProgress(100);
        final Button start1 = (Button)  findViewById(R.id.start1);
        final TextView counter1 = (TextView) findViewById(R.id.counter1);
        //Time goodies:
        final Date destination1 = new Date(1433907000000L);
        final Date theTimeForNow = new Date();



        //Decleration of the first counter:
        final CountDownTimer timer1 = new CountDownTimer(destination1.getTime(),1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int precent = (int) (millisUntilFinished  /(double)destination1.getTime() * 100);
                prec1.setProgress(precent);


                //Text to show:

                // The Actual Time remaining:
                long remainingTime = (long) (millisUntilFinished - theTimeForNow.getTime());
                Date remainingTimeInMillis = new Date(remainingTime);
                String message =
                        "Remaining Time to Konkoor: " + remainingTimeInMillis.getDate() +
                        " days and "+ remainingTimeInMillis.getHours() +" Hours and "+
                        remainingTimeInMillis.getMinutes() + " Minutes and " +
                        remainingTimeInMillis.getSeconds() + " Seconds";
                counter1.setText(message);
            }

            @Override
            public void onFinish() {
                counter1.setText("Finished");
                prec1.setProgress(0);

            }
        };





        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator vibe =
                        (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);
                vibe.vibrate(50);
                timer1.start();
            }
        });


    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
