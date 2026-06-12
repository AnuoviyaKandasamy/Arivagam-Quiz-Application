package quizapp.application.ports;

import quizapp.domain.Choice;
import quizapp.domain.Question;

public interface QuizIO {
    void showQuestion(int number, Question question);

    Choice readChoice();

    void showCorrect();

    void showWrong(Choice correctAnswer);

    void showNoQuestions();

    void showResult(int total, int correct, int wrong, int score, double percentage);

    void showPerformanceMessage(int total, int score);
}
