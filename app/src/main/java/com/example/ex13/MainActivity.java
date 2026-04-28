package com.example.ex13;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
/**
 * @author noam sloni
 * @version 1.0
 * @since 30.3.2026
 * * the MainActivity class manages the background color of the layout based on
 *  * the selected RadioButton and the state of the Switch
 */
public class MainActivity extends AppCompatActivity {
    /** Where the color appears on the screen: */
    LinearLayout colors;
    /** The radio buttons for selecting colors: */
    RadioButton color1 ;
    RadioButton color2;
    RadioButton color3;
    RadioButton color4;
    Button btn;
    /**The switch that will determine the final response on the screen: */
    Switch switch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors=findViewById(R.id.colors);
        color1=findViewById(R.id.color1);
        color2=findViewById(R.id.color2);
        color3=findViewById(R.id.color3);
        color4=findViewById(R.id.color4);
        switch1=findViewById(R.id.switch1);


    }
    public void go(View view) {
        if(switch1.isChecked()== false){
            if(color1.isChecked() == true){
                colors.setBackgroundColor(Color.BLUE);
            }
            else if(color2.isChecked() == true){
                colors.setBackgroundColor(Color.YELLOW);
            }
            else if(color3.isChecked() == true){
                colors.setBackgroundColor(Color.RED);
            }
            else if(color4.isChecked() == true){
                colors.setBackgroundColor(Color.GREEN);
            }

        }
    }
    public void radioClick(View view) {
        if(switch1.isChecked()==true){
            if(view.getId() == R.id.color1){
                colors.setBackgroundColor(Color.BLUE);}
            else if(view.getId() == R.id.color2){
                colors.setBackgroundColor(Color.YELLOW);
            }
            else if(view.getId() == R.id.color3){
                colors.setBackgroundColor(Color.RED);
            }
            else if(view.getId() == R.id.color4){
                colors.setBackgroundColor(Color.GREEN);
            }
        }
    }
}