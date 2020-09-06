public class MathBook extends Book{
    private String difficulty_level;

    public MathBook(String name, String type, String difficulty_level) {
        super(name, type);
        this.difficulty_level = difficulty_level;
    }

    public String getDifficulty_level() {
        return difficulty_level;
    }

    public void setDifficulty_level(String difficulty_level) {
        this.difficulty_level = difficulty_level;
    }
}
