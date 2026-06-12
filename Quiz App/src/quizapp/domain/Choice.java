package quizapp.domain;

public enum Choice {
    A('a'),
    B('b'),
    C('c');

    private final char code;

    Choice(char code) {
        this.code = code;
    }

    public char code() {
        return code;
    }

    public static Choice fromChar(char c) {
        char lower = Character.toLowerCase(c);
        for (Choice choice : values()) {
            if (choice.code == lower) return choice;
        }
        throw new IllegalArgumentException("Invalid choice: " + c);
    }
}
