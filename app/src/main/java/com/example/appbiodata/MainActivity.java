package com.example.appbiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void kirimEmail (View view) {
        Uri tabEmail = Uri.parse("mailto:raihannadhif14@gmail.com");
        Intent Email = new Intent(Intent.ACTION_SENDTO, tabEmail);
        startActivity(Email);
    }

    public void kirimTelpon(View view) {
        Uri tabTelpon = Uri.parse("telpon : 082241826719");
        Intent Telpon = new Intent(Intent.ACTION_DIAL, tabTelpon);
        startActivity(Telpon);
    }

    public void TampilMaps(View view) {
        Uri tabMaps = Uri.parse("geo:-7.026454985003491, 110.46481487949387?q=Komplek.+Graha Wahid+ClusterMadrid,+Kedungmundu,+Kec.+Tembalang.,+Semarang,+Jawa+Tengah+50273");
        Intent Maps = new Intent(Intent.ACTION_VIEW, tabMaps);
        startActivity(Maps);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}