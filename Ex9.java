void main()throws InterruptedException{
	/*Zadanie 9:
		Stworz prosty kalkulator, ktory bedzie pytal uzytkownika o wybor operacji do
		wykonania, a nastepnie pobierze liczby i wykona dzialanie
		Wykorzystaj konstukcje Switch (AAAAAAAA dopiero to zauwazylem po napisaniu ponizszego kodu..lol)
		No to zrobie wersje ze Swtich, bedzie to wersja pliku Ex9.1.java hihi*/

IO.println("Prosze wybrać jaką operacje chcesz zrobic");
Thread.sleep(500);
IO.println("1 - Dodawanie ");
Thread.sleep(500);
IO.println("2 - Odejmowanie");
Thread.sleep(500);
IO.println("3 - Mnozenie");
Thread.sleep(500);
IO.println("4 - Dzielenie");
Thread.sleep(500);
IO.println("5 - Reszta z dzielenia");
Thread.sleep(500);
IO.println("6 - Potegowanie");
Thread.sleep(500);
IO.println("7 - Pierwiastkowanie");
Thread.sleep(500);
IO.println();
IO.println("Wcisnij nr operacji");
IO.println();
Scanner sc = new Scanner(System.in);

double x;
double y;
double wynik;

while(true){
	int operation = sc.nextInt();
		if(operation==1){
			IO.println("Wprowadź dwie kwoty, ktore chcesz dodac. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x+y;
			Thread.sleep(1500);
			IO.println("Wynik summy to: "+wynik);
			Thread.sleep(1000);
			IO.println("Wpisz 1, jezeli chcesz zrobic kolejna operacje. 2 - jezeli chcesz skonczyc.");
			int choice = sc.nextInt();
			if(choice==1){
			  IO.println("Dobrze, wybirz kolejna operacje: ");
				Thread.sleep(500);
				IO.println("1 - Dodawanie ");
				Thread.sleep(500);
				IO.println("2 - Odejmowanie");
				Thread.sleep(500);
				IO.println("3 - Mnozenie");
				Thread.sleep(500);
				IO.println("4 - Dzielenie");
				Thread.sleep(500);
				IO.println("5 - Reszta z dzielenia");
				Thread.sleep(500);
				IO.println("6 - Potegowanie");
				Thread.sleep(500);
				IO.println("7 - Pierwiastkowanie");
				Thread.sleep(500);
			}else if(choice==2){
				IO.println("Dziekuje bardzo, have a nice day!");
				break;
			}
			
		}else if(operation==2){
			IO.println("Wprowadź dwie kwoty, ktore chcesz odjac. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x-y;
			Thread.sleep(1500);
			IO.println("Wynik odejmowania to: "+wynik);
			Thread.sleep(1000);
			IO.println("Wpisz 1, jezeli chcesz zrobic kolejna operacje. 2 - jezeli chcesz skonczyc.");
			int choice = sc.nextInt();
			if(choice==1){
			  IO.println("Dobrze, wybirz kolejna operacje: ");
			  Thread.sleep(500);
				IO.println("1 - Dodawanie ");
				Thread.sleep(500);
				IO.println("2 - Odejmowanie");
				Thread.sleep(500);
				IO.println("3 - Mnozenie");
				Thread.sleep(500);
				IO.println("4 - Dzielenie");
				Thread.sleep(500);
				IO.println("5 - Reszta z dzielenia");
				Thread.sleep(500);
				IO.println("6 - Potegowanie");
				Thread.sleep(500);
				IO.println("7 - Pierwiastkowanie");
				Thread.sleep(500);
			}else if(choice==2){
				IO.println("Dziekuje bardzo, have a nice day!");
				break;
			}
			
		
		}else if(operation==3){
			IO.println("Wprowadź dwie kwoty, ktore chcesz pomnozyc. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x*y;
			Thread.sleep(1500);
			IO.println("Wynik mnozenia to: "+wynik);
			Thread.sleep(1000);
			IO.println("Wpisz 1, jezeli chcesz zrobic kolejna operacje. 2 - jezeli chcesz skonczyc.");
			int choice = sc.nextInt();
			if(choice==1){
			  IO.println("Dobrze, wybirz kolejna operacje: ");
				Thread.sleep(500);
				IO.println("1 - Dodawanie ");
				Thread.sleep(500);
				IO.println("2 - Odejmowanie");
				Thread.sleep(500);
				IO.println("3 - Mnozenie");
				Thread.sleep(500);
				IO.println("4 - Dzielenie");
				Thread.sleep(500);
				IO.println("5 - Reszta z dzielenia");
				Thread.sleep(500);
				IO.println("6 - Potegowanie");
				Thread.sleep(500);
				IO.println("7 - Pierwiastkowanie");
				Thread.sleep(500);
			}else if(choice==2){
				IO.println("Dziekuje bardzo, have a nice day!");
				break;
			}
		
		}else if(operation==4){
			IO.println("Wprowadź dwie kwoty, ktore chcesz podzielic. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x/y;
			Thread.sleep(1500);
			IO.println("Wynik dzielenia to: "+wynik);
			Thread.sleep(1000);
			IO.println("Wpisz 1, jezeli chcesz zrobic kolejna operacje. 2 - jezeli chcesz skonczyc.");
			int choice = sc.nextInt();
			if(choice==1){
			  IO.println("Dobrze, wybirz kolejna operacje: ");
				Thread.sleep(500);
				IO.println("1 - Dodawanie ");
				Thread.sleep(500);
				IO.println("2 - Odejmowanie");
				Thread.sleep(500);
				IO.println("3 - Mnozenie");
				Thread.sleep(500);
				IO.println("4 - Dzielenie");
				Thread.sleep(500);
				IO.println("5 - Reszta z dzielenia");
				Thread.sleep(500);
				IO.println("6 - Potegowanie");
				Thread.sleep(500);
				IO.println("7 - Pierwiastkowanie");
				Thread.sleep(500);
			}else if(choice==2){
				IO.println("Dziekuje bardzo, have a nice day!");
				break;
			}
		
		}else if(operation==5){
			IO.println("Wprowadź dwie kwoty, z ktorych chcesz uzyskac reszte z dzielenia. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x%y;
			Thread.sleep(1500);
			IO.println("Pozostanie ci po dzieleniu: "+wynik);
			Thread.sleep(1000);
			IO.println("Wpisz 1, jezeli chcesz zrobic kolejna operacje. 2 - jezeli chcesz skonczyc.");
			int choice = sc.nextInt();
			if(choice==1){
			  IO.println("Dobrze, wybirz kolejna operacje: ");
				Thread.sleep(500);
				IO.println("1 - Dodawanie ");
				Thread.sleep(500);
				IO.println("2 - Odejmowanie");
				Thread.sleep(500);
				IO.println("3 - Mnozenie");
				Thread.sleep(500);
				IO.println("4 - Dzielenie");
				Thread.sleep(500);
				IO.println("5 - Reszta z dzielenia");
				Thread.sleep(500);
				IO.println("6 - Potegowanie");
				Thread.sleep(500);
				IO.println("7 - Pierwiastkowanie");
				Thread.sleep(500);
			}else if(choice==2){
				IO.println("Dziekuje bardzo, have a nice day!");
				break;
			}
		
		}else if(operation==6){
			/*double wynik = Math.pow(2, 3); // 2 do potęgi 3, wynik to 8.0
			System.out.println(wynik); - data from google*/
			IO.println("Wrowadz x i y, gdzie x to podstaw a y to potega. Pamietaj o wcisnieciu Enter.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =Math.pow(x,y);
			Thread.sleep(1500);
			IO.println("Wynik potegowania to: "+wynik);
			Thread.sleep(1000);
			IO.println("Wpisz 1, jezeli chcesz zrobic kolejna operacje. 2 - jezeli chcesz skonczyc.");
			int choice = sc.nextInt();
			if(choice==1){
			  IO.println("Dobrze, wybirz kolejna operacje: ");
				Thread.sleep(500);
				IO.println("1 - Dodawanie ");
				Thread.sleep(500);
				IO.println("2 - Odejmowanie");
				Thread.sleep(500);
				IO.println("3 - Mnozenie");
				Thread.sleep(500);
				IO.println("4 - Dzielenie");
				Thread.sleep(500);
				IO.println("5 - Reszta z dzielenia");
				Thread.sleep(500);
				IO.println("6 - Potegowanie");
				Thread.sleep(500);
				IO.println("7 - Pierwiastkowanie");
				Thread.sleep(500);
			}else if(choice==2){
				IO.println("Dziekuje bardzo, have a nice day!");
				break;
			}
		
		}else if(operation==7){
			IO.println("Wrowadz x i y, gdzie x to podstaw a y to sila pierwiastku. Pamietaj o wcisnieciu Enter.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =Math.pow(x,1/y);
			Thread.sleep(1500);
			IO.println("Wynik pierwiastkowania to: "+wynik);
			Thread.sleep(1000);
			IO.println("Wpisz 1, jezeli chcesz zrobic kolejna operacje. 2 - jezeli chcesz skonczyc.");
			int choice = sc.nextInt();
			if(choice==1){
			  IO.println("Dobrze, wybirz kolejna operacje: ");
				Thread.sleep(500);
				IO.println("1 - Dodawanie ");
				Thread.sleep(500);
				IO.println("2 - Odejmowanie");
				Thread.sleep(500);
				IO.println("3 - Mnozenie");
				Thread.sleep(500);
				IO.println("4 - Dzielenie");
				Thread.sleep(500);
				IO.println("5 - Reszta z dzielenia");
				Thread.sleep(500);
				IO.println("6 - Potegowanie");
				Thread.sleep(500);
				IO.println("7 - Pierwiastkowanie");
				Thread.sleep(500);
			}else if(choice==2){
				IO.println("Dziekuje bardzo, have a nice day!");
				break;
			}
		
		}else{
			IO.println("Źle wprowadzony nr!");
		}
	}

}