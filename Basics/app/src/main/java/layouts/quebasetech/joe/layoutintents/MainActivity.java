package layouts.quebasetech.joe.layoutintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "HELLO_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Handle send button click
    public void onClick(View view) {
        Intent displayMessageActivity = new Intent(this, DisplayMessageActivity.class);
        EditText messageBox = (EditText) findViewById(R.id.messageBox);
        String message = messageBox.getText().toString();
        displayMessageActivity.putExtra(MESSAGE, message);
        startActivity(displayMessageActivity);
    }
}
