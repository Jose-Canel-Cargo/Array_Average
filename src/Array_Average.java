import java.util.Arrays;
import java.util.Scanner;

public class Array_Average {
    public static void main(String[] args) {

    double[] inputArray = new double[10];
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter ten double numbers to fill the array and return the average of your inputs: ");

    for(int i = 0; i < inputArray.length; i++) {
  
      inputArray[i] = scanner.nextDouble(); 
    }
    
    scanner.close();
    
    System.out.println("\nYour inputs are the following: " + Arrays.toString(inputArray));

    int integerArrayAverage = (int) average(inputArray);
    double doubleArrayAverage = average(inputArray);
    
    System.out.println("\nThe (integer) average of your inputs is: " + integerArrayAverage);
    System.out.println("\nThe (double) average of your inputs is: " + doubleArrayAverage);
  }

  public static int average(int[] array){
    int sum = 0;
    
    for (int number : array){
      sum += number;
      
    }
    
    int length = array.length;
    int average = sum / length;
    
    return average;
  }
    
  public static double average(double[] array){

    double sum = 0;
    
    for (double number : array){
      sum += number;
    }
    
    double length = array.length;
    double average = sum / length;
    
    return average;  
  }
}
