import java.util.Scanner;

public class Main {
  public static void main(String args[])
  {
    int grades[] = new int[6];
    int i;
    float total=0, avg;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n\nWelcome to your final grade determination program!\n\n");

    System.out.println("The grading scale is as follows:\n" + "A = 90-100" + "\n" + "B = 80-89.9" + "\n" + "C = 70-79.9" + "\n" + "D = 60-69.9" + "\n" + "F = 0-59.9 \n\n" );

    System.out.println("Please enter the percent grade you recieved on each test as an integer with no symbols.\n\n");

    for(i=0; i<6; i++){
      System.out.println("Enter Grade of Test " + (i+1) + ":");
      grades[i] = scanner.nextInt();
      total = total + grades[i];
    }
    scanner.close();
    avg = total/6;
    System.out.println("\nYour grade is: ");
    if(avg>=90)
    {
      System.out.println("A");
    }
    else if(avg>=80 && avg<90)
    {
      System.out.println("B");
    }
    else if(avg>=70 && avg<80)
    {
      System.out.println("C");
    }
    else if(avg>=60 && avg<70)
    {
      System.out.println("D");
    }
    else
    {
      System.out.println("F");
    }
    System.out.println("\n\nCongratulations on finishing your class! Thank you for using this final grade determination program.");
  }
}