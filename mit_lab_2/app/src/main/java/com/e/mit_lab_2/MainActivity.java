package com.e.mit_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView1);

        String filmNames[] = {
                "Akira",
                "Nausicaa",
                "Perfect Blue"
        };

        String filmDescription[] = {
                "1988 ‧ Sci-fi/Action ‧ 2h 6m",
                "1984 ‧ Fantasy/Adventure ‧ 1h 57m",
                "1997 ‧ Mystery/Thriller ‧ 1h 30m"
        };


        Integer imageid[] = {
                R.drawable.akira,
                R.drawable.nausicaa,
                R.drawable.perfectblue
        };

        FilmAdapter customFilmList = new FilmAdapter(this, filmNames, filmDescription, imageid);
        listView.setAdapter(customFilmList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    Intent i = new Intent(view.getContext(), AkiraActivity.class);
                    startActivity(i);
                }if (position == 1){
                    Intent i = new Intent(view.getContext(), NausicaaActivity.class);
                    startActivity(i);
                }
                if (position == 2){
                    Intent i = new Intent(view.getContext(), PerfectBlueActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
