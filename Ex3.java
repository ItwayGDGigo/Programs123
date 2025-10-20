void main() {
	//IO.println("Podaj imie: ");
	//String firstInput = IO.readln();
	
	//IO.println("Witaj " +firstInput);
	
	//Zadanie 3
	//Pierwszy sposob
	Scanner sc = new Scanner(System.in);
	IO.println("Wprowadz liczbe a ja powiem ci czy to jest 0, ujemna lub dodatnia liczba");
	int amount = sc.nextInt();
	//pierwszy sposob
	if(amount==0){
		IO.println("Wprowadziles zero");
	}else if(amount<0){
		IO.println("Kwota ujemna");
	}else if(amount>0){
		IO.println("Kwota dodatnia");
	}
	//drugi sposob
	IO.println("Wprowadz drugi raz, mam sprawdzic drugi sposob");
	int amount1 = sc.nextInt();
	String a =(amount1==0 ? "Masz zero":amount1>0? "No i dodatnia, brawo!":amount1<0? "Ujemna, niestety":" ");
	
	IO.println(a);
	
	
}