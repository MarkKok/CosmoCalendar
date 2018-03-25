package com.applikeysolutions.cosmocalendar.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.applikeysolutions.cosmocalendar.utils.SelectionType;
import com.applikeysolutions.cosmocalendar.view.CalendarView;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setSelectionType(SelectionType.RANGE);
        Set<Long> disabledDays = new HashSet<>();
        Calendar calendar = Calendar.getInstance();

        disabledDays.add(1521974647046L);
        calendarView.setDisabledDays(disabledDays);
        //calendarView.setDisabledDayTextColor(getResources().getColor(android.R.color.holo_red_light));
        //calendarView.setOtherDayTextColor(getResources().getColor(android.R.color.transparent));
    }
}
