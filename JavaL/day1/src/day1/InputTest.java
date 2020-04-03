package day1;
import java.util.*;

public class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//获取第一个input
		System.out.print("what your name?");
		String name = in.nextLine();
		
		//获取第二个input
		System.out.print("how old are you ?");
		int age  = in.nextInt();
		
		//在console 展示输出
		System.out.println("Hello, "+ name + ".Next year,you'll be " + (age + 1));
	}
}
