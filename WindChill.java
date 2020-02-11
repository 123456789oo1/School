import java.util.Scanner;

/*
 * A wind chill calculator
 * Carl Szeless
 * 1/30/20
 */
public class WindChill {
	// method == function
	public static void main(String[] args) {
		
		final double CONSTANT_1 = 35.74;
		final double CONSTANT_2 = 0.6215;
		final double CONSTANT_3 = 35.75;
		final double CONSTANT_4 = 0.16;
		final double CONSTANT_5 = 0.4275;
		double outsideTemp;
		double windSpeed;
		double windChill;
		Scanner input = new Scanner(System.in);
		
		//watch math class video
		
		System.out.println("Enter the Temperature between -45 and 40: ");
		outsideTemp = input.nextDouble();
		while(outsideTemp > 40) {
			System.out.println("The temperture is to high please Enter a new Temperature: ");
			outsideTemp = input.nextDouble();
		}
		while(outsideTemp < -45) {
			System.out.println("The temperture is to low please Enter a new Temperature: ");
			outsideTemp = input.nextDouble();
		}
		System.out.println("You entered: " + outsideTemp);
		System.out.println("Enter the Wind Speed between 5 and 60: ");
		windSpeed = input.nextDouble();
		while(windSpeed > 60) {
			System.out.println("The Wind Speed is to high please Enter a new Wind Speed: ");
			outsideTemp = input.nextDouble();
		}
		while(windSpeed < 5) {
			System.out.println("The Wind Speed is to low please Enter a new Wind Speed: ");
			outsideTemp = input.nextDouble();
		}
		System.out.println("You entered: " + windSpeed);
		windChill = CONSTANT_1 + CONSTANT_2*(outsideTemp) - CONSTANT_3*(Math.pow(windSpeed, CONSTANT_4)) + CONSTANT_5*(outsideTemp)*(Math.pow(windSpeed, CONSTANT_4));
		System.out.println("Your wind chill is: " + windChill);
		input.close();
		
		
	}

}
