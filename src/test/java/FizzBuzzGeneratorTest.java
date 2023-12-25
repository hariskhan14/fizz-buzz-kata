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
    @CsvSource({"1","2","4"})
    void shouldReturnNumberItself(int input) {
        String res = this.fizzBuzzGenerator.gen(input);
        Assertions.assertEquals(String.valueOf(input), res);
    }

    @ParameterizedTest
    @CsvSource({"3","6","9"})
    void shouldReturnFizzIfInputIsDivisibleBy3(int input) {
        String res = this.fizzBuzzGenerator.gen(input);
        Assertions.assertEquals("Fizz", res);
    }

    @ParameterizedTest
    @CsvSource({"5","10","20"})
    void shouldReturnBuzzIfInputIsDivisibleBy5(int input) {
        String res = this.fizzBuzzGenerator.gen(input);
        Assertions.assertEquals("Buzz", res);
    }

    @Test
    void shouldReturnFizzBuzzIfNumberIs15() {
        String res = this.fizzBuzzGenerator.gen(15);
        Assertions.assertEquals("FizzBuzz", res);
    }

    @Test
    void shouldReturnFizzBuzzIfNumberIs30() {
        String res = this.fizzBuzzGenerator.gen(30);
        Assertions.assertEquals("FizzBuzz", res);
    }

    @Test
    void shouldReturnFizzBuzzIfNumberIs45() {
        String res = this.fizzBuzzGenerator.gen(45);
        Assertions.assertEquals("FizzBuzz", res);
    }
}
