package com.jalaacademy;

public class Operators {
	public static void main(String[] args) {
         int x =20;
         int y = 10;
     ArthematicOperations a1 = new ArthematicOperations();
          int sum = a1.sum(x, y);
	      int sub = a1.sub(x, y);
	      int mul = a1.mul(x, y);
	      int div =a1.division(x, y);
	      int incre = a1.increment(x);
	      int decre =a1.decrement(y);
	      System.out.println(sum);
	      System.out.println(sub);
	      System.out.println(mul);
	      System.out.println(div);
	      System.out.println(incre);
	      System.out.println(decre);
	
	}
}

class ArthematicOperations {
	public int sum(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;

	}

	public int division(int x, int y) {
		return x / y;
	}

	public int increment(int x) {
		return x++;

	}

	public int decrement(int y) {
		return y--;

	}

}
