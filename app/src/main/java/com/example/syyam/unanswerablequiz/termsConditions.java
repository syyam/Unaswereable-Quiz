package com.example.syyam.unanswerablequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class termsConditions extends AppCompatActivity {

    private Button agree;
    private Button disagree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_conditions);
        agree = (Button) findViewById(R.id.agree);
        disagree = (Button) findViewById(R.id.disagree);

        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent ag=new Intent(termsConditions.this,game.class);
                startActivity(ag);
            }
        });
        disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent di =new Intent(termsConditions.this,MainActivity.class);
            }
        });
    }
}
