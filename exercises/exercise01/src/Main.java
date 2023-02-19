import java.util.Arrays;

public class Main {
    public static void main(String[] argus){
        Session session = new Session();

        session.students[0] = new FullTime("Mike", new int[]{15, 13, 11, 12, 11, 12, 10, 15, 10, 14, 10, 9, 8, 12, 11}, new int[]{91,98});
        session.students[1] = new FullTime("Jack", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13},new int[]{90,80});
        session.students[2] = new PartTime("Lucy", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[3] = new PartTime("Lily", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[4] = new PartTime("Josh", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[5] = new PartTime("Amy", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[6] = new PartTime("Bob", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[7] = new PartTime("Cindy", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[8] = new PartTime("Daniel", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[9] = new PartTime("Evan", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[10] = new PartTime("Frank", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[11] = new PartTime("Gabby", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[12] = new PartTime("Harry", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[13] = new PartTime("Ivan", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[14] = new PartTime("John", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[15] = new PartTime("Keven", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[16] = new PartTime("Luke", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[17] = new PartTime("Mike", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[18] = new PartTime("Nick", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        session.students[19] = new PartTime("Oven", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});


        for (int i = 0; i < 20; i++) {
            session.avgScore();
            session.printQuizScoreList();
            session.printPartTimeName();
            session.printFullTimeExamScore();
        }
    }
}
class Student {
    String name;
    int[] quizScores;
    public Student(String name, int[] quizScores){
        this.name = name;
        this.quizScores = new int[15];
    }
}
class PartTime extends Student {

    public PartTime(String name, int[] quizScores) {
        super(name, quizScores);
    }
}
class FullTime extends Student {
    int[] examScores;
    public FullTime(String name, int[] quizScores, int[] examScores){
        super(name, quizScores);
        this.examScores = new int[2];
    }
}
class Session {
    int numOfStudent = 20;
    Student[] students = new Student[numOfStudent];

    // calculate average quiz scores per student for the whole class
    public void avgScore(){
        float avgQuizScore = 0.0f;
        for(int i = 0; i < students.length; i++){
            int quizTotal = 0;
            int[] quizScores = students[i].quizScores;
            for(int j = 0; j < quizScores.length; j++)
                quizTotal += quizScores[j];
                avgQuizScore = (float) quizTotal / quizScores.length;
            System.out.println(students[i].name + "'s average quiz score is " + avgQuizScore);
        }
    }

    // print the list of quiz scores in ascending order for one session
    public void printQuizScoreList(){
        // Arrays.sort(students);
        for(int i = 0; i < students.length; i++){
            for (int j =0; j < 15; j++){
                System.out.println("Quiz score of " + students[i] + " is " + students[i].quizScores[j]);
            }
        }
    }
    //  print names of part-time students
    public void printPartTimeName(){
        for (int i = 0; i < students.length; i++){
            if (students[i] instanceof PartTime){
                PartTime partTimeStudent = (PartTime) students[i];
                System.out.println("Part time student, name is: " + partTimeStudent.name);
            }
        }
    }
    // print exam scores of full-time students
    public void printFullTimeExamScore(){
        for(int i = 0; i < students.length; i++){
            if(students[i] instanceof FullTime){
                FullTime fullTimeStudent = (FullTime) students[i];
                System.out.println("Exam scores of full time student " + fullTimeStudent.name + "  are " + fullTimeStudent.examScores[0] + " and " + fullTimeStudent.examScores[1]);
            }
        }
    }
}


