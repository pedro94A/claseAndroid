package com.leassy.studiodd.myapplication.Fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.media.MediaPlayer;
import android.widget.TextView;
import android.widget.ImageView;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.widget.Button;
import android.widget.ImageButton;
import com.leassy.studiodd.myapplication.*;
/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetallesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetallesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetallesFragment extends Fragment {
    Bundle bundle;
    String[] arreglo;
    String [] audio;
    String [] imagenC;
    int idRecibido,idRecibido1,i;
    TextView texto;
    ImageView imagen;
    MediaPlayer mp;
    ImageButton reproducir;
    public int total;
    // TODO: Rename parameter arguments, choose names that match
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    static int paginaActual;
    static int id;

    private OnFragmentInteractionListener mListener;


    // TODO: Rename and change types and number of parameters
    public static DetallesFragment newInstance(int position,int idRecibido) {
        DetallesFragment fragment = new DetallesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, position);
        args.putInt(ARG_PARAM2, idRecibido);
        fragment.setArguments(args);
        return fragment;
    }

    public DetallesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            paginaActual = getArguments().getInt(ARG_PARAM1);
            id = getArguments().getInt(ARG_PARAM2);
        }
        bundle =getActivity().getIntent().getExtras();
        idRecibido=bundle.getInt("id");
        idRecibido1=bundle.getInt("frase");
        //imagen.setImageResource(R.drawable.and);


        //bundle = getActivity().getIntent().getExtras();
        //idRecibido=bundle.getInt("id");
        //idRecibido1=bundle.getInt("frase");


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_detalles, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        reproducir=(ImageButton) getView().findViewById(R.id.imageButton);
        reproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        imagen=(ImageView) getView().findViewById(R.id.imageView);
        texto = ( TextView ) getView().findViewById(R.id.idFrase);
        consultar();

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    public void consultar(){
        AdminSQLiteOpenhelper admin= new AdminSQLiteOpenhelper(getActivity().getApplicationContext(), "base",null,1);
        SQLiteDatabase base =admin.getWritableDatabase();
        String query="SELECT textFrase, audio,imagen FROM leasyC where idContenido = "+(idRecibido+paginaActual)+" and idFras ="+(idRecibido1+id);
        Cursor cursor= base.rawQuery(query,null);
        total=cursor.getCount();
        arreglo= new String[cursor.getCount()];
        audio= new String[cursor.getCount()];
        imagenC= new String[cursor.getCount()];
        i=0;
        while (cursor.moveToNext()){
            arreglo[i]=cursor.getString(0);
            audio[i]=cursor.getString(1);
            imagenC[i]=cursor.getString(2);
            texto.setText(arreglo[i]);
            imagen.setImageResource(getResources().getIdentifier(imagenC[i], "drawable", getActivity().getPackageName()));
            mp=MediaPlayer.create(getActivity().getApplicationContext(), getResources().getIdentifier(audio[i], "raw",getActivity().getPackageName()));
            i++;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }


}
