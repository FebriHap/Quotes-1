package com.ahmfarisi.quotes.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmfarisi.quotes.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvQuotes;
    private ProgresBar pbQuotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvQuotes = findViewBiId(R.id.rv_Quotes);
        pbQuotes = fin
    }
}