/**
 * 
 */
package ioc.v2;

/**
 * ����������ӿ�
 * 
 * @author ����ΰ
 *
 * �������ڣ�2009-5-12
 */
public interface ICommand {

	/**
	 * �ö���
	 */
	public Object fetch() throws CommandException;
}
