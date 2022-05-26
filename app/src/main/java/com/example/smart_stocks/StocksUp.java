package com.example.smart_stocks;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class StocksUp extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stocks_up, container, false);

//        btnToSecondNew.setOnClickListener(view_ -> {
//            getFragmentManager().beginTransaction().setCustomAnimations(
//                            R.anim.slide_in,  // enter
//                            R.anim.fade_out,  // exit
//                            R.anim.fade_in,   // popEnter
//                            R.anim.slide_out  // popExit
//                    )
//                    .replace(R.id.fragment_container, new PolusInfo()).commit();
//        });

        View btnToSecondNew = view.findViewById(R.id.polus);
        btnToSecondNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),ActivityPolusInfo.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
