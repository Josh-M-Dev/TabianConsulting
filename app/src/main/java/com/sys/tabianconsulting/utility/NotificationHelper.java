package com.sys.tabianconsulting.utility;

import android.content.Context;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import static com.sys.tabianconsulting.SignedInActivity.CHANNEL_ID;



public class NotificationHelper {

    private static final String TAG = "NotificationHelper";
    public static  void  displayNotification(Context context, String title, String body){
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle(title)
                .setContentText(body)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(context);
        managerCompat.notify(1, mBuilder.build());

        Log.d(TAG, "displayNotification: Message " + title + " " + body);
    }
}
