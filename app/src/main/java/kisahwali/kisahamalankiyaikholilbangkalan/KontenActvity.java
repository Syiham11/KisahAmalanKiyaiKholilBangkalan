package kisahwali.kisahamalankiyaikholilbangkalan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class KontenActvity extends AppCompatActivity {

    TextView tvKonten;
    FloatingActionButton fabShare;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konten_actvity);
        getSupportActionBar().setTitle(getIntent().getExtras().getString("titlebar"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvKonten = (TextView)findViewById(R.id.tv_konten);
        fabShare = (FloatingActionButton)findViewById(R.id.fab_share);

        interstitial = new InterstitialAd(KontenActvity.this);
        interstitial.setAdUnitId(String.valueOf(R.string.idintersitial));
        AdView mAdView = (AdView) findViewById(R.id.ad_view1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        interstitial.loadAd(adRequest);

        // Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }
        });

        tvKonten.setText(getIntent().getExtras().getString("konten"));

        fabShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, getIntent().getExtras().getString("titlebar")+" KH. HASYIM ASY'ARI\n\n"+tvKonten.getText()
                +"\n\nShare from Application Kisah dan Amalan KH.HASYIM ASY'ARI http://bit.ly/KdanAHasyimAsyari");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==android.R.id.home) {
            finish();
        }

        return true;
    }

    private void displayInterstitial() {
        // If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
