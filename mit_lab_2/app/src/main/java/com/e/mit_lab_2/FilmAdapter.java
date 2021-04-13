package com.e.mit_lab_2;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FilmAdapter extends ArrayAdapter<String> {
    private String[] filmNames;
    private String[] filmDescription;
    private Integer[] imageid;
    private Activity context;

    public FilmAdapter(Activity context, String[] filmNames, String[] filmDescription, Integer[] imageid) {
        super(context, R.layout.list_item, filmNames);
        this.context = context;
        this.filmNames = filmNames;
        this.filmDescription = filmDescription;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.list_item, null, true);
        TextView textViewName = (TextView) row.findViewById(R.id.film_name);
        TextView textViewDescription = (TextView) row.findViewById(R.id.film_desc);
        ImageView imagePoster = (ImageView) row.findViewById(R.id.film_img);

        textViewName.setText(filmNames[position]);
        textViewDescription.setText(filmDescription[position]);
        imagePoster.setImageResource(imageid[position]);
        return  row;
    }
}
