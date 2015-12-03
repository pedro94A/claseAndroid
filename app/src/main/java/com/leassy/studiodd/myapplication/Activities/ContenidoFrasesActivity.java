package com.leassy.studiodd.myapplication.Activities;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.database.Cursor;

import com.leassy.studiodd.myapplication.AdminSQLiteOpenhelper;
import com.leassy.studiodd.myapplication.Fragments.DetallesFragment;
import com.leassy.studiodd.myapplication.R;


public class ContenidoFrasesActivity extends FragmentActivity implements DetallesFragment.OnFragmentInteractionListener{
    int numeroPaginas;
    Bundle bundle;
    int idRecibido,idRecibido1;
    ViewPager pager;
    PagerAdapter pagerAdapter;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_frases);
        //idRecibido=bundle.getInt("id");
        //idRecibido1=bundle.getInt("(frase");
        //bundle =getIntent().getExtras();
        numeroPaginas=10;
        pager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter =new ownPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // FragmentManager manger = getFragmentManager();
        //FragmentTransaction trans= manger.beginTransaction();
        //DetallesFragment fragmento= new DetallesFragment();
        //trans.replace(R.id.layout_fragment_details,fragmento);
        //trans.commit();
    }




    public class ownPagerAdapter extends FragmentStatePagerAdapter{
        public ownPagerAdapter (FragmentManager manager){
            super(manager);
        }

        public Fragment getItem(int position)
        {
            return  DetallesFragment.newInstance(position,idRecibido);
        }
        public int getCount(){
            return numeroPaginas;
        }
    }

    public void onFragmentInteraction(Uri uri){

    }
    public void consultar(){
        AdminSQLiteOpenhelper admin= new AdminSQLiteOpenhelper(getApplicationContext(), "base",null,1);
        SQLiteDatabase base =admin.getWritableDatabase();
        String query="SELECT textFrase, audio,imagen FROM leasyC where idContenido = "+idRecibido;
        Cursor cursor= base.rawQuery(query,null);
        total=cursor.getCount();
    }


}
