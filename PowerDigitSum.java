package juicebox;

import java.math.BigInteger;

public class PowerDigitSum {
	public static void main(String[] args) {
    long begin = System.currentTimeMillis();

		BigInteger num = findNum(2,5000);
		BigInteger num2 = BigInteger.valueOf(0);
		while (!num.equals(BigInteger.valueOf(0))) {
			num2 = num2.add(num.mod(BigInteger.valueOf(10)));
			num = num.divide(BigInteger.valueOf(10));
		}
		System.out.println(num2);

    long end = System.currentTimeMillis();
		System.out.println(end - begin + "ms");
	}

	public static BigInteger findNum(int x, int i) {
		BigInteger b = BigInteger.valueOf(x);
		b = b.pow(i);
		System.out.println(b);
		return b;
		}
}