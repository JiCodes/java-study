import java.util.*;

class Student {
    String name;
    List<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        quizScores = new ArrayList<>();
    }

    public void addQuizScore(int quizScore) {
        quizScores.add(quizScore);
    }
    // Getter
    public List<Integer> getQuizScores() {
        return quizScores;
    }
}

class PartTimeStudent extends Student {
    public PartTimeStudent(String name) {
        super(name);
    }
}

class FullTimeStudent extends Student {
    int[] examScores;

    public FullTimeStudent(String name) {
        super(name);
    }

    public void setExamScores(int examScores[]) {
        this.examScores = examScores;
    }
    public int[] getExamScores() {
        return examScores;
    }
}