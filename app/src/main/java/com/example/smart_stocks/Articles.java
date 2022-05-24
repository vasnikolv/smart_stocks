package com.example.smart_stocks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Articles extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_articles, container);

        View btnToSiteOf1Broker = view.findViewById(R.id.sber);
        btnToSiteOf1Broker.setOnClickListener(view_of_1_broker -> {
            Uri uri = Uri.parse("https://www.sberbank.ru/ru/person/investments/sber_invest");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToOf2Broker = view.findViewById(R.id.tink);
        btnToOf2Broker.setOnClickListener(view_of_2_broker -> {
            Uri uri = Uri.parse("https://www.tinkoff.ru/invest/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToSiteOf3Broker = view.findViewById(R.id.bcs);
        btnToSiteOf3Broker.setOnClickListener(view_of_3_broker -> {
            Uri uri = Uri.parse("https://bcs.ru");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToOf4Broker = view.findViewById(R.id.finam);
        btnToOf4Broker.setOnClickListener(view_of_4_broker -> {
            Uri uri = Uri.parse("https://finam.ru");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToFirstNew = view.findViewById(R.id.rus_new_1);
        btnToFirstNew.setOnClickListener(view_of_first_new -> {
            Intent intent = new Intent(getContext(), MainActivity.FirstNew.class);
            startActivity(intent);
        });


        View btnToSecondNew = view.findViewById(R.id.rus_new_2);
        btnToSecondNew.setOnClickListener(view_ -> {
            Intent intent = new Intent(getContext(), SecondNew.class);
            startActivity(intent);
        });

        return view;
    }
}
