package juicebox;

public class Fibonacci {
	public static void main(String[] args) {
		fibo(50);
	}
	
	
	public static void fibo(int n) {
		int a = 0;
		int b = 1;
		if(n == 1) {
			System.out.println(a);
		}else if(n == 2) {
			System.out.println(a);
			System.out.println(b);
		}else {
			System.out.println(a);
			System.out.println(b);
			int i = 1;
			while(i <= n - 2){
				int c = a + b;
				a = b;
				b = c;
				i++;
				System.out.println(c);
			}
		}
	}
}
