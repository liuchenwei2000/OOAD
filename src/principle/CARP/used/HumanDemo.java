/**
 * 
 */
package principle.CARP.used;

import java.util.ArrayList;
import java.util.List;

/**
 * 人 演示类
 * <p>
 * 本类是按照HAS-A关系使用组合进行的设计实现
 * HAS-A代表一个类是另一个类的一个角色，而不是另一个类的特殊种类
 * 比如：美国人、中国人都应该是人的角色
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
		/*
		 * 这样一来james就可以始终是这个对象了
		 * 并且可以具有各种角色，比如经理、雇员和学生
		 */
		Human james = new Human("james");
		james.addRole(new Manager());
		james.addRole(new Employee());
		james.addRole(new Student("MBA School"));
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
 * Human设计为具体类，每个人可以有很多角色
 * 当一个类是另一个类的角色时，不应该使用继承描述这种关系
 */
class Human {

	private String name;

	// 每个人可以有很多角色，并且是动态变化的
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
 * 角色接口
 */
interface IRole {

	/**
	 * 本角色可以干些事情
	 */
	public void doSomething();
}

/**
 * 经理角色
 */
class Manager implements IRole {

	public void doSomething() {
		System.out.println("do manage work");
	}
}

/**
 * 雇员角色
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
 * 学生角色
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
