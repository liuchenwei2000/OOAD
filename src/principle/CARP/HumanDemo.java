/**
 * 
 */
package principle.CARP;

/**
 * 人 演示类
 * <p>
 * 本类是按照IS-A关系使用继承进行的设计实现
 * IS-A是严格的分类学意义上的定义，指一个类是另一个类的一种
 * 比如：男人、女人都是人的一种，猫、狗都是动物的一种
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-1-29
 */
public class HumanDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建一个叫"james"的经理
		Human james = new Manager("james");
		HumanClient.doWorks(james);
		/*
		 * 创建一个叫"james"的雇员，实际上这个james就是上面的那个经理james
		 * 但是通过继承的实现方案无法使得james既是经理又是雇员还是学生
		 * 每一次必须重新创建一个相应的对象才可以，这是因为继承是静态的 
		 */
		james = new Employee("james");
		HumanClient.doWorks(james);
		james = new Student("james", "MBA School");
		HumanClient.doWorks(james);
	}
}

/**
 * Human客户端类
 */
class HumanClient {

	/**
	 * 让人开始工作
	 */
	static void doWorks(Human human) {
		human.doWork();
	}
}

/**
 * 人 类
 * <p>
 * Human设计为抽象类，供子类进行继承
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
	 * 开始干活
	 */
	public abstract void doWork();
}

/**
 * 经理类
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
 * 雇员类
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
 * 学生类
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
