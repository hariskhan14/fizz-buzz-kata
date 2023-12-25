import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzGeneratorTest {
    //Arrange - requirements
    //Act - performs the actions
    //Assert - test the response
    //Note: writing the assertion first since we know what to test and then go backwards

    private FizzBuzzGenerator fizzBuzzGenerator;

    @BeforeEach
    public void setup() {
        this.fizzBuzzGenerator = new FizzBuzzGenerator();
    }

    @ParameterizedTest
    @CsvSource({"3,6,9"})
    void shouldReturnFizzIfInputIsDivisibleBy3(int input) {
        String res = this.fizzBuzzGenerator.gen(input);
        Assertions.assertEquals("Fizz", res);
    }

    @Test
    void returnBuzzIfInputIs5() {
        String res = this.fizzBuzzGenerator.gen(5);
        Assertions.assertEquals("Buzz", res);
    }

    @Test
    void returnBuzzIfInputIs10() {
        String res = this.fizzBuzzGenerator.gen(10);
        Assertions.assertEquals("Buzz", res);
    }

    @Test
    void returnBuzzIfInputIs15() {
        String res = this.fizzBuzzGenerator.gen(15);
        Assertions.assertEquals("Buzz", res);
    }
}
