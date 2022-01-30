package com.codegama.todolist;

import android.app.Application;
import android.content.ComponentCallbacks2;

public class AppController extends Application implements ComponentCallbacks2 {

    private static AppController mInstance;

    public static synchronized AppController getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}

