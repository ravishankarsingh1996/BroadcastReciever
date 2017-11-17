package splashscreen.ravi.com.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Ravi on 16-11-2017.
 */

public class Reciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast toast = Toast.makeText(context, "Intent Recieved", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        //Toast.makeText(context, "Intent Recieved", Toast.LENGTH_LONG).show();
    }

}
