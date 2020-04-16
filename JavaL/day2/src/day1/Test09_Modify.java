package day1;

public class Test09_Modify {
	public static void main(String[] args) {
		int i = 1;
		int j = 5;
		
		
		j *= i++ + j;
		
		//j *= i++ + j++ ;等价于 j = j * (i++ + j++)
		/*
		 * 第一步：先把j的值5放起来
		 * 第二步：
		 * 1、先取i的值1，放起来
		 * 2、i自增 i= 2
		 * 第三步：
		 * 1、先取j的值5放起来
		 * 2、j自增，j=6
		 * 第四步：
		 * 求和：i++ + j++ = 1+5 =6
		 * 第五步：
		 * 用5*(和) = 5*6 = 30
		 * 第六步：赋值，把乘积赋值给j
		 * 
		 * 
		 */
		
		System.out.println("i = " + i); //2
		
		System.out.println("j = " + j); //30
	}
}
