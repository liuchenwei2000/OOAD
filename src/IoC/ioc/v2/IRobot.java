/**
 * 
 */
package ioc.v2;

/**
 * Robot接口
 * 
 * @author 刘晨伟
 *
 * 创建日期：2009-5-12
 */
public interface IRobot {

	/**
	 * 根据Command去拿东西
	 */
	public Object fetchOnCommand() throws CommandException;
}
