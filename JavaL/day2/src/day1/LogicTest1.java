package day1;



/*
 * 逻辑运算符
 * 	逻辑与：&
 * 		类似：且
 * 	逻辑或：|
 * 		类似：或
 * 	逻辑非：!
 * 		类似：取反
 * 	逻辑异或: ^
 * 		类似：求不同
 * 			true & true （false）
 * 			false & true (true)
 * 			true & false  (true)
 * 			false & false (false)
 * 	短路与：&&
 * 		结果和&一致
 * 		
 * 	短路或：||
 * 
 */

public class LogicTest1 {
	public  static void main(String[] args) {
		int i = 1;
		int j = 1;
		//左边为false ,右边就不看了
		if (i++ == 2 || ++j == 2) {   
			i = 7;
			
		}
		System.out.println("i="+i+"j="+j);  
	}
	

}
