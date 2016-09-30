package com.example.android.quizappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;
import static com.example.android.quizappfinal.R.id.Q1_Answer_A;
import static com.example.android.quizappfinal.R.id.Q2_Answer_C;
import static com.example.android.quizappfinal.R.id.disableHome;
import static com.example.android.quizappfinal.R.id.radioGroup1;
import static com.example.android.quizappfinal.R.id.radioGroup2;
import static com.example.android.quizappfinal.R.id.radioGroup3;
import static com.example.android.quizappfinal.R.id.radioGroup4;
import static com.example.android.quizappfinal.R.id.radioGroup5;
import static com.example.android.quizappfinal.R.id.submitQuiz;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    /**
     * This method is called when the "Try Again" button is clicked. It will send you to the Intro (Start Quiz) page.
     */
    public void tryAgain(View view) {
        Intent startQuizPage = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(startQuizPage);

        Toast.makeText(getApplicationContext(), "Good Luck!", Toast.LENGTH_SHORT).show();
    }

    /**
     * onClick method for the submit quiz button.
     *
     * @param view
     */
    public void submitQuiz(View view) {
        final Button button = (Button) findViewById(R.id.submitQuiz);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int quizScore = 0;

                //Access the RadioGroup1 view and save it to a variable.
                RadioGroup Q1_radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
                //Retrieve the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId = Q1_radioGroup.getCheckedRadioButtonId();

                if (solutionId == (R.id.Q1_Answer_A)) {
                    quizScore = quizScore + 1;
                } else {
                    quizScore = quizScore + 0;
                }

                //Access the RadioGroup2 view and save it to a variable.
                RadioGroup Q2_radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
                //Retrieve the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId2 = Q2_radioGroup2.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId2 == R.id.Q2_Answer_C) {
                    quizScore = quizScore + 1;
                } else {
                    quizScore = quizScore + 0;
                }

                //Access the RadioGroup3 view and save it to a variable.
                RadioGroup Q3_radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
                //Retrieve the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId3 = Q3_radioGroup3.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId3 == R.id.Q3_Answer_B) {
                    quizScore = quizScore + 1;
                } else {
                    quizScore = quizScore + 0;
                }

                //Access the RadioGroup4 view and save it to a variable.
                RadioGroup Q4_radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
                //Retrieves the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId4 = Q4_radioGroup4.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //The id given is the id of the correct answer.
                if (solutionId4 == R.id.Q4_Answer_A) {
                    quizScore = quizScore + 1;

                } else {
                    quizScore = quizScore + 0;
                }

                //Access the RadioGroup5 view and save it to a variable.
                RadioGroup Q6_radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup5);
                //Retrieves the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId5 = Q6_radioGroup5.getCheckedRadioButtonId();

                //Use if statements to determine the correct answer using id's.
                //The id given is the id of the correct answer.
                if (solutionId5 == R.id.Q6_Answer_C) {
                    quizScore = quizScore + 1;
                } else {
                    quizScore = quizScore + 0;
                }

                //Use if statements to determine which checkboxes have been checked
                //Adds the correct amount of points according to the answer.
                CheckBox check1 = (CheckBox) findViewById(R.id.Q5_checkbox2);
                CheckBox check2 = (CheckBox) findViewById(R.id.Q5_checkbox3);

                if (check1.isChecked()) {
                    quizScore = quizScore + 1;
                } else {
                    quizScore = quizScore + 0;
                }

                if (check2.isChecked()) {
                    quizScore = quizScore + 1;
                } else {
                    quizScore = quizScore + 0;
                }

                //Using if statements to determine if the answer in EditText is correct.
                //Adds the correct amount of points if answer if correct.
                EditText writingAnswer = (EditText) findViewById(R.id.Q7_edit_text);

                if ((writingAnswer.getEditableText().toString().equals("A Bear"))) {
                    quizScore = quizScore + 1;
                } else if ((writingAnswer.getEditableText().toString().equals("a Bear"))) {
                    quizScore = quizScore + 1;
                } else if ((writingAnswer.getEditableText().toString().equals("a bear"))) {
                    quizScore = quizScore + 1;
                } else if ((writingAnswer.getEditableText().toString().equals("A BEAR"))) {
                    quizScore = quizScore + 1;
                } else {
                    quizScore = quizScore + 0;
                }

                //The "if/else" sequences below allow two different Toast messages to display depending on the users final score.
                if (quizScore >= 5) {
                    //Make Toast as a congratulations message if the user receives a score of 4 or higher
                    Toast.makeText(getApplicationContext(), "Great Job! you passed the quiz with a score of " + quizScore + " out of 8. ", Toast.LENGTH_LONG).show();
                } else {
                    //Make Toast as a "you failed" toast message if the user receives a score of 3 or less.
                    Toast.makeText(getApplicationContext(), "You received " + quizScore + " out of 8, which is failing....\n prepare to be force choked through the screen. ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
