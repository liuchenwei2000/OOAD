/**
 * 
 */
package uml.diagrams.clazz;

/**
 * 类图中的Programmer类源码
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-1-10
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
