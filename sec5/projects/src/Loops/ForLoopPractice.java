package Loops;

public class ForLoopPractice {
    public static void main(String[] args) {
        calculateInterest(4597, 2.0);

    }
    public static void calculateInterest(double amount, double interestRate){
        for (int i = 2; i <= 8; i++){
            System.out.println("Interest = $" + String.format("%.2f", amount * (interestRate/100)));
            interestRate++;
        }

    }


}
