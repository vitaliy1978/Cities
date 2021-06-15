package com.zelinskiy.cities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int widthScreen, heightScreen;  //для определения ширины и высоты экрана.
    public static float wd, he;    //для определения ширины и высоты экрана.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView text_head = findViewById(R.id.text_head);
        ImageView image_city = findViewById(R.id.image_city);
        Button start_androis = findViewById(R.id.start_android);

        Display display = getWindowManager().getDefaultDisplay();   //определение размеров экрана
        Point size = new Point();                                   //определение размеров экрана
        display.getSize(size);                                      //определение размеров экрана
        widthScreen = size.x;                                       //определение размеров экрана
        heightScreen = size.y;                                      //определение размеров экрана
        wd = (float) widthScreen / 800;
        he = (float) heightScreen / 800;



    }
}