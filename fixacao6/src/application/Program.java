package application;

import java.util.Scanner;
import entitites.Hotel;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hotel[] vect = new Hotel[10];

		System.out.println("################WELLCOME TO THE HOTEL################");
		System.out.print("How many rooms will be rented?");
		int number = sc.nextInt();

		for (int i = 0; i < number; i++) {

			System.out.println("Rent #" + i + ":");

			System.out.print("Enter the name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter the email: ");
			String email = sc.nextLine();
			System.out.print("Enter the room: ");
			int room = sc.nextInt();

			vect[room] = new Hotel(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}

			sc.close();
		}

	}
}
