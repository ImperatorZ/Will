package team.will;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by asass on 04.08.2015.
 */
public class Converter extends MenuActivity {
    private EditText mInputEditText;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.converter_layout);
        mInputEditText = (EditText) findViewById(R.id.editTextConvert);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //Конвертируем в доллары
    private float convertDollarToRub(float Dollar){
        return (float)(Dollar / 63);

//Привет Влад, привет Миша душа в трубке
    }

    private float convertRubToDollar(float Rub){
        return (float)(Rub * 63);

    }

    public void onConvert(View view){
        switch (view.getId()){
            case R.id.buttonConvert:
                RadioButton rubRadionButton = (RadioButton)findViewById(R.id.radioButtonDollar);
                if(mInputEditText.getText().length() == 0) {
                    Toast.makeText(Converter.this, "Введите значение в поле", Toast.LENGTH_SHORT).show();
                    return;
                }
                float inputValue = Float.parseFloat(mInputEditText.getText().toString());
                if (rubRadionButton.isChecked()) {
                    mInputEditText.setText(String.valueOf(convertRubToDollar(inputValue)));
                }else{
                    mInputEditText.setText(String.valueOf(convertDollarToRub(inputValue)));

                }
                break;
        }
    }


}
