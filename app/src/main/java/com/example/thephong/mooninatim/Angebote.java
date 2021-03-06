package com.example.thephong.mooninatim;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Angebote extends AppCompatActivity {
    private Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angebote);

        prevButton = findViewById(R.id.prvbtn);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStartBildschirm();
            }
        });
    }

    public void openStartBildschirm(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
