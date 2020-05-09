package day2;
//求1到100的和
public class Test7_exer1 {
	public static void main(String[] args) {
		/*
		 * 两个变量
		 * i 变量
		 * sum 求和的变量
		 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			
		}
		System.out.println("总和："+ sum);
	}
}
