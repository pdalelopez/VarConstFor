import java.util.Scanner;
public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int startLeapYear = 1948;
		
		int leapBetween = 4;
		
		Scanner input = new Scanner(System.in);
		
		int birthYear = input.nextInt();
		
		int result = 1+((birthYear-startLeapYear)/leapBetween);
		
		System.out.println(result);

		
	}

}
