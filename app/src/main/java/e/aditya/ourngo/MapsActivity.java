package e.aditya.ourngo;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Objects;


public class MapsActivity extends  AppCompatActivity implements OnMapReadyCallback {

   // public  int x=0;
    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        Objects.requireNonNull(mapFragment).getMapAsync(this);
        AutoCompleteTextView lsearch = (AutoCompleteTextView) findViewById(R.id.autocomplete_country);
        String[] countries = getResources().getStringArray(R.array.countries_array);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        lsearch.setAdapter(adapter);
        lsearch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object item = adapterView.getItemAtPosition(i);
                if(item instanceof String){
                    String location=(String) item;
                    onMapSearch(location);
        }
        }
    });}

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.

     *
     *
     *
     *
     *
     *
     *
     */
    public void onMapSearch(String view) {
        if(view.compareTo("Seva Sahayog Foundation")==0){
            LatLng latLng = new LatLng(18.50733, 73.838653);
            mMap.addMarker(new MarkerOptions().position(latLng).title(view)
                    .snippet("18 Vrundavan Society, Pathik Bungalow, Near Shri Shri Ravi Shankar Vidya Mandir, Off, Mhatre Bridge, Navi Peth, Sadashiv Peth, Pune, Maharashtra 411030"));
            float zoomLevel = 16.0f;
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));
        }
        if(view.compareTo("RESQ Charitable Trust")==0){
            LatLng latLng = new LatLng(18.495351, 73.765126);
            mMap.addMarker(new MarkerOptions().position(latLng).title(view)
                    .snippet("Plot No. 3906, Paud, 115, Mulshi Rd, Hill Town, Chandani Chowk, Bavdhan, Pune, Maharashtra 411022"));
            float zoomLevel = 16.0f;
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));
        }
        if(view.compareTo("Apla Ghar")==0){
            LatLng latLng = new LatLng(18.485142, 73.790999);
            mMap.addMarker(new MarkerOptions().position(latLng).title(view)
                    .snippet("Behind Atul Nagar, Gokulnagar, Varanashi Society, Mumbai-Banglore Highway, Warje Malwadi, AtulNagar Phase I, Atul Nagar, Warje, Pune, Maharashtra 411058"));
            float zoomLevel = 16.0f;
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));
        }
        if(view.compareTo("Sanmati Bal Niketan")==0){
            LatLng latLng = new LatLng(18.520360, 73.978163);
            mMap.addMarker(new MarkerOptions().position(latLng).title(view)
                    .snippet("A.M. College Road, Belhekar Vasti, Near Vasantdada Sugar Institute, Manjari Budruk, Pune, Maharashtra 412307"));
            float zoomLevel = 16.0f;
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));
        }
        if(view.compareTo("SindhuTai Sapkal Boy Orphanage")==0){
            LatLng latLng = new LatLng(18.520360, 73.978163);
            mMap.addMarker(new MarkerOptions().position(latLng).title(view)
                    .snippet("Tal.Haveli, Belhekar Vasti Near Vasantdada Sugar Institute, Manjri Bk, Pune, Maharashtra 412307"));
            float zoomLevel = 16.0f;
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));
        }
        if(view.compareTo("Tayyabia Orphanege")==0){
            LatLng latLng = new LatLng(18.509012, 73.879440);
            mMap.addMarker(new MarkerOptions().position(latLng).title(view)
                    .snippet("2410, East St, Camp, Pune, Maharashtra 411001"));
            float zoomLevel = 16.0f;
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));
        }

        //if(x == 1){
          //  LatLng latLng = new LatLng(18.50733, 73.838653);

        }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        // Add a marker in Sydney and move the camera
        //LatLng seva = new LatLng(18.50733, 73.838653);
        //mMap.addMarker(new MarkerOptions()

        LatLng sydney = new LatLng(18.5413, 73.7279);
        mMap.addMarker(new MarkerOptions()
                .position(sydney)
                .title("You").snippet("SIT, Lavale"));
        float zoomLevel = 10.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, zoomLevel));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);

    }

    public void nextAct(View v){
        Intent i = new Intent(MapsActivity.this, ItemListActivity.class);
        startActivity(i);
    }

}



