package com.applikeysolutions.cosmocalendar.sample;

import androidx.appcompat.app.AppCompatActivity;
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
        calendarView.setSelectedDayBackgroundColor(getResources().getColor(R.color.black));
        calendarView.setSelectedDayBackgroundStartColor(getResources().getColor(R.color.black));
        calendarView.setSelectedDayBackgroundEndColor(getResources().getColor(R.color.black));
        calendarView.setDayTextColor(getResources().getColor(R.color.black));
        calendarView.setSelectedDayTextColor(getResources().getColor(android.R.color.white));
    }
}
