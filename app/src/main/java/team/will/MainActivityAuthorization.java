package team.will;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by asass on 04.08.2015.
 */
public class MainActivityAuthorization extends MenuActivity {
    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void goToAuthorization(View view){
        Intent authorization = new Intent(this, Authorization.class);
        startActivity(authorization);
    }
}
