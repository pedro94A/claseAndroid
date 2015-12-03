package com.leassy.studiodd.myapplication.Activities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.content.Intent;

import com.leassy.studiodd.myapplication.AdminSQLiteOpenhelper;
import com.leassy.studiodd.myapplication.R;


public class CategoriasActivity extends ActionBarActivity {
    String arreglo [];
    ListView texto;
    int i;
    Bundle recibir;
    int categoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        recibir= getIntent().getExtras();
        categoria=recibir.getInt("id");
        consultar();
        texto = (ListView) findViewById(R.id.idRecibido);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arreglo);
        texto.setAdapter(adaptador);

        texto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), ContenidoFrasesActivity.class);
                i.putExtra("id", position);
                i.putExtra("frase",categoria);
                startActivity(i);
            }
        });
        /*p*/
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_categorias, menu);
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
        Cursor cursor;
            AdminSQLiteOpenhelper admin = new AdminSQLiteOpenhelper(this, "base", null, 1);
            SQLiteDatabase base = admin.getWritableDatabase();
            String query = "SELECT textFrase FROM leasy where categoria ="+categoria;
            cursor = base.rawQuery(query, null);
            arreglo = new String[cursor.getCount()];
            i = 0;
            while (cursor.moveToNext()) {
                arreglo[i] = cursor.getString(0);
                i++;
            }

    }

}
