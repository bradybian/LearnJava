package day2;
/*
 * 猜测[0,100)的整数，
 * 从键盘输入数字，如果大了提示，大了，如果小了，提示小了
 * 统计猜测次数
 */
public class Test11_random {
	public static void main(String[] args) {
		//取0-100的随机数
		int random = (int)(Math.random()*100);
		int num;
		int count = 0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		do {
			System.out.println("猜大小，请输入你的值:");
			num = input.nextInt();
			count++;
			if (num > random) {
				System.out.println("大了");
			}else if (num < random) {
				System.out.println("小了");
			}
		} while (random != num );
		System.out.println("恭喜你猜对了!!"+ random);
		System.out.println("你共猜测了"+ count +"次");
	}

}
