package com.vikaskumar.vsk.intents;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class BuckysIntentService extends IntentService{

    private static final String TAG = "com.vikaskumar.vsk.intents";

    //Housekeeping stuff
    public BuckysIntentService() {
        super("BuckysIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //This is what the service does
        Log.i(TAG, "The service has now started");
    }
}
