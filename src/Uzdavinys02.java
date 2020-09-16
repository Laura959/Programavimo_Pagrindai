import java.util.Scanner;

public class Uzdavinys02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	       System.out.println("Iveskite kampa a: ");
	       int a = reader.nextInt();
	       System.out.println("Iveskite kampa b: ");
	       int b = reader.nextInt();
	       int x = 180 - a - b;
	       System.out.println("--------------------------------------------------");
	       System.out.println("Ivesta: " + a + ", "+ b);
	       System.out.println("Gauta: " + x + ".");
	       reader.close();
	}

}
