/**
 * 
 */
package ioc.v1;

/**
 * ��������
 * 
 * ���˼·��
 * 1��Robot��һ��CupCommand
 * 2��CupCommand��fetch()��������Cup
 * 3��Robot��fetchCup()����Cup
 * 
 * ĿǰRobot����Ҫ��������λ��CupCommand
 * ������ô��ã�ÿ��Robot��Ҫ�Լ�������CupCommand
 * ���ԣ��޷���ȫ�����Ĳ���Robot�࣬ÿ������Robot���ʱ�򶼼�ӵز�����CupCommand
 * ���ǽ���ϵ����֣�Robot��CupCommand���̫����
 * ��һ��Robot�ͱ���һ��CupCommand
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2009-5-12
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