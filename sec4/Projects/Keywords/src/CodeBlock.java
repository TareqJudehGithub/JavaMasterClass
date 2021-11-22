public class CodeBlock {
    public static void main(String[] args){

        // declare int variable score and initialize it a '500' value;
        int score = 60;


        if (score >= 90) {
            System.out.println("Perfect score!");
        }
        else if (score >= 80 && score < 90){
            System.out.println("Very good score!");
        }
        else if (score >= 70 && score < 80){
            System.out.println("Good score!");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println("Finished executing code");

    }
}
