import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {

		String title;
		String rating;
		String ans;
		int  soldTickets;
		Scanner input = new Scanner(System.in);
		Movie m;
		
		do {
		System.out.println("Enter the title of the movie: ");
		title = input.nextLine();
		System.out.println("Enter the movie's rating: ");
		rating = input.nextLine();
		System.out.println("Enter the number of tickets sold: ");
		soldTickets = input.nextInt();
		m = new Movie(title,rating,soldTickets);
		
		System.out.println(m.getTitle() + " (" + m.getRating() + "): Tickets sold: " + m.getSoldTickets());
		
		input.nextLine();
		System.out.println("Do you want to continue? (y/n)");
		ans = input.nextLine();
	}while (ans.equals("y") );
		System.out.println("Goodbye");
		input.close();
		
	}

}
