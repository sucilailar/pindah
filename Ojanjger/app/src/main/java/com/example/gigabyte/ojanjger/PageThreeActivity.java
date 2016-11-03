package com.example.gigabyte.ojanjger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by GIGABYTE on 03/11/2016.
 */

public class PageThreeActivity extends AppCompatActivity {
    private String text1;
    private EditText pageThreeText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);

        Button back3 = (Button) findViewById(R.id.tiga);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageThreeActivity.this, PageTwoActivity.class);
                startActivity(intent);

            }
        });
    }

}









