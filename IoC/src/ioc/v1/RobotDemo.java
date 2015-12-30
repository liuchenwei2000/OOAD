/**
 * 
 */
package ioc.v1;

/**
 * Robot演示类
 * 
 * @author 刘晨伟
 *
 * 创建日期：2009-5-12
 */
public class RobotDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robot = new Robot("wall.e");
		try {
			// robot只能去取杯子
			@SuppressWarnings("unused")
			Cup cup = robot.fetchOnCommand();
		} catch (CupNotFoundException e) {
			e.printStackTrace();
		}
	}
}
