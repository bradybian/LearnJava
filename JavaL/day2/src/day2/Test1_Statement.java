package day2;

/*
 * 变量：用来存储和保存值
 * 表达式：是用来计算的
 * 语句：可以独立执行的，并且是要完成一件事情的
 * 		不是所有的表达式直接加，就可以构成语句的
 * 流程控制语句结构：
 * 1、顺序结构（每一步都要走，从上到下依次执行的）
 * 2、分支结构（选择其中的某一分支运行）
 * 3、循环结构（重复执行某些语句）
 */

public class Test1_Statement {
	public static void main(String[] args) {
		int a =10 ;
		if (a%2 == 0) {
			System.out.println("a是偶数" + a);
		}else {
			System.out.println("a是奇数" + a);
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("cool,good good study!!day day up" + i);
		}
		
		
	}
}
