package splashscreen.ravi.com.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mBroadcast;
    LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBroadcast = findViewById(R.id.broadcastIntent);
        layoutInflater = getLayoutInflater();


        mBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              /*  Intent i=new Intent("ravi.broadcastreciever.intent.CUSTOM_INTENT");
                i.setClass(MainActivity.this, Reciever.class);
                sendBroadcast(i);*/

                Intent intent = new Intent(MainActivity.this, Reciever.class);
                intent.setAction("ravi.broadcastreciever.intent.CUSTOM_INTENT");
                sendBroadcast(intent);
            }
        });
    }
}
