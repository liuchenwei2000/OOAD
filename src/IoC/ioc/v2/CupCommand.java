/**
 * 
 */
package ioc.v2;

import ioc.v1.Cup;

/**
 * ȡ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2009-5-12
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