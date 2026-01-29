import java.util.*;

public class StudentManagement {

    public static void main(String[] args) {

        // 1. Store student objects in ArrayList
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Kartik", 85));
        studentList.add(new Student(102, "Aman", 78));
        studentList.add(new Student(103, "Neha", 92));
        studentList.add(new Student(101, "Kartik", 85)); // duplicate entry

        // 4. Remove duplicates using Set (memory optimization)
        Set<Integer> uniqueIds = new HashSet<>();
        List<Student> uniqueStudents = new ArrayList<>();

        for (Student s : studentList) {
            if (uniqueIds.add(s.getId())) {
                uniqueStudents.add(s);
            }
        }

        // 2. Use HashMap for fast lookup (id → student)
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : uniqueStudents) {
            studentMap.put(s.getId(), s);
        }

        // 3. Sorting using Comparator (by marks)
        uniqueStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getMarks() - s1.getMarks(); // descending order
            }
        });

        // 8. Print formatted report
        System.out.println("----- Student Report (Sorted by Marks) -----");
        System.out.printf("%-5s %-10s %-5s%n", "ID", "Name", "Marks");
        System.out.println("------------------------------------------");

        // 5. Enhanced for loop
        for (Student s : uniqueStudents) {
            System.out.println(s);
        }

        // Fast lookup demonstration
        System.out.println("\nSearching student with ID 102:");
        Student found = studentMap.get(102);
        System.out.println(found != null ? found : "Student not found");
    }
}
