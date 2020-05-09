package day2;

import java.util.Scanner;

/*
 * 彩票游戏，随机两位数字，如果为10，则为中大奖
 * 如果为11，14，77则发1000元
 */
public class Test4_Random {
	public static void main(String[] args) {
		int rand = (int)(Math.random()*90+10);
		System.out.println(rand);
		//提示用户输入一个两位数
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("请输入两位数彩票:");
		int num = input.nextInt();
		int randshi = rand/10;
		int randge = rand%10;
		int numshi = num/10;
		int numge = num%10;
		
	
		if (num == rand ) {
			System.out.println("奖金10000");
		
		}else if (numshi == randge && numge == randshi) {
			System.out.println("奖金5000");
		}else if (numshi == randshi || numge == randge) {
			System.out.println("奖金500");
		}else if (numshi == randge || numge == randshi) {
			System.out.println("奖金300");
		}else {
			System.out.println("没有奖金");
		}
	}


}
