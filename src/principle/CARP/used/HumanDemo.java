/**
 * 
 */
package principle.CARP.used;

import java.util.ArrayList;
import java.util.List;

/**
 * �� ��ʾ��
 * <p>
 * �����ǰ���HAS-A��ϵʹ����Ͻ��е����ʵ��
 * HAS-A����һ��������һ�����һ����ɫ����������һ�������������
 * ���磺�����ˡ��й��˶�Ӧ�����˵Ľ�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-1-29
 */
public class HumanDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ����һ��james�Ϳ���ʼ�������������
		 * ���ҿ��Ծ��и��ֽ�ɫ�����羭����Ա��ѧ��
		 */
		Human james = new Human("james");
		james.addRole(new Manager());
		james.addRole(new Employee());
		james.addRole(new Student("MBA School"));
		HumanClient.doWorks(james);
	}
}

/**
 * Human�ͻ�����
 */
class HumanClient {

	/**
	 * ���˿�ʼ����
	 */
	static void doWorks(Human human) {
		human.doWork();
	}
}

/**
 * �� ��
 * <p>
 * Human���Ϊ�����࣬ÿ���˿����кܶ��ɫ
 * ��һ��������һ����Ľ�ɫʱ����Ӧ��ʹ�ü̳��������ֹ�ϵ
 */
class Human {

	private String name;

	// ÿ���˿����кܶ��ɫ�������Ƕ�̬�仯��
	private List<IRole> roles;

	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void doWork() {
		System.out.println("This is " + getName() + "'s work list:");
		for (IRole role : getRoles()) {
			role.doSomething();
		}
	}

	public void addRole(IRole role) {
		getRoles().add(role);
	}

	private List<IRole> getRoles() {
		if (roles == null) {
			roles = new ArrayList<IRole>();
		}
		return roles;
	}
}

/**
 * ��ɫ�ӿ�
 */
interface IRole {

	/**
	 * ����ɫ���Ը�Щ����
	 */
	public void doSomething();
}

/**
 * �����ɫ
 */
class Manager implements IRole {

	public void doSomething() {
		System.out.println("do manage work");
	}
}

/**
 * ��Ա��ɫ
 */
class Employee implements IRole {

	private double salary = 100;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void doSomething() {
		System.out.println("do employee work with salary $" + getSalary());
	}
}

/**
 * ѧ����ɫ
 */
class Student implements IRole {

	private String school;

	public Student(String school) {
		this.school = school;
	}

	public void doSomething() {
		System.out.println("do study work in " + school);
	}
}