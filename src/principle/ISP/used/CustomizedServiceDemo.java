/**
 * 
 */
package principle.ISP.used;

/**
 * ���Ʒ�����ʾ��
 * <p>
 * �������������ѭ�ӿڸ���ԭ���
 * ���Ʒ���Ҳ��һ����Ҫ�����ԭ������˵��
 * ����ͻ��˽�����ҪĳһЩ�����Ļ�����Ӧ���������ṩ��Щ��Ҫ�ķ�����
 * ������Ҫ�ṩ����Ҫ�ķ��������ĺô��ǣ�
 * 1������ѧ�ĽǶ��Ͽ��ǣ������������ࡣ
 * 2����ǿ��ϵͳ�Ŀ�ά���ԡ�
 * ��ͻ����ṩ��public�ӿ���һ�ֳ�ŵ��һ��public�ӿ�һ���ṩ�ͺ��ѳ��ء�
 * ��Ϊ����ṩ�̣�û����Ը����������ĳ�ŵ���ر��ǲ���Ҫ�ĳ�ŵ��
 * ����ĳ�ŵ���ϵͳ��ά����ɲ���Ҫ�ĸ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-1-24
 */
public class CustomizedServiceDemo {

}

/**
 * ��һ��ӷ�׵Ĵ�ӿڲ�ɸ�ϸ������С�ӿ�
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
 * Client1�ͻ�����ֱ��������IService1�ӿ�
 * IService1�ṩ��Client1����Ҫ�����й��ܣ�����û�ж���Ĳ���Ҫ�Ĺ���
 * �����Client2��Client3Ҳ��һ�������
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