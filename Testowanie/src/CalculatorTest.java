import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
public void onePlusOneShouldEqualsTwo(){
        Calculator calculator = new Calculator();
    Assert.assertEquals(2, calculator.sum(1,1));
    }

    @Test
    public void threePlusThreeShouldFive(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.sum(3,2));

    }
}


