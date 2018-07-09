package io.geekfarmer.omdb;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shashank.sony.fancyaboutpagelib.FancyAboutPage;

public class AboutActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setTitle("About Page");
      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        FancyAboutPage fancyAboutPage=findViewById(R.id.fancyaboutpage);
        //fancyAboutPage.setCoverTintColor(Color.BLUE); //Optional
        fancyAboutPage.setCover(R.drawable.coverpage);
        fancyAboutPage.setName("Anurag Patel");
        fancyAboutPage.setDescription("Fresher | Android Developer | Interested in Computer Vision and Deep Learning");
        fancyAboutPage.setAppIcon(R.drawable.anu);
        fancyAboutPage.setAppName("OMDB");
        fancyAboutPage.setVersionNameAsAppSubTitle("1.0.1");
        fancyAboutPage.setAppDescription("My Genuine pleasure is making my idea into a software that reaches million people and to know more about me and my projects click on my github page link above.\n\n" +
                "I build many of small apps but two major android app built by me are.....\n\n"+
                "https://play.google.com/store/apps/details?id=com.inertialelements.xoblu\n\n"+
                "https://play.google.com/store/apps/details?id=com.tricktekno.equifest.equifest");
        fancyAboutPage.addEmailLink("anuragpatel.optnio@gmail.com");
        fancyAboutPage.addFacebookLink("https://www.facebook.com/optnio00");
        fancyAboutPage.addTwitterLink("https://twitter.com/optnio");
        fancyAboutPage.addLinkedinLink("https://www.linkedin.com/in/geekfarmer/");
        fancyAboutPage.addGitHubLink("https://geekfarmer.github.io");

    }
}
