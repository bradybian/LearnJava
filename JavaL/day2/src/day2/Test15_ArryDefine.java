package day2;

/*
 * 1、声明一个数组
 * 语法格式
 * 	元素的数据类型[] 数组名
 * 例如
 * 存储几个学员的成绩： int[] scores;
 * 2、数组的初始化
 * 需要完成的两件事
 * （1）确定数组的长度
 * （2）确定数组元素的值
 * 方式1、静态初始化
 * 
 * 	数组名 = new 元素的的数据类型[]{元素值的列表}
 *  数组的声明和静态初始化合成为一句
 * 方式2、动态初始化
 * 3、如何表示一个数组的元素
 * 数组名[下标]
 * 下标的范围：[0,长度-1]
 * 4、如何表示数组的长度
 * 数组名.length
 * 5、遍历，访问数组的元素
 * 
 */
public class Test15_ArryDefine {
	public static void main(String[] args) {
		//声明一个数组
		//int[] scores;
		//初始化数组
		//静态初始化
		//数组名= new 元素的的数据类型[]{元素值的列表}
		//scores = new int[] {1,3,3,5,6};
		//数组的声明和静态初始化合成为一句
		//int scores[] = new int[] {66,77,78,9,11};
		//甚至可以把new int[]省略
		int scores[] = {66,77,78,9,11};
		
		//遍历数组 
		for (int index = 0; index < scores.length; index++) {
			 System.out.println(scores[index]);
		}
	}
}
