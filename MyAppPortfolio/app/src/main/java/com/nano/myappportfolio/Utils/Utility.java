package com.nano.myappportfolio.Utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Ravind Maurya on 2/16/2016.
 */
public class Utility {

    public static void showToast(Context context, String msg){

        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }

}
