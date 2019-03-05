package com.example.animals_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int bt1=0,bt2=0,bt3=0,bt4=0,bt5=0,bt6=0;
    int cnt=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abt(View view) {
        if(bt1>0)
            return;
        bt1++;
        cnt++;
        ((ImageView)findViewById(R.id.i1)).setImageDrawable(getResources().getDrawable(R.drawable.piaa));
        if(cnt==6){
            Toast toastCenter = Toast.makeText(getApplicationContext(),"You are win!",Toast.LENGTH_LONG);

            toastCenter.setGravity(Gravity.CENTER,0,0);

            toastCenter.show();
        }
    }

    public void bbt(View view) {
        if(bt2>0)
            return;
        bt2++;
        cnt++;
        ((ImageView)findViewById(R.id.i2)).setImageDrawable(getResources().getDrawable(R.drawable.pibb));
        if(cnt==6){
            Toast toastCenter = Toast.makeText(getApplicationContext(),"You are win!",Toast.LENGTH_LONG);

            toastCenter.setGravity(Gravity.CENTER,0,0);

            toastCenter.show();
        }
    }

    public void cbt(View view) {
        if(bt3>0)
            return;
        bt3++;
        cnt++;
        ((ImageView)findViewById(R.id.i3)).setImageDrawable(getResources().getDrawable(R.drawable.picc));
        if(cnt==6){
            Toast toastCenter = Toast.makeText(getApplicationContext(),"You are win!",Toast.LENGTH_LONG);

            toastCenter.setGravity(Gravity.CENTER,0,0);

            toastCenter.show();
        }
    }

    public void dbt(View view) {
        if(bt4>0)
            return;
        bt4++;
        cnt++;
        ((ImageView)findViewById(R.id.i4)).setImageDrawable(getResources().getDrawable(R.drawable.pidd));
        if(cnt==6){
            Toast toastCenter = Toast.makeText(getApplicationContext(),"You are win!",Toast.LENGTH_LONG);

            toastCenter.setGravity(Gravity.CENTER,0,0);

            toastCenter.show();
        }
    }

    public void ebt(View view) {
        if(bt5>0)
            return;
        bt5++;
        cnt++;
        ((ImageView)findViewById(R.id.i5)).setImageDrawable(getResources().getDrawable(R.drawable.piee));
        if(cnt==6){
            Toast toastCenter = Toast.makeText(getApplicationContext(),"You are win!",Toast.LENGTH_LONG);

            toastCenter.setGravity(Gravity.CENTER,0,0);

            toastCenter.show();
        }
    }

    public void fbt(View view) {
        if(bt6>0)
            return;
        bt6++;
        cnt++;
        ((ImageView)findViewById(R.id.i6)).setImageDrawable(getResources().getDrawable(R.drawable.piff));
        if(cnt==6){
            Toast toastCenter = Toast.makeText(getApplicationContext(),"You are win!",Toast.LENGTH_LONG);

            toastCenter.setGravity(Gravity.CENTER,0,0);

            toastCenter.show();
        }
    }

    public void abut(View view){
        ((ImageView)findViewById(R.id.i1)).setImageDrawable(getResources().getDrawable(R.drawable.pia));
        ((ImageView)findViewById(R.id.i2)).setImageDrawable(getResources().getDrawable(R.drawable.pib));
        ((ImageView)findViewById(R.id.i3)).setImageDrawable(getResources().getDrawable(R.drawable.pic));
        ((ImageView)findViewById(R.id.i4)).setImageDrawable(getResources().getDrawable(R.drawable.pid));
        ((ImageView)findViewById(R.id.i5)).setImageDrawable(getResources().getDrawable(R.drawable.pie));
        ((ImageView)findViewById(R.id.i6)).setImageDrawable(getResources().getDrawable(R.drawable.pif));
        bt1=0;
        bt2=0;
        bt3=0;
        bt4=0;
        bt5=0;
        bt6=0;
        cnt=0;
    }
}
