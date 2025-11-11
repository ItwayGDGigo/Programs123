import java.util.Scanner;

public class Zadanie8{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		IO.println("Wprowadz wysokość prostokątu");
		int wys = sc.nextInt();
		
		IO.println("Wprowadz szerokosc prostokątu");
		int szer = sc.nextInt();
		
		IO.println("Wprowadz znak ktory wypelni prostokat");
		char fill = sc.next().charAt(0);
		
		IO.println("Wprowadz znak ktory orkesli granice prostokatu");
		char border = sc.next().charAt(0);
		
		IO.println("No i ponizej masz Kwadrat/prostokąt Malewicza");
		
		//dodatkowe pomocnicze zmienne.
		int i = 0;//zmienna dla szerokosci
		//lim - zmienna dla wysokosci - dodane w petli for.
		
		while(i<szer){ //i na poczatku = 0. wiec moze byc < od szerokosci
			IO.print(border+" ");//petla dla pierwszego wierszu gdzie wszystko bedzie BORDER.
			i++; // zwiekszamy i o jeden, zeby petla nie byla nieskonczona.
		}IO.println();//putsty println - zeby nastepny wiersz zaczal sie on newLine.
		
		i=0;//doprowadzamy i do pierwodnego stanu.
		
		for(int lim=1; lim>0 && lim<(wys-1); lim++){//petla dla srodkowych wierszy gdzie granice beda BORDER  a srodek wypelniony FILL.
			IO.print(border+" ");
			i++;
			while(i<(szer-1)){
				IO.print(fill+" ");
				i++; 
			}IO.println(border+" ");
			i=0;
		}
		while(i<szer){//ostatni wiersz, taki jak pierwszy.
			IO.print(border+" ");
			i++;
		}
	}
}		//to musi byc zadanie z gwiazdka. 3 dni to robilem :D