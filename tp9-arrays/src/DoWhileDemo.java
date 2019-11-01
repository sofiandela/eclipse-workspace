import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int count = teclado.nextInt();
		
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

	}

}
