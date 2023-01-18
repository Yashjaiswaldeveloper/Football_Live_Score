package com.ide.footballmatch.livetv;

import android.app.Application;

import com.onesignal.OneSignal;

public class MyApp extends Application {

    private static final String ONESIGNAL_APP_ID = "cc10d47b-eee2-4e0a-9773-a7d1765a17b1";

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
