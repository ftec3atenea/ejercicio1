package com.example.eje1;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // enlazamos el mundo visual con la lógica
        TextView tv0 = findViewById(R.id.tv0);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);

        // crear la animación
        Animation anim0 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.rotation);
        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.translate);
        Animation anim3 = AnimationUtils.loadAnimation(this, R.anim.scale);
        Animation anim4 = AnimationUtils.loadAnimation(this, R.anim.sett);

        // ejecutar la animación
        //tv0.startAnimation(anim0);
        //tv1.startAnimation(anim1);
        //tv2.startAnimation(anim2);
        //tv3.startAnimation(anim3);
        tv4.startAnimation(anim4);




    }
}