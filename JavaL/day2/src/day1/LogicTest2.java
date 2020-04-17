package day1;

/*
 * || 左边为true,则短路，不执行右边
 * 	   左边为false,右边为false,则false ,右边为true ，则true
 * && 左边为false,则短路，不执行右边
 * 		左边为true，右边为true,则true，右边false，则false
 * 		
 */
public class LogicTest2 {
	public static void main(String[] args) {
		
		boolean x = true;
		boolean y = false;
		short z = 42;
		/*
		 * 第一步：z++
		 * 		先取值"42",后自增放入
		 * 第二步：判断z++ == 42   true
		 * && 短路与，左边必须为false才满组短路现象，继续右边
		 * 第三步： y == false true 
		 * 第四步： 判断  true && false 得false
		 * 
		 */
		
		if ((z++ == 42) && (y==true)) {
			z++; //不执行
		}
		/*
		 * 第一步 ： false
		 * || 左边为false,不满足短路，继续右边
		 * || 右边先自增后取值，false 
		 * false || false 得false
		 * z =44
		 */
		if ((x = false) || (++z == 42)) {
			z++;	
		}
		/*第一步，左边false 
		 * 右边true 
		 * false || true 
		 * 得到z = 46
		 */
		if ((x = false) || (++z == 45)) {
			z++;
		}
		/*
		 * 第一步。右边为false == false 为true 短路
		 * z= 47
		 */
		if ((y == false) || (z++ == 46)) {
			z++;
		}
		
		System.out.println("z = " +z);//46
		
	}
}
