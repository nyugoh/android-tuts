package layouts.quebasetech.joe.layoutintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the TextView
        TextView messageBox = (TextView) findViewById(R.id.textView);

        // Get the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE);

        // Set the message in the box
        messageBox.setText(message);
    }
}
