import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldNumberIsEven() {
        //give
        int number = 10;
        //when
        boolean numberEven = Main.isEven(number);
        //then
        Assert.assertEquals(true, numberEven);
    }

    @Test
    public void shouldNumberIsOdd() {
        //give
        int number = 9;
        //when
        boolean numberEven = Main.isEven(number);
        //then
        Assert.assertEquals(false, numberEven);
    }

}
