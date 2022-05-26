package uz.gita.test_quiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private String selectTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        LottieAnimationView lottie = findViewById(R.id.quizicon);
        final LinearLayout math = findViewById(R.id.mathLayout);
        final LinearLayout physics = findViewById(R.id.physicsLayout);
        final LinearLayout chemistry = findViewById(R.id.chemistryLayout);
        final LinearLayout geography = findViewById(R.id.geographyLayout);


        final AppCompatButton startButton = findViewById(R.id.startQuizBtn);

        lottie.playAnimation();
        startButton.setEnabled(false);

        // matematika uchun
        math.setOnClickListener(view -> {
            startButton.setEnabled(true);
            selectTopicName = "Math";

            math.setBackgroundResource(R.drawable.background_topic);

            physics.setBackgroundResource(R.drawable.back);
            chemistry.setBackgroundResource(R.drawable.back);
            geography.setBackgroundResource(R.drawable.back);


        });

        // fizika uchun
        physics.setOnClickListener(view -> {
            startButton.setEnabled(true);
            selectTopicName = "Physics";

            physics.setBackgroundResource(R.drawable.background_topic);

            math.setBackgroundResource(R.drawable.back);
            chemistry.setBackgroundResource(R.drawable.back);
            geography.setBackgroundResource(R.drawable.back);


        });

        // kimyo uchun
        chemistry.setOnClickListener(view -> {
            startButton.setEnabled(true);
            selectTopicName = "Chemistry";

            chemistry.setBackgroundResource(R.drawable.background_topic);

            physics.setBackgroundResource(R.drawable.back);
            math.setBackgroundResource(R.drawable.back);
            geography.setBackgroundResource(R.drawable.back);


        });

        // geografiya uchun
        geography.setOnClickListener(view -> {
            startButton.setEnabled(true);
            selectTopicName = "Geography";


            geography.setBackgroundResource(R.drawable.background_topic);


            physics.setBackgroundResource(R.drawable.back);
            chemistry.setBackgroundResource(R.drawable.back);
            math.setBackgroundResource(R.drawable.back);
        });


        // start Button uchun
        startButton.setOnClickListener(view -> {

            // hec bir narsa tanlanmagan bolsa

            if (selectTopicName.isEmpty()) {

                Toast.makeText(MainActivity.this, "Please choose the topic", Toast.LENGTH_SHORT).show();
            }
            // tanlangan bolsa

            else {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("selectedTopic", selectTopicName);
                startActivity(intent);
                finish();
            }

        });


    }
}