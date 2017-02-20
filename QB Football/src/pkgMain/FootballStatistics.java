package pkgMain;

import java.util.Scanner;

public class FootballStatistics {

	public static void main(String[] args) {
		//Create Scanner Object
				Scanner input = new Scanner(System.in);
				
				
				//Prompt user for inputs for all stats
				System.out.print("Enter the number of touchdowns: ");
				int td = input.nextInt();
				
				System.out.print("Enter the total yards: ");
				double yards = input.nextDouble();
				
				System.out.print("Enter the number of interceptions: ");
				int intercps = input.nextInt();
				
				System.out.print("Enter the number of completions: ");
				int comp = input.nextInt();
				
				System.out.print("Enter the number of attempted passes: ");
				int att = input.nextInt();
				
				double a, b, c, d;
				
				a = ((comp/att)-0.30)*5;
				if (a > 2.375)
					a = 2.375;
				else if (a < 0)
					a = 0;
				
				b = ((yards/att)-3)*0.25;
				if (b > 2.375)
					b = 2.375;
				else if (b < 0)
					b = 0;
				
				c = (td/att)*20;
				if (c > 2.375)
					c = 2.375;
				else if (c < 0)
					c = 0;
				
				d = 2.375 - (intercps/att)*25;
				if (d > 2.375)
					d = 2.375;
				else if (d < 0)
					d = 0;
			
				double passerRating = ((a + b + c + d)/6)*100;
				
				System.out.println("The Passer Rating with inputted stats is " + passerRating);

	}

}
