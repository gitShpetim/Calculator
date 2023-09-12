package hello;
import java.util.Scanner;
public class Calculator {
	
	

		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			
			/*
			 * Name: Shpetim Gashi
			 * Description:
			 * Date created: 03/20/23
			 * Date modified: 04/03/23
			 * Email: ShpetimGashi101@outlook.com
			 * 
			 */
			
			
			String userChoice = "Y"; // we initialize userChoice to "Y" so the loop runs at least once
			while (userChoice.equals("Y")) { 
				/*
				 * we use this initial while loop to continue running the calculator until the user inputs "N"
				 */

		String mode = ""; // Initialize mode variable to an empty string
			while (!mode.equals("standard") && !mode.equals("scientific")) { /*
			* use a while loop to keep asking the user for input until they enter standard or scientific
			*/
			
				System.out.println("choose a mode (standard or scientific): "); //ask the user to choose a mode
				mode = scnr.nextLine(); //read the users input 

				if (mode.equals("standard")) {
					System.out.println("you have chosen standard");
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division: ");
				} else if (mode.equals("scientific")) {
					System.out.println("you have chosen scientific");
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x: ");
				} else {
					System.out.println("you have chosen an incorrect mode");
					mode = "";
				}
			}
			

			String operator = "";
			while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")
					&& !operator.equals("sin") && !operator.equals("cos") && !operator.equals("tan")) {
				System.out.print("choose an operator: ");
				operator = scnr.nextLine();

				if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
					System.out.println("you have chosen " + operator);

				} else if (mode.equals("scientific") && (operator.equals("sin") || operator.equals("cos")
						|| operator.equals("tan"))) {
					System.out.println("you have chosen " + operator);

				} else {
					System.out.println("you have chosen an incorrect operator");
					operator = "";
				}
			}
			
			
			
			

			System.out.println("choose the number amount of values you want to use (up to 3, at least 2): ");
			double numAmount = scnr.nextDouble();
			scnr.nextLine();
	        double num1, num2, num3;
			
	        

	          if (numAmount == 2) {
				System.out.println("enter value 1: ");
				num1 = scnr.nextDouble();
				System.out.println("enter value 2: ");
				num2 = scnr.nextDouble();
				

				double result = 0.0;
				switch (operator) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				case "sin":
					result = Math.sin(num1);
					break;
				case "cos":
					result = Math.cos(num1);
					break;
				case "tan":
					result = Math.tan(num1);
					break;

				default:
					System.out.println("Invalid operator");
					break;
				}
				System.out.println("The result is: " + result);
				
			}
				else if(numAmount == 3) { 
					System.out.println("enter value 1: ");
					num1 = scnr.nextDouble();
					System.out.println("enter value 2: ");
					num2 = scnr.nextDouble();
					System.out.println("enter value 3: ");
					num3 = scnr.nextDouble();
					
					double result = 0.0;
	                switch (operator) {
	                    case "+":
	                        result = num1 + num2 + num3;
	                        break;
	                    case "-":
	                        result = num1 - num2 - num3;
	                        break;
	                    case "*":
	                        result = num1 * num2 * num3;
	                        break;
	                    case "/":
	                        result = num1 / num2 / num3;
	                        break;
	                    case "sin":
	                		result = Math.sin(num1);
	                		break;
	                	case "cos":
	                		result = Math.cos(num1);
	                		break;
	                	case "tan":
	                		result = Math.tan(num1);
	                		break;
	                		
	                	default:
	                		System.out.println("Invalid operator");
	                		break; 
	                }
	                  System.out.println("The result is: " + result);
	              
	                }
				
			
				
		
				
			
			
	                  System.out.println("Do you want to perform another calculation? (Y/N)");
	                  userChoice = scnr.next();
	                  scnr.nextLine();
	                  
	                  if (userChoice.equals("N")) {
	                      System.out.println("Thank you for using my calculator. Have a nice day!");
	                  }
	                  
	              } while (userChoice.equals("Y"));
	              
	              scnr.close();
			}
	                          
	                  }




