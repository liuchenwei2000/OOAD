/**
 * 
 */
package ioc.v2;

/**
 * ��������
 * 
 * ���˼·��
 * 1��Robot��һ��ICommand
 * 2��ICommandͨ��setter���ⲿ���ƴ����������Robot�Լ�ȥ��ȡ
 * 
 * ����ǿ��Ʒ�ת��Э����������֮����������δӶ���������ת�Ƴ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2009-5-12
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