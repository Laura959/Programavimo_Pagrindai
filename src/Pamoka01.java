import java.util.Scanner;

public class Pamoka01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
      System.out.println("Iveskite krastine a: ");
      int a = reader.nextInt();
      System.out.println("Iveskite krastine b: ");
      int b = reader.nextInt();
      System.out.println("Iveskite krastine c: ");
      int c = reader.nextInt();
      int Perimetras = a + b + c;
      System.out.println("Trikampio perimetras: " + Perimetras);
      System.out.println("--------------------------------------------------");
      System.out.println("Ivesta: " + a + ", "+ b + ", "+ c);
      System.out.println("Gauta: " + Perimetras);
      reader.close();
     
     
       
    }
}
	


