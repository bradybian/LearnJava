package day2;
/*
 * while(循环条件（1）){
 * 		循环体语句（2）
 * }
 * 执行过程：
 * 1、先判断循环条件
 * 2、如果循环条件成立，就执行循环体语句,在回到（1）
 * 	  如果循环条件不成立，那么就结束while循环
 * while循环四要素
 * 1、循环变量初始化 int i = 1
 * 2、循环条件 i <=1
 * 3、循环体语句 sum += i
 * 4、迭代语句 i++
 * 结论：
 * 各种循环是可以相互转换的，在某些场景，某一种循环更加适合
 * for循环一般用于次数比较明显，数组的遍历
 * while一般用于条件比较明显，次数不明显的
 * 
 */

public class Test9_while {
	public static void main(String[] args) {
		//求1-100的和
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("偶数是："+ sum);
	}
}
