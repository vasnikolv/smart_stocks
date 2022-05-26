package com.example.smart_stocks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Articles extends Fragment {
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_articles, container, false);

        View btnToSiteOf1Broker = view.findViewById(R.id.first_best_broker);
        btnToSiteOf1Broker.setOnClickListener(view_of_1_broker -> {
            Uri uri = Uri.parse("https://www.sberbank.ru/ru/person/investments/sber_invest");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToCommentOf1Broker = view.findViewById(R.id.first_best_broker_comments);
        btnToCommentOf1Broker.setOnClickListener(view_of_1_broker_comments -> {
            Uri uri = Uri.parse("https://www.banki.ru/services/responses/bank/sberbank/product/investments/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToOf2Broker = view.findViewById(R.id.second_best_broker);
        btnToOf2Broker.setOnClickListener(view_of_2_broker -> {
            Uri uri = Uri.parse("https://www.tinkoff.ru/invest/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToCommentOf2Broker = view.findViewById(R.id.second_best_broker_comments);
        btnToCommentOf2Broker.setOnClickListener(view_of_2_broker_comments -> {
            Uri uri = Uri.parse("https://www.banki.ru/investment/responses/company/broker/tcs/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToSiteOf3Broker = view.findViewById(R.id.third_best_broker);
        btnToSiteOf3Broker.setOnClickListener(view_of_3_broker -> {
            Uri uri = Uri.parse("https://bcs.ru");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToCommentOf3Broker = view.findViewById(R.id.third_best_broker_comments);
        btnToCommentOf3Broker.setOnClickListener(view_of_3_broker_comments -> {
            Uri uri = Uri.parse("https://www.banki.ru/investment/responses/company/broker/bks/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToOf4Broker = view.findViewById(R.id.fourth_best_broker);
        btnToOf4Broker.setOnClickListener(view_of_4_broker -> {
            Uri uri = Uri.parse("https://finam.ru");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToCommentOf4Broker = view.findViewById(R.id.fourth_best_broker_comments);
        btnToCommentOf4Broker.setOnClickListener(view_of_4_broker_comments -> {
            Uri uri = Uri.parse("https://www.banki.ru/investment/responses/company/broker/finam/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        View btnToFirstNew = view.findViewById(R.id.rus_new_1);
        btnToFirstNew.setOnClickListener(view_of_first_new -> {
            getFragmentManager().beginTransaction().setCustomAnimations(
                            R.anim.slide_in,  // enter
                            R.anim.fade_out,  // exit
                            R.anim.fade_in,   // popEnter
                            R.anim.slide_out  // popExit
                    )
                    .replace(R.id.fragment_container, new FirstNew()).commit();

        });


        View btnToSecondNew = view.findViewById(R.id.rus_new_2);
        btnToSecondNew.setOnClickListener(view_ -> {
            getFragmentManager().beginTransaction().setCustomAnimations(
                            R.anim.slide_in,  // enter
                            R.anim.fade_out,  // exit
                            R.anim.fade_in,   // popEnter
                            R.anim.slide_out  // popExit
                    )
                    .replace(R.id.fragment_container, new SecondNew()).commit();
        });

        String titlesTo1New[] = {getResources().getString(R.string.articles_rus_new_1_title_1), getResources().getString(R.string.articles_rus_new_1_title_2), getResources().getString(R.string.articles_rus_new_1_title_3), getResources().getString(R.string.articles_rus_new_1_title_4), getResources().getString(R.string.articles_rus_new_1_title_5), getResources().getString(R.string.articles_rus_new_1_title_6)};
        String titlesTo2New[] = {getResources().getString(R.string.articles_rus_new_2_title_1), getResources().getString(R.string.articles_rus_new_2_title_2), getResources().getString(R.string.articles_rus_new_2_title_3), getResources().getString(R.string.articles_rus_new_2_title_4), getResources().getString(R.string.articles_rus_new_2_title_5), getResources().getString(R.string.articles_rus_new_2_title_6)};
        String titlesTo3New[] = {getResources().getString(R.string.articles_rus_new_3_title_1), getResources().getString(R.string.articles_rus_new_3_title_2), getResources().getString(R.string.articles_rus_new_3_title_3), getResources().getString(R.string.articles_rus_new_3_title_4), getResources().getString(R.string.articles_rus_new_3_title_5), getResources().getString(R.string.articles_rus_new_3_title_6)};
        String titlesTo4New[] = {getResources().getString(R.string.articles_rus_new_4_title_1), getResources().getString(R.string.articles_rus_new_4_title_2), getResources().getString(R.string.articles_rus_new_4_title_3), getResources().getString(R.string.articles_rus_new_5_title_4), getResources().getString(R.string.articles_rus_new_4_title_5), getResources().getString(R.string.articles_rus_new_4_title_6)};
        String titlesTo5New[] = {getResources().getString(R.string.articles_rus_new_5_title_1), getResources().getString(R.string.articles_rus_new_5_title_2), getResources().getString(R.string.articles_rus_new_5_title_3), getResources().getString(R.string.articles_rus_new_5_title_4), getResources().getString(R.string.articles_rus_new_5_title_5), getResources().getString(R.string.articles_rus_new_5_title_6)};

        String datesTo1New[] = {getResources().getString(R.string.articles_rus_new_1_date_1), getResources().getString(R.string.articles_rus_new_1_date_2), getResources().getString(R.string.articles_rus_new_1_date_3), getResources().getString(R.string.articles_rus_new_1_date_4), getResources().getString(R.string.articles_rus_new_1_date_5), getResources().getString(R.string.articles_rus_new_1_date_6)};
        String datesTo2New[] = {getResources().getString(R.string.articles_rus_new_2_date_1), getResources().getString(R.string.articles_rus_new_2_date_2), getResources().getString(R.string.articles_rus_new_2_date_3), getResources().getString(R.string.articles_rus_new_2_date_4), getResources().getString(R.string.articles_rus_new_2_date_5), getResources().getString(R.string.articles_rus_new_2_date_6)};
        String datesTo3New[] = {getResources().getString(R.string.articles_rus_new_3_date_1), getResources().getString(R.string.articles_rus_new_3_date_2), getResources().getString(R.string.articles_rus_new_3_date_3), getResources().getString(R.string.articles_rus_new_3_date_4), getResources().getString(R.string.articles_rus_new_3_date_5), getResources().getString(R.string.articles_rus_new_3_date_6)};
        String datesTo4New[] = {getResources().getString(R.string.articles_rus_new_4_date_1), getResources().getString(R.string.articles_rus_new_4_date_2), getResources().getString(R.string.articles_rus_new_4_date_3), getResources().getString(R.string.articles_rus_new_4_date_4), getResources().getString(R.string.articles_rus_new_4_date_5), getResources().getString(R.string.articles_rus_new_4_date_6)};
        String datesTo5New[] = {getResources().getString(R.string.articles_rus_new_5_date_1), getResources().getString(R.string.articles_rus_new_5_date_2), getResources().getString(R.string.articles_rus_new_5_date_3), getResources().getString(R.string.articles_rus_new_5_date_4), getResources().getString(R.string.articles_rus_new_5_date_5), getResources().getString(R.string.articles_rus_new_5_date_6)};



        TextView rusNew1Title = view.findViewById(R.id.rus_new_1_title);
        TextView rusNew2Title = view.findViewById(R.id.rus_new_2_title);
        TextView rusNew3Title = view.findViewById(R.id.rus_new_3_title);
        TextView rusNew4Title = view.findViewById(R.id.rus_new_4_title);
        TextView rusNew5Title = view.findViewById(R.id.rus_new_5_title);
        TextView rusNew1Date = view.findViewById(R.id.rus_new_1_date);
        TextView rusNew2Date = view.findViewById(R.id.rus_new_2_date);
        TextView rusNew3Date = view.findViewById(R.id.rus_new_3_date);
        TextView rusNew4Date = view.findViewById(R.id.rus_new_4_date);
        TextView rusNew5Date = view.findViewById(R.id.rus_new_5_date);

        View btnUpdater = view.findViewById(R.id.updater_button);
        btnUpdater.setOnClickListener(new View.OnClickListener() {
            public int q = 1;
            @Override
            public void onClick(View v) {
                rusNew1Title.setText(String.valueOf(titlesTo1New[q]));
                rusNew2Title.setText(String.valueOf(titlesTo2New[q]));
                rusNew3Title.setText(String.valueOf(titlesTo3New[q]));
                rusNew4Title.setText(String.valueOf(titlesTo4New[q]));
                rusNew5Title.setText(String.valueOf(titlesTo5New[q]));

                rusNew1Date.setText(String.valueOf(datesTo1New[q]));
                rusNew2Date.setText(String.valueOf(datesTo2New[q]));
                rusNew3Date.setText(String.valueOf(datesTo3New[q]));
                rusNew4Date.setText(String.valueOf(datesTo4New[q]));
                rusNew5Date.setText(String.valueOf(datesTo5New[q]));

                q++;
                if (q >= titlesTo1New.length) q = 0;
            }
        });


        return view;
    }


}
