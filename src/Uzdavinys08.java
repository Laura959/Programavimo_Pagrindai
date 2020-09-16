import java.util.Scanner;

public class Uzdavinys08 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite centu skaiciu ");
		int ct = reader.nextInt();
		int eg = ct / 100;
	    int ctg = ct % 100;
		System.out.println("--------------------------------------------------");
		System.out.println("Ivesta: " + ct + " ct");
		System.out.println("Gauta: " + eg + " Eur ir " + ctg + " ct.");
		reader.close();

	}

}
