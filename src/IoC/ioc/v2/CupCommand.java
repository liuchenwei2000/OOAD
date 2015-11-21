/**
 * 
 */
package ioc.v2;

import ioc.v1.Cup;

/**
 * 取杯子命令
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2009-5-12
 */
public class CupCommand implements ICommand{

	public CupCommand() {

	}

	public Cup fetch() throws CommandException {
		Cup cup = new Cup();
		// do something else...
		return cup;
	}
}
