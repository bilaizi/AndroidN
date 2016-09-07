package com.example.bilaizi.androidn;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;


import android.view.View;

/**
 * Created by bilaizi on 16-9-5.
 */

public class MainActivity extends Activity {
    private NotificationManager mNotificationManager;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void click(View v) {
        //[1]获取一个NotificationManger,用来管理Notification
        mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        //[2]创建一个Notification
        Notification mNotification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("黑马学院")
                .setContentText("Android 学科")
                //.setGroup("heima")
                .build();
        //[3]利用获取一个NotificationManager,发送这个Notification
        mNotificationManager.notify(i++, mNotification);
    }

    public void click1(View v) {
        //[1]获取一个NotificationManger,用来管理Notification
        mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        //[2.1.1]需要创建一个Intent对象，用来处理用户回复之后的操作
        Intent mIntent = new Intent(this,MsgActivity.class);
        //[2.1.2]创建一个RemoteInput对象，这个对象是对用户回复的内容进行加密
        RemoteInput mRemoteInput = new RemoteInput.Builder("heima").build();
        //[2.1]创建一个Action,指定一个PendingIntent对象,这个对象可以指定用户点击发送之后，处理那个Intent对象，
        // 用这个业务进行跳转,必须添加一个RemoteInput对象对用户输入的内容进行一个加密
        Notification.Action mAction = new Notification.Action.Builder(R.mipmap.ic_launcher,
                "请输入回复内容", PendingIntent.getActivity(this, 1001, mIntent, 0))
                .addRemoteInput(mRemoteInput)
                .build();
        //[2]创建一个Notification
        Notification mNotification = new Notification.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("黑马学院")
                .setContentText("Android 学科")
                .addAction(mAction)
                .build();
        //[3]利用获取一个NotificationManager,发送这个Notification
        mNotificationManager.notify(1, mNotification);
    }
}
