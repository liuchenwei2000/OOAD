/**
 * 
 */
package uml.diagrams.clazz;

/**
 * ��ͼ�е�Programmer��Դ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-1-10
 */
public class Programmer {

	public long lunchHours;
	protected float jobs;
	private char unstable;
	private double salary;

	public Programmer() {

	}

	public void work() {
		System.out.println(unstable);// just for fun
	}

	private void updateSkills() {
		System.out.println(salary);// just for fun
	}

	protected void sellBugs() {
		updateSkills();// just for fun
	}
}