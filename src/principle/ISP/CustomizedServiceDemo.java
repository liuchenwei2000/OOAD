/**
 * 
 */
package principle.ISP;

/**
 * ���Ʒ�����ʾ��
 * <p>
 * �����������Υ���ӿڸ���ԭ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-1-24
 */
public class CustomizedServiceDemo {

}

/**
 * һ��ӷ�׵Ĵ�ӿڣ��ṩ���������ɵĹ���
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
 * Client1�ͻ�����ֱ��������IService�ӿ�
 * ����Client1ֻ��ҪIService���������ܣ������Ĳ�����Ҫ
 * �����Client2��Client3Ҳ����һ����
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