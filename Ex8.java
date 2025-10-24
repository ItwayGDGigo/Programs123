void main() throws InterruptedException{
	
	int correctPin = 1111;
	
	IO.println("Hello, please put your card");
	
	//zeby nie bylo to takie nudne dodam wyświetlanie komunikatu Please wait... 
	//dajmy czas podzespołam na rozpoznanie karty przed komunikatem o wprowadzenia PIN.
	//skorzystalem z www: https://stackoverflow.com/questions/23283041/how-to-make-java-delay-for-a-few-seconds
	
	Thread.sleep(4000);
	
	IO.println("Please wait, checking your card");
	
	Thread.sleep(5000);
	
	IO.println("Ok, now please provide PIN");
	
	//classa Scanner, dodajemy mozliwosc interakcji uzytkownika
	
	Scanner sc = new Scanner(System.in);
	
	int pin = sc.nextInt();
	//użytkownik wprowadza PIN - program poruwnuje go z poprawnym
	while(pin==correctPin){
		IO.println("Correct");
		break;
		
	}
	while(pin!=correctPin){
		IO.println("Please try again");
		pin=sc.nextInt();
		
	}
	/* Zadanie 8: Napisz program, który symuluje działanie automatu bankowego. Program ma
	rozkładać wprowadzaną przez użytkownika kwotę na banknoty o nominałach:
	100 zł = A/ 50 zł =B/ 20 zł =C/ 10 zł =D/ 5 zł =E/ 2 zł =F/ 1 zł =G.
	Przydział banknotów ma być moźliwie optymalny, czyli liczba banknotów powinna być jak najmniejsza.
	*/
	//banktoty A-G - gdzie bedziemy zapisywać dane ile banknotów wpadło.
	int A; int B; int C; int D; int E; int F; int G;
	
	//użytkownik wpisuje ile wpłaca gotówki
	IO.println("Declare amount you want to pay");
	int cashIn = sc.nextInt();
	
	// block operacyjny, ktory filtruje banknoty
	while(true){
		
		A=cashIn/100;
		cashIn=cashIn-(A*100);
		IO.println("Banknotow nominalem 100 zl jest: "+A);
		B=cashIn/50;
		cashIn=cashIn-(B*50);
		IO.println("Banknotow nominalem 50 zl jest: "+B);
		C=cashIn/20;
		cashIn=cashIn-(C*20);
		IO.println("Banknotow nominalem 20 zl jest: "+C);
		D=cashIn/10;
		cashIn=cashIn-(D*10);
		IO.println("Banknotow nominalem 10 zl jest: "+D);
		E=cashIn/5;
		cashIn=cashIn-(E*5);
		IO.println("Banknotow nominalem 5 zl jest: "+E);
		F=cashIn/2;
		cashIn=cashIn-(F*2);
		IO.println("Banknotow nominalem 2 zl jest: "+F);
		G=cashIn/1;
		cashIn=cashIn-(G);
		IO.println("Banknotow nominalem 1 zl jest: "+G);
		break;
	}
	
	
	
	
	
	
}