import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzGeneratorTest {
    //Arrange - requirements
    //Act - performs the actions
    //Assert - test the response
    //Note: writing the assertion first since we know what to test and then go backwards

    private FizzBuzzGenerator fizzBuzzGenerator;
    @Before
    public void setup() {
        this.fizzBuzzGenerator = new FizzBuzzGenerator();
    }

    @Test
    public void shouldReturnFizzIfInputIs3() {
        String res = this.fizzBuzzGenerator.gen(3);
        Assert.assertEquals("Fizz", res);
    }

    @Test
    public void shouldReturnFizzIfInputIs6() {

        String res = this.fizzBuzzGenerator.gen(6);
        Assert.assertEquals("Fizz", res);
    }

    @Test
    public void shouldReturnFizzIfInputIs9() {

        String res = this.fizzBuzzGenerator.gen(9);
        Assert.assertEquals("Fizz", res);
    }
}
