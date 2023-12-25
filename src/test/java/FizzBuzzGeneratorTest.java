import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzGeneratorTest {

    @Test
    public void shouldReturnFizzIfInputIs3() {
        //Arrange - requirements
        //Act - performs the actions
        //Assert - test the response
        //Note: writing the assertion first since we know what to test and then go backwards

        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
        String res = fizzBuzzGenerator.gen(3);
        Assert.assertEquals("Fizz", res);
    }
    @Test
    public void shouldReturnFizzIfInputIs6() {

        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
        String res = fizzBuzzGenerator.gen(3);
        Assert.assertEquals("Fizz", res);
    }

    @Test
    public void shouldReturnFizzIfInputIs9() {

        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
        String res = fizzBuzzGenerator.gen(3);
        Assert.assertEquals("Fizz", res);
    }
}
