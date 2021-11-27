/**
 * Rounding documentation
 * @author Tareq
 */
class rounding {
  public static void main(String[] args) {

    // Random number in range 1 - 10;
    double randomNum = Math.floor(Math.random() * 10 + 1);
    System.out.println("\nRandom number");
    System.out.println(randomNum);

    // Round
    System.out.println("\nMath.round()");
    double roundNum = Math.round(100.79);
    System.out.println(roundNum);

    // Math.floor() => rounds to the least nearest integer.
    System.out.println("\nMath.floor()");
    double floorNum = Math.floor(5.26);
    System.out.println(floorNum);
  
    // Math.ceil() => rounds to the greatest nearest integer.
    System.out.println("\nMath.ceil()");
    double ceilNum = Math.ceil(5.26);
    System.out.println(ceilNum);

    // String.format("%.2f", number) 
    // String.format() convert a number to string and round it to given decimal.
    System.out.println("\nString.format(%.2f, number)");
    
    double doubleNum = 10.5456897;
    String formatNum = String.format("%.2f", doubleNum);
    System.out.println(formatNum);
  }
}