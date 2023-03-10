package Lorry;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed");
		int speed = scan.nextInt();
		System.out.println("Enter the distance");
		int distance = scan.nextInt();
		new PrintTime(speed, distance);
}
}
