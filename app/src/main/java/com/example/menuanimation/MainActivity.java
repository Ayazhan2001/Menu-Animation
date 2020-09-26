package com.example.menuanimation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView im_animation;
    Animation comboAnimation, blinkAnimation, slideAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im_animation = findViewById(R.id.im_animation);

        comboAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.combo);
        blinkAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        slideAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.combo:
                im_animation.startAnimation(comboAnimation);
                break;
            case R.id.blink:
                im_animation.startAnimation(blinkAnimation);
                break;
            case R.id.slide:
                im_animation.startAnimation(slideAnimation);
                break;

        }
        return true;
    }
}
