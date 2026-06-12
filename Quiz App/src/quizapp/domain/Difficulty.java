package quizapp.domain;

public enum Difficulty {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private final String label;

    Difficulty(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }

    public static Difficulty fromString(String input) {
        if (input == null) throw new IllegalArgumentException("Difficulty is required");
        String normalized = input.trim();
        for (Difficulty d : values()) {
            if (d.label.equalsIgnoreCase(normalized) || d.name().equalsIgnoreCase(normalized)) return d;
        }
        throw new IllegalArgumentException("Unknown difficulty: " + input);
    }
}
