package com.example.bilaizi.androidn;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by bilaizi on 16-9-6.
 */

public class MsgActivity extends Activity {
    private NotificationManager mNotificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent mIntent = getIntent();
        Bundle mBundle = RemoteInput.getResultsFromIntent(mIntent);
        CharSequence mContent = mBundle.getCharSequence("heima");
        Toast.makeText(this, mContent,Toast.LENGTH_LONG).show();
        System.out.println("content" + mContent);
        mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification mNotification = new Notification.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText("回复完成")
                .build();
        mNotificationManager.notify(1,mNotification);
    }
}
