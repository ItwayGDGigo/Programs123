void main() {
	//IO.println("Podaj imie: ");
	//String firstInput = IO.readln();
	//IO.println("Witaj " +firstInput);
	//Zadanie 4
	//Pierwszy sposob
	Scanner sc = new Scanner(System.in);
	IO.println("Wprowadz liczbe, ja sprawze ci do ktorego zbioru A (-15,-10) czy B(-nieskonczonosc,-13) nalezy");
	int amount = sc.nextInt();
	
	if(amount>= -15 && amount <=-13){
		IO.println("Zbior A i B");
	}else if(amount<-15 && amount <0){
		IO.println("Zbior B");
	}else if(amount>-13 && amount<=-10){
		IO.println("Zbior A");
	}else{
		IO.println("Jest poza zbiorem A i B");
	}
}