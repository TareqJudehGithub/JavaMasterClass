package learn.java;

public class Challenge {
    public static void main(String[] args) {

        // Calling calculateHighScorePosition method with different scores
        int p1Score = calculateHighScorePosition(1500);
        int p2Score = calculateHighScorePosition(99);
        int p3Score = calculateHighScorePosition(400);
        int p4Score = calculateHighScorePosition(750);

        displayHighScorePosition("Tim", p1Score);
        displayHighScorePosition("Sarah", p2Score);
        displayHighScorePosition("Emma", p3Score);
        displayHighScorePosition("Ali", p4Score);

    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000) {
            return 1;
        }
        else if (score >= 500 && score < 1000) {
            return 2;
        }
        else if (score >= 100 && score < 500) {
            return 3;
        }
        else {
            return 4;
        }
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get position " + position + " on the high score table.");
    }
}

