/**
 * 
 */
package ioc.v2;

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
		// 这样Robot对象就可以去执行不同的Command
		ICommand command = new CupCommand();
		robot.setCommand(command);
		try {
			@SuppressWarnings("unused")
			Object object = robot.fetchOnCommand();
		} catch (CommandException e) {
			e.printStackTrace();
		}
	}
}
