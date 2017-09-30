package juicebox;

import java.util.*;

public class Questions {

	private static Scanner scan;

	public static void main(String[] args) {
		//sum(10,15);
		//tamBolen(60);
		//kalan(14,5);
		//carpim(15,14);
		//ortalama();
		sort();
		
	}
	
	public static void sort() {
		scan = new Scanner(System.in);
		System.out.println("eleman sayisini giriniz.");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("elemanlari giriniz");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int temp;
		int i;
		int j;
		for(i = 0; i < size-1; i++) {
			for(j = size - 1; j > i; j--) {
				if(arr[j] <= arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print("[" + arr[k] + "] ");
		}
	}
	
	public static void ortalama() {
		scan = new Scanner(System.in);
		int counter = 0;
		double sum = 0;
		boolean bool = true;
		while(bool) {
			int newNum = scan.nextInt();
			sum += newNum;
			if(newNum == 0) bool = false;
			counter++;
		}
		System.out.println(sum / (counter - 1));
		System.out.println("sum = " + sum + " numOfDig = " + (counter - 1));
	}
	
	public static void carpim(int a, int b) {
		if(a == 0 || b == 0) {
			System.out.println(0);
		}else {
			int i = 1;
			int sonuc = 0;
			while(i <= b) {
				sonuc += a;
				i++;
			}
			System.out.println(sonuc);
		}
	}
	
	public static void kalan(int a, int b) {
		if(a < b ) {
			System.out.println(a);
		}else if(b == 0){
			System.out.println("b 0 olamaz");
		}else {
			while(a >= b) {
				a = a - b;
			}
			System.out.println(a);
		}
	}
	
	public static void midNum(int a, int b, int c) {
		if(a > b && b > c) {
			System.out.println(b);
		}else if(a > c && c > b) {
			System.out.println(c);
		}else if(c > a && a > b) {
			System.out.println(a);
		}else if(b > a && a > c) {
			System.out.println(a);
		}else if(c > b && b > a) {
			System.out.println(b);
		}else if(b > c && c > a) {
			System.out.println(c);
		}
	}
	
	public static void tamBolen(int n) {
		if(n == 0 || n == 1) {
			System.out.println(n);
		}else {
			int x = 1;
			while(x <= n/2) {
				if(n % x == 0) {
					System.out.println(x);
				}
				x++;
			}
			System.out.println(n);
		}
	}
	
	public static void sum(int a, int b) {
		if(a > b) { 
			System.out.println("a < b olmali");
		}else {
			int toplam = 0;
			while(a <= b) {
				toplam += a;
				a++;
			}
			System.out.println(toplam);
		}
	}

}
