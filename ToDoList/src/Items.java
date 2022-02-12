import java.util.ArrayList;
import java.util.Scanner;

public class Items {

	// create arraylist called todoList
	ArrayList<String> todoList = new ArrayList<String>();

	// constructor that takes string and inserts into todoList
	public void addItems(String item) {
		todoList.add(item);
	}

	// method that removes items from todoList
	public void removeItem(int item) {
		todoList.remove((item - 1));
	}

	// method that prints out todoList
	public void printList() {
		for (int i = 0; i < todoList.size(); i++) {
			System.out.println("   " + (i + 1) + ": " + todoList.get(i));
		}
	}

	// method that returns todoList
	public ArrayList<String> getList() {
		return todoList;
	}

	// method that returns size of todoList
	public int getSize() {
		return todoList.size();
	}

	public void greeting() {
		System.out.println("Welcome to your To-Do List!");

	}

	public void menu() {
		System.out.println();
		System.out.println("Please pick an action from below: ");
		// System.out.println();
		System.out.println("   1. Add an item");
		System.out.println("   2. Remove an item");
		System.out.println("   3. Print the list");
		System.out.println("   4. Exit");
		System.out.println();
		System.out.print("Your choice: ");
	}

	public void menuSwitch(int choice) {
		switch (choice) {
		case 1:
			System.out.println();
			System.out.println("Enter an item to add to the list: ");
			Scanner input = new Scanner(System.in);
			String item = input.nextLine();
			addItems(item);
			break;
		case 2:
			System.out.println();
			System.out.println("Enter item index number to remove from the list: ");
			System.out.print("Your choice: ");
			Scanner input2 = new Scanner(System.in);
			int item2 = input2.nextInt();
			removeItem(item2);
			break;
		case 3:
			System.out.println();
			if (todoList.isEmpty()) {
				System.out.println("You have nothing to do!");
			} else {
				System.out.println("The list has " + getSize() + " total items:");
				printList();
			}
			break;
		case 4:
			System.out.println();
			System.out.println("Goodbye!");
			break;
		default:
			System.out.println();
			System.out.println("Invalid choice");
			break;
		}
	}

	public void menuLoop() {
		int choice;
		do {
			menu();
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			menuSwitch(choice);
		} while (choice != 4);

	}
}
