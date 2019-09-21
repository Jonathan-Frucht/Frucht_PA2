import java.util.Scanner;

public class poll {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String topics[] = {"Crab","Bear","Bird","Goat","Fish"};
		int responses[][] = new int[5][10];
		int pointTotal[] = new int[5];
		int max[],low[]; 
		int i,j,userInput,avg,count;
		
		// max[0] holds the total points,max[1] holds the topic
		max = new int[2];
		
		// low[0] holds the total points,low[1] holds the topic
		low = new int[]{9999,0};
		
		// Initializing values to zero
		userInput = 0;
		avg = 0;
		count = 0;
		
		System.out.println("Welcome to Poll!\n");
		
		
		while(userInput != -1)
		{
			System.out.println("Please rate these 5 topics from 1 (least important) to 10 (most important)");
			System.out.println("Enter -1 to continue to the summary.");
			
			for (i =0;i<5;++i)
			{
				System.out.print(topics[i] + ": ");
				userInput = scnr.nextInt();
				// -1 will exit the loop and print the summary
				if (userInput == -1) 
					break;
				// Invalid input will allow the user to correct themselves
				if ((userInput >10) || (userInput <-1) || (userInput == 0)) 
				{
					System.out.println("Sorry but that value is invalid, please try again!");
					--i;
					continue;
				}
				// Incrementing response count & saving total points
				++responses[i][userInput-1];
				pointTotal[i] = pointTotal[i] + userInput;
			}
			if (userInput == -1) 
				break;
			++count;
			System.out.println();
		}
		
		
		System.out.println("Summary of the poll:");
		System.out.print("     ");
		for ( j = 1; j <= 10; ++j)
			System.out.printf("%4d    ",j);
		System.out.println();
		for (i = 0;i < 5; ++i)
		{
			System.out.print("\n" + topics[i] + "|");
			for (j = 0; j < 10; ++j)
			{
				System.out.printf("%4d   |",responses[i][j]);
				avg = avg + responses[i][j];
			}
			if (count != 0)
				avg = pointTotal[i]/count;
			System.out.print(" Average score: " + avg);
		}
		
		// Determing which topics recieved the highest/lowest amount of points
		for (i = 0; i < 5; ++i)
			if (max[0] < pointTotal[i])
			{
				max[0] = pointTotal[i];
				max[1] = i;
			}
		
		for (i = 0; i < 5; ++i)
			if (low[0] > pointTotal[i])
			{
				low[0] = pointTotal[i];
				low[1] = i;
			}
		
		
		System.out.printf("\n\nThe topic of %s was rated the highest with a total of %d points.",topics[max[1]],max[0]);
		System.out.printf("\nThe topic of %s recieved the lowest with a total of %d points.",topics[low[1]],low[0]);
		scnr.close();
	}
}
