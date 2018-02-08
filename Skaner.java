import java.util.Scanner;

public class Skaner 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Podaj imię");
		String imię = input.nextLine();
		System.out.println("Witaj "+ imię);
		
		System.out.println("Podaj Twój wiek");
		int wiek = input.nextInt();
		System.out.println("Twój wiek to " + wiek);
		
		System.out.println("Podaj Twój wzrost w cm");
		double wzrost = input.nextDouble(); //typ zmiennej double, nazwa zmiennej wzrost
		System.out.println("Podaj Twóją wagę w kg");
		double waga = input.nextDouble(); // typ zmniennej double, nazwa zmiennej waga
		
		wzrost = wzrost / 100; //dzielimy przez 100 bo wynik musi być podany w metrach
		double bmi = waga/(Math.pow(wzrost, 2));
		System.out.println("Twój indeks BMI wynosi " + bmi);	
		
		if (bmi<18.5)
		{
			System.out.print("Trzeba przytyć!");
		}
		
		else if (bmi>25)
		{
			System.out.print("Czas na odchudzanie");
		}
		
		else 
		{
			System.out.print("Prawidłowy indeks BMI");
		}
	}

}
