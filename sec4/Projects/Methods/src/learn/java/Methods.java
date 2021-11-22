package learn.java;

public class Methods {
    public static void main(String[] args) {
        // student1 scores
        int s1mathScore = 87;
        int s1scienceScore = 89;
        int s1englishScore = 92;
        int s1ictScore = 93;

        // student1 scores
        int s2mathScore = 83;
        int s2scienceScore = 90;
        int s2englishScore = 86;
        int s2ictScore = 97;

        // Calling method avgScore - student 1
        System.out.println(avgScore(s1mathScore, s1scienceScore, s1scienceScore, s1ictScore));

        // Calling method avgScore - student 2
        System.out.println(avgScore(s2mathScore, s2scienceScore, s2scienceScore, s2ictScore));
    }

    public  static double avgScore(int s1, int s2, int s3, int s4){
        int sum = s1 + s2 + s3 + s4;
        double avg = (double)sum / 4;
        return avg;
    }

}
