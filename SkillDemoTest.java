import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {

    @Test
    public void averageScoreOdd() {
        SkillDemo1 test = new SkillDemo1();
        test.add(5);
        test.add(2);
        boolean actual = test.averageScore() == 3.5;
        assertEquals(true, actual);
    }
}

/*
javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemoTest.java
java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore SkillDemoTest
ssh cs15lsp22adp@ieng6.ucsd.edu
*/