package day1;

/*
 * 比较运算符
 * 大于 >
 * 小于 <
 * 大于等于 >=
 * 小于等于 <=
 * 等于==
 * 		谨防不要与赋值=相混淆
 * 不等于 !=
 */
/*
 * 比较运算符，计算后的结果只有两个，true和false
 * 比较运算符只能用于基本数据类型，不能用于引用数据类型,除了==和!=符号
 * 一元运算符：操作数只有1个。
 * 		如：a++等
 * 二元运算符: 操作数有两个
 * 		如：求和： a+b a和b都时操作
 * 			比较大小： age >=26 age和26都是操作数
 * 三元运算符: 需要三个操作符
 */
public class CompareTest1 {
	public static void main(String[] args) {
		
		int age = 20;
		/*
		 * 判断是否成年
		 */
		System.out.println("是否大于26岁  " + (age >= 26));
		/*
		 * 比较运算符作为条件
		 */
		if ( age >= 20) {
			System.out.println("可以进入网吧！！！");
		}else {
			System.out.println("未成年人禁止进入");
		}
		
		boolean flag = false;
		if (flag) {
			//boolean时可以作为条件进行判断的，其他类型不能作为条件进行判断
			System.out.println("条件成立");
		}
	}
		
		
		
	}

