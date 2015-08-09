package team.will;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Authorization extends MenuActivity {

    private EditText mNameReg;
    private EditText  mPassReg;
    private EditText mTelephoneReg;
    private Toolbar toolbar;


   String admin1="Somoff";
    String admin2="Imperator";
    String admin3="Kraft";
    Integer p = 6310;
    String parol="6310";
    final String parol2 = String.valueOf(parol);
    String numberVlad="+79615223485";
    final String numberVlad2 = String.valueOf(numberVlad);
    String numberMisha="+79615135913";
    final String numberMisha2 = String.valueOf(numberMisha);
    String numberDima="+79183689894";
    final String numberDima2 = String.valueOf(numberDima);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization_layout);

        mNameReg = (EditText) findViewById(R.id.editTextName);
        mPassReg = (EditText) findViewById(R.id.editTextPassword);
        mTelephoneReg = (EditText) findViewById(R.id.editTextTelephone);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    public void goAuth(View view) {

        if ((mNameReg.getText().toString().equals(admin1) || mNameReg.getText().toString().equals(admin2) ||mNameReg.getText().toString().equals(admin3)) && mPassReg.getText().toString().equals(parol2) && (mTelephoneReg.getText().toString().equals(numberDima2) || mTelephoneReg.getText().toString().equals(numberMisha2) || mTelephoneReg.getText().toString().equals(numberVlad2))){

            Intent intent = new Intent(this, SMSActivity.class);
            startActivity(intent);}
        else {


            if (mNameReg.getText().length() == 0) {
                Toast.makeText(Authorization.this, "Введите имя", Toast.LENGTH_SHORT).show();
                return;
            }
            if (mPassReg.getText().length() == 0) {
                Toast.makeText(Authorization.this, "Введите пароль", Toast.LENGTH_SHORT).show();
                return;
            }
            if (mTelephoneReg.getText().length() <= 12) {
                Toast.makeText(Authorization.this, "Неверные данные или номер телефона", Toast.LENGTH_SHORT).show();

            }



                }

            }
        }
















