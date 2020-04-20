package e.aditya.ourngo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
public class ItemActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);
    }

    public void goToSite (View view) {
        goToUrl ( "https://www.sindhutaisapakal.org/index.html");
    }

    public void goToTweet (View view) {
        goToUrl ( "https://twitter.com/sousapkal?lang=en");
    }

    public void goToFace (View view) {
        goToUrl ( "https://www.facebook.com/Sindhutai-Sapkal-202282803131794/");
    }

    public void goToInsta (View view) {
        goToUrl ( "https://www.instagram.com/dr.sindhutai_sapkal.maai/?hl=en");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}

