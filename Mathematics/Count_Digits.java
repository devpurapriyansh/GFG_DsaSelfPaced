import java.util.Scanner;

public class Count_Digits {

  public static void main(String[] args) {
    System.out.print("Enter the number : ");
    var sc = new Scanner(System.in);

    int num = sc.nextInt();

    int count = 0, n = num;

    while (n != 0) {
      n = n / 10;
      count++;
    }
    System.out.println("The length of the number was : " + count);
  }
}
