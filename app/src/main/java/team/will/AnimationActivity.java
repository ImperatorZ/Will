package team.will;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by asass on 07.08.2015.
 */
public class AnimationActivity extends MenuActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_layout);

        ImageView sun = (ImageView) findViewById(R.id.sun);
        Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.sun_rise);

        sun.startAnimation(sunRise);

    }

    public void StartApplication(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}

