package day1;
/*
 * 运算符:
 * 条件运算符
 * 是唯一的三元运算符，称为三元运算符
 * 条件表达式？ 结果表达式 1 : 结果 表达式2
 * 整个表达式包含三个部分
 * 运算规则：
 * 如果条件表达式成立，就取结果表达式1的值，不成立，取结果表达式2的值
 *  
 */

public class Test1_Condition {
	public static void main(String[] args) {
		boolean marry = false;
		System.out.println(marry ? "已婚" : "未婚");
		//找出 x和y中 的最大值
		
		int x = 4;
		int y = 6;
		int max = x>=y ? x : y;
		
		/*
		 * 等价于
		 * if (x > y){
		 * 		max = x;
		 * }else{
		 * 		max = y;
		 * }
		 * 
		 */
		System.out.println(x + "," + y + "中的最大值是：" + max);
		
	}
}
