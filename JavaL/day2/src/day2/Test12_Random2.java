package day2;
/*
 * 在java核心类库中，除了在Math类中提供了random()来产生随机数，还在java.util.Random来
 * 提供随机数
 */
public class Test12_Random2 {
	public static void main(String[] args) {
		//1、先准备产生随机数的工具
		java.util.Random tools = new java.util.Random();
		
		//2、用工具来获取随机数
		int randomNum = tools.nextInt();
		System.out.println("随机数为" + randomNum);
		//3、用工具获得一定范围内的随机数
		int num = tools.nextInt(10);
		System.out.println("[0,10)的随机整数" + num);
		
	}

}
