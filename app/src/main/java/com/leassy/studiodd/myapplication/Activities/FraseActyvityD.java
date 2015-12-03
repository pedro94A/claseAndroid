package com.leassy.studiodd.myapplication.Activities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ImageView;

import com.leassy.studiodd.myapplication.AdminSQLiteOpenhelper;
import com.leassy.studiodd.myapplication.R;


public class FraseActyvityD extends ActionBarActivity {
    Bundle bundle;
    String[] arreglo;
    int idRecibido,i;
    TextView texto;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase_actyvity_d);

        //consultar();
        //texto= ( TextView )findViewById(R.id.idRecibidoD);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_frase_actyvity_d, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void consultar(){
        AdminSQLiteOpenhelper admin= new AdminSQLiteOpenhelper(this, "base",null,1);
        SQLiteDatabase base =admin.getWritableDatabase();
        String query="SELECT textFrase FROM leasyC where ="+idRecibido;
        Cursor cursor= base.rawQuery(query, null);
        arreglo= new String[cursor.getCount()];
        i=0;
        while (cursor.moveToNext()){
            arreglo[i]=cursor.getString(0);
            texto.setText(bundle.getString(arreglo[i]));
            i++;
        }
    }
}
