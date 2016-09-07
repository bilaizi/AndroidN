package com.example.databinding;

import android.view.View;
import android.widget.Toast;

/**
 * Created by bilaizi on 16-9-7.
 */

public class Handlers{

    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_SHORT).show();
    }

    public void onClickEnemy(View view) {
        Toast.makeText(view.getContext(), "onClickEnemy", Toast.LENGTH_SHORT).show();
    }

    public static String toUpperString(String str) {
        return str.toUpperCase();
    }
}