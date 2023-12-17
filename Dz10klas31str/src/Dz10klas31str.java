import java.util.Scanner;

public class Dz10klas31str {

	public static void main(String[] args) {
		//1 int x =4;
		// System.out.println("Value is " + ((x>4) ? 1.5 : 9));
		//	2	int x1 = 50, x2 = 75;
		//		boolean b = x1>= x2;
		//		if(b = true){
		//			System.out.println("Success");
		//		} else {
		//			System.out.println("Failure");
		//		}

		/*3 Скласти програму (застосувавши тернарний оператор), яка визначає і повідомляє
		 * додатне чи від'ємно число міститься в змінній numerric*/
		//		int numerric = -9;
		//		System.out.println("Маєм " + ((numerric >= 0 ? "numerric: додатне число" : "numerric: від'ємно число")));
		/*4 Дано трицифрове число.Якщо сума його цифр дорівнює 7 і число є парним, то
		 * зменшити його вдвічі, інакше піднести число до квадрату. Написати програму
		 * двома способами(використовуючи if та використовуючи тернарний оператор)*/		
		//int i = 232;
		int number, digit, sum = 0; 
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the number: ");  
		number = sc.nextInt(); 
		int number1 = number;
		while(number1 > 0)  
		{  //знаходить останню цифру даного числа
			digit = number1 % 10; 	
			//додає останню цифру до змінної sum
			sum = sum + digit; 
			//видаляє останню цифру з числа
			number1 = number1 / 10;  }
		//виводить результат
/*2*/		System.out.println((sum==7 && number%2 == 0) ? number/2 : number*number);
/*1*/		if(sum==7 && number%2 == 0){
			System.out.print("Сума цифр числа "+number+" дорівнює 7 і число є парним -" + "number/2: результат "+ number/2);}
		else {
			System.out.print("Інакше - піднести число "+number+" до квадрату: результат "+ number*number);}
		
	}
	

}


