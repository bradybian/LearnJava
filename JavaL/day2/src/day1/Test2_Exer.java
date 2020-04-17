package day1;
/*
 * 1、定义一个int类型变量，用来保存年份
 * (1) 可以被4整除但不能被100整除
 * (2) 可以被400整除
 */

public class Test2_Exer {
	public static void main(String[] args) {
		int year = 2016;
		boolean result = year%4 == 0 && year%4!=0 | year%4 ==0;
		System.out.println(year + (result?"是闰年":"不是闰年"));
	}

}
