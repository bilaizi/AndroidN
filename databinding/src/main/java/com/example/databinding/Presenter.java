package com.example.databinding;

import android.view.View;
import android.widget.Toast;

/**
 * Created by bilaizi on 16-9-7.
 */

public class Presenter {
    public void onClickAA(View view) {
        Toast.makeText(view.getContext(), "onClickAA", Toast.LENGTH_SHORT).show();
    }
}
