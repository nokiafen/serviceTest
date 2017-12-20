package com.example.chenhailin.myapplication;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by chenhailin on 2017/12/20.
 */

public class ServiceT extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent , int flags, int startId) {
        Log.i(TAG, "-->>onStartCommand-->>"+startId);
                  flags = START_STICKY;

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(false)//通知设置不会自动显示
                .setShowWhen(true)//显示时间
                .setSmallIcon(R.mipmap.ic_launcher)//设置通知的小图标
                .setContentTitle("通知的标题")
                .setContentText("下载完成,点击安装");//设置通知的内容

        //创建PendingIntent，用于点击通知栏后实现的意图操作
//        PendingIntent pendingIntent = getActivity(context, 0, installIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        builder.setContentIntent(pendingIntent);

        Notification notification = builder.build();
        notification.defaults = Notification.DEFAULT_SOUND;// 设置为默认的声音
        notification.flags = Notification.FLAG_ONLY_ALERT_ONCE | Notification.FLAG_NO_CLEAR;
//        manager.notify(0, notification);// 显示通知
                     startForeground(1, notification);

//                     AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
//                    //读者可以修改此处的Minutes从而改变提醒间隔时间
//                   //此处是设置每隔55分钟启动一次
//                    //这是55分钟的毫秒数
//                     int Minutes = 55 * 60 * 1000;
//                    //SystemClock.elapsedRealtime()表示1970年1月1日0点至今所经历的时间
//                    long triggerAtTime = SystemClock.elapsedRealtime() + Minutes;
//                   //此处设置开启AlarmReceiver这个Service
//                    Intent i = new Intent(this, Alarmreceiver.class);
//                    PendingIntent pi = PendingIntent.getBroadcast(this, 0, i, 0);
//                   //ELAPSED_REALTIME_WAKEUP表示让定时任务的出发时间从系统开机算起，并且会唤醒CPU。
//                    manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, pi);
                         return super.onStartCommand(intent, flags, startId);

    }




}
