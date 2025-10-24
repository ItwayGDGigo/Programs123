void main(){
	
	IO.println("Hello, please put your card");
	
	int correctPin = 1111;
	
	IO.println("Thank you, please provide PIN");
	
	//classa Scanner, dodajemy mozliwosc interakcji uzytkownika
	
	Scanner sc = new Scanner(System.in);
	
	int pin = sc.nextInt();
	
	while(pin==correctPin){
		IO.println("Correct");
		break;
		
	}
	while(pin!=correctPin){
		IO.println("Please try again");
		pin=sc.nextInt();
		
	}
	//if(true){
	//		IO.println("PIN correct");
	//	}else{
	//		IO.println("Incorrect PIN, try again");
	//	}			
	
	
	
	
	
}