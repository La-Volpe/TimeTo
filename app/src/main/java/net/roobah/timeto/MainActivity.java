package net.roobah.timeto;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
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

        final TextView counter1 = (TextView) findViewById(R.id.counter1);
        counter1.setText("زمان تا شروع");
        //Time goodies:
        final Date destination1 = new Date(1434079800000L);
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
                        "زمان تا کنکور: " + remainingTimeInMillis.getDate() +
                        " روز و "+ remainingTimeInMillis.getHours() +" ساعت و "+
                        remainingTimeInMillis.getMinutes() + " دقیقه و  " +
                        remainingTimeInMillis.getSeconds() + " ثانیه";
                counter1.setText(message);
            }

            @Override
            public void onFinish() {
                counter1.setText("پایان یافت");
                prec1.setProgress(0);

            }
        };


        //Second Counter:

        final ProgressBar prec2 = (ProgressBar) findViewById(R.id.prec2);
        prec2.setProgress(100);

        final TextView counter2 = (TextView) findViewById(R.id.counter2);
        counter2.setText("زمان تا شروع");
        //Time goodies:
        final Date destination2 = new Date(1434079800000L);




        //Decleration of the first counter:
        final CountDownTimer timer2 = new CountDownTimer(destination2.getTime(),1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int precent = (int) (millisUntilFinished  /(double)destination2.getTime() * 100);
                prec2.setProgress(precent);


                //Text to show:

                // The Actual Time remaining:
                long remainingTime = (long) (millisUntilFinished - theTimeForNow.getTime());
                Date remainingTimeInMillis = new Date(remainingTime);
                String message =
                        "زمان تا کنکور: " + remainingTimeInMillis.getDate() +
                                " روز و "+ remainingTimeInMillis.getHours() +" ساعت و "+
                                remainingTimeInMillis.getMinutes() + " دقیقه و  " +
                                remainingTimeInMillis.getSeconds() + " ثانیه";
                counter2.setText(message);
            }

            @Override
            public void onFinish() {
                counter2.setText("پایان یافت");
                prec2.setProgress(0);

            }
        };

        //Third Counter:

        final ProgressBar prec3 = (ProgressBar) findViewById(R.id.prec3);
        prec3.setProgress(100);

        final TextView counter3 = (TextView) findViewById(R.id.counter3);
        counter3.setText("زمان تا شروع");
        //Time goodies:
        final Date destination3 = new Date(1434079800000L);




        //Decleration of the first counter:
        final CountDownTimer timer3 = new CountDownTimer(destination3.getTime(),1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int precent = (int) (millisUntilFinished  /(double)destination3.getTime() * 100);
                prec3.setProgress(precent);


                //Text to show:

                // The Actual Time remaining:
                long remainingTime = (long) (millisUntilFinished - theTimeForNow.getTime());
                Date remainingTimeInMillis = new Date(remainingTime);
                String message =
                        "زمان تا کنکور: " + remainingTimeInMillis.getDate() +
                                " روز و "+ remainingTimeInMillis.getHours() +" ساعت و "+
                                remainingTimeInMillis.getMinutes() + " دقیقه و  " +
                                remainingTimeInMillis.getSeconds() + " ثانیه";
                counter3.setText(message);
            }

            @Override
            public void onFinish() {
                counter3.setText("پایان یافت");
                prec3.setProgress(0);

            }
        };

        //Forth Timer:

        final ProgressBar prec4 = (ProgressBar) findViewById(R.id.prec4);
        prec4.setProgress(100);

        final TextView counter4 = (TextView) findViewById(R.id.counter4);
        counter1.setText("زمان تا شروع");
        //Time goodies:
        final Date destination4 = new Date(1434079800000L);




        //Decleration of the first counter:
        final CountDownTimer timer4 = new CountDownTimer(destination4.getTime(),1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int precent = (int) (millisUntilFinished  /(double)destination4.getTime() * 100);
                prec4.setProgress(precent);


                //Text to show:

                // The Actual Time remaining:
                long remainingTime = (long) (millisUntilFinished - theTimeForNow.getTime());
                Date remainingTimeInMillis = new Date(remainingTime);
                String message =
                        "زمان تا کنکور: " + remainingTimeInMillis.getDate() +
                                " روز و "+ remainingTimeInMillis.getHours() +" ساعت و "+
                                remainingTimeInMillis.getMinutes() + " دقیقه و  " +
                                remainingTimeInMillis.getSeconds() + " ثانیه";
                counter4.setText(message);
            }

            @Override
            public void onFinish() {
                counter4.setText("پایان یافت");
                prec4.setProgress(0);

            }
        };



        timer1.start();
        timer2.start();
        timer3.start();
        timer4.start();



    }


}
