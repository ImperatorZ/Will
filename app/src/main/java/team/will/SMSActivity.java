package team.will;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class SMSActivity extends Activity {

    private EditText SmsReg;
    private NotificationManager nm;
    private final int NOTIFICATION_ID = 127;
    final Random random = new Random();
    final String str1 = String.valueOf(random.nextInt(8999) + 1000);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_layout);
        SmsReg = (EditText) findViewById(R.id.editTextSms);
        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void showNotification(View view) {

        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        builder
                .setSmallIcon(R.drawable.mill96)
                .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.tttttt))
                .setTicker("Строго секретно")
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentTitle("Ваш уникальный уникальный код")
                .setContentText("Ваш код : " + str1);


        Notification notification = builder.build();
        nm.notify(NOTIFICATION_ID, notification);



    }

    public void NextActivity(View view) {

        if (SmsReg.getText().toString().equals(str1)) {
            Toast.makeText(this, "Код верен", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Код неверен", Toast.LENGTH_SHORT).show();
        }
    }
}



