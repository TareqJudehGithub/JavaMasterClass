package ControlFlow;

public class SwitchStatement {
    public static void main(String[] args){

        // Check letter
        char letter = 'B';
        switch (letter){
            case 'A': case 'B': case'C': case 'D': case 'E':
                System.out.println("Found");
                break;
            default:
                System.out.println("Not found!");
                break;
        }

        // Check month
        String month = "january";
        String season = "June";
        switch (month.toLowerCase()){
            case "January": case "February": case "December":
                season = "Winter";
                break;
            case "March": case "April": case "May":
                season = "Spring";
                break;
            case "June": case "July": case "August":
                season = "Summer";
                break;
            case "September": case "October": case "November":
                season = "Autumn";
                break;
        }
        System.out.println(season);
    }

}
