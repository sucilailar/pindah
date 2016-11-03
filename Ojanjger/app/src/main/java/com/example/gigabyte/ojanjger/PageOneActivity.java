package com.example.gigabyte.ojanjger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PageOneActivity extends AppCompatActivity {

    String var_nama;
    String var_nim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);

        Button pageoneNext = (Button) findViewById(R.id.pageone_next);



        final EditText nama1 = (EditText) findViewById(R.id.nama);
        final EditText nim = (EditText) findViewById(R.id.nim);

        pageoneNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageOneActivity.this, PageTwoActivity.class);
                startActivity(intent);
                var_nama = nama1.getText().toString();
                var_nim = nim.getText().toString();

                Intent i = null;
                i = new Intent(PageOneActivity.this, PageTwoActivity.class);

                Bundle b = new Bundle();
                b.putString("parse_nama", var_nama);
                b.putString("parse_nim", var_nim);
                i.putExtras(b);
                startActivity(i);
            }
        });




    }
}
