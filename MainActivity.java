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

        int width = width(); int height = height();

        for(int i = 0; i < button_count; i++){
            buttons[i] = (Button)findViewById(button_ids[i]);
            button_params[i] = (RelativeLayout.LayoutParams) buttons[i].getLayoutParams();
            button_params[i].width = width / 4;
            button_params[i].height = (int) (height * 0.7 / 5);
            buttons[i].setTextSize((float) (height * 0.7 / 5 * 0.5));
            buttons[i].setLayoutParams(button_params[i]);
        }

    }

    protected int width(){
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.x;
    }
    protected int height(){
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.y;
    }
}
