package com.example.tictactoe2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private Boolean start_stop = true;
    private Integer counter = 0;
    private Integer k1 = 2, k2 = 2, k3 = 3, k4 = 4, k5 = 5, k6 = 6, k7 = 7, k8 = 2, k9 = 2;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        text = findViewById(R.id.textView);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (start_stop){
                    if ((k1 == 0 && k2 == 0 && k3 == 0) || (k4 == 0 && k5 == 0 && k6 == 0) || (k7 == 0 && k8 == 0 && k9 == 0) || (k1 == 0 && k4 == 0 && k7 == 0) || (k2 == 0 && k5 == 0 && k8 == 0) || (k3 == 0 && k6 == 0 && k9 == 0) || (k1 == 0 && k5 == 0 && k9 == 0) || (k3 == 0 && k5 == 0 && k7 == 0)){
                        text.setText("Нолики победили!!!");
                        start_stop = false;
                    }
                    if ((k1 == 1 && k2 == 1 && k3 == 1) || (k4 == 1 && k5 == 1 && k6 == 1) || (k7 == 1 && k8 == 1 && k9 == 1) || (k1 == 1 && k4 == 0 && k7 == 1) || (k2 == 1 && k5 == 1 && k8 == 1) || (k3 == 1 && k6 == 1 && k9 == 1) || (k1 == 1 && k5 == 1 && k9 == 1) || (k3 == 1 && k5 == 1 && k7 == 1)){
                        text.setText("Крестики победили!!!");
                        start_stop = false;
                    }
                }
            }
        }).start();

    }

    //Что бы поочереди ставить крестики и нолики нужно ввести сщетчик и использовать if
    public void ob1(View view) {
        if (counter == 0){
            b1.setText("x");
            counter ++;
            k1 = 1;
        }
        else if (counter == 1){
            b1.setText("o");
            counter --;
            k1 = 0;
        }
    }

    public void ob2(View view) {
        if (counter == 0){
            b2.setText("x");
            counter ++;
            k2 = 1;
        }
        else if (counter == 1){
            b2.setText("o");
            counter --;
            k2 = 0;
        }
    }

    public void ob3(View view) {
        if (counter == 0){
            b3.setText("x");
            counter ++;
            k3 = 1;
        }
        else if (counter == 1){
            b3.setText("o");
            counter --;
            k3 = 0;
        }
    }

    public void ob4(View view) {
        if (counter == 0){
            b4.setText("x");
            counter ++;
            k4 = 1;
        }
        else if (counter == 1){
            b4.setText("o");
            counter --;
            k4 = 0;
        }
    }

    public void ob5(View view) {
        if (counter == 0){
            b5.setText("x");
            counter ++;
            k5 = 1;
        }
        else if (counter == 1){
            b5.setText("o");
            counter --;
            k5 = 0;
        }
    }

    public void ob6(View view) {
        if (counter == 0){
            b6.setText("x");
            counter ++;
            k6 = 1;
        }
        else if (counter == 1){
            b6.setText("o");
            counter --;
            k6 = 0;
        }
    }

    public void ob7(View view) {
        if (counter == 0){
            b7.setText("x");
            counter ++;
            k7 = 1;
        }
        else if (counter == 1){
            b7.setText("o");
            counter --;
            k7 = 0;
        }
    }

    public void ob8(View view) {
        if (counter == 0){
            b8.setText("x");
            counter ++;
            k8 = 1;
        }
        else if (counter == 1){
            b8.setText("o");
            counter --;
            k8 = 0;
        }
    }

    public void ob9(View view) {
        if (counter == 0){
            b9.setText("x");
            counter ++;
            k9 = 1;
        }
        else if (counter == 1){
            b9.setText("o");
            counter --;
            k9 = 0;
        }
    }

    public void repeat(View view) {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        k1 = 2;
        k2 = 2;
        k3 = 2;
        k4 = 2;
        k5 = 2;
        k6 = 2;
        k7 = 2;
        k8 = 2;
        k9 = 2;
        start_stop = true;
        text.setText("");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        start_stop = false;
    }
}