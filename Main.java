import java.util.Scanner;
class Main{
	public static void main(String[] args){
	
	Scanner userIn = new Scanner(System.in);
	Scanner userInDouble = new Scanner(System.in);
	//pierwszy punkt komunikat do klienta
	System.out.println("Hello, please provide PIN");
	//wprowadzenie zmiennych dla programu
	int pinUser = userIn.nextInt();
	int pinCorrect = 1111;
	double saldo = 1000000.0;
	/*sprawdzenie PINu, jeżeli poprawny jest wykonywany zestaw instukcji 1-wpłaty; 2-wypłaty
	3-wykaz salda*/
	if(pinUser==pinCorrect){
	System.out.println("PIN - correct");
	System.out.println("What the oparation you want to do?");
	System.out.println("1 - Cash in");
	System.out.println("2 - Cash out");
	System.out.println("3 - Balance check");
	
	int operacja = userIn.nextInt();
	
		if(operacja ==1){
			System.out.println("Please provide amount:");
			double cashIn = userInDouble.nextDouble();
			if(cashIn<=0){
				System.out.println("Incorrect amount, please take your card and try again");
			}else{
				saldo+=cashIn;
				System.out.println("Your balance is: "+saldo);
				System.out.println("Please take your card and have a nice day!");
			}
		
		}else if(operacja ==2){
			System.out.println("Please provide amount:");
			double cashOut = userInDouble.nextDouble();
			if(cashOut<=0){
				System.out.println("Incorrect amount, please take your card and try again");
			}else if(cashOut<=saldo){
				saldo-=cashOut;
				System.out.println("Your balance is: "+saldo);
				System.out.println("Please take your card and have a nice day!");
			}else if(cashOut>=saldo){
				System.out.println("Not inofe balance on your account, please take your card and try again");
			}
		}else if(operacja ==3){
			System.out.println("Your balance is: "+saldo);
		
		}else{
			System.out.println("Unknow operation, please take your card and try again.");
		}
		
		}else{
		System.out.println("Wrong PIN, take your card and try again.");
		}
	
	}

}
