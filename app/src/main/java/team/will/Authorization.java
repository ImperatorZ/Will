package team.will;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by asass on 04.08.2015.
 */
public class Authorization extends Activity {

    private EditText editName;
    private EditText editPass;
    private EditText editTelephone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization_layout);

        editName = (EditText) findViewById(R.id.editTextName);
        editPass = (EditText) findViewById(R.id.editTextPassword);
        editTelephone = (EditText) findViewById(R.id.editTextTelephone);

    }


    public void goAuth(View view) {
        if (editName.getText().length() == 0) {
            Toast.makeText(Authorization.this, "Введите имя", Toast.LENGTH_SHORT).show();
        } else {
            if (editPass.getText().length() == 0) {
                Toast.makeText(Authorization.this, "Введите пароль", Toast.LENGTH_SHORT).show();
            } else {
                if (editTelephone.getText().length() == 0) {
                    Toast.makeText(Authorization.this, "Введите телефоне", Toast.LENGTH_SHORT).show();
                }
            }
        }


        if (editName.getText().toString() == "Imperator") {
        } else {
            if (editPass.getText().toString() == "6310") {
            } else {
                if (editTelephone.getText().toString() == "79615223485"){
                }else{
                    Toast.makeText(Authorization.this, "Введенные данные не верны", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, MainActivityAuthorization.class);
                    startActivity(intent);
                    finish();

                }
            }
        }
    }
}




