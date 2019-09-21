import java.util.Scanner;

public class encrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int encryptVal,i,temp;
		int arr[] = new int [4];
		
		
		System.out.println("Please enter a 4-Digit integer:");
		// Receiving and testing if user input is valid
		while (true) { 
			encryptVal = scnr.nextInt();
			if ((encryptVal > -1 ) && (encryptVal <= 9999)) 
				break;
			System.out.println("The value you have entered is not a 4-Digit integer, please try again.");
		}
		// Separating digits
		arr[0] = (encryptVal / 1000);
		arr[1] = (encryptVal / 100) % 10;
		arr[2] = (encryptVal / 10) % 10;
		arr[3] = (encryptVal % 10);
		
		// Commencing first step of encryption
		for (i = 0; i < 4; i++) {
			arr[i] = (arr[i] + 7) % 10; 
		}
		
		// Commencing second step of encryption
		for (i = 0; i < 2; i++) {
			temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp;
		}
				
		// Printing encrypted value
		System.out.println("The encrypted value is : " + arr[0] + arr[1] + arr[2] + arr[3]);
		scnr.close();
	}
}
