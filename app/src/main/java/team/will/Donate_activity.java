package team.will;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * Created by Tiamat on 07.08.2015.
 */
public class Donate_activity extends MenuActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}
