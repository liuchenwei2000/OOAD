/**
 * 
 */
package ioc.v2;

/**
 * 机器人命令接口
 * 
 * @author 刘晨伟
 *
 * 创建日期：2009-5-12
 */
public interface ICommand {

	/**
	 * 拿东西
	 */
	public Object fetch() throws CommandException;
}
