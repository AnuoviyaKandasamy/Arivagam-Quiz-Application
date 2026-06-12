package quizapp.application;

public record QuizResult(
        int total,
        int correct,
        int wrong
) {
    public int score() {
        return correct;
    }

    public double percentage() {
        if (total == 0) return 0.0;
        return (correct * 100.0) / total;
    }
}
