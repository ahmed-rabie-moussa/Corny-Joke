package com.rabie.cornyjoke;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_screen);
    }

    public void getAJoke(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        JokeFragment jokeFragment = new JokeFragment(new JokeModel(1, "ed7ak b2a ya sa7by batal 8abawa", 0, 0));
        fragmentTransaction.replace(R.id.upperJokeFragment, jokeFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}