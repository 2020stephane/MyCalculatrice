package com.sherlock.mycalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView editText2;
    Button bouton0,bouton1,bouton2,bouton3,bouton4,bouton5,bouton6,bouton7,bouton8,bouton9,
            boutonPlus,boutonMoins,boutonMultiplier,boutonDiviser,boutonEgal,
            boutonC,boutonVirgule;

    double resultat;
    int  nbrope1=0;
    String temp1 = "";
    final int[] number = new int[10];
    final char[] typeOp = new char[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = findViewById(R.id.editView2);
        bouton0 = findViewById(R.id.bouton0);
        bouton1 = findViewById(R.id.bouton1);
        bouton2 = findViewById(R.id.bouton2);
        bouton3 = findViewById(R.id.bouton3);
        bouton4 = findViewById(R.id.bouton4);
        bouton5 = findViewById(R.id.bouton5);
        bouton6 = findViewById(R.id.bouton6);
        bouton7 = findViewById(R.id.bouton7);
        bouton8 = findViewById(R.id.bouton8);
        bouton9 = findViewById(R.id.bouton9);
        boutonPlus = findViewById(R.id.boutonPlus);
        boutonMoins = findViewById(R.id.boutonMoins);
        boutonMultiplier = findViewById(R.id.boutonMultiplier);
        boutonDiviser = findViewById(R.id.boutonDiviser);
        boutonEgal = findViewById(R.id.boutonEgal);
        boutonC = findViewById(R.id.boutonC);
        boutonVirgule = findViewById(R.id.boutonVirgule);

        editText2.setText("");

        bouton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('0');
                editText2.setText(editText2.getText() + "0");
            }
        });

        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('1');
                editText2.setText(editText2.getText() + "1");
            }
        });

        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('2');
                editText2.setText(editText2.getText() + "2");
            }
        });

        bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('3');
                editText2.setText(editText2.getText() + "3");
            }
        });

        bouton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('4');
                editText2.setText(editText2.getText() + "4");
            }
        });

        bouton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('5');
                editText2.setText(editText2.getText() + "5");
            }
        });

        bouton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('6');
                editText2.setText(editText2.getText() + "6");
            }
        });

        bouton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('7');
                editText2.setText(editText2.getText() + "7");
            }
        });

        bouton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('8');
                editText2.setText(editText2.getText() + "8");
            }
        });

        bouton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber('9');
                editText2.setText(editText2.getText() + "9");
            }
        });

        boutonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "+");
                saveOperator('+');
            }

        });

        boutonMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "-");
                saveOperator('-');
            }
        });

        boutonMultiplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "*");
                saveOperator('*');
            }
        });

        boutonDiviser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "/");
                saveOperator('/');
            }
        });

        boutonEgal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculRes();
                editText2.setText(editText2.getText() + "=");
                editText2.setText(editText2.getText() + String.valueOf(resultat));
                editText2.setText(editText2.getText() + "\n");
                for (int i = 0; i <= 9; i++) {
                    editText2.setText(editText2.getText() + " number [" + i + "]=" + number[i]);
                    editText2.setText(editText2.getText() + "\n");
                    editText2.setText(editText2.getText() + " typeOp [" + i + "]=" + typeOp[i]);
                    editText2.setText(editText2.getText() + "\n");
                }
                resultat = 0;
                nbrope1 = 0;
            }

        });

        boutonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText("");
                for (int i = 0; i < 10 ; i++) {
                    number[i] = 0;
                }
                resultat = 0;

            }
        });

        boutonVirgule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + ".");
            }
        });

    }
    void saveNumber(char chiffre) {
        temp1 = temp1 + chiffre;
    }
    void saveOperator(char signop) {
        number[nbrope1] = Integer.parseInt(temp1);
        typeOp[nbrope1] = signop;
        temp1 ="";
        nbrope1 = nbrope1 + 1;
    }
    void calculRes(){
        resultat = resultat + number[0];
        number[nbrope1] = Integer.parseInt(temp1);
        temp1 ="";
        for (int i = 0; i <= nbrope1 ; i++) {
            if (typeOp[i] == '+') {
                resultat = resultat + number[i+1];
            }
            if (typeOp[i] == '-') {
                resultat = resultat - number[i+1];
            }
            if (typeOp[i] == '*') {
                resultat = resultat * number[i+1];
            }
            if (typeOp[i] == '/') {
                resultat = resultat / number[i+1];
            }
        }

    }
}