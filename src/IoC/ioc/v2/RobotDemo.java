/**
 * 
 */
package ioc.v2;

/**
 * Robot��ʾ��
 * 
 * @author ����ΰ
 *
 * �������ڣ�2009-5-12
 */
public class RobotDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robot = new Robot("wall.e");
		// ����Robot����Ϳ���ȥִ�в�ͬ��Command
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