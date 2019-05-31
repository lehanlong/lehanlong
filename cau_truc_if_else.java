package baitap;

import java.util.Scanner;

public class cau_truc_if_else {

	public static void main(String[] args) {
		int number;
		Scanner so = new Scanner(System.in);
		System.out.println("Nhập vào số cần kiểm tra: ");
		number = so.nextInt();
		
		if (number % 2==0) {
			System.out.println(number + " là số chẵn");
		}
		else {
			System.out.println(number + " là số lẻ");
		}
	}

}
