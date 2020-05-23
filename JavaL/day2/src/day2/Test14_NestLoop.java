package day2;
/*
 * 打印菱形
 * 
 */
public class Test14_NestLoop {
	public static void main(String[] args) {

		
		for (int i = 1; i<=5; i++) {
			 /*
			  * 找规律
			  * i = 1,1个空格，j=1
			  * i = 2,2个空格，j=1,2
			  * i = 3,3个空格，j=1,2,3
			  * i = 4,4个空格，j=1,2,3,4
			  * i = 5,5个空格，j=1,2,3,4,5
			  *
			  */
			for (int j = 4; j >= i; j--) {
				System.out.print("  ");
		
			}

			/*
			 * i =1,1个*，j=1
			 * i =2,3个*，j=1,2,3
			 * i =3,5个*，j=1,2,3,4,5
			 * i =4,7个*，j=1,2,3,4,5,6,7
			 * i =5,9个*，j=2*i-1
			 */
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("* ");
				
			}
		    System.out.println();			
	}
		/*
		 * 下半部分
		 * 空格
		 * 
		 */
		for (int i = 1; i <=4; i++) {
			/*
			 * 空格
			 * i =1,1个空格，j=1
			 * i =2,2个空格，j=2
			 * i =3,3个空格，j=3
			 * i =4,4个空格，j=4
			 */
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			/*
			 * i = 1,7个*,j=7
			 * i = 2,5个*,j=5
			 * i = 3,3个*,j=3
			 * i = 4,1个*,j=1
			 */
			
			for (int j = 1; j <=9-2*i; j++) {
				
				System.out.print("*  ");
			}
			System.out.println();
		}
}
}