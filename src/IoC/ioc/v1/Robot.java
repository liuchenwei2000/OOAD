/**
 * 
 */
package ioc.v1;

/**
 * 机器人类
 * 
 * 设计思路：
 * 1，Robot有一个CupCommand
 * 2，CupCommand有fetch()方法返回Cup
 * 3，Robot的fetchCup()返回Cup
 * 
 * 目前Robot的主要问题是如何获得CupCommand
 * 不管怎么获得，每个Robot都要自己负责获得CupCommand
 * 所以，无法完全孤立的测试Robot类，每当测试Robot类的时候都间接地测试了CupCommand
 * 这是紧耦合的体现，Robot和CupCommand耦合太紧了
 * 有一个Robot就必有一个CupCommand
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2009-5-12
 */
public class Robot {

	private String name;
	private CupCommand command;

	public Robot(String name) {
		this.name = name;
		command = new CupCommand();
	}

	public Cup fetchOnCommand() throws CupNotFoundException {
		System.out.println("Robot " + name + " will fetch cup.");
		return command.fetch();
	}
}