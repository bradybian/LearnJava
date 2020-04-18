package day2;
/*
 * --顺序结构：
 * 整个程序来说都是顺序执行的，从main朱方法开始
 * 代表性的：输入和输出
 * （1）：输出类型
 * System.out.println();//输出xx后换行
 * System.out.print();//输出xx后不换行
 * （2）：输入类型
 * 步骤1
 * （1）准备一个数据扫描仪（对象），指定数据的来源
 * java.util.Scanner input = new java.util.Scanner(System.in)
 */

public class Test02_Order {
	public static void main(String[] args) {
		/*
		 * 	(1)java.util.Scanner:是一个扫描仪类型，是引用数据类型，首字母大写 
		 * 	(2) input是一个变量，代表一个扫描仪
		 *  （3）java.util.Scanner（System.in）是给变量input赋值的，他是一个对象
		 *  （4）System.in指定了数据类型的来源，表示标准的输入设备 
		 */	
		java.util.Scanner input = new java.util.Scanner(System.in);
		/*
		 * nextInt()是input这个对象的方法，所以Int的i是大写，因为方法名和变量名一样，从第二个单词的首字母开始大写
		 * 因为是方法，所以()不能省略
		 */
		
		System.out.println("你的年龄： ");
		int age = input.nextInt();
		
		System.out.println("你的姓名： ");
		String name = input.next();
		
		System.out.println("你的性别： ");
		char gender  = input.next().charAt(0);
		System.out.println("是否帅： ");
		boolean cool = input.nextBoolean();
		
		
		System.out.println("你的年龄： " + age);
		System.out.println("你的姓名： " + name);
		System.out.println("你的性别： " + gender);
		System.out.println("是否帅： " + cool);
		
	}

}
