package com.vleung.lab1ex2;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textView = new TextView(this);
        textView.setTextSize(40);

        // does not work
//        textView.setText(R.string.full_name + "\n" +
//                R.string.program_name + "\n" +
//                R.string.semester + "\n" +
//                R.string.course_name);

        // doesn't work either
//        textView.setText(getString(R.string.formatted_info, R.string.full_name, R.string.program_name,
//                                    R.string.semester, R.string.course_name));

        Resources res = getResources();
        String full_name = res.getString(R.string.full_name);
        String program_name = res.getString(R.string.program_name);
        String semester = res.getString(R.string.semester);
        String course_name = res.getString(R.string.course_name);
        String info = res.getString(
                        R.string.formatted_info, full_name, program_name, semester, course_name);
        textView.setText(info);

        ViewGroup layout = (ViewGroup)findViewById(R.id.activity_display);
        layout.addView(textView);
    }
}
