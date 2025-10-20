void main(){

	//troche zmiennie kod - o mozliwosc dodania wiecej niz 1 przypadek, dla ulatwienia sprawdzana czy blok switch dobrze dziala
	//takze popraktykuje nowej metody codu, dla udostepnienia mozliwosci wprowadzania dancyh od uzytkownika.
	
	//int day = IO.readln(); //to jest duzo mniejsze od uzywania obiektu Scanner. Zobaczymy czy dziala.
	//wyglada na to ze readln() - moze wczytac int - moze to przez koncowke ln?
	
	//int day = IO.readInt();// no niestety nie dziala - skorzystam ze starego dobrego Scannera
	
	Scanner sc = new Scanner(System.in);
	IO.println("Please enter nr of day, and we switch word");
	int day = sc.nextInt();
	
	
	switch(day){
		case 1: IO.println("Monday");
		break;
		case 2: IO.println("Tusday");
		break;
		case 3: IO.println("Wednesday");
		break;
		case 4: IO.println("Thursday");
		break;
		case 5: IO.println("Friday");
		break;
		default: IO.println("Weekend");
	}
	
	// Dziala - proste skromne, ale dziala.

}