package uz.gita.test_quiz.ModelQuestions;

public class TestDataModel {

    private int id;
    private int question;
    private int variant_a;
    private int variant_b;
    private int variant_c;
    private int variant_d;
    private int answer;

    public TestDataModel(int id, int question, int variant_a, int variant_b, int variant_c, int variant_d, int answer) {
        this.id = id;
        this.question = question;
        this.variant_a = variant_a;
        this.variant_b = variant_b;
        this.variant_c = variant_c;
        this.variant_d = variant_d;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public int getQuestion() {
        return question;
    }

    public int getVariant_a() {
        return variant_a;
    }

    public int getVariant_b() {
        return variant_b;
    }

    public int getVariant_c() {
        return variant_c;
    }

    public int getVariant_d() {
        return variant_d;
    }

    public int getAnswer() {
        return answer;
    }
}
