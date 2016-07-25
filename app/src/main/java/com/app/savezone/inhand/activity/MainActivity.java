package com.app.savezone.inhand.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.savezone.inhand.R;
import com.app.savezone.inhand.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContrainer, new MainFragment())
                    .commit();
        }
    }
}
