package day2;
//打印1-100的偶数
public class Test_exer2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i%2 ==0) {
				System.out.println("偶数是"+ i);
			}
		}
		System.out.println("-------------");
		for (int i = 2; i <= 100; i+=2) {
			System.out.println("偶数是"+ i);
		}
}	
}
