package team.will;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by asass on 04.08.2015.
 */
public class MainActivityAuthorization extends MenuActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization_main);
    }
    public void goToAuthorization(View view){
        Intent authorization = new Intent(this, Authorization.class);
        startActivity(authorization);
    }
}
