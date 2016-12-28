package com.inclumaps.Tools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.view.ContextThemeWrapper;

/**
 * Clase para almacenar todas las variables constantes
 * */
public class ConstantData {

    public Context ctx;

    /**
     * Constructor de la clase
     * */
    public ConstantData(Context ctx){
        this.ctx = ctx;

    }


    /**
     * Verifica el estado de la conexion a internet por WIFI
     * */
    public Boolean conexionWifi(){
        ConnectivityManager connectivity = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info = connectivity.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            if (info != null) {
                if (info.isConnected()) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Verifica el estado de la conexion a internet por DATOS
     * */
    public Boolean conectadoRedMovil(){
        ConnectivityManager connectivity = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info = connectivity.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if (info != null) {
                if (info.isConnected()) {
                    return true;
                }
            }
        }
        return false;
    }

/*
    public void showAlertDialog(Context context, String title, String message, Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(new ContextThemeWrapper(context,R.style.myDialog)).create();

        alertDialog.setTitle(title);

        alertDialog.setMessage(message);

        //alertDialog.setIcon((status) ? R.drawable.success : R.drawable.fail);

        alertDialog.show();
    }
*/

}


