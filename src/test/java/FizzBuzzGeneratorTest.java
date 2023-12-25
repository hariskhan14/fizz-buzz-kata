import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzGeneratorTest {

    @Test
    public void shouldReturnFizzIfInputIsTrue() {
        //Arrange - requirements
        //Act - performs the actions
        //Assert - test the response
        //Note: writing the assertion first since we know what to test and then go backwards

        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
        String res = fizzBuzzGenerator.gen(3);
        Assert.assertEquals("Fizz", res);
    }
}
