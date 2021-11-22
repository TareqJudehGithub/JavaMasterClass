class Statements {
    public static void main(String[] args){

        // declaration statement
        int finalScore = 50;

        // Expression statement (initialize finalScore with a value of 60)
        finalScore = 60;

        /*  increment operator before and after the variable.
            IF the operator (prefix)was set before the variable, it will first be reflected on the variable,
            and then be printed. But if the prefix was set after, print method will print the original value.

        */
        System.out.println(--finalScore);
    }
}