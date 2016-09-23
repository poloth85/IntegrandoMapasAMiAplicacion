package net.copaba.integrandomapasamiaplicacion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Polo on 20/09/16.
 */
public class PlaceAdaptor extends BaseAdapter {
    private Context context;
    private final List<Place> places;

    public PlaceAdaptor(MainActivity context, ArrayList<Place> places) {
        this.context = context;
        this.places = places;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null) {
            gridView = new View(context);
            gridView = inflater.inflate(R.layout.place, null);
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.imgPlace);

            switch (position){
                case 0:
                    imageView.setImageResource(R.mipmap.galeriasatizapan);
                    break;
                case 1:
                    imageView.setImageResource(R.mipmap.espacioesmeralda);
                    break;
                case 2:
                    imageView.setImageResource(R.mipmap.citycenter);
                    break;
                case 3:
                    imageView.setImageResource(R.mipmap.naucalli);
                    break;
                default:
                    imageView.setImageResource(R.mipmap.ic_launcher);
                    break;
            }
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }

    @Override
    public int getCount() { return places.size(); }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
