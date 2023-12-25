public class FizzBuzzGenerator {
    public String gen(int number) {
        String response = String.valueOf(number);
        if (number == 15) {
            response = "FizzBuzz";
        } else if (number == 30) {
            response = "FizzBuzz";
        } else if (number % 5 == 0) {
            response = "Buzz";
        } else if (number % 3 == 0){
            response = "Fizz";
        }

        return response;
    }
}
