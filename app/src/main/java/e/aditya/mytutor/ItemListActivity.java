package e.aditya.mytutor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
public class ItemListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
    }

    public void goToSite (View view) {
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
    }

}

