package e.aditya.ourngo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//import android.content.Intent;
//import android.net.Uri;
//import android.view.View;
public class ItemListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
    }

    public void goBack(View v){
        Intent j = new Intent(ItemListActivity.this,MapsActivity.class);
        startActivity(j);
    }

    public void goNext(View v){
        Intent k = new Intent(ItemListActivity.this,ItemActivity1.class);
        startActivity(k);
    }
    public void goNext2(View v){
        Intent k = new Intent(ItemListActivity.this,ItemActivity2.class);
        startActivity(k);
    }
    public void goNext3(View v){
        Intent k = new Intent(ItemListActivity.this,ItemActivity3.class);
        startActivity(k);
    }
    public void goNext4(View v){
        Intent k = new Intent(ItemListActivity.this,ItemActivity4.class);
        startActivity(k);
    }
    /*public void goToSite (View view) {
        goToUrl ( "http://sevasahayog.org/");
    }

    public void goToTweet (View view) {
        goToUrl ( "https://twitter.com/sevasahayog?lang=en");
    }

    public void goToFace (View view) {
        goToUrl ( "https://www.facebook.com/sevasahayog/");
    }

    public void goToInsta (View view) {
        goToUrl ( "https://www.instagram.com/sevasahayog/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }*/

}

