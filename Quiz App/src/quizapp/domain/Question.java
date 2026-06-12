package quizapp.domain;

import java.util.List;
import java.util.Objects;

public final class Question {
    private final String text;
    private final List<String> options; // size 3
    private final Choice answer;
    private final Category category;
    private final Difficulty difficulty;

    public Question(String text, List<String> options, Choice answer, Category category, Difficulty difficulty) {
        this.text = Objects.requireNonNull(text, "text");
        this.options = List.copyOf(Objects.requireNonNull(options, "options"));
        if (this.options.size() != 3) throw new IllegalArgumentException("options must have exactly 3 items");
        this.answer = Objects.requireNonNull(answer, "answer");
        this.category = Objects.requireNonNull(category, "category");
        this.difficulty = Objects.requireNonNull(difficulty, "difficulty");
    }

    public String text() {
        return text;
    }

    public List<String> options() {
        return options;
    }

    public Choice answer() {
        return answer;
    }

    public Category category() {
        return category;
    }

    public Difficulty difficulty() {
        return difficulty;
    }
}
