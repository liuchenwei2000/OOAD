/**
 * 
 */
package principle.CARP;

/**
 * �� ��ʾ��
 * <p>
 * �����ǰ���IS-A��ϵʹ�ü̳н��е����ʵ��
 * IS-A���ϸ�ķ���ѧ�����ϵĶ��壬ָһ��������һ�����һ��
 * ���磺���ˡ�Ů�˶����˵�һ�֣�è�������Ƕ����һ��
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
		// ����һ����"james"�ľ���
		Human james = new Manager("james");
		HumanClient.doWorks(james);
		/*
		 * ����һ����"james"�Ĺ�Ա��ʵ�������james����������Ǹ�����james
		 * ����ͨ���̳е�ʵ�ַ����޷�ʹ��james���Ǿ������ǹ�Ա����ѧ��
		 * ÿһ�α������´���һ����Ӧ�Ķ���ſ��ԣ�������Ϊ�̳��Ǿ�̬�� 
		 */
		james = new Employee("james");
		HumanClient.doWorks(james);
		james = new Student("james", "MBA School");
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
 * Human���Ϊ�����࣬��������м̳�
 */
abstract class Human {

	private String name;

	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/**
	 * ��ʼ�ɻ�
	 */
	public abstract void doWork();
}

/**
 * ������
 */
class Manager extends Human {

	public Manager(String name) {
		super(name);
	}

	public void doWork() {
		System.out.println(getName() + " do manage work");
	}
}

/**
 * ��Ա��
 */
class Employee extends Human {

	private double salary = 100;

	public Employee(String name) {
		super(name);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void doWork() {
		System.out.println(getName() + " do employee work with salary $"
				+ getSalary());
	}
}

/**
 * ѧ����
 */
class Student extends Human {

	private String school;

	public Student(String name, String school) {
		super(name);
		this.school = school;
	}

	public void doWork() {
		System.out.println(getName() + " do study work in " + school);
	}
}