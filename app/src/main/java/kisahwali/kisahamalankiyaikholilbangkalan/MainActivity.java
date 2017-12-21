package kisahwali.kisahamalankiyaikholilbangkalan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
    Button btnProfilSingkat, btnKisahKehidupan, btnKisahKaromah, btnAmalan;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfilSingkat = (Button)findViewById(R.id.btn_profil_singkat);
        btnKisahKehidupan = (Button)findViewById(R.id.btn_cerita_perjalanan);
        btnKisahKaromah = (Button)findViewById(R.id.btn_kisah_karomah);
        btnAmalan = (Button)findViewById(R.id.btn_amalan);

        interstitial = new InterstitialAd(MainActivity.this);
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

        btnProfilSingkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(MainActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btnProfilSingkat.getText());
                pindahKonten.putExtra("konten","KH Mohammad Hasyim Asy'ari.  Biasa disebut KH Hasyim Ashari beliau dilahirkan pada tanggal 10 April 1875 atau menurut penanggalan arab pada tanggal 24 Dzulqaidah 1287H di Desa Gedang, Kecamatan Diwek, Kabupaten Jombang, Jawa Timur. Beliau tutup usia pada tanggal 25 Juli 1947 yang kemudian dikebumikan di Tebu Ireng, Jombang.\n" +
                        "\n" +
                        "KH Hasyim Asy'ari merupakan pendiri Nahdlatul Ulama yaitu sebuah organisasi massa Islam yang terbesar di Indonesia. KH Hasyim Asyari merupakan putra dari pasangan Kyai Asyari dan Halimah, Ayahnya Kyai Ashari merupakan seorang pemimpin Pesantren Keras yang berada di sebelah selatan Jombang.\n" +
                        "\n" +
                        "KH Hasyim Ashari merupakan anak ketiga dari 11 bersaudara. Dari garis keturunan ibunya, KH Hasyim Ashari merupakan keturunan kedelapan dari Jaka Tingkir (Sultan Pajang). dari Ayah dan Ibunya KH Hasyim Ashari mendapat pendidikan dan nilai-nilai dasar Islam yang kokoh.");
                startActivity(pindahKonten);
            }
        });

        btnKisahKehidupan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(MainActivity.this,KisahPerjalananActivity.class);
                pindahKonten.putExtra("titlebar",btnKisahKehidupan.getText());
                pindahKonten.putExtra("statusKaromah",false);
                startActivity(pindahKonten);
            }
        });

        btnKisahKaromah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(MainActivity.this,KisahPerjalananActivity.class);
                pindahKonten.putExtra("titlebar",btnKisahKaromah.getText());
                pindahKonten.putExtra("statusKaromah",true);
                startActivity(pindahKonten);
            }
        });

        btnAmalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(MainActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btnAmalan.getText());
                pindahKonten.putExtra("konten"," 1. Meneladani Rasulullah sebagai idola utama manusia, itu yang senantisa beliau wasiatkan bukan hanya kepada santri-santrinya tetapi juga kepada seluruh kaum muslimin.\n" +
                        "\n" +
                        "2. Semangat Jihad (membela agama dan bangsa), beliau adalah ulama yang mujahid (ahli jihad) yang negarawan dan memiliki patriotisme yang luar biasa. Hal ini bisa kita lakukan sesuai dengan kemampuan dan profesi kita masing-masing (Ulama, ustazd, guru, pegawai, pelajar, santri, pengusaha, pejabat, petani, nelayan dll). Jihad tidaklah harus berperang atau memikul senjata, segala bentuk perbuatan baik dan membawa manfaat serta mencegah segala bentuk perbuatan keji dan munkar itu sendiri juga merupakan suatu jihad.\n" +
                        "\n" +
                        "3. Menjaga Shalat lima waktu dengan berjamaah\n" +
                        "\n" +
                        "4. Beliau memiliki pribadi yang Ihklas dalam bertindak, termasuk ihlas melayani umat, masyarakat dan bangsa Indonesia ini\n" +
                        "\n" +
                        "5. Pribadi yang santun, rendah hati (tawadlu), tidak suka menonjolkan diri, menampakkan diri\n" +
                        "\n" +
                        "6. Saling menghormati, suka bermusyawarah, tidak fanatik yang berlebihan merasa paling benar sendiri\n" +
                        "\n" +
                        "7. Membersihkan hati dan mensucikan niat didalam mengerjakan dan melakukan sesuatu (Nasehat beliau dalam kitab adabutta’lim wa mutaallim).\n" +
                        "\n" +
                        "8. Beliau adalah pribadi yang pekerja keras, memiliki semangat juang tinggi tanpa mengenal lelah dalam melakukan sesuatu (berjuang, belajar, bekerja, membantu/melayani Umat dll) termasuk dalam melayani umat dan bangsa Indonesia.\n" +
                        "\n" +
                        "Itulah karomah besar Hadratus Syaikh Muhammad Hasyim Asyari yang telah Allah anugrahkan kepada beliau, juga sekaligus ijazah yang beliau berikan kepada santri-santrinya dan seluruh kaum muslimin, agar bisa di amalkan dalam kehidupan sehari-hari didalam beragama, berkeluarga, bermsyarakat dan berbangsa.\n" +
                        "\n" +
                        "Terkadang kita sering sering terpesona oleh kekeramatan, kehebatan dan kesaktian beberapa ulama atau kyai tertentu. Contoh seperti kisah jika ada Kyai yang bisa mendatangkan rizki secara tiba-tiba, bisa berada di suatu tempat yang sangat jauh dalam sekejap mata, bisa juga berada dalam suatu tempat yang berbeda secara bersamaan, mengetahui akan kejadian masa lalu dan juga mengetahui kejadian-kejadian yang akan terjadi, bisa terbang, mampu berjalan di atas air dan masih banyak lagi lainya. Itu membuat kita terkagum-kagum, padahal semua itu tiada mustahil dan sangatlah mudah bagi Allah.\n" +
                        "\n" +
                        "Kalaulah kita lihat putra beliau KH. Abdul Wachid Hasyim dalam usia yang sangat muda sekitar 30 tahunan sudah menjadi ulama besar, pejuang dan negarawan, tokoh nasional dan internasional, dan juga menjadi pahlawan Nasional, beliau sangat di segani dan di hormati. KH. Abdul Wachid Hasyim meninggal dalam usia sangat muda 39 tahun. Mungkin karena sangat sayangNya Allah kepada beliau sehingga di dalam usia beliau yang masih sangat muda, Allah memanggil beliau untuk menghadap keharibaan-Nya,waallahu ‘alam\n" +
                        "\n" +
                        "Masih belum ada sampai sekarang ini tokoh, ulama/Kyai di Indonesia yang usianya sangat muda sekitar 30 tahunan sudah menjadi ulama besar sekaligus tokoh nasaional dan internasional kecuali hanya beliau sendiri KH. Abdul Wachid Hasyim. Rata-rata kebanyakan yang menjadi tokoh ulama/kyai besar di Indonesia jika usianya sudah mencapai hampir 60 tahunan.\n" +
                        "\n" +
                        "Menurut putri beliau Ibu Lily Khodijah Wachid, bahwanya beliau ini (KH. M Hasyim Asy’ari dan KH Abdul Wachid Hasyim) sangatlah layak di sebut waliNya Allah.\n" +
                        "\n" +
                        "KH. Abdurrahman Wachid atau Gus Dur adalah seorang ulama besar, seniman dan juga negarawan sejati. Sebagian besar orang-orang sholihin mengatakan jikalau Gus Dur ini “Waliyullah” karena memiliki banyak kelebihan dan kemampuan luar biasa. Itu baru anak dan cucunya apalagi kakeknya Hadratus Syaikh Muhammad Hasyim Asy’ari, bahkan guru beliau sendiri KH. M kholil yang banyak ulama mengatakan jika beliau itu qutbul aqtobnya tanah Jawa sangat menghormati beliau KH. M Hasyim Asy’ari.");
                startActivity(pindahKonten);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.search:
                //your code here
                Intent pindahAbout = new Intent(MainActivity.this,AboutActivity.class);
                pindahAbout.putExtra("titlebar","About");
                startActivity(pindahAbout);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void displayInterstitial() {
        // If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
