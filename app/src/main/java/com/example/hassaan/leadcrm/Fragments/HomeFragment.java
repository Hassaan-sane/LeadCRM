package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hassaan.leadcrm.R;
import com.github.tibolte.agendacalendarview.AgendaCalendarView;
import com.github.tibolte.agendacalendarview.CalendarPickerController;
import com.github.tibolte.agendacalendarview.models.BaseCalendarEvent;
import com.github.tibolte.agendacalendarview.models.CalendarEvent;
import com.github.tibolte.agendacalendarview.models.DayItem;

import java.net.URL;
import java.security.AlgorithmParameterGenerator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;


public class HomeFragment extends Fragment implements CalendarPickerController {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        AgendaCalendarView mAgendaCalendarView = view.findViewById(R.id.agenda_calendar_view);

        Calendar minDate = Calendar.getInstance();
        Calendar maxDate = Calendar.getInstance();

        minDate.add(Calendar.MONTH, -1);
        minDate.set(Calendar.DAY_OF_MONTH, 1);
        maxDate.add(Calendar.YEAR, 1);

        List<CalendarEvent> eventList = new ArrayList<>();
        new MyAsyncTask().execute(eventList);


        mAgendaCalendarView.init(eventList, minDate, maxDate, Locale.getDefault(), this);
        return view;
    }


    @Override
    public void onDaySelected(DayItem dayItem) {

    }

    @Override
    public void onEventSelected(CalendarEvent event) {

    }

    @Override
    public void onScrollToDate(Calendar calendar) {

    }

    private class MyAsyncTask extends AsyncTask<List<CalendarEvent>, Integer, Long> {

        @Override
        protected Long doInBackground(List<CalendarEvent>... lists) {
            List<CalendarEvent> eventList = new ArrayList<>();
            Calendar startTime1 = Calendar.getInstance();
            Calendar endTime1 = Calendar.getInstance();
            endTime1.add(Calendar.MONTH, 1);
            BaseCalendarEvent event1 = new BaseCalendarEvent("Thibault travels in Iceland", "A wonderful journey!", "Iceland",
                    ContextCompat.getColor(getContext(), R.color.orange_dark), startTime1, endTime1, true);
            eventList.add(event1);

            Calendar startTime2 = Calendar.getInstance();
            startTime2.add(Calendar.DAY_OF_YEAR, 1);
            Calendar endTime2 = Calendar.getInstance();
            endTime2.add(Calendar.DAY_OF_YEAR, 3);
            BaseCalendarEvent event2 = new BaseCalendarEvent("Visit to Dalvík", "A beautiful small town", "Dalvík",
                    ContextCompat.getColor(getContext(), R.color.yellow), startTime2, endTime2, true);
            eventList.add(event2);

            return null;
        }
    }
}
