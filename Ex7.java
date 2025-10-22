void main(){
	/*Zadanie nr 7. 
	co nowego? metoda nextChar() - nie istnieje w clasie Scanner w Javie
	wiec pobieramy ciąg znaków za pomocą next() lub nextLine() i wyświetlamy pierwszy znak charAt(0)*/

	IO.println("Wpisz jaka ocene dostales: A, B, C czy inne");
	
	//dodajemy clase Scanner
	Scanner sc = new Scanner(System.in);
	char gradeUs = sc.nextLine().charAt(0);
	//convertuje znak w liczbe - switch case nie odczytuje znaków
	int gradeNr = (int) gradeUs;

	
	switch(gradeNr){
		
		case 65: IO.println("Bardzo dobrze!");
		break;
		case 66: IO.println("Dobrze!"); 
		break;
		case 67: IO.println("Zaliczone"); 
		break;
		default: IO.println("Niezaliczone");
		
	}
}