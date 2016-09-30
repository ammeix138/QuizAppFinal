package com.example.android.quizappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     /*This method allows the user to click the start button and begin the quiz on Main2Activity.
        *
        */

    public Button startQuiz;
    public void startQuiz() {
        startQuiz = (Button)findViewById(R.id.startQuiz_button) ;

        startQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMovieQuiz = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(startMovieQuiz);

                Toast.makeText(getApplicationContext(),"Have fun!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startQuiz();
    }


}
