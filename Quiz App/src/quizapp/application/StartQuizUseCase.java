package quizapp.application;

import quizapp.application.ports.QuestionRepository;
import quizapp.application.ports.QuizIO;
import quizapp.domain.Category;
import quizapp.domain.Choice;
import quizapp.domain.Difficulty;
import quizapp.domain.Question;

import java.util.List;
import java.util.Objects;

public final class StartQuizUseCase {
    private final QuestionRepository repository;
    private final QuizIO io;

    public StartQuizUseCase(QuestionRepository repository, QuizIO io) {
        this.repository = Objects.requireNonNull(repository, "repository");
        this.io = Objects.requireNonNull(io, "io");
    }

    public QuizResult execute(Category category, Difficulty difficulty) {
        List<Question> questions = repository.findBy(category, difficulty);
        if (questions.isEmpty()) {
            io.showNoQuestions();
            return new QuizResult(0, 0, 0);
        }

        int correct = 0;
        int wrong = 0;

        int total = 0;
        for (Question q : questions) {
            total++;
            io.showQuestion(total, q);
            Choice user = io.readChoice();
            if (user == q.answer()) {
                correct++;
                io.showCorrect();
            } else {
                wrong++;
                io.showWrong(q.answer());
            }
        }

        QuizResult result = new QuizResult(total, correct, wrong);
        io.showResult(result.total(), result.correct(), result.wrong(), result.score(), result.percentage());
        io.showPerformanceMessage(result.total(), result.score());
        return result;
    }
}
