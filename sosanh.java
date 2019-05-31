package baitap;
import java.util.Scanner;
public class sosanh {
	public static void main(String[] args) {
		int firstVariable, secondVariable;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        firstVariable = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        secondVariable = scanner.nextInt();
        System.out.println("Kết quả của so sánh bằng " + firstVariable + " và " + 
                secondVariable + " là " + (firstVariable == secondVariable));
        System.out.println("Kết quả của so sánh không bằng " + firstVariable + " và " + 
                secondVariable + " là " + (firstVariable != secondVariable));
        System.out.println("Kết quả của so sánh lớn hơn " + firstVariable + " và " + 
                secondVariable + " là " + (firstVariable > secondVariable));
        System.out.println("Kết quả của so sánh lớn hơn hoặc bằng " + firstVariable + " và " + 
                secondVariable + " là " + (firstVariable >= secondVariable));
        System.out.println("Kết quả của so sánh nhỏ hơn " + firstVariable + " và " + 
                secondVariable + " là " + (firstVariable < secondVariable));
        System.out.println("Kết quả của so sánh nhỏ hơn hoặc bằng " + firstVariable + " và " + 
                secondVariable + " là " + (firstVariable <= secondVariable));
	}

}
