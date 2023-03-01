import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = DummyStudents.generateStudents();

        Session session = new Session(students);
        session.calculateAverageQuizScoresForClass();
        session.printQuizScoresAscending();
        session.printPartTimeStudents();
        session.printFullTimeStudentExamScores();
    }
}