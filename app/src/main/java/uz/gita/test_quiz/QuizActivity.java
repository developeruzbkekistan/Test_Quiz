package uz.gita.test_quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.airbnb.lottie.LottieAnimationView;

import java.util.List;

import uz.gita.test_quiz.ControllerTestData.Controller;
import uz.gita.test_quiz.ModelQuestions.TestDataModel;


public class QuizActivity extends AppCompatActivity {


    private TextView question;
    private TextView questionsCapacity;

    private AppCompatButton variant_a, variant_b, variant_c, variant_d;
    private AppCompatButton nextQuestionButton;


    private String trueAnswer;
    private String userAnswer = "";

    private int position;
    private final int countQuestions = 10;
    private int trueAnswerCount = 0;

    private final Controller controller = Controller.getInstance();
    private List<TestDataModel> data;

    private View view1 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view1 = getLayoutInflater().inflate(R.layout.activity_quiz, null);
        setContentView(view1);

        questionsCapacity = findViewById(R.id.questonsCapasity);
        questionsCapacity.setText(1 + "/" + countQuestions);

        controller.shuffle();
        loadButtonsById();
        loadDataQuestionList();
        loadDataTests();


        final ImageView backButton = findViewById(R.id.backBtn);
        final TextView selectedTopic = findViewById(R.id.topicName);
        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");

        selectedTopic.setText(getSelectedTopicName);


        backButton.setOnClickListener(view -> {
            AlertDialog dialog = new AlertDialog.Builder(QuizActivity.this)
                    .setMessage("Are you sure exit ?")
                    .setNegativeButton("No", (dialogInterface, i) -> {
                        startActivity(new Intent(QuizActivity.this, MainActivity.class));
                        finish();
                    })
                    .setPositiveButton("Yes", (dialogInterface, i) -> {
                        startActivity(new Intent(QuizActivity.this, MainActivity.class));
                        finish();
                    })
                    .create();


            dialog.show();
        });

    }


    @SuppressLint("SetTextI18n")
    private void loadButtonsById() {
        question = findViewById(R.id.question);

        variant_a = findViewById(R.id.variant_A);

        variant_a.setOnClickListener(view -> {
            userAnswer = "";
            userAnswer = (String) variant_a.getText();

            variant_a.setBackgroundResource(R.drawable.choose_topic_round);
            variant_b.setBackgroundResource(R.drawable.back);
            variant_c.setBackgroundResource(R.drawable.back);
            variant_d.setBackgroundResource(R.drawable.back);
            nextQuestionButton.setEnabled(true);

        });
        variant_b = findViewById(R.id.variant_B);

        variant_b.setOnClickListener(view -> {
            userAnswer = "";
            userAnswer = (String) variant_b.getText();

            variant_a.setBackgroundResource(R.drawable.back);
            variant_b.setBackgroundResource(R.drawable.choose_topic_round);
            variant_c.setBackgroundResource(R.drawable.back);
            variant_d.setBackgroundResource(R.drawable.back);
            nextQuestionButton.setEnabled(true);

        });

        variant_c = findViewById(R.id.variant_C);

        variant_c.setOnClickListener(view -> {

            userAnswer = "";
            userAnswer = (String) variant_c.getText();

            variant_c.setBackgroundResource(R.drawable.choose_topic_round);

            variant_b.setBackgroundResource(R.drawable.back);
            variant_a.setBackgroundResource(R.drawable.back);
            variant_d.setBackgroundResource(R.drawable.back);
            nextQuestionButton.setEnabled(true);

        });

        variant_d = findViewById(R.id.variant_D);

        variant_d.setOnClickListener(view -> {
            userAnswer = "";
            userAnswer = (String) variant_d.getText();
            variant_d.setBackgroundResource(R.drawable.choose_topic_round);
            variant_b.setBackgroundResource(R.drawable.back);
            variant_c.setBackgroundResource(R.drawable.back);
            variant_a.setBackgroundResource(R.drawable.back);
            nextQuestionButton.setEnabled(true);


        });

        nextQuestionButton = findViewById(R.id.nextQuestion);


        nextQuestionButton.setOnClickListener(view -> {
            if (userAnswer.equals(trueAnswer)) trueAnswerCount++;
            clearSelectedVariants();
            loadDataTests();
            nextQuestionButton.setEnabled(false);

            questionsCapacity.setText((position) + "/" + countQuestions);

        });

    }

    private void loadDataQuestionList() {

        String subject = getIntent().getStringExtra("selectedTopic");

        switch (subject) {
            case "Math": {
                data = controller.getTestDataMath();
                break;
            }
            case "Physics": {
                data = controller.getTestDataPhysics();
                break;
            }

            case "Chemistry": {
                data = controller.getTestDataChemistry();
                break;
            }

            case "Geography": {
                data = controller.getTestDataGeography();
            }

        }


    }

    private void loadDataTests() {
        if (position == countQuestions) {
            finishTest();
            return;
        }

        question.setText(data.get(position).getQuestion());
        variant_a.setText(data.get(position).getVariant_a());
        variant_b.setText(data.get(position).getVariant_b());
        variant_c.setText(data.get(position).getVariant_c());
        variant_d.setText(data.get(position).getVariant_d());
        trueAnswer = this.getResources().getString(data.get(position).getAnswer());


        position++;
// 448
    }

    @SuppressLint("SetTextI18n")
    private void finishTest() {

        View view = getLayoutInflater().inflate(R.layout.cutom_dialog, null);

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(view)
                .setCancelable(false)
                .show();


        dialog.getWindow().setBackgroundDrawable(null);

        //view1.setBackgroundResource(R.drawable.background_screen);
        LottieAnimationView lottie = view.findViewById(R.id.checks);
        TextView trua = view.findViewById(R.id.correct);
        TextView wrong = view.findViewById(R.id.wrong);

        trua.setText("True answers :\t\t" + trueAnswerCount);
        wrong.setText("Wrong answers :\t\t" + (countQuestions - trueAnswerCount));

        view.findViewById(R.id.newquiz).setOnClickListener(btn -> {
            Log.d("TTT", "correct answer = " + trueAnswerCount);
            startActivity(new Intent(QuizActivity.this, MainActivity.class));
            finish();
        });

        lottie.playAnimation();

        dialog.show();
    }


    private void clearSelectedVariants() {

        variant_a.setBackgroundResource(R.drawable.back);
        variant_b.setBackgroundResource(R.drawable.back);
        variant_c.setBackgroundResource(R.drawable.back);
        variant_d.setBackgroundResource(R.drawable.back);

    }

    @Override
    public void onBackPressed() {
        
    }
}