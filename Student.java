// Student class (Model / Entity class)
public class Student {

    int id;
    String name;
    int marks;

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Overriding toString() for formatted output
    @Override
    public String toString() {
        return String.format("%-5d %-10s %-5d", id, name, marks);
    }
}
