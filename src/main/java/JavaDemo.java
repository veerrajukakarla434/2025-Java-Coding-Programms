import java.util.Scanner;

public class JavaDemo {

	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);      
        String myString = scanner.nextLine();
        System.out.println("String:"+myString);
        scanner.close();
	}

}
