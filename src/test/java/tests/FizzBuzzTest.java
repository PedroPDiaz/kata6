package tests;

import org.junit.Test;
import software.ulpgc.kata6.FizzBuzz;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_given_0Fizz0Buzz0FizzBuzz_given_1() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertThat(fizzBuzz.FizzBuzzCheck()).isEqualTo("1");
    }

    @Test
    public void should_given_0Fizz0Buzz0FizzBuzz_given_2() {
        FizzBuzz fizzBuzz = new FizzBuzz(2);
        assertThat(fizzBuzz.FizzBuzzCheck()).isEqualTo("1, 2");
    }

    @Test
    public void should_given_1Fizz0Buzz0FizzBuzz_given_3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertThat(fizzBuzz.FizzBuzzCheck()).isEqualTo("1, 2, Fizz");
    }

    @Test
    public void should_given_1Fizz1Buzz0FizzBuzz_given_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        assertThat(fizzBuzz.FizzBuzzCheck()).isEqualTo("1, 2, Fizz, 4, Buzz");
    }

    @Test
    public void should_given_4Fizz2Buzz1FizzBuzz_given_15() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertThat(fizzBuzz.FizzBuzzCheck()).isEqualTo("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz");
    }


}
