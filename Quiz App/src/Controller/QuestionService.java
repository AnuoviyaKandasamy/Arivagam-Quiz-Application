package Controller;

import Model.Questions;
import java.util.Scanner;

public class QuestionService {

    public void startQuiz(Questions[] questions, String category, String level) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int correct = 0;
        int wrong = 0;
        int total = 0;

        for (int i = 0; i < questions.length; i++) {

            if (questions[i].getCategory().equalsIgnoreCase(category)
                    && questions[i].getLevel().equalsIgnoreCase(level)) {

                total++;
                System.out.println("\nQuestion " + total);
                questions[i].displayquestions();

                System.out.print("Enter your answer (a/b/c): ");

                char userAnswer;

                while (true) {
                    String input = sc.next().toLowerCase();

                    if (input.length() == 1 && (input.charAt(0) == 'a' || input.charAt(0) == 'b' || input.charAt(0) == 'c')) {
                        userAnswer = input.charAt(0);
                        break;
                    } else {
                        System.out.print("Invalid option! Enter only a, b, or c: ");
                    }
                }

                if (userAnswer == questions[i].getAnswer()) {
                    System.out.println("Correct!");
                    score++;
                    correct++;
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Correct answer: " + questions[i].getAnswer());
                    wrong++;
                }
                System.out.println("-----------------------------------");
            }
        }

        if (total == 0) {
            System.out.println("\nNo questions available for selected Category / Level");
            return;
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Questions: " + total);
        System.out.println("Correct: " + correct);
        System.out.println("Wrong: " + wrong);
        System.out.println("Score: " + score);

        double percentage = (score * 100.0) / total;
        System.out.println("Percentage: " + percentage + "%");

        if (score == total) System.out.println("Excellent!");
        else if (score >= total / 2) System.out.println("Good!");
        else System.out.println("Improve!");

        System.out.println("--------------------------");

        // ✅ Retry
        System.out.print("Retry same quiz? (y/n): ");
        char retry = sc.next().toLowerCase().charAt(0);

        if (retry == 'y') {
            startQuiz(questions, category, level);
        }
    }
}