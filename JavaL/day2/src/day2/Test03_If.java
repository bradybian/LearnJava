package day2;

import javax.xml.ws.handler.MessageContext.Scope;

/*
 * 分支结构
 * if(){}
 * else{}
 */

public class Test03_If {
	public static void main(String[] args) {
		/*
		 * 键盘输入成绩，假设成绩【0.100】
		 * 100：满分
		 * 90-99 输出优秀
		 * 
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("请输入成绩：");
		int score = input.nextInt(); 
		if ( score == 100) {
			System.out.println("满分");
		}else if ( score >= 90 && score <= 99 ) {
			System.out.println("优秀");
		}else if ( score <=90) {
			System.out.println("不及格");
		}else {
			System.out.println("输错了");
		}
	}

}
