package com.example.codingchallenege4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent= getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView articleHeader = findViewById(R.id.articleHeader);
        TextView articleBody = findViewById(R.id.articleBody);
        articleHeader.setText(message);
        String body = "";

        if(message.equals("Text One")){
            body = "Focus refers to what is being written about. It involves choosing and maintaining an appropriate topic and degree of detail for a particular purpose and audience. Lack of focus is a common complaint of instructors regarding student writing. " +
                    "If you have assigned writing in the past, you have probably encountered papers that stray from one idea to another without focusing on a single issue or claim. To help students establish focus, consider using an illustration from photography: " +
                    "In focusing a camera, the idea is to obtain a picture of something in particular, with sharp details and perhaps a little background or context. You might encourage students to imagine " +
                    "representing their writing in a photograph—or summarizing it in a single sentence." +
                    " Remind them that since problems with focus often originate during the planning stage, " +
                    "they might begin the writing process by outlining or taking notes.";
        }
        else if(message.equals("Text Two")){
            body = "Just as the best place to start designing an individual writing assignment is by identifying assignment goals, the " +
                    "best place to start making course writing matter is by identifying course objectives. Why does your course matter? " +
                    "Make writing matter for the same reasons. For example, if I am teaching a course called Science and Society, " +
                    "my objectives might be to encourage students to analyze what the media reports about science, rather than receiving " +
                    "all coverage at face value. I might want students to recognize science as something we have created and to which we have " +
                    "assigned meaning, rather than accepting science as a universal and unchanging truth. In my course, then, I am encouraging " +
                    "students to think critically, analyze arguments, and challenge their own assumptions. These same skills contribute to and" +
                    " are fostered by the writing process. " +
                    "By communicating course objectives to students and tying writing to course goals, " +
                    "we can help students see how writing supports lasting academic and intellectual growth.";

        }
        else if(message.equals("Text Three")){
            body ="Tying writing to course goals will only motivate students if they accept the value of the course. " +
                    "Generally, this means seeing a connection between the course and the \"real world.\" " +
                    "A well-designed writing assignment is one of the most effective tools instructors can use to connect course " +
                    "goals to the world at large. The rhetorical context of a writing assignment can demonstrate practical" +
                    " applications of course content and of skills developed through course activities, including writing. " +
                    "Our challenge is to design rhetorical contexts for writing assignments that reflect the outside world. " +
                    "Here are some examples of rhetorical contexts that connect various academic disciplines to the world at large:";
        }

        articleBody.setText(body);
    }
}
