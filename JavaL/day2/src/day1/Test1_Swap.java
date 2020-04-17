package day1;

/*
 * 交换两个变量
 */
public class Test1_Swap {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		
		/*
		 * 通用方式，适用于所有数据类型
		 * 借助与使用同样类型的第三个临时变量，
		 */
		int temp = x;//x变量中值赋值给temp变量中，temp = 1
		x = y; //y中的变量赋值给x x = 2
		y = temp;//temp中变量的值赋值给y  y = 1
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		/*
		 * 方案二，只适用于int整数等类型
		 * 
		 */
		x = 1;
		y = 2;
		
		x = x ^ y ;
		y = x ^ y ;//(新的x) ^ 原来的y = (原来的x ^ 原来的y) ^ 原来的y  = 原来的x (求不同)
		x = x ^ y ;//(新的x) ^ 新的y = (原来的x ^ 原来的 y ) ^ 原来的x = 原来的y 
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		

	}
}
