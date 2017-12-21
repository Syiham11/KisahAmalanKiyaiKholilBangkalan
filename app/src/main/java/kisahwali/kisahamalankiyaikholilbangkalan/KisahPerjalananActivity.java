package kisahwali.kisahamalankiyaikholilbangkalan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import static android.view.View.GONE;

public class KisahPerjalananActivity extends AppCompatActivity {
    TextView btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_10,btn_0;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_perjalanan);
        getSupportActionBar().setTitle(getIntent().getExtras().getString("titlebar"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btn_0 = (TextView)findViewById(R.id.btn_0);
        btn_1 = (TextView)findViewById(R.id.btn_1);
        btn_2 = (TextView)findViewById(R.id.btn_2);
        btn_3 = (TextView)findViewById(R.id.btn_3);
        btn_4 = (TextView)findViewById(R.id.btn_4);
        btn_5 = (TextView)findViewById(R.id.btn_5);
        btn_6 = (TextView)findViewById(R.id.btn_6);
        btn_7 = (TextView)findViewById(R.id.btn_7);
        btn_8 = (TextView)findViewById(R.id.btn_8);
        btn_9 = (TextView)findViewById(R.id.btn_9);
        btn_10 = (TextView)findViewById(R.id.btn_10);

        interstitial = new InterstitialAd(KisahPerjalananActivity.this);
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

        if(getIntent().getExtras().getBoolean("statusKaromah")){
            btn_1.setText("Menguasai Hadist seperti kitab sendiri");
            btn_2.setText("Tebuireng sebagai markas pasukan pejuang");
            btn_3.setText("Mengetahui kejadian ditempat yang jauh");
            btn_4.setText("Memberi amalan kepada santri");
            btn_5.setText("Kelebihan dari santri Tebuireng");
            btn_6.setText("KH. Hasyim Asyari ditahan oleh penjajah");
            btn_7.setVisibility(GONE);
            btn_8.setVisibility(GONE);
            btn_9.setVisibility(GONE);
            btn_10.setVisibility(GONE);
            btn_0.setVisibility(GONE);
        }

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_0.getText());
                pindahKonten.putExtra("konten","Tidak jauh dari jantung kota Jombang ada sebuah dukuh yang bernama Ngedang Desa Tambak Rejo yang dahulu terdapat Pondok Pesantren yang konon pondok tertua di Jombang, dan pengasuhnya Kiai Usman. Beliau adalah seorang kiai besar, alim dan sangat berpengaruh, istri beliau Nyai Lajjinah dan dikaruniai enam anak:\n" +
                        "\n" +
                        "    Halimah (Winih)\n" +
                        "    Muhammad\n" +
                        "    Leler\n" +
                        "    Fadli\n" +
                        "    Arifah\n" +
                        "\n" +
                        "Halimah kemudian dijodohkan dengan seorang santri ayahandanya yang bernama Asy’ari, ketika itu Halimah masih berumur 4 tahun sedangkan Asy’ari hampir beruisa 25 tahun. Mereka dikarunia 10 anak:\n" +
                        "\n" +
                        "    Nafi’ah\n" +
                        "    Ahmad Saleh\n" +
                        "    Muhammad Hasyim\n" +
                        "    Radiyah\n" +
                        "    Hasan\n" +
                        "    Anis\n" +
                        "    Fatonah\n" +
                        "    Maimunah\n" +
                        "    Maksun\n" +
                        "    Nahrowi, dan\n" +
                        "    Adnan.\n" +
                        "\n" +
                        "Muhammad Hasyim, lahir pada hari Selasa Tanggal 24 Dzulqo’dah 1287 H, bertepatan dengan tanggal 14 Pebruari 1871 M. Masa dalam kandungan dan kelahiran KH.M. Hasyim Asy’ari, nampak adanya sebuah isyarat yang menunjukkan kebesarannya. diantaranya, ketika dalam kandungan Nyai Halimah bermimpi melihat bulan purnama yang jatuh kedalam kandungannya, begitu pula ketika melahirkan Nyai Halimah tidak merasakan sakit seperti apa yang dirasakan wanita ketika melahirkan." +
                        "\n"+"Di masa kecil beliau hidup bersama kakek dan neneknya di Desa Ngedang, ini berlangsung selama enam tahun. Setelah itu beliau mengikuti kedua orang tuanya yang pindah ke Desa Keras terletak di selatan kota Jombang dan di desa tersebut Kiai Asy’ari mendirikan pondok pesantren yang bernama Asy’ariyah.\n" +
                        "\n" +
                        "Principle of early learning, mungkin teori ini layak disandang oleh beliau, berdasarkan kehidupan beliau yang mendukung yaitu hidup dilingkungan pesantren, sehingga wajar kalau nilai-nilai pesantren sangat meresap pada dirinya, begitu pula nilai-nilai pesantren dapat dilihat bagaimana ayahanda dan bundanya memberikan bimbingan kepada santri, dan bagaimana para santri hidup dengan sederhana penuh dengan keakraban dan saling membantu..");
                startActivity(pindahKonten);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_1.getText());
                if(getIntent().getExtras().getBoolean("statusKaromah")){
                    pindahKonten.putExtra("konten","Di Indonesia, semua orang tentunya kenal dengan tokoh KH Hasim Asy’ari, terutama kalangan nahdliyyin (sebutan untuk warga Nahdlatul Ulama/NU), sebagai ulama yang mumpuni secara keilmuan sekaligus tokoh pendiri NU. Ia sangat piawai dalam mengajar ilmu agama. Terbukti, saat Kiai Hasyim Asy’ari sedang mengaji kitab Shahih Bukhari, ibarat membaca kitabnya sendiri.Ini menunjukkan penguasaan dalam ilmu Hadits sangat mendalam.\n" +
                            "\n" +
                            "Suatu kisah karomahnya terjadi usai waktu dhuhur. Pada suatu waktu Kiai Hasyim Asy’ari mengajar kitab di hadapan para santri dalam jumlah yang banyak. Di tengah pengajian, ia melemparkan tongkatnya ke depan dan mengenak pada muridnya. Ia bersikap apatis dan tidak mau menghiraukan tongkatnya yang mengena pada santrinya. Santri yang kesakitan itu berusaha menahan diri untuk tetap dalam posisi demi menjaga morallitas terhadap guru. Sejenak murid tersebut teringat bahwa dirinya belum salat dhuhur, sedangkan waktu dhuhur akan berakhir. Kejadian seperti ini, tidak hanya satu kali, tapi berulang-ulang sebagai peringatan terhadap santrinya yang meninggalkan perintah agama dan berbuat kesalahan");
                }else {
                    pindahKonten.putExtra("konten", "Perjalanan keluarga beliau pulalah yang memulai pertama kali belajar ilmu-ilmu agama baik dari kakek dan neneknya. Desa Keras membawa perubahan hidup yang pertama kali baginya, disini mula-mula ia menerima pelajaran agama yang luas dari ayahnya yang pada saat itu pendiri dan pengasuh Pondok Pesantren Asy’ariyah. Dengan modal kecerdasan yang dimiliki dan dorongan lingkungan yang kondusif, dalam usia yang cukup muda, beliau sudah dapat memahami ilmu-ilmu agama, baik bimbingan keluarga, guru, atau belajar secara autodidak. Ketidakpuasannya terhadap apa yang sudah dipelajari, dan kehausan akan mutiara ilmu, membuatnya tidak cukup hanya belajar pada lingkungan keluarganya. Setelah sekitar sembilan tahun di Desa Keras (umur 15 tahun) yakni belajar pada keluarganya, beliau mulai melakukan pengembaraanya menuntut ilmu.");
                }
                startActivity(pindahKonten);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_2.getText());
                if(getIntent().getExtras().getBoolean("statusKaromah")){
                    pindahKonten.putExtra("konten","Pondok Pesantren Tebu Ireng sebagai salah satu markas pasukan pejuang kemerdekaan Republik Indonesia\n" +
                            "Pada waktu terjadi perang kemerdekaan, semua orang yang akan pergi perang untuk mengusir penjajah, mereka semua dikumpulkan oleh KH. Hasyim Asyari di pondok pesantren Tebu Ireng. Mereka diberi minum air sambil membaca Ya Allah Ya Hafidh, Ya Allah Ya Muhith, Fanshurna 'ala qaumil kafiriin. Bagi orang-orang yang beliau kumpulkan tersebut, KH. Hasyim Asyari memberi beberapa pantangan yang tidak boleh mereka langgar selama berperang. Siapa saja yang melanggar pantangan tersebut, mereka pasti terkena tembakan musuh.\n" +
                            "\n" +
                            "Para pejuang yang dikaruniai umur panjang oleh Allah selalu menceritakan kisah ini, termasuk salah seorang dari mereka yang bernama Pak Si'in.");
                }else {
                    pindahKonten.putExtra("konten", "Dalam usia 15 tahun, perjalanan awal menuntut ilmu, Muhammad Hasyim belajar ke pondok-pondok pesantren yang masyhur di tanah Jawa, khususnya Jawa Timur. Di antaranya adalah Pondok Pesantren Wonorejo di Jombang, Wonokoyo di Probolinggo, Tringgilis di Surabaya, dan Langitan di Tuban (sekarang diasuh oleh K.H Abdullah Faqih), kemudian Bangkalan, Madura, di bawah bimbingan Kiai Muhammad Khalil bin Abdul Latif (Syaikhuna Khalil).\n" +
                            "\n" +
                            "Ada cerita yang cukup mengagumkan tatkala KH.M. Hasyim Asy’ari “ngangsu kawruh” dengan Kiai Khalil. Suatu hari, beliau melihat Kiai Khalil bersedih, beliau memberanikan diri untuk bertanya. Kiai Khalil menjawab, bahwa cincin istrinya jatuh di WC, Kiai Hasyim lantas usul agar Kiai Khalil membeli cincin lagi. Namun, Kiai Khalil mengatakan bahwa cincin itu adalah cincin istrinya. Setelah melihat kesedihan di wajah guru besarnya itu, Kiai Hasyim menawarkan diri untuk mencari cincin tersebut didalam WC. Akhirnya, Kiai Hasyim benar-benar mencari cincin itu didalam WC, dengan penuh kesungguhan, kesabaran, dan keikhlasan, akhirnya Kiai Hasyim menemukan cincin tersebut. Alangkah bahagianya Kiai Khalil atas keberhasilan Kiai Hasyim itu. Dari kejadian inilah Kiai Hasyim menjadi sangat dekat dengan Kiai Khalil, baik semasa menjadi santrinya maupun setelah kembali ke masyarakat untuk berjuang. Hal ini terbukti dengan pemberian tongkat saat Kiai Hasyim hendak mendirikan Jam’iyah Nahdlatul Ulama’ yang dibawa KH. As’ad Syamsul Arifin (pengasuh Pondok Pesantren Syafi’iyah Situbondo).\n" +
                            "\n" +
                            "Setelah sekitar lima tahun menuntut ilmu di tanah Madura (tepatnya pada tahun 1307 H/1891 M), akhirnya beliau kembali ke tanah Jawa, belajar di pesantren Siwalan, Sono Sidoarjo, dibawah bimbingan K. H. Ya’qub yang terkenal ilmu nahwu dan shorofnya. Selang beberapa lama, Kiai Ya’qub semakin mengenal dekat santri tersebut dan semakin menaruh minat untuk dijadikan menantunya.\n" +
                            "\n" +
                            "Pada tahun 1303 H/1892 M., Kiai Hasyim yang saat itu baru berusia 21 tahun menikah dengan Nyai Nafisah, putri Kiai Ya’qub. Tidak lama setelah pernikahan tersebut, beliau kemudian pergi ke tanah suci Mekah untuk menunaikan ibadah haji bersama istri dan mertuanya. Disamping menunaikan ibadah haji, di Mekah beliau juga memperdalam ilmu pengetahuan yang telah dimilkinya, dan menyerap ilmu-ilmu baru yang diperlukan. Hampir seluruh disiplin ilmu agama dipelajarinya, terutama ilmu-ilmu yang berkaitan dengan hadits Rasulullah SAW yang menjadi kegemarannya sejak di tanah air.\n" +
                            "\n" +
                            "Perjalanan hidup terkadang sulit diduga, gembira dan sedih datang silih berganti.demikian juga yang dialami Kiai Hasyim Asy’ari di tanah suci Mekah. Setelah tujuh bulan bermukim di Mekah, beliau dikaruniai putra yang diberi nama Abdullah. Di tengah kegembiraan memperoleh buah hati itu, sang istri mengalami sakit parah dan kemudian meninggal dunia. empat puluh hari kemudian, putra beliau, Abdullah, juga menyusul sang ibu berpulang ke Rahmatullah. Kesedihan beliau yang saat itu sudah mulai dikenal sebagai seorang ulama, nyaris tak tertahankan. Satu-satunya penghibur hati beliau adalah melaksanakan thawaf dan ibadah-ibadah lainnya yang nyaris tak pernah berhenti dilakukannya. Disamping itu, beliau juga memiliki teman setia berupa kitab-kitab yang senantiasa dikaji setiap saat. Sampai akhirnya, beliau meninggalkan tanah suci, kembali ke tanah air bersama mertuanya.");
                }
                startActivity(pindahKonten);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_3.getText());
                if(getIntent().getExtras().getBoolean("statusKaromah")){
                    pindahKonten.putExtra("konten","Allah memberi kemampuan kepada KH. Hasyim Asyari untuk mengetahui apa yang sedang terjadi di tempat lain, meskipun tempat itu jauh, hal ini sama dengan kemampuan yang diberikan Allah kepada salah seorang sahabat Nabi, yaitu Umar, beliau dapat mengetahui apa yang sedang terjadi dengan pasukannya dan memberi perintah kepada pasukan tersebut dari atas mimbar. Ketika KH. Hasyim Asyari sedang memberi pengajian kepada para santri di pondok pesantren Tebu Ireng, pada saat yang sama, beliau dapat mengetahui pasukan pejuang yang beliau didik sedang berperang melawan musuh di daerah Pare, sebuah daerah yang jauhnya kira-kira 30 km dari pondok pesantren Tebu Ireng. KH. Hasyim Asyari di samping mampu melihat perang yang sedang berlangsung di daerah Pare tersebut, beliau pun juga memberi perintah kepada pasukan pejuang yang sedang berperang itu.\n" +
                            "\n" +
                            "Penjajah tidah pernah berhasil menghacurkan pondok pesantren Tebu Ireng\n" +
                            "Pesantren beliau berkali-kali di bom oleh pasukan penjajah, tapi bom itu tidak pernah meledak.");
                }else {
                    pindahKonten.putExtra("konten", "Kerinduan akan tanah suci rupanya memanggil beliau untuk kembali lagi pergi ke kota Mekah. Pada tahun 1309 H/1893 M, beliau berangkat kembali ke tanah suci bersama adik kandungnya yang bernama Anis. Kenangan indah dan sedih teringat kembali tatkala kaki beliau kembali menginjak tanah suci Mekah. Namun hal itu justru membangkitkan semangat baru untuk lebih menekuni ibadah dan mendalami ilmu pengetahuan. Tempat-tempat bersejarah dan mustajabah pun tak luput dikunjunginya, dengan berdoa untuk meraih cita-cita, seperti Padang Arafah, Gua Hira’, Maqam Ibrahim, dan tempat-tempat lainnya. Bahkan makam Rasulullah SAW di Madinah pun selalu menjadi tempat ziarah beliau. Ulama-ulama besar yang tersohor pada saat itu didatanginya untuk belajar sekaligus mengambil berkah, di antaranya adalah Syaikh Su’ab bin Abdurrahman, Syaikh Muhammad Mahfud Termas (dalam ilmu bahasa dan syariah), Sayyid Abbas Al-Maliki al-Hasani (dalam ilmu hadits), Syaikh Nawawi Al-Bantani dan Syaikh Khatib Al-Minang Kabawi (dalam segala bidang keilmuan).\n" +
                            "\n" +
                            "Upaya yang melelahkan ini tidak sia-sia. Setelah sekian tahun berada di Mekah, beliau pulang ke tanah air dengan membawa ilmu agama yang nyaris lengkap, baik yang bersifat ma’qul maupun manqul, seabagi bekal untuk beramal dan mengajar di kampung halaman.");
                }
                startActivity(pindahKonten);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_4.getText());
                if(getIntent().getExtras().getBoolean("statusKaromah")){
                    pindahKonten.putExtra("konten","Jika KH. Hasyim Asyari ingin memberi ‘amalan’ kepada santrinya, maka dipanggilnya 3 orang santri, dilihatnya dengan mata hatinya. Dengan mata hati, beliau memilih salah seorang dari ketiga santri tersebut yang benar-benar memiliki kemampuan untuk melaksanakan ‘amalan’ yang akan beliau berikan. Berikutnya, 2 orang santri yang tidak beliau pilih, mereka disuruh keluar dari ruangan tempat mereka dipanggil.\n");
                }else {
                    pindahKonten.putExtra("konten", "Sepulang dari tanah suci sekitar Tahun1313 H/1899 M, beliau memulai mengajar santri, beliau pertama kali mengajar di Pesantren Ngedang yang diasuh oleh mediang kakeknya, sekaligus tempat dimana ia dilahirkan dan dibesarkan. Setelah itu belaiu mengajar di Desa Muning Mojoroto Kediri. Disinilah beliau sempat menikahi salah seoarang putri Kiai Sholeh Banjar Melati. Akungnya, karena berbagai hal, pernikahan tersebut tidak berjalan lama sehingga Kiai Hasyim kembali lagi ke Jombang.\n" +
                            "\n" +
                            "Ketika telah berada di Jombang beliau berencana membangun sebuah pesantren yang dipilihlah sebuah tempat di Dusun Tebuireng yang pada saat itu merupakan sarang kemaksiatan dan kekacauan. Pilihan itu tentu saja menuai tanda tanaya besar dikalangan masyarakat, akan tetapi semua itu tidak dihiraukannaya.\n" +
                            "\n" +
                            "Nama Tebuireng pada asalnya Kebo ireng (kerbau hitam). Ceritanya, Di dearah tersebut ada seekor kerbau yang terbenam didalam Lumpur, dimana tempat itu banyak sekali lintahnya, ketika ditarik didarat, tubuh kerbau itu sudah berubah warna yang asalnya putih kemerah-merahan berubah menjadi kehitam-hitaman yang dipenuhi dengan lintah. Konon semenjak itulah daerah tadi dinamakan Keboireng yang akhirnya berubah menjadi Tebuireng.\n" +
                            "\n" +
                            "Pada tanggal 26 Robiul Awal 1317 H/1899 M, didirikanlah Pondok Pesantren Tebuireng, bersama rekan-rekan seperjuangnya, seperti Kiai Abas Buntet, Kiai Sholeh Benda Kereb, Kiai Syamsuri Wanan Tara, dan beberapa Kiai lainnya, segala kesuliatan dan ancaman pihak-pihak yang benci terhadap penyiaran pendidikan Islam di Tebuireng dapat diatasi.\n" +
                            "\n" +
                            "KH. M. Hasyim Asya’ri memulai sebuah tradisi yang kemudian menjadi salah satu keistimewaan beliau yaitu menghatamkan kitab shakhihaini “Al-Bukhori dan Muslim” dilaksanakan pada setiap bulan suci ramadlan yang konon diikuti oleh ratusan kiai yang datang berbondong-bondong dari seluruh jawa. Tradisi ini berjalan hingga sampai sekarang (penggasuh PP. Tebuireng KH. M.Yusuf Hasyim). Para awalnya santri Pondok Tebuireng yang pertama berjumlah 28 orang, kemudian bertambah hingga ratusan orang, bahkan diakhir hayatnya telah mencapai ribuan orang, alumnus-alumnus Pondok Tebuireng yang sukses menjadi ulama’ besar dan menjadi pejabat-pejabat tinggi negara, dan Tebuireng menjadi kiblat pondok pesantren.");
                }
                startActivity(pindahKonten);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_5.getText());
                if(getIntent().getExtras().getBoolean("statusKaromah")){
                    pindahKonten.putExtra("konten","Pada waktu Jepang menjajah Indonesia, di daerah Jombang, juga terdapat tentara Jepang, jika tentara Jepang mendatangi pondok pesantren Tebu Ireng, kendaraan yang dipakai oleh tentara jepang tersebut tidak bisa berjalan jika bannya disentuh oleh para santri dari KH. Hasyim Asyari.");
                }else {
                    pindahKonten.putExtra("konten", "Disamping aktif mengajar beliau juga aktif dalam berbagai kegiatan, baik yang bersifat lokal atau nasional. Pada tanggal 16 Sa’ban 1344 H/31 Januari 1926 M, di Jombang Jawa Timur didirikanlah Jam’iyah Nahdlotul Ulama’ (kebangkitan ulama) bersama KH. Bisri Syamsuri, KH. Wahab Hasbullah, dan ulama’-ulama’ besar lainnya, dengan azaz dan tujuannya: “Memegang dengan teguh pada salah satu dari madzhab empat yaitu Imam Muhammad bin Idris Asyafi’i, Imam Malik bin Anas, Imam Abu Hanifah An-Nu’am dan Ahmad bin Hambali. Dan juga mengerjakan apa saja yang menjadikan kemaslahatan agama Islam”. KH. Hasyim Asy’ari terpilih menjadi rois akbar NU, sebuah gelar sehingga kini tidak seorang pun menyandangnya. Beliau juga menyusun qanun asasi (peraturan dasar) NU yang mengembangkan faham ahli sunnah waljama’ah.\n" +
                            "\n" +
                            "Nahdlatul ulama’ sebagai suatu ikatan ulama’ seluruh Indonesia dan mengajarkan berjihad untuk keyakinan dengan sistem berorganisasi. Memang tidak mudah untuk menyatukan ulama’ yang berbeda-beda dalam sudut pandangnya, tetapi bukan Kiai Hasyim kalau menyerah begitu saja, bahwa beliau melihat perjuangan yang dilakukan sendiri-sendiri akan lebih besar membuka kesempatan musuh untuk menghancurkannya, baik penjajah atau mereka yang ingin memadamkan sinar dan syi’ar Islam di Indonesia, untuk mengadudomba antar sesama. Beliau sebagai orang yang tajam dan jauh pola pikirnya dalam hal ini, melihat bahaya yang akan dihadapkannya oleh umat Islam, dan oleh karena itu beliau berfikir mencari jalan keluarnya yaitu dengan membentuk sebuah organisasi dengan dasar-dasar yang dapat diterima oleh ulama’ulama lain.\n" +
                            "\n" +
                            "Jam’iyah ini berpegang pada faham ahlu sunnah wal jama’ah, yang mengakomodir pada batas-batas tertentu pola bermadzhab, yang belakangan lebih condong pada manhaj dari pada sekedar qauli. Pada dasawarsa pertama NU berorentasi pada persoalan agama dan kemasyarakatan. Kegiatan diarahkankan pada persoalan pendidikan, pengajian dan tabligh. Namun ketika memasuki dasawarsa kedua orentasi diperluas pada persoalan-persolan nasional. Hal tersebut terkait dengan keberadaannya sebagai anggota federasi Partai dan Perhimpunan Muslim Indonesia (MIAI) NU bahkan pada perjalanan sejarahnya pernah tampil sebagai salah satu partai polotik peserta pemilu, yang kemudian menyatu dengan PPP, peran NU dalam politik praktis ini kemudian diangulir dengan keputusan Muktamar Situbono yanh menghendaki NU sebagai organisasi sosial keagamaan kembali pada khitohnya.");
                }
                    startActivity(pindahKonten);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_6.getText());
                if(getIntent().getExtras().getBoolean("statusKaromah")){
                    pindahKonten.putExtra("konten","KH. Hasyim Asyari pernah di tahan oleh tentara Jepang. Jepang tidak menyukai KH. Hasyim Asyari karena KH. Hasyim Asyari mencela ibadah para tentara Jepang tersebut, yaitu setiap pagi para tentara Jepang wajib memberi penghormatan kepada matahari. Selama KH. Hasyim Asyari didalam tahanan, para santri beliau datang dan akhirnya pihak Jepang melepaskan beliau.\n" +
                            "\n" +
                            "KH. Hasyim Asyari memimpin musyawarah para ulama dan mengeluarkan resolusi jihad\n" +
                            "KH. Hasyim Asyari, disamping dikenal sebagai tokoh Islam dan pendiri NU, beliau juga dikenal sebagai pahlawan Nasional. Salah satu dari jasa beliau adalah mengenai peran serta beliau ketika terjadi perang kemerdekaan di Surabaya. Ketika itu, KH. Hasyim Asyari mengeluarkan resolusi jihad yang mewajibkan setiap orang Islam yang tempat tinggalnya berjarak dibawah 96 km dari Surabaya, mereka wajib datang ke Surabaya untuk berperang melawan penjajah. Akhirnya masyarakat Islam berbondong-bondong datang ke Surabaya dan tidak sedikit dari mereka datang dari daerah yang jauh . Meskipun tentara pejuang hanya menggunakan senjata seadanya tapi atas berkat do'a para ulama, Allah menurunkan pertolongannya sehingga tentara penjajah menderita kerugian besar pada saat perang tanggal 10 November yang kemudian diperingati sebagai hari Pahlawan oleh Bangsa Indonesia.");
                }else {
                    pindahKonten.putExtra("konten", "Peran KH. M. Hasyim Asy’ari tidak hanya terbatas pada bidang keilmuan dan keagamaan, melainkan juga dalam bidang sosial dan kebangsaan, beliau terlibat secara aktif dalam perjuangan membebaskan bangsa dari penjajah belanda.\n" +
                            "\n" +
                            "Pada tahun 1937 beliau didatangi pimpinan pemerintah belanda dengan memberikan bintang mas dan perak tanda kehormatan tetapi beliau menolaknya. Kemudian pada malam harinya beliau memberikan nasehat kepada santri-santrinya tentang kejadian tersebut dan menganalogkan dengan kejadian yang dialami Nabi Muhammad SAW yang ketika itu kaum Jahiliyah menawarinya dengan tiga hal, yaitu:\n" +
                            "\n" +
                            "    Kursi kedudukan yang tinggi dalam pemerintahan\n" +
                            "    Harta benda yang berlimpah-limpah\n" +
                            "    Gadis-gadis tercantik\n" +
                            "\n" +
                            "Akan tetapi Nabi SAW menolaknya bahkan berkata: “Demi Allah, jika mereka kuasa meletakkan matahari ditangan kananku dan bulan ditangan kiriku dengan tujuan agar aku berhenti dalam berjuang, aku tidak akan mau menerimanya bahkan nyawa taruhannya”. Akhir KH.M. Hasyim Asy’ari mengakhiri nasehat kepada santri-santrinya untuk selalu mengikuti dan menjadikan tauladan dari perbuat Nabi SAW.\n" +
                            "\n" +
                            "Masa-masa revolusi fisik di Tahun 1940, barang kali memang merupakan kurun waktu terberat bagi beliau. Pada masa penjajahan Jepang, beliau sempat ditahan oleh pemerintah fasisme Jepang. Dalam tahanan itu beliau mengalami penyiksaan fisik sehingga salah satu jari tangan beliau menjadi cacat. Tetapi justru pada kurun waktu itulah beliau menorehkan lembaran dalam tinta emas pada lembaran perjuangan bangsa dan Negara republik Indonesia, yaitu dengan diserukan resolusi jihad yang beliau memfatwakan pada tanggal 22 Oktober 1945, di Surabaya yang lebih dikenal dengan hari pahlawan nasional.\n" +
                            "\n" +
                            "Begitu pula masa penjajah Jepang, pada tahun 1942 Kiai Hasyim dipenjara (Jombang) dan dipindahkan penjara Mojokerto kemudian ditawan di Surabaya. Beliau dianggap sebagai penghalang pergerakan Jepang.\n" +
                            "\n" +
                            "Setelah Indonesia merdeka Pada tahun 1945 KH. M. Hasyim Asy’ari terpilih sebagai ketua umum dewan partai Majlis Syuro Muslimin Indonesia (MASYUMI) jabatan itu dipangkunya namun tetap mengajar di pesantren hingga beliau meninggal dunia pada tahun 1947.");
                }startActivity(pindahKonten);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_7.getText());
                pindahKonten.putExtra("konten","Hampir bersamaan dengan berdirinya Pondok Pesantren Tebuireng (1317 H/1899 M), KH. M. Hasyim Asya’ri menikah lagi dengan Nyai Nafiqoh putri Kiai Ilyas pengasuh Pondok Pesantren Sewulan Madiun. Dari perkawinan ini kiai hasyim dikaruniai 10 putra dan putri yaitu:\n" +
                        "\n" +
                        "    Hannah\n" +
                        "    Khoiriyah\n" +
                        "    Aisyah\n" +
                        "    Azzah\n" +
                        "    Abdul Wahid\n" +
                        "    Abdul hakim (Abdul Kholiq)\n" +
                        "    Abdul Karim\n" +
                        "    Ubaidillah\n" +
                        "    Mashurroh\n" +
                        "    Muhammad Yusuf.\n" +
                        "\n" +
                        "Menjelang akhir Tahun 1930, KH. M. Hasyim Asya’ri menikah kembali denagn Nyai Masruroh, putri Kiai Hasan, pengasuh Pondok Pesantren Kapurejo, Kecamatan Pagu Kediri, dari pernikahan tersebut, beliua dikarunia 4 orang putra-putri yaitu:\n" +
                        "\n" +
                        "    Abdul Qodir\n" +
                        "    Fatimah\n" +
                        "    Chotijah\n" +
                        "    Muhammad Ya’kub\n" +
                        "\n" +
                        "Garis keturunan KH. M. Hasyim Asy’ari (Nenek ke-sembilan )\n" +
                        "\n" +
                        "Muhammad Hasyim bin Asy’ari bin Abdul Wahid (Pangeran Sambo) bin Abdul Halim (Pangeran Benowo) bin Abdul Rahman (Mas Karebet/Jaga Tingkir) yang kemudian bergelar Sultan Hadiwijaya bin Abdullah (Lembu Peteng) yang bergelar Brawijaya VI");
                startActivity(pindahKonten);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_8.getText());
                pindahKonten.putExtra("konten","Pada Tanggal 7 Ramadhan 1366 M. jam 9 malam, beliau setelah mengimami Shalat Tarawih, sebagaimana biasanya duduk di kursi untuk memberikan pengajian kepada ibu-ibu muslimat. Tak lama kemudian, tiba-tiba datanglah seorang tamu utusan Jenderal Sudirman dan Bung Tomo. Sang Kiai menemui utusan tersebut dengan didampingi Kiai Ghufron, kemudian tamu itu menyampaikan pesan berupa surat. Entah apa isi surat itu, yang jelas Kiai Hasyim meminta waktu semalam untuk berfikir dan jawabannya akan diberikan keesokan harinya.\n" +
                        "\n" +
                        "Namun kemudian, Kiai Ghufron melaporkan situasi pertempuran dan kondisi pejuang yang semakin tersudut, serta korban rakyat sipil yang kian meningkat. Mendengar laporan itu, Kiai Hasyim berkata, “Masya Allah, Masya Allah…” kemudian beliau memegang kepalanya dan ditafsirkan oleh Kiai Ghufron bahwa beliau sedang mengantuk. Sehingga para tamu pamit keluar. Akan tetapi, beliau tidak menjawab, sehingga Kiai Ghufron mendekat dan kemudian meminta kedua tamu tersebut untuk meninggalkan tempat, sedangkan dia sendiri tetap berada di samping Kiai Hasyim Asy’ari. Tak lama kemudian, Kiai Ghufron baru menyadari bahwa Kiai Hasiyim tidak sadarkan diri. Sehingga dengan tergopoh-gopoh, ia memanggil keluarga dan membujurkan tubuh Kiai Hasyim. Pada saat itu, putra-putri beliau tidak berada di tempat, misalnya Kiai Yusuf Hasyim yang pada saat itu sedang berada di markas tentara pejuang, walaupun kemudian dapat hadir dan dokter didatangkan (Dokter Angka Nitisastro).\n" +
                        "\n" +
                        "Tak lama kemudian baru diketahui bahwa Kiai Hasyim terkena pendarahan otak. Walaupun dokter telah berusaha mengurangi penyakitnya, namun Tuhan berkehendak lain pada kekasihnya itu. KH.M. Hasyim Asy’ari wafat pada pukul 03.00 pagi, Tanggal 25 Juli 1947, bertepatan dengan Tanggal 07 Ramadhan 1366 H. Inna LiLlahi wa Inna Ilaihi Raji’un.\n" +
                        "\n" +
                        "Kepergian belaiu ketempat peristirahatan terakhir, diantarkan bela sungkawa yang amat dalam dari hampir seluruh lapisan masyarakat, terutama dari para pejabat sipil maupun militer, kawan seperjuangan, para ulama, warga NU, dan khususnya para santri Tebuireng. Umat Islam telah kehilangan pemimpin besarnya yang kini berbaring di pusara beliau di tenggah Pesantrn Tebuireng. Pada saat mengantar kepergianya, shahabat dan saudara beliau, KH. Wahab hazbulloh, sempat mengemukakan kata sambutan yang pada intinya menjelaskan prinsip hidup belaiu, yakni, “berjuang terus dengan tiada mengenal surut, dan kalau perlu zonder istirahat”.");
                startActivity(pindahKonten);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_9.getText());
                pindahKonten.putExtra("konten","Peninggalan lain yang sangat berharga adalah sejumlah kitab yang beliau tulis disela-sela kehidupan beliau didalam mendidik santri, mengayomi ribuan umat, membela dan memperjuangkan bumi pertiwi dari penjajahan. Ini merupakan bukti riil dari sikap dan perilakunya, pemikirannya dapat dilacak dalam beberapa karyanya yang rata-rata berbahasa Arab.\n" +
                        "\n" +
                        "Tetapi sangat disayangkan, karena kurang lengkapnya dokumentasi, kitab-kitab yang sangat berharga itu lenyap tak tentu rimbanya. Sebenarnya, kitab yang beliau tulis tidak kurang dari dua puluhan judul. Namun diakungkan yang bisa diselamatkan hanya beberapa judul saja, diantaranya:\n" +
                        "\n" +
                        "    Al-Nurul Mubin Fi Mahabati Sayyidi Mursalin. Kajian kewajiban beriman, mentaati, mentauladani, berlaku ikhlas, mencinatai Nabi SAW sekaligus sejarah hidupnya\n" +
                        "    Al-Tanbihat al-Wajibat Liman Yashna’u al-Maulida Bi al-Munkarat. Kajian mengenai maulid nabi dalam kaitannya dengan amar ma’ruf nahi mungkar\n" +
                        "    Risalah Ahli Sunnah Wal Jama’ah. Kajian mengenai pandangan terhadap bid’ah, Konsisi salah satu madzhab, dan pecahnya umat menjadi 73 golongan\n" +
                        "    Al-Durasul Muntasyiroh Fi Masail Tis’a ‘asyaraoh. Kajian tentang wali dan thoriqoh yang terangkum dalam sembilan belas permasalahan.\n" +
                        "    Al-Tibyan Fi Nahyi’an Muqatha’ah al-Arham Wa al-Aqrab Wa al-Akhwal. Kajian tentang pentingnya jalinan silaturahmi antar sesama manusia\n" +
                        "    Adabul ‘Alim Wa Muata’alim. Pandangan tentang etika belajar dan mengajar didalam pendidikan pesantrren pada khususnya\n" +
                        "    Dlau’ al-Misbah Fi Bayani Ahkami Nikah. Kajian hukum-hukum nikah, syarat, rukun, dan hak-hak dalam perkawinan\n" +
                        "    Ziyadah Ta’liqot. Kitab yang berisikan polemic beliau dengan syaikh Abdullah bin yasir Pasuruaan");
                startActivity(pindahKonten);
            }
        });

        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKonten = new Intent(KisahPerjalananActivity.this,KontenActvity.class);
                pindahKonten.putExtra("titlebar",btn_10.getText());
                pindahKonten.putExtra("konten"," Tepat pada tanggal 21-22 Oktober 1945, KH Hasyim Asyari mengumpulkan wakil-wakil dari cabang NU di seluruh Jawa dan Madura di Surabaya. Dalam pertemuan tersebut, diputuskan bahwa melawan penjajah sebagai perang suci dan hukumnya fardu ain. Saat ini populer dengan istilah resolusi jihad.\n" +
                        "\n" +
                        "Setelah resolusi jihad dicetuskan, ribuan kyai dan santri bergerak ke Surabaya. Pada 10 November 1945 atau tepatnya dua minggu setelah resolusi jihad dikumandangkan, meletuslah peperangan sengit antara pasukan Inggris melawan tentara pribumi dan juga warga sipil yang cuma bersenjatakan bambu runcing. Konon, ini adalah perang terbesar sepanjang sejarah Nusantara. (sumber : merdeka.com)\n" +
                        "\n" +
                        "Menurut KH. Wahab hasbullah prinsip hidup KH Hasyim Asyari yaitu : \"berjuang terus dengan tiada mengenal surut, lelah dan istirahat\".\n" +
                        "\n" +
                        "Salah satu prinsip semangat juang KH Hasyim Asy’ari di dasari dari hadist Rasulullah yaitu: “Demi Allah, jika mereka kuasa meletakkan matahari ditangan kananku dan bulan ditangan kiriku dengan tujuan agar aku berhenti dalam berjuang, aku tidak akan mau menerimanya bahkan nyawa taruhannya” (Al-Hadist).\n" +
                        "\n" +
                        "KHM Hasyim Asy’ari senantiasa mengingatkan kepada santri-santrinya untuk selalu mengikuti dan menjadikan tauladan dari perbuat Nabi Muhammad saw.");
                startActivity(pindahKonten);
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
