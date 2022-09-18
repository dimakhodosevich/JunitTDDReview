package by.itstep.khodosevich.lesson3;

public class Factorial {
    public int getFactorial(int number){
        int result = 1;

        for (int i = 2; i <= number; i++) {
            result*=i;
        }

        return result;
    }
}
