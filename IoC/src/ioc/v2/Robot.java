/**
 * 
 */
package ioc.v2;

/**
 * 机器人类
 * 
 * 设计思路：
 * 1，Robot有一个ICommand
 * 2，ICommand通过setter由外部控制传入而不是由Robot自己去获取
 * 
 * 这就是控制反转：协调依赖对象之间合作的责任从对象自身中转移出来
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2009-5-12
 */
public class Robot implements IRobot {

	private String name;
	private ICommand command;

	public Robot(String name) {
		this.name = name;
	}

	public Object fetchOnCommand() throws CommandException {
		System.out.println("Robot " + name + " will fetch something.");
		return command.fetch();
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}
}
