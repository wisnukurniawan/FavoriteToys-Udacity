package com.wisnu_krn.favoritebooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wisnu_krn.favoritebooks.models.ToyBox;

public class MainActivity extends AppCompatActivity {
    private TextView mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToysListTextView = (TextView) findViewById(R.id.tv_toy_name);

        String[] toyNames = ToyBox.getToyName();

        for (String toyName : toyNames){
            mToysListTextView.append(toyName + "\n\n\n");
        }
    }
}
