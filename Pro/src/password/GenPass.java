/****
 * created by Atchaya, keshaw shree,
 * Program to generate password
 * gmail: shreeatchayadevi@gmail.com
 * 		  keshawmoorthy@gmail.com
 */
package password;
import java.util.*;
public class GenPass {
	
		public static void main(String[] args) 
		{ 
			System.out.println("---PLEASE WAIT---");
			int length = 10; 
			System.out.println(Password(length)); 
			int length1 = 4; 
			System.out.println(OTP(length1)); 
		}  
		static char[]Password(int len) 
		{ 

			System.out.println("Generating password"); 
			System.out.print("Your new password is : "); 

		 
			String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
			String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
			String numbers = "0123456789"; 
			String symbols = "!@#$%^&*_=+-/.?<>)"; 
					
			String values = Capital_chars + Small_chars + 
							numbers + symbols; 
 
			Random rndm_method = new Random(); 

			char[] password = new char[len]; 

			for (int i = 0; i < len; i++) 
			{ 
				password[i] = 
				values.charAt(rndm_method.nextInt(values.length())); 

			} 
			return password; 
		} 

	static char[] OTP(int len) 
	{ 
		System.out.println("Generating OTP"); 
		System.out.print("You OTP is : "); 

		String numbers = "0123456789"; 

		 
		Random rndm_method = new Random(); 

		char[] otp = new char[len]; 

		for (int i = 0; i < len; i++) 
		{ 
		
			otp[i] = 
			numbers.charAt(rndm_method.nextInt(numbers.length())); 
		} 
		return otp; 
	} 
 
} 
