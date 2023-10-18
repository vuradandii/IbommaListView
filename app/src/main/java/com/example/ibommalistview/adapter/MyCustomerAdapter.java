package com.example.ibommalistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ibommalistview.Movies.MovieList;
import com.example.ibommalistview.R;

import java.util.ArrayList;

public class MyCustomerAdapter extends ArrayAdapter<MovieList> {
   Context context;
   ArrayList<MovieList> movieListArrayList;

   public MyCustomerAdapter(Context context, ArrayList<MovieList> movieListArrayList) {
      super(context, R.layout.item_list, movieListArrayList);
      this.movieListArrayList = movieListArrayList;
   }

   private static class MovieViewHolder {
      TextView moviename, year, cast, director;
      ImageView imageView;
   }

   @NonNull
   @Override
   public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

      MovieList movieList = getItem(position);

      MovieViewHolder myviewHolder;
      final View result;

      if (convertView == null){

         myviewHolder = new MovieViewHolder();
         LayoutInflater inflater = LayoutInflater.from(getContext());
         convertView = inflater.inflate(R.layout.item_list, parent, false);

         myviewHolder.moviename = (TextView) convertView.findViewById(R.id.moviename);
         myviewHolder.year = (TextView) convertView.findViewById(R.id.year);
         myviewHolder.cast = (TextView) convertView.findViewById(R.id.cast);
         myviewHolder.director = (TextView) convertView.findViewById(R.id.director);
         myviewHolder.imageView = (ImageView) convertView.findViewById(R.id.image);

         result = convertView;
         convertView.setTag(myviewHolder);

      } else {

         myviewHolder = (MovieViewHolder) convertView.getTag();
         result = convertView;

      }
         myviewHolder.moviename.setText(movieList.getMovieName());
         myviewHolder.year.setText(movieList.getYear());
         myviewHolder.cast.setText(movieList.getCast());
         myviewHolder.director.setText(movieList.getDirector());
         myviewHolder.imageView.setImageResource(movieList.getImage());

         return convertView;


   }

}

