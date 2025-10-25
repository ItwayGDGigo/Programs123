void main()throws InterruptedException{
	/*Zadanie 9:
		wersja ze Swtich, bedzie to wersja pliku Ex9.1.java hihihi*/

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
int operation = sc.nextInt();
	switch(operation){
		case 1:
			IO.println("Wprowadź dwie kwoty, ktore chcesz dodac. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x+y;
			Thread.sleep(1500);
			IO.println("Wynik summy to: "+wynik);
			Thread.sleep(1000);
		break;
			
		case 2:
			IO.println("Wprowadź dwie kwoty, ktore chcesz odjac. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x-y;
			Thread.sleep(1500);
			IO.println("Wynik odejmowania to: "+wynik);
			Thread.sleep(1000);
		break;
			
		
		case 3:
			IO.println("Wprowadź dwie kwoty, ktore chcesz pomnozyc. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x*y;
			Thread.sleep(1500);
			IO.println("Wynik mnozenia to: "+wynik);
			Thread.sleep(1000);
		break;
		
		case 4:
			IO.println("Wprowadź dwie kwoty, ktore chcesz podzielic. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x/y;
			Thread.sleep(1500);
			IO.println("Wynik dzielenia to: "+wynik);
			Thread.sleep(1000);
		break;
		
		case 5:
			IO.println("Wprowadź dwie kwoty, z ktorych chcesz uzyskac reszte z dzielenia. Po wprowadzeniu jednej wciscij Enter zeby wprowadzic druga.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =x%y;
			Thread.sleep(1500);
			IO.println("Pozostanie ci po dzieleniu: "+wynik);
			Thread.sleep(1000);
		break;
		
		case 6:
			/*double wynik = Math.pow(2, 3); // 2 do potęgi 3, wynik to 8.0
			System.out.println(wynik); - data from google*/
			IO.println("Wrowadz x i y, gdzie x to podstaw a y to potega. Pamietaj o wcisnieciu Enter.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =Math.pow(x,y);
			Thread.sleep(1500);
			IO.println("Wynik potegowania to: "+wynik);
			Thread.sleep(1000);
		break;
		
		case 7:
			IO.println("Wrowadz x i y, gdzie x to podstaw a y to sila pierwiastku. Pamietaj o wcisnieciu Enter.");
			x=sc.nextDouble();
			y=sc.nextDouble();
			wynik =Math.pow(x,1/y);
			Thread.sleep(1500);
			IO.println("Wynik pierwiastkowania to: "+wynik);
			Thread.sleep(1000);
		break;
		
		
		
		}
	}