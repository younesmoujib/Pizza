package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView share=findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            String text="tap your text";
            @Override
            public void onClick(View v) {
                String url = "https://api.whatsapp.com/send?phone="  + "&text=" + text;

                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    // Gérez l'exception si WhatsApp n'est pas installé.
                    Toast.makeText(MainActivity2.this, "WhatsApp is not installed!", Toast.LENGTH_SHORT).show();

                }}
        });

        Intent intent=this.getIntent();
        if(intent !=null){
            String nom = intent.getStringExtra("nom");

            int img=intent.getIntExtra("img",R.drawable.ic_launcher_background);
            String desc=intent.getStringExtra("desc");
            String ingr=intent.getStringExtra("ingr");

            ImageView i=findViewById(R.id.image);
            TextView n=findViewById(R.id.nom1);
            TextView d=findViewById(R.id.desc);
            TextView in=findViewById(R.id.ingr);
            n.setText(nom);
            i.setImageResource(img);
            d.setText(desc);
            in.setText(ingr);
        }
    }
    private boolean isAppInstalled(String packageName) {
        PackageManager packageManager = getPackageManager();
        boolean isInstalled;

        try {
            packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            isInstalled = true;
        } catch (PackageManager.NameNotFoundException e) {
            isInstalled = false;
            e.printStackTrace();
        }
        return isInstalled;
    }
}