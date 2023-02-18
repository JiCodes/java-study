import java.util.Arrays;

public class Main {
    public class Student {
        int quizScore;
        int quizIndex = 0;
        public Student(int quizScore){
            this.quizScore = quizScore;
        }
    }
    public class PartTime extends Student {
        int partTime;
        public PartTime(int quizScore) {
            super(quizScore);
        }
    }
    public class FullTime extends Student {
        int fullTime;
        int examScore;
        int examIndex = 0;
        public FullTime(int quizScore){
            super(quizScore);
        }
    }
    class Session {
        int numOfStudent = 20;
        Student[] students = new Student[numOfStudent];

        public double avgScore(){
            float total = 0;
            for(int i = 0; i < students.length; i++){
                total += students[i].quizScore;
            }
            return (float) total / numOfStudent;
        }

        public void printScore(){
            Arrays.sort(students);

            for(int i = 0; i < students.length; i++){
                System.out.println("Quiz score is: " + students[i].quizScore);
            }
        }

        public void printPartTime(){
            for (int i = 0; i < students.length; i++){
                if (students[i] instanceof PartTime){
                    System.out.println("Part time student name: " + students[i]);
                }
            }
        }

        public void printExamScore(){
            for(int i = 0; i < students.length; i++){
                if(students[i] instanceof FullTime){
                    FullTime fullTimeStudent = (FullTime) students[i];
                    System.out.println("Exam score of full time student: " + fullTimeStudent.examScore);
                }
            }
        }
    }

    public void main(String[] args){
        Session session = new Session();

        // Populate Student Array with 20 students and dummy scores
        for (int i = 0; i < 20; i++) {
            String type = Math.random() < 0.5 ? "Part-time" : "Full-time";
            Student stu;
            if ("Part-time".equals(type)) {
                stu = new PartTime(i);
            } else {
                stu = new FullTime(i);
            }
            session.students[i] = stu;
        }

        session.avgScore();
        session.printScore();
        session.printPartTime();
        session.printExamScore();
    }



}