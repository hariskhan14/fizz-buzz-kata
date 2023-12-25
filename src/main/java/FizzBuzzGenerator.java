public class FizzBuzzGenerator {
    public String gen(int number) {
        String response = String.valueOf(number);
        if (number % 5 == 0) {
            response = "Buzz";
        } else {
            response = "Fizz";
        }

        return response;
    }
}
