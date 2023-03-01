import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DummyStudents {
    static String[] studentNames = {"Mike", "Jack", "Lucy", "Lily", "Josh", "Amy", "Bob", "Cindy",
            "Daniel", "Evan", "Frank", "Gabby", "Harry", "Ivan", "John", "Keven", "Luke", "Mike", "Nick", "Oven"};

    public static List<Student> generateStudents() {
        List<Student> students = new ArrayList<>();
        Random rand = new Random();
        for (String name : studentNames) {
            if (rand.nextBoolean()) {
                FullTimeStudent fullTimeStudent = new FullTimeStudent(name);
                fullTimeStudent.setExamScores(new int[] {rand.nextInt(100), rand.nextInt(100)});
                for (int i = 0; i < 15; i++) {
                    fullTimeStudent.addQuizScore(rand.nextInt(100));
                }
                students.add(fullTimeStudent);
            } else {
                PartTimeStudent partTimeStudent = new PartTimeStudent(name);
                for (int i = 0; i < 15; i++) {
                    partTimeStudent.addQuizScore(rand.nextInt(100));
                }
                students.add(partTimeStudent);
            }
        }
        return students;
    }
}