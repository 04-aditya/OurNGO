package e.aditya.ourngo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
public class ItemActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);
    }

    public void goToSite (View view) {
        goToUrl ( "https://www.resqct.org/");
    }

    public void goToTweet (View view) {
        goToUrl ( "https://twitter.com/resqct");
    }

    public void goToFace (View view) {
        goToUrl ( "https://www.facebook.com/resqct");
    }

    public void goToInsta (View view) {
        goToUrl ( "https://instagram.com/resqct/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}

