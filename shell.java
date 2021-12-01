import java.util.Scanner;

public class shell {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hit ENTER without input to Exit.");
		while(true) {
			System.out.print("Laggo > ");
			String text = scanner.nextLine();
			if (text.equals("")) {
				System.out.println("User has exit the program.");
				break;
			}
			String result = Laggo.run("<stdin>", text);
			if (result == null) {
				System.out.print("");;
			} else {
				System.out.println(result);
			}
		} 
	}
}
