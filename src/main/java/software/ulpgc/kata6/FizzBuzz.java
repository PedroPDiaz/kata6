package software.ulpgc.kata6;

public class FizzBuzz {
    private final int numberOfElement;

    public FizzBuzz(int numberOfElement) {
        this.numberOfElement = numberOfElement;
    }

    public int getNumberOfElement() {
        return numberOfElement;
    }

    public String FizzBuzzCheck(){
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < getNumberOfElement()+1; i++) {
            if (isMultiplyOf5(i) && isMultiplyOf3(i)) {result.append("FizzBuzz");}
            else if (isMultiplyOf5(i)) {result.append("Buzz");}
            else if (isMultiplyOf3(i)) {result.append("Fizz");}
            else { result.append(i); }
            if (i < getNumberOfElement()){
                result.append(", ");
            }
        }
        return result.toString();
    }

    private boolean isMultiplyOf5(int i) {
        return i % 5 == 0;
    }

    private boolean isMultiplyOf3(int i) {
        return i % 3 == 0;
    }
}

