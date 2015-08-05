package team.will;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Authorization extends Activity {

    private EditText mNameReg;
    private EditText mPassReg;
    private EditText mTelephoneReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization_layout);

        mNameReg = (EditText) findViewById(R.id.editTextName);
        mPassReg = (EditText) findViewById(R.id.editTextPassword);
        mTelephoneReg = (EditText) findViewById(R.id.editTextTelephone);

    }


    public void goAuth(View view) {
        if (mNameReg.getText().length() == 0) {
            Toast.makeText(Authorization.this, "Введите имя", Toast.LENGTH_SHORT).show();
        } else {
            if (mPassReg.getText().length() == 0) {
                Toast.makeText(Authorization.this, "Введите пароль", Toast.LENGTH_SHORT).show();
            } else {
                if (mTelephoneReg.getText().length() == 12) {
                    Toast.makeText(Authorization.this, "Введите номер телефона", Toast.LENGTH_SHORT).show();
                } else {
                    if (mTelephoneReg.getText().length() < 12) {
                        Toast.makeText(Authorization.this, "Вы не верно указали номер телефона", Toast.LENGTH_SHORT).show();
                    } else {


                        Intent intent = new Intent(this, Converter.class);
                        startActivity(intent);
                        Toast.makeText(Authorization.this, "Вы успешно зарегестрирвоались", Toast.LENGTH_SHORT).show();

                    }

                }


            }
        }


    }
}





