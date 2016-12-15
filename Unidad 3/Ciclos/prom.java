import java.util.Scanner;

class prom
{
	public static void main(String[] args) 
	{
		int c=0, suma=0,num;
		double prom=0;

		Scanner input = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		num = input.nextInt();

		do
		{
		if(num%5==0)
		{
			suma=suma+num;
			c++;
		}
		System.out.print("Escribe un numero: ");
		num = input.nextInt();
		}
		while(num!=0);
		{
			prom=suma/c;
		}
		System.out.println("El promedio es "+prom);

	}
}