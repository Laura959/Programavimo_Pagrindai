import java.util.Scanner;

public class Uzdavinys04 {

	public static void main(String[] args) {
	   Scanner reader = new Scanner(System.in);
       System.out.println("Iveskite kilometrus: ");
       int km = reader.nextInt();
       System.out.println("Iveskite metrus: ");
       int m = reader.nextInt();
       int metrai = km*1000 + m;
       System.out.println("--------------------------------------------------");
       System.out.println("Ivesta: " + km + " km ir " + m + " m");
       System.out.println("Gauta: " + metrai + ".");
       reader.close();
	}

}
