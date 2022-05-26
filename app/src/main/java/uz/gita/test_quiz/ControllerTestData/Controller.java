package uz.gita.test_quiz.ControllerTestData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.test_quiz.ModelQuestions.TestDataModel;
import uz.gita.test_quiz.R;

public class Controller {

    private static Controller controller;

    private static List<TestDataModel> mathTests = new ArrayList<>();
    private static List<TestDataModel> physicsTests = new ArrayList<>();
    private static List<TestDataModel> chemistryTests = new ArrayList<>();
    private static List<TestDataModel> geographyTests = new ArrayList<>();


    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }

        return controller;
    }


    private Controller() {
        loadMathTest();
        loadPhysicsTest();
        loadChemistryTest();
        loadGeographyTest();
    }

    private void loadMathTest() {
        mathTests.add(new TestDataModel(0, R.string.questionm_1, R.string.variantm_1_a, R.string.variantm_1_b, R.string.variantm_1_c, R.string.variantm_1_d, R.string.answerm1));
        mathTests.add(new TestDataModel(1, R.string.questionm_2, R.string.variantm_2_a, R.string.variantm_2_b, R.string.variantm_2_c, R.string.variantm_2_d, R.string.answerm2));
        mathTests.add(new TestDataModel(2, R.string.questionm_3, R.string.variantm_3_a, R.string.variantm_3_b, R.string.variantm_3_c, R.string.variantm_3_d, R.string.answerm3));
        mathTests.add(new TestDataModel(3, R.string.questionm_4, R.string.variantm_4_a, R.string.variantm_4_b, R.string.variantm_4_c, R.string.variantm_4_d, R.string.answerm4));
        mathTests.add(new TestDataModel(4, R.string.questionm_5, R.string.variantm_5_a, R.string.variantm_5_b, R.string.variantm_5_c, R.string.variantm_5_d, R.string.answerm5));
        mathTests.add(new TestDataModel(5, R.string.questionm_6, R.string.variantm_6_a, R.string.variantm_6_b, R.string.variantm_6_c, R.string.variantm_6_d, R.string.answerm6));
        mathTests.add(new TestDataModel(6, R.string.questionm_7, R.string.variantm_7_a, R.string.variantm_7_b, R.string.variantm_7_c, R.string.variantm_7_d, R.string.answerm7));
        mathTests.add(new TestDataModel(7, R.string.questionm_8, R.string.variantm_8_a, R.string.variantm_8_b, R.string.variantm_8_c, R.string.variantm_8_d, R.string.answerm8));
        mathTests.add(new TestDataModel(8, R.string.questionm_9, R.string.variantm_9_a, R.string.variantm_9_b, R.string.variantm_9_c, R.string.variantm_9_d, R.string.answerm9));
        mathTests.add(new TestDataModel(9, R.string.questionm_10, R.string.variantm_10_a, R.string.variantm_10_b, R.string.variantm_10_c, R.string.variantm_10_d, R.string.answerm10));

        mathTests.add(new TestDataModel(10, R.string.questionm_11, R.string.variantm_11_a, R.string.variantm_11_b, R.string.variantm_11_c, R.string.variantm_11_d, R.string.answerm11));
        mathTests.add(new TestDataModel(11, R.string.questionm_12, R.string.variantm_12_a, R.string.variantm_12_b, R.string.variantm_12_c, R.string.variantm_12_d, R.string.answerm12));
        mathTests.add(new TestDataModel(12, R.string.questionm_13, R.string.variantm_13_a, R.string.variantm_13_b, R.string.variantm_13_c, R.string.variantm_13_d, R.string.answerm13));
        mathTests.add(new TestDataModel(13, R.string.questionm_14, R.string.variantm_14_a, R.string.variantm_14_b, R.string.variantm_14_c, R.string.variantm_14_d, R.string.answerm14));
        mathTests.add(new TestDataModel(14, R.string.questionm_15, R.string.variantm_15_a, R.string.variantm_15_b, R.string.variantm_15_c, R.string.variantm_15_d, R.string.answerm15));
        mathTests.add(new TestDataModel(15, R.string.questionm_16, R.string.variantm_16_a, R.string.variantm_16_b, R.string.variantm_16_c, R.string.variantm_16_d, R.string.answerm16));
        mathTests.add(new TestDataModel(16, R.string.questionm_17, R.string.variantm_17_a, R.string.variantm_17_b, R.string.variantm_17_c, R.string.variantm_17_d, R.string.answerm17));
        mathTests.add(new TestDataModel(17, R.string.questionm_18, R.string.variantm_18_a, R.string.variantm_18_b, R.string.variantm_18_c, R.string.variantm_18_d, R.string.answerm18));
        mathTests.add(new TestDataModel(18, R.string.questionm_19, R.string.variantm_19_a, R.string.variantm_19_b, R.string.variantm_19_c, R.string.variantm_19_d, R.string.answerm19));
        mathTests.add(new TestDataModel(19, R.string.questionm_20, R.string.variantm_20_a, R.string.variantm_20_b, R.string.variantm_20_c, R.string.variantm_20_d, R.string.answerm20));

        mathTests.add(new TestDataModel(20, R.string.questionm_21, R.string.variantm_21_a, R.string.variantm_21_b, R.string.variantm_21_c, R.string.variantm_21_d, R.string.answerm21));
        mathTests.add(new TestDataModel(21, R.string.questionm_22, R.string.variantm_22_a, R.string.variantm_22_b, R.string.variantm_22_c, R.string.variantm_22_d, R.string.answerm22));
        mathTests.add(new TestDataModel(22, R.string.questionm_23, R.string.variantm_23_a, R.string.variantm_23_b, R.string.variantm_23_c, R.string.variantm_23_d, R.string.answerm23));
        mathTests.add(new TestDataModel(23, R.string.questionm_24, R.string.variantm_24_a, R.string.variantm_24_b, R.string.variantm_24_c, R.string.variantm_24_d, R.string.answerm24));
        mathTests.add(new TestDataModel(24, R.string.questionm_25, R.string.variantm_25_a, R.string.variantm_25_b, R.string.variantm_25_c, R.string.variantm_25_d, R.string.answerm25));
        mathTests.add(new TestDataModel(25, R.string.questionm_26, R.string.variantm_26_a, R.string.variantm_26_b, R.string.variantm_26_c, R.string.variantm_26_d, R.string.answerm26));
        mathTests.add(new TestDataModel(26, R.string.questionm_27, R.string.variantm_27_a, R.string.variantm_27_b, R.string.variantm_27_c, R.string.variantm_27_d, R.string.answerm27));
        mathTests.add(new TestDataModel(27, R.string.questionm_28, R.string.variantm_28_a, R.string.variantm_28_b, R.string.variantm_28_c, R.string.variantm_28_d, R.string.answerm28));
        mathTests.add(new TestDataModel(28, R.string.questionm_29, R.string.variantm_29_a, R.string.variantm_29_b, R.string.variantm_29_c, R.string.variantm_29_d, R.string.answerm29));
        mathTests.add(new TestDataModel(29, R.string.questionm_30, R.string.variantm_30_a, R.string.variantm_30_b, R.string.variantm_30_c, R.string.variantm_30_d, R.string.answerm30));

    }

    private void loadPhysicsTest() {

        physicsTests.add(new TestDataModel(0, R.string.questionf_1, R.string.variantf_1_a, R.string.variantf_1_b, R.string.variantf_1_c, R.string.variantf_1_d, R.string.answerf1));
        physicsTests.add(new TestDataModel(1, R.string.questionf_2, R.string.variantf_2_a, R.string.variantf_2_b, R.string.variantf_2_c, R.string.variantf_2_d, R.string.answerf2));
        physicsTests.add(new TestDataModel(2, R.string.questionf_3, R.string.variantf_3_a, R.string.variantf_3_b, R.string.variantf_3_c, R.string.variantf_3_d, R.string.answerf3));
        physicsTests.add(new TestDataModel(3, R.string.questionf_4, R.string.variantf_4_a, R.string.variantf_4_b, R.string.variantf_4_c, R.string.variantf_4_d, R.string.answerf4));
        physicsTests.add(new TestDataModel(4, R.string.questionf_5, R.string.variantf_5_a, R.string.variantf_5_b, R.string.variantf_5_c, R.string.variantf_5_d, R.string.answerf5));
        physicsTests.add(new TestDataModel(5, R.string.questionf_6, R.string.variantf_6_a, R.string.variantf_6_b, R.string.variantf_6_c, R.string.variantf_6_d, R.string.answerf6));
        physicsTests.add(new TestDataModel(6, R.string.questionf_7, R.string.variantf_7_a, R.string.variantf_7_b, R.string.variantf_7_c, R.string.variantf_7_d, R.string.answerf7));
        physicsTests.add(new TestDataModel(7, R.string.questionf_8, R.string.variantf_8_a, R.string.variantf_8_b, R.string.variantf_8_c, R.string.variantf_8_d, R.string.answerf8));
        physicsTests.add(new TestDataModel(8, R.string.questionf_9, R.string.variantf_9_a, R.string.variantf_9_b, R.string.variantf_9_c, R.string.variantf_9_d, R.string.answerf9));
        physicsTests.add(new TestDataModel(9, R.string.questionf_10, R.string.variantf_10_a, R.string.variantf_10_b, R.string.variantf_10_c, R.string.variantf_10_d, R.string.answerf10));

        physicsTests.add(new TestDataModel(10, R.string.questionf_12, R.string.variantf_12_a, R.string.variantf_12_b, R.string.variantf_12_c, R.string.variantf_12_d, R.string.answerf12));
        physicsTests.add(new TestDataModel(11, R.string.questionf_12, R.string.variantf_12_a, R.string.variantf_12_b, R.string.variantf_12_c, R.string.variantf_12_d, R.string.answerf12));
        physicsTests.add(new TestDataModel(12, R.string.questionf_12, R.string.variantf_12_a, R.string.variantf_12_b, R.string.variantf_12_c, R.string.variantf_12_d, R.string.answerf12));
        physicsTests.add(new TestDataModel(13, R.string.questionf_12, R.string.variantf_12_a, R.string.variantf_12_b, R.string.variantf_12_c, R.string.variantf_12_d, R.string.answerf12));
        physicsTests.add(new TestDataModel(14, R.string.questionf_13, R.string.variantf_13_a, R.string.variantf_13_b, R.string.variantf_13_c, R.string.variantf_13_d, R.string.answerf13));
        physicsTests.add(new TestDataModel(15, R.string.questionf_14, R.string.variantf_14_a, R.string.variantf_14_b, R.string.variantf_14_c, R.string.variantf_14_d, R.string.answerf14));
        physicsTests.add(new TestDataModel(16, R.string.questionf_15, R.string.variantf_15_a, R.string.variantf_15_b, R.string.variantf_15_c, R.string.variantf_15_d, R.string.answerf15));
        physicsTests.add(new TestDataModel(17, R.string.questionf_16, R.string.variantf_16_a, R.string.variantf_16_b, R.string.variantf_16_c, R.string.variantf_16_d, R.string.answerf16));
        physicsTests.add(new TestDataModel(18, R.string.questionf_17, R.string.variantf_17_a, R.string.variantf_17_b, R.string.variantf_17_c, R.string.variantf_17_d, R.string.answerf17));
        physicsTests.add(new TestDataModel(19, R.string.questionf_18, R.string.variantf_18_a, R.string.variantf_18_b, R.string.variantf_18_c, R.string.variantf_18_d, R.string.answerf18));

        physicsTests.add(new TestDataModel(20, R.string.questionf_19, R.string.variantf_19_a, R.string.variantf_19_b, R.string.variantf_19_c, R.string.variantf_19_d, R.string.answerf19));
        physicsTests.add(new TestDataModel(21, R.string.questionf_20, R.string.variantf_20_a, R.string.variantf_20_b, R.string.variantf_20_c, R.string.variantf_20_d, R.string.answerf20));
        physicsTests.add(new TestDataModel(22, R.string.questionf_21, R.string.variantf_21_a, R.string.variantf_21_b, R.string.variantf_21_c, R.string.variantf_21_d, R.string.answerf21));
        physicsTests.add(new TestDataModel(23, R.string.questionf_22, R.string.variantf_22_a, R.string.variantf_22_b, R.string.variantf_22_c, R.string.variantf_22_d, R.string.answerf22));
        physicsTests.add(new TestDataModel(24, R.string.questionf_23, R.string.variantf_23_a, R.string.variantf_23_b, R.string.variantf_23_c, R.string.variantf_23_d, R.string.answerf23));
        physicsTests.add(new TestDataModel(25, R.string.questionf_24, R.string.variantf_24_a, R.string.variantf_24_b, R.string.variantf_24_c, R.string.variantf_24_d, R.string.answerf24));
        physicsTests.add(new TestDataModel(26, R.string.questionf_25, R.string.variantf_25_a, R.string.variantf_25_b, R.string.variantf_25_c, R.string.variantf_25_d, R.string.answerf25));
        physicsTests.add(new TestDataModel(27, R.string.questionf_26, R.string.variantf_26_a, R.string.variantf_26_b, R.string.variantf_26_c, R.string.variantf_26_d, R.string.answerf26));
        physicsTests.add(new TestDataModel(28, R.string.questionf_27, R.string.variantf_27_a, R.string.variantf_27_b, R.string.variantf_27_c, R.string.variantf_27_d, R.string.answerf27));
        physicsTests.add(new TestDataModel(29, R.string.questionf_29, R.string.variantf_29_a, R.string.variantf_29_b, R.string.variantf_29_c, R.string.variantf_29_d, R.string.answerf29));


    }

    private void loadChemistryTest() {

        chemistryTests.add(new TestDataModel(0, R.string.questionch_1, R.string.variantch_1_a, R.string.variantch_1_b, R.string.variantch_1_c, R.string.variantch_1_d, R.string.answerch1));
        chemistryTests.add(new TestDataModel(1, R.string.questionch_2, R.string.variantch_2_a, R.string.variantch_2_b, R.string.variantch_2_c, R.string.variantch_2_d, R.string.answerch2));
        chemistryTests.add(new TestDataModel(2, R.string.questionch_3, R.string.variantch_3_a, R.string.variantch_3_b, R.string.variantch_3_c, R.string.variantch_3_d, R.string.answerch3));
        chemistryTests.add(new TestDataModel(3, R.string.questionch_4, R.string.variantch_4_a, R.string.variantch_4_b, R.string.variantch_4_c, R.string.variantch_4_d, R.string.answerch4));
        chemistryTests.add(new TestDataModel(4, R.string.questionch_5, R.string.variantch_5_a, R.string.variantch_5_b, R.string.variantch_5_c, R.string.variantch_5_d, R.string.answerch5));
        chemistryTests.add(new TestDataModel(5, R.string.questionch_6, R.string.variantch_6_a, R.string.variantch_6_b, R.string.variantch_6_c, R.string.variantch_6_d, R.string.answerch6));
        chemistryTests.add(new TestDataModel(6, R.string.questionch_7, R.string.variantch_7_a, R.string.variantch_7_b, R.string.variantch_7_c, R.string.variantch_7_d, R.string.answerch7));
        chemistryTests.add(new TestDataModel(7, R.string.questionch_8, R.string.variantch_8_a, R.string.variantch_8_b, R.string.variantch_8_c, R.string.variantch_8_d, R.string.answerch8));
        chemistryTests.add(new TestDataModel(8, R.string.questionch_9, R.string.variantch_9_a, R.string.variantch_9_b, R.string.variantch_9_c, R.string.variantch_9_d, R.string.answerch9));
        chemistryTests.add(new TestDataModel(9, R.string.questionch_10, R.string.variantch_10_a, R.string.variantch_10_b, R.string.variantch_10_c, R.string.variantch_10_d, R.string.answerch10));

        chemistryTests.add(new TestDataModel(10, R.string.questionch_11, R.string.variantch_11_a, R.string.variantch_11_b, R.string.variantch_11_c, R.string.variantch_11_d, R.string.answerch11));
        chemistryTests.add(new TestDataModel(11, R.string.questionch_12, R.string.variantch_12_a, R.string.variantch_12_b, R.string.variantch_12_c, R.string.variantch_12_d, R.string.answerch12));
        chemistryTests.add(new TestDataModel(12, R.string.questionch_13, R.string.variantch_13_a, R.string.variantch_13_b, R.string.variantch_13_c, R.string.variantch_13_d, R.string.answerch13));
        chemistryTests.add(new TestDataModel(13, R.string.questionch_14, R.string.variantch_14_a, R.string.variantch_14_b, R.string.variantch_14_c, R.string.variantch_14_d, R.string.answerch14));
        chemistryTests.add(new TestDataModel(14, R.string.questionch_15, R.string.variantch_15_a, R.string.variantch_15_b, R.string.variantch_15_c, R.string.variantch_15_d, R.string.answerch15));
        chemistryTests.add(new TestDataModel(15, R.string.questionch_16, R.string.variantch_16_a, R.string.variantch_16_b, R.string.variantch_16_c, R.string.variantch_16_d, R.string.answerch16));
        chemistryTests.add(new TestDataModel(16, R.string.questionch_17, R.string.variantch_17_a, R.string.variantch_17_b, R.string.variantch_17_c, R.string.variantch_17_d, R.string.answerch17));
        chemistryTests.add(new TestDataModel(17, R.string.questionch_18, R.string.variantch_18_a, R.string.variantch_18_b, R.string.variantch_18_c, R.string.variantch_18_d, R.string.answerch18));
        chemistryTests.add(new TestDataModel(18, R.string.questionch_19, R.string.variantch_19_a, R.string.variantch_19_b, R.string.variantch_19_c, R.string.variantch_19_d, R.string.answerch19));
        chemistryTests.add(new TestDataModel(19, R.string.questionch_20, R.string.variantch_20_a, R.string.variantch_20_b, R.string.variantch_20_c, R.string.variantch_20_d, R.string.answerch20));

        chemistryTests.add(new TestDataModel(20, R.string.questionch_21, R.string.variantch_21_a, R.string.variantch_21_b, R.string.variantch_21_c, R.string.variantch_21_d, R.string.answerch21));
        chemistryTests.add(new TestDataModel(21, R.string.questionch_22, R.string.variantch_22_a, R.string.variantch_22_b, R.string.variantch_22_c, R.string.variantch_22_d, R.string.answerch22));
        chemistryTests.add(new TestDataModel(22, R.string.questionch_23, R.string.variantch_23_a, R.string.variantch_23_b, R.string.variantch_23_c, R.string.variantch_23_d, R.string.answerch23));
        chemistryTests.add(new TestDataModel(23, R.string.questionch_24, R.string.variantch_24_a, R.string.variantch_24_b, R.string.variantch_24_c, R.string.variantch_24_d, R.string.answerch24));
        chemistryTests.add(new TestDataModel(24, R.string.questionch_25, R.string.variantch_25_a, R.string.variantch_25_b, R.string.variantch_25_c, R.string.variantch_25_d, R.string.answerch25));
        chemistryTests.add(new TestDataModel(25, R.string.questionch_26, R.string.variantch_26_a, R.string.variantch_26_b, R.string.variantch_26_c, R.string.variantch_26_d, R.string.answerch26));
        chemistryTests.add(new TestDataModel(26, R.string.questionch_27, R.string.variantch_27_a, R.string.variantch_27_b, R.string.variantch_27_c, R.string.variantch_27_d, R.string.answerch27));
        chemistryTests.add(new TestDataModel(27, R.string.questionch_28, R.string.variantch_28_a, R.string.variantch_28_b, R.string.variantch_28_c, R.string.variantch_28_d, R.string.answerch28));
        chemistryTests.add(new TestDataModel(28, R.string.questionch_29, R.string.variantch_29_a, R.string.variantch_29_b, R.string.variantch_29_c, R.string.variantch_29_d, R.string.answerch29));
        chemistryTests.add(new TestDataModel(29, R.string.questionch_30, R.string.variantch_30_a, R.string.variantch_30_b, R.string.variantch_30_c, R.string.variantch_30_d, R.string.answerch30));


    }

    private void loadGeographyTest() {
        geographyTests.add(new TestDataModel(0, R.string.questiong_1, R.string.variantg_1_a, R.string.variantg_1_b, R.string.variantg_1_c, R.string.variantg_1_d, R.string.answerg1));
        geographyTests.add(new TestDataModel(1, R.string.questiong_2, R.string.variantg_2_a, R.string.variantg_2_b, R.string.variantg_2_c, R.string.variantg_2_d, R.string.answerg2));
        geographyTests.add(new TestDataModel(2, R.string.questiong_3, R.string.variantg_3_a, R.string.variantg_3_b, R.string.variantg_3_c, R.string.variantg_3_d, R.string.answerg3));
        geographyTests.add(new TestDataModel(3, R.string.questiong_4, R.string.variantg_4_a, R.string.variantg_4_b, R.string.variantg_4_c, R.string.variantg_4_d, R.string.answerg4));
        geographyTests.add(new TestDataModel(4, R.string.questiong_5, R.string.variantg_5_a, R.string.variantg_5_b, R.string.variantg_5_c, R.string.variantg_5_d, R.string.answerg5));
        geographyTests.add(new TestDataModel(5, R.string.questiong_6, R.string.variantg_6_a, R.string.variantg_6_b, R.string.variantg_6_c, R.string.variantg_6_d, R.string.answerg6));
        geographyTests.add(new TestDataModel(6, R.string.questiong_7, R.string.variantg_7_a, R.string.variantg_7_b, R.string.variantg_7_c, R.string.variantg_7_d, R.string.answerg7));
        geographyTests.add(new TestDataModel(7, R.string.questiong_8, R.string.variantg_8_a, R.string.variantg_8_b, R.string.variantg_8_c, R.string.variantg_8_d, R.string.answerg8));
        geographyTests.add(new TestDataModel(8, R.string.questiong_9, R.string.variantg_9_a, R.string.variantg_9_b, R.string.variantg_9_c, R.string.variantg_9_d, R.string.answerg9));
        geographyTests.add(new TestDataModel(9, R.string.questiong_10, R.string.variantg_10_a, R.string.variantg_10_b, R.string.variantg_10_c, R.string.variantg_10_d, R.string.answerg10));

        geographyTests.add(new TestDataModel(10, R.string.questiong_11, R.string.variantg_11_a, R.string.variantg_11_b, R.string.variantg_11_c, R.string.variantg_11_d, R.string.answerg11));
        geographyTests.add(new TestDataModel(11, R.string.questiong_12, R.string.variantg_12_a, R.string.variantg_12_b, R.string.variantg_12_c, R.string.variantg_12_d, R.string.answerg12));
        geographyTests.add(new TestDataModel(12, R.string.questiong_13, R.string.variantg_13_a, R.string.variantg_13_b, R.string.variantg_13_c, R.string.variantg_13_d, R.string.answerg13));
        geographyTests.add(new TestDataModel(13, R.string.questiong_14, R.string.variantg_14_a, R.string.variantg_14_b, R.string.variantg_14_c, R.string.variantg_14_d, R.string.answerg14));
        geographyTests.add(new TestDataModel(14, R.string.questiong_15, R.string.variantg_15_a, R.string.variantg_15_b, R.string.variantg_15_c, R.string.variantg_15_d, R.string.answerg15));
        geographyTests.add(new TestDataModel(15, R.string.questiong_16, R.string.variantg_16_a, R.string.variantg_16_b, R.string.variantg_16_c, R.string.variantg_16_d, R.string.answerg16));
        geographyTests.add(new TestDataModel(16, R.string.questiong_17, R.string.variantg_17_a, R.string.variantg_17_b, R.string.variantg_17_c, R.string.variantg_17_d, R.string.answerg17));
        geographyTests.add(new TestDataModel(17, R.string.questiong_18, R.string.variantg_18_a, R.string.variantg_18_b, R.string.variantg_18_c, R.string.variantg_18_d, R.string.answerg18));
        geographyTests.add(new TestDataModel(18, R.string.questiong_19, R.string.variantg_19_a, R.string.variantg_19_b, R.string.variantg_19_c, R.string.variantg_19_d, R.string.answerg19));
        geographyTests.add(new TestDataModel(19, R.string.questiong_20, R.string.variantg_20_a, R.string.variantg_20_b, R.string.variantg_20_c, R.string.variantg_20_d, R.string.answerg20));

        geographyTests.add(new TestDataModel(20, R.string.questiong_21, R.string.variantg_21_a, R.string.variantg_21_b, R.string.variantg_21_c, R.string.variantg_21_d, R.string.answerg21));
        geographyTests.add(new TestDataModel(21, R.string.questiong_22, R.string.variantg_22_a, R.string.variantg_22_b, R.string.variantg_22_c, R.string.variantg_22_d, R.string.answerg22));
        geographyTests.add(new TestDataModel(22, R.string.questiong_23, R.string.variantg_23_a, R.string.variantg_23_b, R.string.variantg_23_c, R.string.variantg_23_d, R.string.answerg23));
        geographyTests.add(new TestDataModel(23, R.string.questiong_24, R.string.variantg_24_a, R.string.variantg_24_b, R.string.variantg_24_c, R.string.variantg_24_d, R.string.answerg24));
        geographyTests.add(new TestDataModel(24, R.string.questiong_25, R.string.variantg_25_a, R.string.variantg_25_b, R.string.variantg_25_c, R.string.variantg_25_d, R.string.answerg25));
        geographyTests.add(new TestDataModel(25, R.string.questiong_26, R.string.variantg_26_a, R.string.variantg_26_b, R.string.variantg_26_c, R.string.variantg_26_d, R.string.answerg26));
        geographyTests.add(new TestDataModel(26, R.string.questiong_27, R.string.variantg_27_a, R.string.variantg_27_b, R.string.variantg_27_c, R.string.variantg_27_d, R.string.answerg27));
        geographyTests.add(new TestDataModel(27, R.string.questiong_28, R.string.variantg_28_a, R.string.variantg_28_b, R.string.variantg_28_c, R.string.variantg_28_d, R.string.answerg28));
        geographyTests.add(new TestDataModel(28, R.string.questiong_29, R.string.variantg_29_a, R.string.variantg_29_b, R.string.variantg_29_c, R.string.variantg_29_d, R.string.answerg29));
        geographyTests.add(new TestDataModel(29, R.string.questiong_30, R.string.variantg_30_a, R.string.variantg_30_b, R.string.variantg_30_c, R.string.variantg_30_d, R.string.answerg30));


    }

    public void shuffle() {
        Collections.shuffle(mathTests);
        Collections.shuffle(physicsTests);
        Collections.shuffle(chemistryTests);
        Collections.shuffle(geographyTests);
    }

    public List<TestDataModel> getTestDataMath() {
        return mathTests;
    }

    public List<TestDataModel> getTestDataPhysics() {
        return physicsTests;
    }

    public List<TestDataModel> getTestDataChemistry() {
        return chemistryTests;
    }

    public List<TestDataModel> getTestDataGeography() {
        return geographyTests;
    }
}
