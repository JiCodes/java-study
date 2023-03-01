import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
class Session {
    List<Student> students;

    public Session(List<Student> students) {
        this.students = students;
    }

    // calculate average quiz scores per student for the whole class
    public double calculateAverageQuizScorePerStudent(Student student) {
        List<Integer> quizScores = student.getQuizScores();
        double total = 0.0;
        for (int score : quizScores) {
            total += score;
        }
        return total / quizScores.size();
    }
    public void calculateAverageQuizScoresForClass() {
        System.out.println("Average Quiz Scores for the whole class: ");
        for (Student student : students) {
            double averageQuizScore = calculateAverageQuizScorePerStudent(student);

            Formatter formatter = new Formatter();
            formatter.format("%.2f", averageQuizScore);
            System.out.println(student.name + " Average Quiz Score: " + formatter.toString());
        }
    }

    //  print the list of quiz scores in ascending order for one session
    public void printQuizScoresAscending() {
        List<Integer> allScores = new ArrayList<>();
        for (Student student : students) {
            allScores.addAll(student.getQuizScores());
        }
        Collections.sort(allScores);
        System.out.println("Quiz Scores in Ascending Order: " + allScores);
    }

    // print names of part-time students
    public void printPartTimeStudents() {
        System.out.println("Part Time Students: ");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.name);
            }
        }
    }

    // print exam scores of full-time students
    public void printFullTimeStudentExamScores() {
        System.out.println("Full Time Student Exam Scores: ");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                System.out.println(fullTimeStudent.name
                        + " Exam1 Score: " + fullTimeStudent.getExamScores()[0]
                        + ", Exam2 Score: " + fullTimeStudent.getExamScores()[1]);
            }
        }
    }
}