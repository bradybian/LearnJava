package day2;
/*
 * 循环结构：重复执行某些代码
 * 1、for循环
 * 2、while循环
 * 3、do...while循环
 * 4、foreach增强循环
 * 语法结构
 * 
 * 1、for循环
 * 形式一
 * for(;;){
 * 		重复执行的语句
 * }
 * 形式二
 * for(循环变量初始化表达式（1）;循环条件表达式（2）;循环变量迭代表达式（3）){
 * 		循环体语句（4）：重复执行的语句
 * }
 * 执行的过程
 * 1、执行循环变量初始化表达式（1）
 * 2、进行循环表达式（2）判断
 * 3、如果循环表达式（2）成立，就执行循环体语句(4) 然后执行循环变量迭代表达式（3）完成后回到(2)
 *    如果循环表达式（2）不成立，结束整个for循环
 */
public class Test6_For {

	public static void main(String[] args) {
		for (int i = 1; i <= 5;i++) {
			System.out.println(i + "亮！真帅");
		}
		/*
		 * 1、int i = 1
		 * 2、i <= 5
		 * 3、执行System.out.println("亮！真帅"); 然后执行i++ = 2,完成后，到（2）进行判断
		 */
	}
	
	
}