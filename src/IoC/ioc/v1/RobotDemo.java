/**
 * 
 */
package ioc.v1;

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
		try {
			// robotֻ��ȥȡ����
			@SuppressWarnings("unused")
			Cup cup = robot.fetchOnCommand();
		} catch (CupNotFoundException e) {
			e.printStackTrace();
		}
	}
}