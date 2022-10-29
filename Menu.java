import java.util.*;

class Menu {
	public static void main(String args[]) {
		int choice;
		String order;
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Tea");
		System.out.println("2. Cold drinks");
		System.out.println("3. Samosa");
		System.out.println("Enter choice(1-3):");
		choice = sc.nextInt();
		// logic
		switch (choice) {
			case 1: {
				order = "tea";
				System.out.println("Price is 50");
			}
				break;
			case 2: {
				order = "cold drinks";
				System.out.println("Price is 100");
			}
				break;
			case 3: {
				order = "samosa";
				System.out.println("Price is 35");
			}
				break;
			default:
				order = "not in menu";
		}
		// output
		System.out.println("your order is" + order);
	}
}
