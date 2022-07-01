import java.util.Scanner;
public class starinput{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    for(int i=n;i>0;i--)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}