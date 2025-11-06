void main() {
	
	Scanner sc = new Scanner(System.in);
	IO.println("Wprowadź libę\na=");
	int a = sc.nextInt();
	IO.println("Wprowadź libę\nb=");
	int b = sc.nextInt();
	
	IO.println("Ten program jest kalculatorem bitowy. Algorytmem, który sumuję a i b");
	int c;
	int d;
	
	while(true){
		c=a^b;
		d=a&b;
		d=d<<1;
		if(d==0){
			IO.println("Suma:"+c);
			break;
		}else{
			a=c;
			b=d;
		}
	}
}