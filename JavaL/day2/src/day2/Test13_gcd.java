package day2;

/*
 * 求2个数的最大公约数和最小公倍数
 * 公式
 * 最大公约数：gcd(Greatest Common Divisor)
 * gcd(a,b)=gcd(a>b && a % b !=0 )
 * 最小公倍数
 * 最小公倍数=a*b/gcd
 */

public class Test13_gcd {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int m ;
		while (true) {
			System.out.println("请输入起一个正整数的值：");
			m  = input.nextInt();
			if (m < 0) {
				System.out.println(m + "不是正整数");
			}
			break;
			
		}
		int n ;
		while (true) {
			System.out.println("请输入起一个正整数的值：");
			n  = input.nextInt();
			if ( n < 0) {
				System.out.println(n + "不是正整数");
			}
			break;
			
		}
		System.out.println("两个正整数："+ m  + n);
		//找出两数的最大值和最小值
		int max = m>=n ? m : n;
		int min = m<n ? m:n;
		//求出最大公约数
		int maxYue = 1;
		for (int i = min; i >= min; i--) {
			if (m% i ==0  && n % i == 0) {

				maxYue = i;
//				System.out.println("最大公约数为"+ i);
				break;
			}
		System.out.println(m +"和"+ n +" 的最大公约数为"+ maxYue);
	
		}
//		最小公倍数 = m *n/最大公约数
		System.out.println(m*n/maxYue + "是" + m +"和"+n+ "的最小公倍数");
	   
	}

}
