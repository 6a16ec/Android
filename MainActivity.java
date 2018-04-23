package com.example.calculator;

import android.app.Activity;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeButtonSize();


    }

    protected void changeButtonSize() {

        int button_count = 20;

        int[] button_ids = new int[button_count];
        button_ids[0] = R.id.button1; button_ids[1] = R.id.button2; button_ids[2] = R.id.button3; button_ids[3] = R.id.button4;
        button_ids[4] = R.id.button5; button_ids[5] = R.id.button6; button_ids[6] = R.id.button7; button_ids[7] = R.id.button8;
        button_ids[8] = R.id.button9; button_ids[9] = R.id.button10; button_ids[10] = R.id.button11; button_ids[11] = R.id.button12;
        button_ids[12] = R.id.button13; button_ids[13] = R.id.button14; button_ids[14] = R.id.button15; button_ids[15] = R.id.button16;
        button_ids[16] = R.id.button17; button_ids[17] = R.id.button18; button_ids[18] = R.id.button19; button_ids[19] = R.id.button20;

        Button[] buttons = new Button[button_count];
        
        final RelativeLayout.LayoutParams[] button_params = new RelativeLayout.LayoutParams[button_count];

        int width = width();

        for(int i = 0; i < button_count; i++){
            buttons[i] = (Button)findViewById(button_ids[i]);
            button_params[i] = (RelativeLayout.LayoutParams) buttons[i].getLayoutParams();
            button_params[i].width = width / 4;
            buttons[i].setLayoutParams(button_params[i]);
        }
        
        
//        Button bt1, bt2, bt3, bt4;
//
//        bt1 = (Button)findViewById(R.id.button1);bt2 = (Button)findViewById(R.id.button2);bt3 = (Button)findViewById(R.id.button3);bt4 = (Button)findViewById(R.id.button4);
//        final RelativeLayout.LayoutParams layoutparams1 = (RelativeLayout.LayoutParams) bt1.getLayoutParams();
//        final RelativeLayout.LayoutParams layoutparams2 = (RelativeLayout.LayoutParams) bt2.getLayoutParams();
//        final RelativeLayout.LayoutParams layoutparams3 = (RelativeLayout.LayoutParams) bt3.getLayoutParams();
//        final RelativeLayout.LayoutParams layoutparams4 = (RelativeLayout.LayoutParams) bt4.getLayoutParams();
//
//        Display display = getWindowManager().getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);
//
//        layoutparams1.width = size.x / 4;
//
//        layoutparams2.width = size.x / 4;
//
//        layoutparams3.width = size.x / 4;
//
//        layoutparams4.width = size.x / 4;
//
//        //layoutparams.height = size.y - 100;
//
//        bt1.setLayoutParams(layoutparams1);
//        bt2.setLayoutParams(layoutparams2);
//        bt3.setLayoutParams(layoutparams3);
//        bt4.setLayoutParams(layoutparams4);

    }

    protected int width(){
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.x;
    }
}
