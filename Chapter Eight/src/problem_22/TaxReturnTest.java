package problem_22;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class TaxReturnTest {

    @org.junit.jupiter.api.Test
     void getTax() {
        TaxReturn mayuresh = new TaxReturn(45000, 1);

        double actual = mayuresh.getTax();
        double expected = 6450;

        Assert.assertEquals(expected, actual, .001);
    }
}