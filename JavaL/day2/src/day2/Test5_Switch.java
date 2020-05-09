package day2;

/*
 * 选择结构
 * switch....case
 * 语法结构
 * switch(表达式){
 * 		case 常量值1；
 * 		break;
 * 		case 常量值2;
 *      break;
 *      
 *      defult:
 *      语句;
 *      break;
 * 
 * }
 * 执行特点：
 * 1、入口
 * （1）当switch()中表达式的值与某一个case后面的常量值”相等“，就会从某个case进入
 * 2、出口
 * （2）一旦找到入口，就会顺序往下执行，直到遇到出口
 */

public class Test5_Switch {
	public static void main(String[] args) {
		/*
		 * 请输入星期的天数，然后打印对应的汉语
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("请输入星期几(1-7):");
		int weak = input.nextInt();

		switch (weak) {
		case 1:
			System.out.println("星期1");
			break;
		case 2:
			System.out.println("星期2");
			break;
		case 3:
			System.out.println("星期3");
			break;
		case 4:
			System.out.println("星期4");
			break;
			
		default:
			System.out.println("输入有误");
			break;
		}	
	}
}
