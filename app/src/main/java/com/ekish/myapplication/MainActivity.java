package com.ekish.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView numbQuestionTextView,questionsTextView,resultTextView;
    Button button;
    CheckBox check1, check2, check3, check4;
    String[][] arrayQuestions = new String[10][5];
    int[]arrayTrueAnswer={1,3,4,1,1,1,1,3,2,1};
    int number = 0;
    boolean end = false;
    Integer[] digits= {0,1,2,3,4,5,6,7,8,9};
    ArrayList<Integer> al = new ArrayList<>(Arrays.asList(digits));
    Integer[]a2 ={};
    int trueanswer = 0;

    int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Collections.shuffle(al);
        a2=al.toArray(new Integer[al.size()]);
        numbQuestionTextView = (TextView) findViewById(R.id.text1);
        questionsTextView = (TextView) findViewById(R.id.question);
        resultTextView = (TextView) findViewById(R.id.end);
        final Button button = (Button) findViewById(R.id.button);

        numbQuestionTextView.setText("Питання: "+(c+1)+"/"+(arrayQuestions.length));
        numbQuestionTextView.setTextSize(25);
        numbQuestionTextView.setTextColor(Color.BLACK);

        questionsTextView.setText(arrayQuestions[a2[c]][0]); // п итання

        questionsTextView.setTextSize(35);

        arrayQuestions[0][0] ="Коли випустили першу версію Android?";
        arrayQuestions[0][1] = "2008р.";
        arrayQuestions[0][2] = "2005р.";
        arrayQuestions[0][3] = "2010р.";
        arrayQuestions[0][4] = "2003р.";
        arrayQuestions[1][0] = "Коли створили SQL?";
        arrayQuestions[1][1] = "На початку 90-х";
        arrayQuestions[1][2] = "На початку 80-х";
        arrayQuestions[1][3] = "На початку 70-х";
        arrayQuestions[1][4] = "1984р.";
        arrayQuestions[2][0] ="Що таке SQL?";
        arrayQuestions[2][1] = "Шпигунська программа";
        arrayQuestions[2][2] = "Антивірусна программа";
        arrayQuestions[2][3] = "Графічний редактор";
        arrayQuestions[2][4] = "Мова для роботи з базами даних";
        arrayQuestions[3][0] ="Скільки логічних значень розрізняє SQL?";
        arrayQuestions[3][1] = "3";
        arrayQuestions[3][2] = "4";
        arrayQuestions[3][3] = "2";
        arrayQuestions[3][4] = "1";
        arrayQuestions[4][0] ="Основні категорії команд мови SQL?";
        arrayQuestions[4][1] = "DDL;DML;DQL;DCL";
        arrayQuestions[4][2] = "CDL;CML;CQL;CCL";
        arrayQuestions[4][3] = "MDL;MML;MQL;MCL";
        arrayQuestions[4][4] = "DDF;DMF;DQF;DCF";
        arrayQuestions[5][0] ="До якої категорії належить команда SELECT?";
        arrayQuestions[5][1] = "DQL – мову запитів";
        arrayQuestions[5][2] = "DML – мову маніпулювання даними";
        arrayQuestions[5][3] = "DCL – мову управління даними";
        arrayQuestions[5][4] = "DDL – мову визначення даних";
        arrayQuestions[6][0] ="Коли заснований Ужгород?";
        arrayQuestions[6][1] = "SEQUEL";
        arrayQuestions[6][2] = "SIQVEL";
        arrayQuestions[6][3] = "SEQSL";
        arrayQuestions[6][4] = "SIQXL";
        arrayQuestions[7][0] ="Яка остання версія Андроїда?";
        arrayQuestions[7][1] = "9";
        arrayQuestions[7][2] = "8";
        arrayQuestions[7][3] = "7";
        arrayQuestions[7][4] = "6";
        arrayQuestions[8][0] ="Останній офіційний реліз мови SQL?";
        arrayQuestions[8][1] = "SQL:2008";
        arrayQuestions[8][2] = "SQL:2003";
        arrayQuestions[8][3] = "SQL:2015";
        arrayQuestions[8][4] = "SQL:Last";
        arrayQuestions[9][0] ="Яку платформу(и) підтримує SQL";
        arrayQuestions[9][1] = "крос-платформова";
        arrayQuestions[9][2] = "PC";
        arrayQuestions[9][3] = "Xbox";
        arrayQuestions[9][4] = "Android";
        check1 = (CheckBox) findViewById(R.id.checkBox);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        check4 = (CheckBox) findViewById(R.id.checkBox4);
        check1.setText(arrayQuestions[a2[c]][1]);
        check2.setText(arrayQuestions[a2[c]][2]);
        check3.setText(arrayQuestions[a2[c]][3]);
        check4.setText(arrayQuestions[a2[c]][4]);
        check1.setTextSize(25);
        check2.setTextSize(25);
        check3.setTextSize(25);
        check4.setTextSize(25);

        questionsTextView.setText(arrayQuestions[a2[c]][0]); // п итання
        button.setEnabled(false);
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setEnabled(true);
                check1.setChecked(true);
                if(check2.isChecked())
                    check2.setChecked(false);
                if(check3.isChecked())
                    check3.setChecked(false);
                if(check4.isChecked())
                    check4.setChecked(false);
            }
        });
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setEnabled(true);
                check2.setChecked(true);
                if(check1.isChecked())
                    check1.setChecked(false);
                if(check3.isChecked())
                    check3.setChecked(false);
                if(check4.isChecked())
                    check4.setChecked(false);
            }
        });

        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setEnabled(true);
                check3.setChecked(true);
                if(check2.isChecked())
                    check2.setChecked(false);
                if(check1.isChecked())
                    check1.setChecked(false);
                if(check4.isChecked())
                    check4.setChecked(false);
            }
        });

        check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setEnabled(true);
                check4.setChecked(true);
                if(check2.isChecked())
                    check2.setChecked(false);
                if(check3.isChecked())
                    check3.setChecked(false);
                if(check1.isChecked())
                    check1.setChecked(false);
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check1.isChecked() && arrayTrueAnswer[a2[c]]==1)
                    trueanswer++;
                if (check2.isChecked() && arrayTrueAnswer[a2[c]]==2)
                    trueanswer++;
                if (check3.isChecked() && arrayTrueAnswer[a2[c]]==3)
                    trueanswer++;
                if (check4.isChecked() && arrayTrueAnswer[a2[c]]==4)
                    trueanswer++;
                if (c<arrayQuestions.length) {
                    c++;
                    if (c>=9)
                        c=9;
                }
                number++;
                if(c>8)
                {
                    button.setText("Завершити тест");
                    button.setBackgroundColor(Color.GREEN);
                }
                if (end)
                    finish();
                if(number>9) {

                    questionsTextView.setVisibility(View.INVISIBLE);
                    check1.setVisibility(View.INVISIBLE);
                    check2.setVisibility(View.INVISIBLE);
                    check3.setVisibility(View.INVISIBLE);
                    check4.setVisibility(View.INVISIBLE);
                    button.setText("Закрити додаток");
                    button.setBackgroundColor(Color.RED);
                    button.setEnabled(true);
                    end = true;
                    resultTextView.setVisibility(View.VISIBLE);
                    numbQuestionTextView.setText("Результат тесту");
                    resultTextView.setText("Ви правильно відповіли на "+trueanswer+" питань з 10-ти.");

                }


                if(c<10 && number <10)
                {
                    numbQuestionTextView.setText("Питання: "+(c+1)+"/"+(arrayQuestions.length));
                    button.setEnabled(false);}
                questionsTextView.setText(arrayQuestions[a2[c]][0]);
                check1.setText(arrayQuestions[a2[c]][1]);
                check2.setText(arrayQuestions[a2[c]][2]);
                check3.setText(arrayQuestions[a2[c]][3]);
                check4.setText(arrayQuestions[a2[c]][4]);
                check1.setChecked(false);
                check2.setChecked(false);
                check3.setChecked(false);
                check4.setChecked(false);
            }
        });
    }
}


