package com.example.thephong.mooninatim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button nxtbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nxtbutton = findViewById(R.id.button);
        nxtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAngebote();
            }
        });
    }

    public void openAngebote(){
        Intent intent = new Intent(this, Angebote.class);
        startActivity(intent);
    }
}
