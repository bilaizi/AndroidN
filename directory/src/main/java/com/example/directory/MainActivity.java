package com.example.directory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.view.View;

/**
 * Created by bilaizi on 16-9-6.
 */

public class MainActivity extends Activity {
    private StorageManager mStorageManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        new Thread(()->System.out.println("Java 8 Support")).start();
    }

    public void click(View v) {
        mStorageManager = (StorageManager) getSystemService(Context.STORAGE_SERVICE);
        StorageVolume mPrimaryStorageVolumem = mStorageManager.getPrimaryStorageVolume();
        Intent mIntent = mPrimaryStorageVolumem.createAccessIntent(Environment.DIRECTORY_DOWNLOADS);
        startActivityForResult(mIntent, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            System.out.println("用户操作了");

        }
    }
}
