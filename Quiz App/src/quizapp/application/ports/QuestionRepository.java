package quizapp.application.ports;

import quizapp.domain.Category;
import quizapp.domain.Difficulty;
import quizapp.domain.Question;

import java.util.List;

public interface QuestionRepository {
    List<Question> findBy(Category category, Difficulty difficulty);
}
