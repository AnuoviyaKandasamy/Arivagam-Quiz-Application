package quizapp.domain;

public enum Category {
    JAVA("Java"),
    MYSQL("MySQL"),
    DS("DS");

    private final String label;

    Category(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }

    public static Category fromString(String input) {
        if (input == null) throw new IllegalArgumentException("Category is required");
        String normalized = input.trim();
        for (Category c : values()) {
            if (c.label.equalsIgnoreCase(normalized) || c.name().equalsIgnoreCase(normalized)) return c;
        }
        throw new IllegalArgumentException("Unknown category: " + input);
    }
}
