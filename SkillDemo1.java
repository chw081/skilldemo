import java.util.ArrayList;

public class SkillDemo1 {
    ArrayList<Integer> testScores;

    public SkillDemo1() {
        testScores = new ArrayList<Integer>();
    }

    public void add(int midterm) {
        testScores.add(midterm);
    }

    public double averageScore() {
        int sum = 0;
        for (int i =0; i < testScores.size(); i++) {
            sum += testScores.get(i);
        }
        return sum/testScores.size();
    }

    public static void main(String[] args) {
        SkillDemo1 test = new SkillDemo1();
        test.add(5);
        test.add(2);
        System.out.println(test.averageScore());
    }
}