/**
 * 
 */
package principle.ISP.used;

/**
 * 定制服务演示类
 * <p>
 * 本例的设计是遵循接口隔离原则的
 * 定制服务也是一个重要的设计原则，它是说：
 * 如果客户端仅仅需要某一些方法的话，就应当给它们提供这些需要的方法，
 * 而不需要提供不需要的方法。它的好处是：
 * 1，从美学的角度上考虑，这样做很整洁。
 * 2，增强了系统的可维护性。
 * 向客户端提供的public接口是一种承诺，一个public接口一旦提供就很难撤回。
 * 作为软件提供商，没有人愿意做出过多的承诺，特别是不必要的承诺。
 * 过多的承诺会给系统的维护造成不必要的负担。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-1-24
 */
public class CustomizedServiceDemo {

}

/**
 * 将一个臃肿的大接口拆成更细的三个小接口
 */
interface IService1 {
	
	public void m1();
	
	public void p2();
}

interface IService2 {
	
	public void m2();
	
	public void p1();
}

interface IService3 {
	
	public void m1();
	
	public void p1();
	
	public void p2();
}

class Service implements IService1, IService2, IService3 {

	public void m1() {
	}

	public void m2() {
	}

	public void p1() {
	}

	public void p2() {
	}
}

/**
 * Client1客户端类直接依赖于IService1接口
 * IService1提供了Client1所需要的所有功能，并且没有多余的不需要的功能
 * 下面的Client2、Client3也是一样的情况
 */
class Client1 {
	
	private IService1 service;
	
	public void m1(){
		service.m1();
	}
	
	public void p2(){
		service.p2();
	}
}

class Client2 {
	
	private IService2 service;
	
	public void m2(){
		service.m2();
	}
	
	public void p1(){
		service.p1();
	}
}

class Client3 {
	
	private IService3 service;
	
	public void m1(){
		service.m1();
	}
	
	public void p1(){
		service.p1();
	}
	
	public void p2(){
		service.p2();
	}
}
