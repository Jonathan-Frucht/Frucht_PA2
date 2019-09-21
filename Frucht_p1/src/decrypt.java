import java.util.Scanner;

public class decrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int decryptVal,i,temp;
		int arr[] = new int [4];
		
		System.out.println("Please enter a 4-Digit integer:");
		// Receiving and testing if user input is valid
		while (true) { 
			decryptVal = scnr.nextInt();
			if ((decryptVal > -1 ) && (decryptVal <= 9999)) 
				break;
			System.out.println("The value you have entered is not a 4-Digit integer, please try again.");
		}
		
		// Separating digits
		arr[0] = (decryptVal / 1000);
		arr[1] = (decryptVal / 100) % 10;
		arr[2] = (decryptVal / 10) % 10;
		arr[3] = (decryptVal % 10);
				
		// Commencing first step of decryption
		for (i = 0; i < 2; i++) {
			temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp;
		}	
		
		// Commencing second step of encryption
		for (i = 0; i < 4; i++) {
			arr[i] = (arr[i] + 3) % 10; 
		}
		
		// Printing decrypted value
		System.out.println("The decrypted value is : " + arr[0] + arr[1] + arr[2] + arr[3]);
		scnr.close();
	}
}