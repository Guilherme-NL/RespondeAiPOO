public class Subject {
    private String name;
    int grade;
    double progression = 0.0;

    void growUp() {
        this.progression += 0.1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
