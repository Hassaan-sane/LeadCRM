package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hassaan.leadcrm.Activities.DetailTaskActivity;
import com.example.hassaan.leadcrm.MainActivity;
import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.TaskRepo;
import com.example.hassaan.leadcrm.TableClasses.Task;
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


public class HomeFragment extends Fragment {

    AgendaCalendarView mAgendaCalendarView;
    List<CalendarEvent> eventList;
    List<Task> tasks;
    Calendar minDate;
    Calendar maxDate;

    private int i=0;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mAgendaCalendarView = view.findViewById(R.id.agenda_calendar_view);

        new MyAsyncTask().execute(eventList);

        return view;
    }




    private class MyAsyncTask extends AsyncTask<List<CalendarEvent>, Integer, Long> implements CalendarPickerController {

        @Override
        protected Long doInBackground(List<CalendarEvent>... lists) {

            TaskRepo taskRepo= new TaskRepo();

            minDate = Calendar.getInstance();
            maxDate = Calendar.getInstance();

            minDate.add(Calendar.MONTH, -1);
            minDate.set(Calendar.DAY_OF_MONTH, 1);
            maxDate.add(Calendar.YEAR, 1);

            eventList = new ArrayList<>();
            tasks=taskRepo.getTaskList();

            Calendar startTime1 = Calendar.getInstance();
            Calendar endTime1 = Calendar.getInstance();

            endTime1.add(Calendar.MONTH, 1);
            BaseCalendarEvent event1;
            for (Task task:tasks) {
               event1  = new BaseCalendarEvent(task.getSubject(), "A wonderful journey! ", "Pakistan",
                        ContextCompat.getColor(getContext(), R.color.orange_dark), startTime1, endTime1, true);

                eventList.add(event1);

            }

//
//            Calendar startTime2 = Calendar.getInstance();
//            startTime2.add(Calendar.DAY_OF_YEAR, 1);
//            Calendar endTime2 = Calendar.getInstance();
//            endTime2.add(Calendar.DAY_OF_YEAR, 3);
////
//            BaseCalendarEvent event2 = new BaseCalendarEvent("Visit to Dalvík", "A beautiful small town", "Dalvík",
//                    ContextCompat.getColor(getContext(), R.color.yellow), startTime2, endTime2, true);
//            eventList.add(event2);

            return null;
        }

        @Override
        protected void onPostExecute(Long aLong) {
            super.onPostExecute(aLong);
            mAgendaCalendarView.init(eventList, minDate, maxDate, Locale.getDefault(), this);
        }

        @Override
        public void onDaySelected(DayItem dayItem) {

        }

        @Override
        public void onEventSelected(CalendarEvent event) {
//            Intent intent = new Intent(getContext(), DetailTaskActivity.class);
//            intent.putExtra("TaskPosition",i);
//            startActivity(intent);

            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container, new TasksFragment()).commit();

        }

        @Override
        public void onScrollToDate(Calendar calendar) {

        }
    }
}
