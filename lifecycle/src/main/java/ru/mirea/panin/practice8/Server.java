package ru.mirea.panin.practice8;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class Server implements LifecycleObserver {
    private String TAG = "lifecycle";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void init(){
        Log.d(TAG, "init connection");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void connect(){
        Log.d(TAG, "connect to web-server");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void request(){
        Log.d(TAG, "request data");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void send(){
        Log.d(TAG, "send data");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void disconnect(){
        Log.d(TAG, "disconnect");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void freeRes(){
        Log.d(TAG, "free resources");
    }
}
