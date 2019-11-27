package ru.mirea.chumakova.thread;

import android.util.Log;

class MyThread extends Thread {
    private static final String TAG = MyThread.class.getSimpleName();
    public void run() {
        Log.d(TAG, "Mой поток запущен...");
    }
}