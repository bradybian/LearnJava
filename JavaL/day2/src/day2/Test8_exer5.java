package day2;
/*
 * 输出所有的水仙花数：
 * 水仙花数指一个三位数，其各个位上数字的和等于其本身
 * 如：1*1*1+5*5*5+3*3*3=153
 */

public class Test8_exer5 {
	public static void main(String[] args) {
		/*
		 * 三位是是指[100,999)
		 * 对于每一个i的值，我们干什么
		 * （1）求出i的百位，十位，各位的值
		 * （2）判断i的百位的立方+十位的立方+各位的立方是否相等
		 */
		
		System.out.println("所有水仙花数如下：");
		for (int i = 100; i <=999; i++) {
			int bai = i/100;
			int shi = i/10%10;
			int ge = i%10;
			
			if (i == bai*bai*bai + shi*shi*shi + ge*ge*ge) {
				System.out.println(i);
			}
			
			
			
			
		}
		
	}

}
