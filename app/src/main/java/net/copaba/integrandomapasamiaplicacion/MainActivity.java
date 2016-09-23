package net.copaba.integrandomapasamiaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;

/**
 * Created by Polo on 22/09/16.
 */

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    static final ArrayList<Place> places = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        places.add(0,new Place("Galerias Atizapan","19.5494906", "-99.2741936"));
        places.add(1,new Place("Espacio Esmeralda","19.5534967", "-99.2912149"));
        places.add(2,new Place("City Center Esmeralda","19.5490539", "-99.2879105"));
        places.add(3,new Place("Naucalli","19.4951358", "-99.2415511"));
        gridView = (GridView) findViewById(R.id.gvPlaces);
        gridView.setAdapter(new PlaceAdaptor(this,places));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                goToMap(v,position);
            }
        });
    }
    public void goToMap(View view, int position){
        Place place = places.get(position);
        Intent intent= new Intent(view.getContext(), MapActivity.class);
        intent.putExtra("place",place.getName());
        intent.putExtra("latitude",place.getLatitude());
        intent.putExtra("longitude",place.getLongitude());
        startActivity(intent);
    }
}
