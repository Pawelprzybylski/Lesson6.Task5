import org.junit.Assert;
import org.junit.Test;

public class MainTest {
   @Test

    public void shouldNumberIsEven(){
       //give
       int number=10;

       //when
       boolean numberEven= Main.verificationEvenNumber(number);

       //then
       Assert.assertEquals(true,numberEven);



   }

}
