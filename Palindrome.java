import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите строку: ");
		
		String str = scan.next();

		if(reverseString(str))
			System.out.print("Является палиндромом!");
		else
			System.out.print("Не является палиндромом!");
	}
	
	public static boolean reverseString(String s) {

		for (int i = 0; i < s.length()/2; i++)
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				return false;
			return true;
	}
}