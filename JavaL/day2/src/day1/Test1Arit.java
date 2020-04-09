package day1;

public class Test1Arit {
	public static void main(String[] args) {
		
		System.out.println("============================");
		//练习1
		/*
		 * 第一步i++
		 * （1）先取i的值1，放起来
		 * （2）i自增 2
		 * 第二步++i
		 * (1)先自增，i=3
		 * (2)在取i的值3放起来
		 * 第三步i++  + ++i
		 * 1 + 3 =4
		 */
		int i =1;
		System.out.println(i++ + ++i); //2+2
		
		
		System.out.println("============================");
		//练习2
		/*
		 * 第一步 m++
		 * (1) 先取m的值1，放起来
		 * （2）m自增为2
		 * 第二步 n
		 * (1) n = 2
		 * 第三步 ++n
		 * （1）先自增，n=3
		 * (2)放起来
		 * 第4步
		 * （1）从左到右计算 1 *2+3 =5
		 */
		int m = 1;
		int n = 2;
		
		System.out.println(m++ * n + ++n );//2*2+2=6
		
		
		System.out.println("============================");
		//练习3
		/*
		 * 第一步++c
		 * （1）先自增 c = 2
		 * (2)c的值放起来
		 * 第二步d
		 * (1) d = 2
		 * 
		 * 第三步 ++c
		 * （1）先自增 c= 3
		 * (2) 放起来
		 * 第4步
		 * （1）2*2+3=7
		 */
		
		int c = 1;
		int d = 2;
		System.out.println(++c + d * ++c );//2+2*3=8
		
	}
}
