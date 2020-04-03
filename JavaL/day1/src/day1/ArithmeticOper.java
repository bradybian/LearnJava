package day1;
/*
 * 运算符
 * 1、算术运算符
 * +，-，*，/
 * 取模（取余）：%
 * 			特殊:整数/整数，结果只保留整数部分
 * 被模数/模数
 * 
 * 自增：++
 * 		对于自增变量来说，都会+1
 * 		但是++在前还是在后，对于整个表达式的计算来说是不一样的
 * 		++在前，先自增，然后取变量的值
 * 		++在后，先取变量的值，放到操作数栈中，然后自增
 * 		但是不管怎么样，自增变量的取值与自增操作一前一后，一定是一起完成的
 * 自减：--
 * 		类同
 */
public class ArithmeticOper {
	public static void main(String[] args) {
		int x = 13;
		int y = 4;
//		System.out.println("x + y = "+ x+y); //变为拼接
		
		System.out.println("x - y = "+ (x-y)); 
		System.out.println("x * y = "+ (x*y)); 
		System.out.println("x / y = "+ (x/y)); 
		System.out.println("x % y = "+ (x%y)); 
		
//		System.out.println("============================");
//		System.out.println("x % y = "+ (x%y)); 
		System.out.println("============================");
		/*
		 * 自增
		 */
		int m = 1;
		int n = ++m; //m先自增，然后把m的值取出来赋值给n
		System.out.println("a  = "+ m);//2
		System.out.println("b  = "+ n);//2
		System.out.println("============================");
		int p = 1;
		int q = p++; //(1)先取出p的值:1,先放到一个操作数栈，（2）然后p变量完成自增，（3）把刚才操作数栈中的值赋值给q
		System.out.println("p  = "+ p);//2
		System.out.println("q  = "+ q);//1
		
		System.out.println("============================");
		int z = 1;
		z = z++;//（1）先去除z中的1，先放到操作数栈中，（2）然后自增，变为2，（3）把刚才操作数栈中的值赋值给z
		System.out.println("z = " + z);//1
		
		
		System.out.println("============================");
		int b = 1;
		int c = 2;
		/*第一个b++
		 * 	（1）先取b的值"1"，先放到操作数栈
		 * 	（2）紧接着b的值就自增了，b=2
		 *第二个++b
		 *	(1)先b自增，b=3
		 *	(2)紧接这取b的值"3",先放到一个操作数栈
		 *第三步++b
		 *  (1)先b自增，b=4
		 *  （2）紧接这取b的值4，放到操作数栈
		 *第4步c++
		 *	(1)先取c的值"2",先放到操作数栈
		 * 	(2)紧接这c的值自增，c=3
		 *第5步
		 *	（1）先算乘法* 2*4 
		 *	（2）压回去放到”操作数栈“(8)
		 *第六步
		 *	（1）b++ = 1, ++b = 3
		 *	(2) 1+3+8=12
		 */	
		int d = b++ + ++b + ++b * c++;
		System.out.println("b = "+ b);//b=4
		System.out.println("c  = "+ c); //c =3
		System.out.println("d  = "+ d);//d=12
		
		
				
	}
}
