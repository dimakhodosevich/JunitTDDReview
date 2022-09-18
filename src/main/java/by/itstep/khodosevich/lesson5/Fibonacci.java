package by.itstep.khodosevich.lesson5;

public class Fibonacci {

    // 1 1 2 3 5 8 13
    public int getFibonacciNumber(int number){

        if(number>=1 && number<=2){
            return 1;
        }

        int firstNumber = 1;
        int secondNumber = 1;
        int fibonacci = firstNumber+secondNumber;

        for(int i = 4; i<=number; i++){
            firstNumber = secondNumber;
            secondNumber = fibonacci;
            fibonacci = firstNumber+secondNumber;
        }

        return fibonacci;
    }
}
