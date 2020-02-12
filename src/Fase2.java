import java.util.Scanner;
public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int startLeapYear = 1948;
		
		//every 4 year is a leap year
		int leapBetween = 4;
		
		//asking the birth's year
		Scanner input = new Scanner(System.in);
		int birthYear = input.nextInt();
		
		int result = 1+((birthYear-startLeapYear)/leapBetween);
		System.out.println(result);

	}

}
