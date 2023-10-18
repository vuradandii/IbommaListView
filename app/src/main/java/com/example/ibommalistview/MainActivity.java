package com.example.ibommalistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ibommalistview.Movies.MovieList;
import com.example.ibommalistview.adapter.MyCustomerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<MovieList> movieListArrayList;

    private static MyCustomerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        movieListArrayList = new ArrayList<>();

        MovieList movieList = new MovieList("Bro","2023","PawanKalyan","Samudrakani",R.drawable.aaaa);
        MovieList movieList1 = new MovieList("RRR","2022","RamCharan,NTR","Rajamouli",R.drawable.bbbb);
        MovieList movieList2 = new MovieList("Pushpa","2021","AlluArjun","Sukumar",R.drawable.ccc);
        MovieList movieList3 = new MovieList("Jailer","2023","RajiniKanth","Nelson Dillip",R.drawable.ddd);
        MovieList movieList4 = new MovieList("Jawan","2023","ShahRukhKhan","Atlee Kumar",R.drawable.eee);
        MovieList movieList5 = new MovieList("Adipurush","2023","Prabhas","Om Raut",R.drawable.fff);
        MovieList movieList6 = new MovieList("Vikram","2022","KamalHassan","LokeshKanagaraj",R.drawable.ggg);


        movieListArrayList.add(movieList);
        movieListArrayList.add(movieList1);
        movieListArrayList.add(movieList2);
        movieListArrayList.add(movieList3);
        movieListArrayList.add(movieList4);
        movieListArrayList.add(movieList5);
        movieListArrayList.add(movieList6);


        adapter = new MyCustomerAdapter(getApplicationContext(), movieListArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "you select movie" + adapter.getItem(position).getMovieName(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}