void main(){

//A = __________(-15__________-10]______(-5_______0)_______(5_________10)_____________
//B = (-nies.__________-13]________(-8_______-3]______________________________
//C = ______________________________________[-4________________+nies)
//ABC=BBBBBBBBBBBabababababAAAAAA00BBBBBababABCacaCCCCCCCCCCacacacacacacCCCCC
	
	//Output - info dla usera
	IO.println("Wpisz liczbę a ja ci podam w kóre zbiory ona wchodzi");
	
	//Input - user wprowadza danne + inicjalizacja zmiennej typu int o nazwie "number"
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	//instrukcja warunkowa która sprawdza do jakiego zbioru nażeli liczba wprowadzona przez usera.
	
	if(number<=-15){
		IO.println("Twoj numer nalezy do zbioru: B");
	}else if(number>-15 && number<=-13){
		IO.println("Twoj numer nalezy do zbioru: A i B");
	}else if(number>-13 && number<=-10){
		IO.println("Twoj numer nalezy do zbioru: A");
	}else if(number>-10 && number<=-8){
		IO.println("Twoj numer nie nazely do zadnego zbioru, gratki trafiles w 10. lol");
	}else if(number>-8 && number<=-5){
		IO.println("Twoj numer nalezy do zbioru: B");
	}else if(number>-5 && number<-4){
		IO.println("Twoj numer nalezy do zbioru: A i B");
	}else if(number>=-4 && number<=-3){
		IO.println("Twoj numer nalezy do zbioru: A, B i C - jeszcze leprzy strzal niz z 0 - no brawo - uczniu :)");
	}else if(number>-3 && number<0){
		IO.println("Twoj numer nalezy do zbioru: A i C");
	}else if(number>=0 && number<=5){
		IO.println("Twoj numer nalezy do zbioru: C");
	}else if(number>5 && number<10){
		IO.println("Twoj numer nalezy do zbioru: A i C");
	}else if(number>=10){
		IO.println("Twoj numer nalezy do zbioru: C");
	}

	// zeby sprawdzic czy na pewno dobrze dziala kod na dane zbiory sprwadzimy ponizsze liczby
	//-100 = B (correct), -14 = AB (correct), -13=A i B (correct) , -8 - strzal w 10 - nie nalezy do niczego(correct),  -4 - A B i C(correct),  3 = C(correct), 7 = A i C(correct),  100 = C.(correct)
	// na -13 - wpisalem na poczatku tylko zbior A - a program wydal A i B - juz zaczalem sie watpic, ale program ma racje. Dobry przykład przełozenia algorytmu na komputer, bo ludzki mózg nie
	//nadaje sie na takie operacje :D
	
	// wynik testu - "Hura program dziala" - mistrzowstwo rodzi sie w praktyce


}
