package team.will;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

/**
 * Created by Somoff on 05.08.2015.
 */
public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void OnClickAuthors(MenuItem menu){
        Intent Authors = new Intent(this,Authors_activity.class);
        startActivity(Authors);
    }
    public void OnClickDonate(MenuItem menu){
        Intent Donate = new Intent(this,Donate_activity.class);
        startActivity(Donate);
    }
    public void OnClickExit(MenuItem menu){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder
                .setTitle("Выход")
                .setMessage("Вы точно хотите выйти?")
                .setCancelable(false)
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Спасибо вам", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Да",new  DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Хнык", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                System.exit(0);
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
