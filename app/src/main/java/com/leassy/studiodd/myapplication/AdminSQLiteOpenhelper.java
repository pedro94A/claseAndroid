package com.leassy.studiodd.myapplication;

import android.content.ContentValues;
import android.content.Context;
import  android.database.sqlite.*;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class AdminSQLiteOpenhelper extends SQLiteOpenHelper {
    SQLiteDatabase  base;
    public AdminSQLiteOpenhelper(Context context, String Nombre, CursorFactory cursorFactory,int version){
        super(context,Nombre, cursorFactory, version);
    }
    public void onCreate(SQLiteDatabase base){
        String query="CREATE TABLE leasy(idFrase integer,textFrase text,rutaAudio text,categoria integer);";
        base.execSQL(query);
        ContentValues insertar= new ContentValues();
        insertar.put("idFrase", 1);
        insertar.put("textFrase", "Pedir refresco");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 2);
        insertar.put("textFrase", "Pedir un postre");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 3);
        insertar.put("textFrase", "Pedir una botella de agua");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 4);
        insertar.put("textFrase", "Pedir desayuno");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 5);
        insertar.put("textFrase", "Pedir una hamburgesa");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 6);
        insertar.put("textFrase", "Pedir un hotdog");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 7);
        insertar.put("textFrase", "Pedir el menu");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 8);
        insertar.put("textFrase", "¿Qué me puede recomendar del Menú?");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 9);
        insertar.put("textFrase", "¿Algun plato especial para hoy?");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 10);
        insertar.put("textFrase", "¿Yo voy a pedir...");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 11);
        insertar.put("textFrase", "Yo quiero el...");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 12);
        insertar.put("textFrase", "¿Me trae el… por favor?");
        insertar.put("categoria", 0);
        base.insert("leasy", null, insertar);
        insertar.clear();
        //Indicaciones
        insertar.put("idFrase",13);
        insertar.put("textFrase", "perdone, ¿dónde está el museo?");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.put("idFrase", 14);
        insertar.put("textFrase", "perdone, ¿cómo puedo llegar a la estación de tren?");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",15);
        insertar.put("textFrase", "perdone, ¿hay algún supermercado cerca?");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",16);
        insertar.put("textFrase", "perdone, ¿dónde puedo encontrar una farmacia?");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",17);
        insertar.put("textFrase", "siga recto");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",18);
        insertar.put("textFrase", "siga recto hasta llegar a la rotonda");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",19);
        insertar.put("textFrase", "siga / vaya por esta calle");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",20);
        insertar.put("textFrase", "suba por esta calle");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",21);
        insertar.put("textFrase", "baje por esta calle");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",22);
        insertar.put("textFrase", "gire a la izquierda / derecha");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase",23);
        insertar.put("textFrase", "cuando llegue al final de la calle, gire a la izquierda / derecha");
        insertar.put("categoria", 1);
        base.insert("leasy", null, insertar);
        insertar.clear();
        //http://curso-gratis-ingles.euroresidentes.com/2014/04/como-pedir-y-dar-direcciones-en-ingles.html
        //Aeropuerto
        insertar.put("idFrase",24);
        insertar.put("textFrase", "Me gustaria comprar un billete a ...");
        insertar.put("categoria", 2);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 25);
        insertar.put("textFrase", "Le gustaria un viaje de ida o de ida y vuelta?");
        insertar.put("categoria", 2);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 26);
        insertar.put("textFrase", "De ida y vuelta.");
        insertar.put("categoria", 2);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 27);
        insertar.put("textFrase", "Me gustaria un billete para ese vuelo por favor.");
        insertar.put("categoria", 2);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 28);
        insertar.put("textFrase", "En primera clase o en turista?");
        insertar.put("categoria", 2);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 29);
        insertar.put("textFrase", "¿Tiene su tarjeta de embarque?");
        insertar.put("categoria", 2);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 30);
        insertar.put("textFrase", "Sólo está permitido un artículo de mano.");
        insertar.put("categoria", 2);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 31);
        insertar.put("textFrase", "¿Dónde está la zona de recogida de equipaje?");
        insertar.put("categoria", 2);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 32);
        insertar.put("textFrase", "Hacer la cama.");
        insertar.put("categoria", 3);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 33);
        insertar.put("textFrase", "Planchar.");
        insertar.put("categoria", 3);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.clear();
        insertar.put("idFrase", 34);
        insertar.put("textFrase", "Lavar el coche.");
        insertar.put("categoria", 3);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 35);
        insertar.put("textFrase", "Sacar la basura.");
        insertar.put("categoria", 3);
        base.insert("leasy", null, insertar);
        insertar.clear();
        //social
        insertar.put("idFrase", 36);
        insertar.put("textFrase", "No le entiendo, hable un poco más despacio, por favor.");
        insertar.put("categoria", 4);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 37);
        insertar.put("textFrase", "¿Puede usted repetirlo por favor?");
        insertar.put("categoria", 4);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 38);
        insertar.put("textFrase", "¿Podría apuntarme la dirección en un papel por favor?");
        insertar.put("categoria", 4);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 39);
        insertar.put("textFrase", "¿Cómo te llamas? Mi nombre es ...");
        insertar.put("categoria", 4);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 40);
        insertar.put("textFrase", "¿Habla usted español?");
        insertar.put("categoria", 4);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 41);
        insertar.put("textFrase", "Buenos días - Buenas tardes - Buenas noches");
        insertar.put("categoria", 4);
        base.insert("leasy", null, insertar);
        insertar.clear();
        //Salud
        insertar.put("idFrase", 42);
        insertar.put("textFrase", "Me gustaría ver a un médico.");
        insertar.put("categoria", 5);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 43);
        insertar.put("textFrase", "¿Es urgente?");
        insertar.put("categoria", 5);
        base.insert("leasy", null, insertar);
        insertar.clear();
        insertar.put("idFrase", 44);
        insertar.put("textFrase", "¿Tienen algún medico que hable español?");
        insertar.put("categoria", 5);
        base.insert("leasy", null, insertar);
        insertar.clear();





        //TABLA CONTENIDO
        String query2="CREATE TABLE leasyC(idFrase integer,textFrase text,idContenido integer,idFras integer,audio text,imagen text);";
        base.execSQL(query2);
        ContentValues insertar2= new ContentValues();
        insertar2.put("idFrase", 1);
        insertar2.put("textFrase", "I’d like a Soda");
        insertar2.put("audio", "i1");
        insertar2.put("imagen", "ii1");
        insertar2.put("idContenido", 0);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 2);
        insertar2.put("textFrase", "do you have any desserts?");
        insertar2.put("audio", "i2");
        insertar2.put("imagen", "ii2");
        insertar2.put("idContenido", 1);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 3);
        insertar2.put("textFrase", "Can I have a bottle of water?");
        insertar2.put("audio", "i3");
        insertar2.put("imagen", "ii3");
        insertar2.put("idContenido", 2);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 4);
        insertar2.put("textFrase", " I´ll have some coffee with milk and sugar");
        insertar2.put("audio", "i4");
        insertar2.put("imagen", "ii4");
        insertar2.put("idContenido", 3);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.clear();
        insertar2.put("idFrase", 5);
        insertar2.put("textFrase", "I want a hamburger");
        insertar2.put("audio", "i5");
        insertar2.put("imagen", "ii5");
        insertar2.put("idContenido", 4);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 6);
        insertar2.put("textFrase", "I want a HOTDOG");
        insertar2.put("audio", "i6");
        insertar2.put("imagen", "ii6");
        insertar2.put("idContenido", 5);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 7);
        insertar2.put("textFrase", "Please may I have the menu?");
        insertar2.put("audio", "i7");
        insertar2.put("imagen", "ii7");
        insertar2.put("idContenido", 6);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 8);
        insertar2.put("textFrase", "What would you recommend from the Menu?");
        insertar2.put("audio", "i8");
        insertar2.put("imagen", "ii8");
        insertar2.put("idContenido", 7);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 9);
        insertar2.put("textFrase", "Do you have any specials today?");
        insertar2.put("audio", "i9");
        insertar2.put("imagen", "ii9");
        insertar2.put("idContenido", 8);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 10);
        insertar2.put("textFrase", "I will have the …");
        insertar2.put("audio", "i10");
        insertar2.put("imagen", "ii10");
        insertar2.put("idContenido", 9);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 11);
        insertar2.put("textFrase", "I’d like the …");
        insertar2.put("audio", "i11");
        insertar2.put("imagen", "ii11");
        insertar2.put("idContenido", 10);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 12);
        insertar2.put("textFrase", "Please can I have the…");
        insertar2.put("audio", "i12");
        insertar2.put("imagen", "ii12");
        insertar2.put("idContenido", 11);
        insertar2.put("idFras", 0);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        //Indicaciones
        insertar2.put("idFrase", 13);
        insertar2.put("textFrase", "Excuse me, where is the museum?");
        insertar2.put("audio", "i13");
        insertar2.put("imagen", "ii13");
        insertar2.put("idContenido", 0);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 14);
        insertar2.put("textFrase", "Excuse me, how can I get to the train station?");
        insertar2.put("audio", "i14");
        insertar2.put("imagen", "ii14");
        insertar2.put("idContenido", 1);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 15);
        insertar2.put("textFrase", "Excuse me, is there a supermarket nearby?");
        insertar2.put("audio", "i15");
        insertar2.put("imagen", "ii15");
        insertar2.put("idContenido", 2);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 16);
        insertar2.put("textFrase", "Excuse me, where can I find a chemist's?");
        insertar2.put("audio", "i16");
        insertar2.put("imagen", "ii16");
        insertar2.put("idContenido", 3);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 17);
        insertar2.put("textFrase", "Go straight on / Go straight ahead");
        insertar2.put("audio", "i17");
        insertar2.put("imagen", "ii17");
        insertar2.put("idContenido", 4);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 18);
        insertar2.put("textFrase", "Go straight on until you get to the roundabout");
        insertar2.put("audio", "i18");
        insertar2.put("imagen", "ii18");
        insertar2.put("idContenido", 5);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 19);
        insertar2.put("textFrase", "Go along this street");
        insertar2.put("audio", "i19");
        insertar2.put("imagen", "ii19");
        insertar2.put("idContenido", 6);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 20);
        insertar2.put("textFrase", "Go up this street");
        insertar2.put("audio", "i20");
        insertar2.put("imagen", "ii20");
        insertar2.put("idContenido", 7);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 21);
        insertar2.put("textFrase", "Go down this street");
        insertar2.put("audio", "i21");
        insertar2.put("imagen", "ii21");
        insertar2.put("idContenido", 8);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 22);
        insertar2.put("textFrase", "Turn left / right");
        insertar2.put("audio", "i22");
        insertar2.put("imagen", "ii22");
        insertar2.put("idContenido", 9);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 23);
        insertar2.put("textFrase", "When you get to the end of the street, turn left / right");
        insertar2.put("audio", "i23");
        insertar2.put("imagen", "ii23");
        insertar2.put("idContenido", 10);
        insertar2.put("idFras", 1);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        //Aeropuerto
        insertar2.put("idFrase", 24);
        insertar2.put("textFrase", "I'd like to buy a ticket to ...");
        insertar2.put("audio", "i24");
        insertar2.put("imagen", "ii24");
        insertar2.put("idContenido", 0);
        insertar2.put("idFras", 2);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 25);
        insertar2.put("textFrase", "Would you like one way or round trip?");
        insertar2.put("audio", "i25");
        insertar2.put("imagen", "ii25");
        insertar2.put("idContenido", 1);
        insertar2.put("idFras", 2);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 26);
        insertar2.put("textFrase", "Round trip?");
        insertar2.put("audio", "i26");
        insertar2.put("imagen", "ii26");
        insertar2.put("idContenido", 2);
        insertar2.put("idFras", 2);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 27);
        insertar2.put("textFrase", "I'd like a ticket for that flight please.");
        insertar2.put("audio", "i27");
        insertar2.put("imagen", "ii27");
        insertar2.put("idContenido", 3);
        insertar2.put("idFras", 2);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 28);
        insertar2.put("textFrase", "First class or coach?");
        insertar2.put("audio", "i28");
        insertar2.put("imagen", "ii28");
        insertar2.put("idContenido", 4);
        insertar2.put("idFras", 2);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 29);
        insertar2.put("textFrase", "Do you have your boarding pass? ");
        insertar2.put("audio", "i29");
        insertar2.put("imagen", "ii29");
        insertar2.put("idContenido", 5);
        insertar2.put("idFras", 2);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 30);
        insertar2.put("textFrase", "Only one carry on item is allowed.");
        insertar2.put("audio", "i30");
        insertar2.put("imagen", "ii30");
        insertar2.put("idContenido", 6);
        insertar2.put("idFras", 2);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 31);
        insertar2.put("textFrase", "Where is the baggage claim?");
        insertar2.put("audio", "i31");
        insertar2.put("imagen", "ii31");
        insertar2.put("idContenido", 7);
        insertar2.put("idFras", 2);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        //Hogar
        insertar2.put("idFrase", 32);
        insertar2.put("textFrase", "To make the bed");
        insertar2.put("audio", "i32");
        insertar2.put("imagen", "ii32");
        insertar2.put("idContenido", 0);
        insertar2.put("idFras", 3);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 33);
        insertar2.put("textFrase", "To iron");
        insertar2.put("audio", "i33");
        insertar2.put("imagen", "ii33");
        insertar2.put("idContenido", 1);
        insertar2.put("idFras", 3);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 34);
        insertar2.put("textFrase", "To wash the car.");
        insertar2.put("audio", "i34");
        insertar2.put("imagen", "ii34");
        insertar2.put("idContenido", 2);
        insertar2.put("idFras", 3);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 35);
        insertar2.put("textFrase", "To take out the crash.");
        insertar2.put("audio", "i35");
        insertar2.put("imagen", "ii35");
        insertar2.put("idContenido", 3);
        insertar2.put("idFras", 3);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        //Social
        insertar2.put("idFrase", 36);
        insertar2.put("textFrase", "I don´t understand, speak a little slower, please.");
        insertar2.put("audio", "i36");
        insertar2.put("imagen", "ii36");
        insertar2.put("idContenido", 0);
        insertar2.put("idFras", 4);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 37);
        insertar2.put("textFrase", "Could you please repeat it again, please?");
        insertar2.put("audio", "i37");
        insertar2.put("imagen", "ii37");
        insertar2.put("idContenido", 1);
        insertar2.put("idFras", 4);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 38);
        insertar2.put("textFrase", "¿Could you please write the adress on paper for me please?");
        insertar2.put("audio", "i38");
        insertar2.put("imagen", "ii38");
        insertar2.put("idContenido", 2);
        insertar2.put("idFras", 4);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 39);
        insertar2.put("textFrase", "What is your name? My name is...");
        insertar2.put("audio", "i39");
        insertar2.put("imagen", "ii39");
        insertar2.put("idContenido", 3);
        insertar2.put("idFras", 4);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 40);
        insertar2.put("textFrase", "Do you speak Spanish?");
        insertar2.put("audio", "i40");
        insertar2.put("imagen", "ii40");
        insertar2.put("idContenido", 4);
        insertar2.put("idFras", 4);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 41);
        insertar2.put("textFrase", "Good morning / Good afternoon / Good evening");
        insertar2.put("audio", "i41");
        insertar2.put("imagen", "ii41");
        insertar2.put("idContenido", 5);
        insertar2.put("idFras", 4);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        //Salud
        insertar2.put("idFrase", 42);
        insertar2.put("textFrase", "I'd like to see a doctor");
        insertar2.put("audio", "i42");
        insertar2.put("imagen", "ii42");
        insertar2.put("idContenido", 0);
        insertar2.put("idFras", 5);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 43);
        insertar2.put("textFrase", "Is it urgent?");
        insertar2.put("audio", "i43");
        insertar2.put("imagen", "ii43");
        insertar2.put("idContenido", 1);
        insertar2.put("idFras", 5);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
        insertar2.put("idFrase", 44);
        insertar2.put("textFrase", "Do you have any doctors who speak spanish?");
        insertar2.put("audio", "i44");
        insertar2.put("imagen", "ii44");
        insertar2.put("idContenido", 2);
        insertar2.put("idFras", 5);
        base.insert("leasyC", null, insertar2);
        insertar2.clear();
    }


    public void onUpgrade(SQLiteDatabase base, int valor, int valor1){
        String query="DROP leasy IF EXIST Frase";
        base.execSQL(query);
        query="CREATE leasy Frase(idFrase integer,textFrase text,rutaAudio text)";
        base.execSQL(query);
    }
}
