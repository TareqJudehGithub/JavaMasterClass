package String;

public class TwoDArray {
    public static void main(String[] args){
        englishAverage()
    }
    /**
     * Looping over 2D array
     */
    public static double englishAverage(int [][] grades, int student){
        int total = 0;
        int subjects = grades.length;

        for (int i = 0; i < subjects; i++){
            total += grades[student][i];
        }
        double avg_grades = total / (double) subjects;
        return avg_grades;
    }
}