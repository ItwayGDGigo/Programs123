public class Zadanie1 {
	public static void main (String[] args){
		
		/*double[] numbers;
		numbers=new double[10];
		numbers[0]=Math.random()*100;
		numbers[1]=Math.random()*100;
		numbers[2]=Math.random()*100;
		numbers[3]=Math.random()*100;
		numbers[4]=Math.random()*100;
		numbers[5]=Math.random()*100;
		numbers[6]=Math.random()*100;
		numbers[7]=Math.random()*100;
		numbers[8]=Math.random()*100;
		numbers[9]=Math.random()*100;
		IO.println(numbers[0]);
		IO.println(numbers[1]);
		IO.println(numbers[2]);
		IO.println(numbers[3]);
		IO.println(numbers[4]);
		IO.println(numbers[5]);
		IO.println(numbers[6]);
		IO.println(numbers[7]);
		IO.println(numbers[8]);
		IO.println(numbers[9]);*/
		
		double[] numbersOne;
		numbersOne = new double[10];
		for(int i=0; i<numbersOne.length;i++){//1.1 wypelnianie tablicy los. liczbami
			
			numbersOne[i]=Math.random()*100;//losowanie od 0 do 1(niewlacznie) dla tego mnozymy na 100(pula do losowania jest od 1 do 99.(9) 
			IO.println("Wartosci tablicy:\t"+numbersOne[i]);//1.2
		
		}
		for(int k = 0; k<numbersOne.length;k++){//1.3 wyswietlanie parzystych indeksow
			if((k%2) ==0){
				IO.println("Liczby o parzystym indeksie:\t"+numbersOne[k]);
			}
			
			
		}
		for(int j=0; j<numbersOne.length;j++){//1.4 wyswietlanie nieparzystych elementow tablicy
			numbersOne[j]=(int) numbersOne[j];
			if((numbersOne[j]%2) ==0){
			 IO.println("Przekonwertowanie elementow tablicy double na int:\t"+numbersOne[j]);
			}
			
			
		}
		
		
		
	}
	
	
}