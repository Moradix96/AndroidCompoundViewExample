package ir.samiantec.compoundviewexample;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmptyStateCV cv = findViewById(R.id.cv);

        cv.setText("Hi");

        cv.setOnClickListener(() -> {
            Toast.makeText(getApplicationContext(), "HIIIIIIIII", Toast.LENGTH_SHORT).show();
        });
    }
}