package com.example.smart_stocks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class ActivityPolusInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_polus_info);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(26, 12824),
                new DataPoint(27, 13000),
                new DataPoint(28, 13900),
                new DataPoint(29, 13200),
                new DataPoint(30, 13100),
//                new DataPoint(31, 13500),
//                new DataPoint(1, 13300),
//                new DataPoint(2, 13400),
//                new DataPoint(3, 12700),
//                new DataPoint(4, 12500),
//                new DataPoint(5, 13200),
//                new DataPoint(6, 13200)

        });
        graph.addSeries(series);

}}
