package com.cms.velsol.cmsemployee.firebase;

import android.util.Log;
import android.widget.Toast;

import com.cms.velsol.cmsemployee.apis.PreferenceManager;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService
{
    PreferenceManager preferenceManager;
    @Override
    public void onTokenRefresh()
    {
        preferenceManager=new PreferenceManager(this);
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("TAG", "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken)
    {
        preferenceManager.saveFirebaseToken(refreshedToken);
        Toast.makeText(this, ""+refreshedToken, Toast.LENGTH_SHORT).show();
    }
}
