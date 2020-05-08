package day1;
//定义三个int类型的变量，x,y,z，随意赋值整数值，求最大值
public class Test3_Exer {
	public static void main(String[] args) {
		int x =3;
		int y =4;
		int z =5;
		
		int max = x>=y? x:y;
		max = max >=z? max:z;
		
		System.out.println("max = " + max);
		 
		
	}

}
