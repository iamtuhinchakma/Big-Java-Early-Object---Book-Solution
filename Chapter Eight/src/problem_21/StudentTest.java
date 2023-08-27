package problem_21;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void addScore() {
        Student mayuresh = new Student(5);

        mayuresh.addScore(80);
        mayuresh.addScore(90);
        mayuresh.addScore(79);
        mayuresh.addScore(100);
        mayuresh.addScore(88);
        double expectedScores[] = {80, 90, 79, 100, 88};

        Assert.assertArrayEquals(expectedScores, mayuresh.getScores(), 0);
    }

    @Test
    void sum() {
        Student mayuresh = new Student(5);

        mayuresh.addScore(80);
        mayuresh.addScore(90);
        mayuresh.addScore(79);
        mayuresh.addScore(100);
        mayuresh.addScore(88);

        double expectedSum = 437;

        Assert.assertEquals(expectedSum, mayuresh.sum(), 0);
    }

    @Test
    void getMinimum() {
        Student mayuresh = new Student(5);

        mayuresh.addScore(80);
        mayuresh.addScore(90);
        mayuresh.addScore(79);
        mayuresh.addScore(100);
        mayuresh.addScore(88);

        double expectedMinimum = 79;

        Assert.assertEquals(expectedMinimum, mayuresh.getMinimum(), 0);
    }
}