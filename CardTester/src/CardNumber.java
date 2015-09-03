import java.util.Scanner;

public class CardNumber
	{
		
		static int total = 0;
		static long ddigit = 0;
		static long ddigit10 = 0;
		public static void main(String[] args)
			{
				long [] cardnumb =  new long [16];
				long [] newcardnumb =  new long [16];
				System.out.println("Type sixteen digit number");
				Scanner userInput = new Scanner(System.in);
				long card = userInput.nextLong();
				
				for (int i = 1; i < 16; i++)
					{
						
						cardnumb[i] = card % 10;
						card = card / 10;
						System.out.print(cardnumb[i]);
					}
				
				
			/*	
				for (int i = 1; i <= 16; i++)
					{
						if (i % 2 == 0)
							{
								long digit = card % 10;		//digit = first number							
								ddigit = digit * 2;         // ddigit = two of digit
								
								
								if (ddigit >= 10)  // if ddigit is larger than ten run
									{
										 long ddigit1 = ddigit % 10;  // gets first of two numbers
										 ddigit10 = ddigit / 10;   // gets second number 
										ddigit = ddigit10 + ddigit1; //adds two numbers together
										newcardnumb[i] = ddigit; //fills the position in the array
										System.out.print(newcardnumb[i]); 
									}
								else //ddigit is less than 10
									{
										newcardnumb[i] = ddigit; // fills position on new card number
										System.out.print(newcardnumb[i]);
									}
							}
						
							
						else
							{		
								 long digit = card % 10;	// gets number
								 digit = newcardnumb[i]; // fills position in array
								 System.out.print(newcardnumb[i]); 
							}
						
						total+=newcardnumb[i];
						
					}
				
				*/
				
				
				
				
				
				
				
				System.out.println("");
				
			if (total % 10 == 0)
				{
					System.out.println("Your card number is possibly valid");
				}
			else
				{
					System.out.println("Your card number is not valid");
				}
			}

	}
