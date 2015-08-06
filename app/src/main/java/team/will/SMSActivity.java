package team.will;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

/**
 * Created by Tiamat on 06.08.2015.
 */
public class SMSActivity extends Activity {

    private EditText SmsReg;

    public Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_layout);
        SmsReg = (EditText) findViewById(R.id.editTextSms);

    }

    public void showNotification(View view) {


    }
}
