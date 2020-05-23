package day2;
/*
 * continue:继续
 * 用于循环结构，
 * 做用：用于提前结束本次循环，继续下次循环
 * 打印1-100的数，其中3，5，7的倍数不打印
 */
public class Test_continue {
	public static void main(String[] args) {
		for (int i = 0; i <=100; i++) {
			//其中3，5，7的倍数不答应
			if (i%3 ==0 || i%5 ==0 || i%7 ==0 ) {
				continue;
			}
			System.out.println("数据是"+ i);
		}
}
}
 