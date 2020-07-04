package com.example.recipe;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class    connection {

    public static boolean checkInternetConnection(Context context) {


        ConnectivityManager con_manager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return (con_manager.getActiveNetworkInfo() != null
                && con_manager.getActiveNetworkInfo().isAvailable()
                && con_manager.getActiveNetworkInfo().isConnected());
    }
}