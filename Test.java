import java.util.Random;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		//аргументы командной строки
		args = new String[] {"three", "two", "one"};
		
		//целочисленный массив, его размер и вычисление суммы элементов
		Scanner sc = new Scanner(System.in);
		System.out.print("Размер массива: ");
		int size = sc.nextInt();
		int mas1[] = new int[size];
		int sum = 0;
		System.out.println("Ввести 1, для подсчёта суммы элементов через for");
		System.out.println("Ввести 2, для подсчёта суммы элементов через while");
		System.out.println("Ввести 3, для подсчёта суммы элементов через do while");
		System.out.print("n = ");
		int n = sc.nextInt();
		while (n<1 || n>3) {
				System.out.println("Ввести 1, для подсчёта суммы элементов через for");
				System.out.println("Ввести 2, для подсчёта суммы элементов через while");
				System.out.println("Ввести 3, для подсчёта суммы элементов через do while");
				n = sc.nextInt();
		}
		System.out.println("Введите элементы массива: ");
		switch (n){
		case 1:
			for (int i2 = 0; i2<size; i2++) {
				mas1[i2] = sc.nextInt();
				sum += mas1[i2];
		}
			break;
		case 2:
			int i = 0;
			while (i<size) {
				mas1[i] = sc.nextInt();
				sum += mas1[i];
				++i;
			}
			break;
		case 3:
			int i1 = 0;
			do {
				mas1[i1] = sc.nextInt();
				sum += mas1[i1];
				++i1;
			}while(i1<size);
			
		}
		System.out.println(sum);
		System.out.println();
		
		//вывод аргументов командной строки
		System.out.println("аргументы командной строки: ");
		for (String str : args) {
		System.out.println(str);
		}
		System.out.println();
		
		//вывод первых 10 чисел гармонического ряда с 3 знаками после запятой
		for(int i = 1;i<=10;i++) {
			System.out.format("%.3f", 1.0/i);
			System.out.println();
		}
		System.out.println();
		
		//массив случайных целых чисел (от -1000 до 1000) с использование класса Random
		System.out.print("Размер массива: ");
		size = sc.nextInt();
		int mas2[] = new int[size];
		Random r = new Random();
		for (int i = 0; i<size; i++) {
			mas2[i] = r.nextInt(2001)-1000;
			System.out.print(mas2[i]);
			System.out.print(" ");
		}
		System.out.println();
		int buffer;
		for (int i = 1; i<size; i++) {
			if (mas2[i]<mas2[i-1]) {
				for (int j = i; j>0; j--) {
					if (mas2[j]<mas2[j-1]) {
					buffer = mas2[j];
					mas2[j] = mas2[j-1];
					mas2[j-1] = buffer;
					}
				}
			}
		}
		System.out.println();
		for(int i : mas2) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		
		//массив случайных целых чисел (от 1 до 1000) с использование метода random()
		for (int i = 0; i<size; i++) {
			mas2[i] = (int) (Math.random()*1000 + 1);
		}
		System.out.println();
		for(int i : mas2) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		for (int i = 1; i<size; i++) {
			if (mas2[i]<mas2[i-1]) {
				for (int j = i; j>0; j--) {
					if (mas2[j]<mas2[j-1]) {
					buffer = mas2[j];
					mas2[j] = mas2[j-1];
					mas2[j-1] = buffer;
					}
				}
			}
		}
		System.out.println();
		for(int i : mas2) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println();
		
		//факториал числа
		long factorial = 1;
		System.out.print("Введите число для вычисления факториала: ");
		int x = sc.nextInt();
		while(true) {
			if (x>0) {
			for(int i = 1; i<=x;i++)
				factorial *= i;
			break;
			}
			else if (x<0) {
				System.out.print("Введите неотрицательное число: ");
				x = sc.nextInt();
			}
			else if (x==0)
				break;
		}
		System.out.print(x);
		System.out.print("! = ");
		System.out.println(factorial);
	}
}