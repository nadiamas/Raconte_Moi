package com.example.benz.raconte_moi;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReadingManager extends AppCompatActivity {

    public Button btnImage, btnDrawing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_manager);
        btnImage= (Button) findViewById(R.id.btnImage);
        btnDrawing= (Button) findViewById(R.id.btnDessin);

        btnDrawing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = getIntent();
                String idChild = intent2.getStringExtra("idChild");

                Intent intent = new Intent(ReadingManager.this, ChoiceDrawing.class);
                intent.putExtra("idChild",idChild);

                startActivity(intent);

            }
        });
        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = getIntent();
                String idChild = intent2.getStringExtra("idChild");

                Intent intent = new Intent(ReadingManager.this, ChoiceImageStory.class);
                intent.putExtra("idChild",idChild);

                startActivity(intent);

            }
        });
    }


}






