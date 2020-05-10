package day2;
/*
 * 循环体结构
 * 1、for
 * 2、while
 * 3、do...while  #至少执行一次
 * 
 * 语法结构
 * do{
 * 		循环体语句块：需要重复的语句
 * 
 * }while(循环条件)
 * 执行过程
 * 1、先执行一次循环体结构
 * 2、然后在判断条件，是否在进行下一次
 * 3、如果条件成立，再次执行循环体语句块，然后进行条件判断
 * 	  如果条件不成立，则结束do .. while
 * 
 * do..while和for和while循环的最大区别是，他的循环体语句块至少执行一次	
 */

import java.awt.SystemColor;

public class Test10_dowhile {
	public static void main(String[] args) {
		/*
		 * 从键盘输入整数，输入0结束，统计输入的正数和负数的个数
		 */
		//从键盘输入整数 java.util.Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num;
		int positive = 0;
		int negative = 0;
		do {
			System.out.println("请输入整数:(输入0结束)");
			num = input.nextInt();
			
			if (num>0) {
				positive++;
			}else if (num<0) {
				negative++;
			}
			
		} while (num!=0);
		System.out.println("正数的个数："+positive);
		System.out.println("负数的个数："+negative);
	}
}
