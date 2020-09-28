package com.rabie.cornyjoke;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class JokeFragment extends Fragment {
    JokeModel joke;

    public JokeFragment(JokeModel joke) {
        this.joke = joke;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fetched_joke_fragment, container, false);
        TextView presentedJoke = (TextView) fragmentView.findViewById(R.id.presented_joke);
        presentedJoke.setText(joke.getJoke_content());
        Button minusButton = (Button) fragmentView.findViewById(R.id.minus_button);
        minusButton.setText(String.valueOf(joke.getJoke_downvotes()));
        Button plusButton = (Button) fragmentView.findViewById(R.id.plus_button);
        plusButton.setText(String.valueOf(joke.getJoke_upvotes()));
        return fragmentView;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
