package com.example.backgroundplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.os.IBinder;

public class MyService extends Service {
   MediaPlayer mp;


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return null;

    }
    public int onStartCommand(Intent intent, int flags, int startId){
        mp= MediaPlayer.create(this, R.raw.gods_plan);
        mp.setLooping(true);
        mp.start();
        return  START_STICKY;
    }
    public void onDestroy(){
        super.onDestroy();
        mp.stop();

    }
}
