package com.example.hassaan.leadcrm.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.NoteRepo;
import com.example.hassaan.leadcrm.TableClasses.Note;

import java.util.Calendar;

public class AddNoteActivity extends AppCompatActivity {

    EditText et_title_note, et_description_note;
    String Tittle, Desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        et_title_note = findViewById(R.id.et_title_note);
        et_description_note = findViewById(R.id.et_description_note);
        if (getIntent() != null) {
            Tittle = getIntent().getStringExtra("Title");
            Desc = getIntent().getStringExtra("Description");
        }
        et_title_note.setText(Tittle);
        et_description_note.setText(Desc);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ok_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.ok) {
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
            Note note = new Note();
            NoteRepo noteRepo = new NoteRepo();
            note.setTitleName(et_title_note.getText().toString());
            note.setDetails(et_description_note.getText().toString());
            note.setCreatedDate(Calendar.getInstance().getTime());

            noteRepo.insertInNotes(note);

            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
