import java.util.Arrays;

public class Main {
    public static void main(String[] argus){
        Session session = new Session();


        Student stu1 = new FullTime("Mike", new int[]{15, 13, 11, 12, 11, 12, 10, 15, 10, 14, 10, 9, 8, 12, 11}, new int[]{91,98});
        Student stu2 = new FullTime("Jack", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13},new int[]{90,80});
        Student stu3 = new PartTime("Lucy", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu4 = new PartTime("Lily", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu5 = new PartTime("Josh", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu6 = new PartTime("Amy", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu7 = new PartTime("Bob", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu8 = new PartTime("Cindy", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu9 = new PartTime("Daniel", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu10 = new PartTime("Evan", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu11 = new PartTime("Frank", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu12 = new PartTime("Gabby", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu13 = new PartTime("Harry", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu14 = new PartTime("Ivan", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu15 = new PartTime("John", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu16 = new PartTime("Keven", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu17 = new PartTime("Luke", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu18 = new PartTime("Mike", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu19 = new PartTime("Nick", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});
        Student stu20 = new PartTime("Oven", new int[]{14, 13, 10, 11, 10, 12, 11, 15, 12, 12, 9, 10, 8, 14, 13});


        session.students[0] = stu1;
        session.students[1] = stu2;
        session.students[2] = stu3;


        for (int i = 0; i < 20; i++) {
            session.avgScore();
            session.printScore();
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
        examScores = new int[2];
    }
}
class Session {
    int numOfStudent = 20;
    Student[] students = new Student[numOfStudent];

    public double avgScore(){
        float total = 0;

        for(int i = 0; i < students.length; i++){
            total += students[i].quizScores[i];
        }
        return (float) total / numOfStudent;
    }

    public void printScore(){
        Arrays.sort(students);
        for(int i = 0; i < students.length; i++){
            System.out.println("Quiz score of " + students[i] + " is " + students[i].quizScores[i]);
        }
    }
    public void printPartTimeName(){
        for (int i = 0; i < students.length; i++){
            if (students[i] instanceof PartTime){
                PartTime partTimeStudent = (PartTime) students[i];
                System.out.println("Part time student, name is: " + partTimeStudent.name);
            }
        }
    }
    public void printFullTimeExamScore(){
        for(int i = 0; i < students.length; i++){
            if(students[i] instanceof FullTime){
                FullTime fullTimeStudent = (FullTime) students[i];
                System.out.println("Exam scores of full time student " + fullTimeStudent.name + "  are " + fullTimeStudent.examScores[0] + " and " + fullTimeStudent.examScores[1]);
            }
        }
    }
}


