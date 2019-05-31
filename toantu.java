package baitap;

import java.util.Scanner;

public class toantu {

	public static void main(String[] args) {
		int a,b;
		Scanner so = new Scanner(System.in);
		
		System.out.println("Nhập giá trị a: ");
		a = so.nextInt();
		
		System.out.println("Nhập giá trị b: ");
		b = so.nextInt();
		
		int tong = a+b;
		System.out.println("Tổng giá trị: "+a+" + "+b+" = "+tong);
		
		int hieu = a-b;
		System.out.println("Hiệu giá trị: "+a+" - "+b+" = "+hieu);
		
		int tich = a*b;
		System.out.println("Tích giá trị: "+a+" * "+b+" = "+tich);
		
		int thuong = a/b;
		System.out.println("Thương giá trị: "+a+" / "+b+" = "+thuong);
	}

}
