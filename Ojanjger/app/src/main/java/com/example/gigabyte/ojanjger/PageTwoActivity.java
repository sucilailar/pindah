package com.example.gigabyte.ojanjger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by GIGABYTE on 03/11/2016.
 */

public class PageTwoActivity extends AppCompatActivity {
    TextView nama, nim;
    String get_nama, get_nim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        Button next2 = (Button) findViewById(R.id.pagetwo_next);
        Button back2 = (Button) findViewById(R.id.pagetwo_back);

        nama= (TextView) findViewById(R.id.nama2);
        nim = (TextView) findViewById(R.id.nim2);

        Bundle b = getIntent().getExtras();

        get_nama=b.getString("parse_nama");
        get_nim=b.getString("parse_nim");

        nama.setText(get_nama);
        nim.setText(get_nim);




        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageTwoActivity.this, PageThreeActivity.class);
                startActivity(intent);

            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageTwoActivity.this, PageOneActivity.class);
                startActivity(intent);

            }
        });
    }
}
