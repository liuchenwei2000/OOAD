/**
 * 
 */
package ioc.v2;

/**
 * Robot�ӿ�
 * 
 * @author ����ΰ
 *
 * �������ڣ�2009-5-12
 */
public interface IRobot {

	/**
	 * ����Commandȥ�ö���
	 */
	public Object fetchOnCommand() throws CommandException;
}