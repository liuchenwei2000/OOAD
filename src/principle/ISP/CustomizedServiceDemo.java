/**
 * 
 */
package principle.ISP;

/**
 * 定制服务演示类
 * <p>
 * 本例的设计是违反接口隔离原则的
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-1-24
 */
public class CustomizedServiceDemo {

}

/**
 * 一个臃肿的大接口，提供多个各不相干的功能
 */
interface IService {
	
	public void m1();
	
	public void m2();
	
	public void p1();
	
	public void p2();
}

class Service implements IService {

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
 * Client1客户端类直接依赖于IService接口
 * 但是Client1只需要IService的两个功能，其他的并不需要
 * 下面的Client2、Client3也都是一样的
 */
class Client1 {
	
	private IService service;
	
	public void m1(){
		service.m1();
	}
	
	public void p2(){
		service.p2();
	}
}

class Client2 {
	
	private IService service;
	
	public void m2(){
		service.m2();
	}
	
	public void p1(){
		service.p1();
	}
}

class Client3 {
	
	private IService service;
	
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
