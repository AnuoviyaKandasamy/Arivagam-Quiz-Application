package Model;

public class Questions {

    private String question;
    private String[] options;
    private char answer;
    private String category;
    private String level;

    public Questions(String question, String[] options, char answer, String category, String level) {
        this.question = question;
        this.options = options;
        this.answer = answer;
        this.category = category;
        this.level = level;
    }

    public void displayquestions() {
        System.out.println(question);
        System.out.println("a) " + options[0]);
        System.out.println("b) " + options[1]);
        System.out.println("c) " + options[2]);
    }

    public char getAnswer() {
        return answer;
    }

    public String getCategory() {
        return category;
    }

    public String getLevel() {
        return level;
    }
}