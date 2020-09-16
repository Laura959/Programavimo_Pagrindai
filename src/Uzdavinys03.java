import java.util.Scanner;

public class Uzdavinys03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
      System.out.println("Iveskite kilometrus: ");
      int km = reader.nextInt();
      int m = km * 1000;
      System.out.println("--------------------------------------------------");
      System.out.println("Ivesta: " + km + ";");
      System.out.println("Gauta: " + m + ".");
reader.close();
	}

}
