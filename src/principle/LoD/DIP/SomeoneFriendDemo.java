/**
 * 
 */
package principle.LoD.DIP;

/**
 * ĳ��������ʾ��
 * <p>
 * ʹ����������ԭ����Կ˷���������ط����ȱ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-1-31
 */
public class SomeoneFriendDemo {

}

/**
 * ĳ����
 */
class Someone {

	/**
	 * �����Ĳ�����Friend��������Someone��Friend������
	 */
	void operation1(Friend friend) {
		/*
		 * ������ʵ����ѭ��������ԭ��
		 * Someone��IStranger���������ѹ�ϵ�������ĺô���Friend������ʱ������IStranger���󻻵�
		 * ֻҪ�µľ���IStranger������ͬ�ĳ������ͣ���ôSomeone���޷���������
		 * �������IStranger�ľ���ʵ�ֿ��Զ�����Someone���仯���Ӷ�ʹ��������
		 */
		IStranger stanger = friend.provide();
		stanger.operation3();
	}
}

/**
 * ĳ�˵�������
 */
class Friend {

	// Friend����һ��Stranger��������Friend��Stranger������
	private IStranger stranger = new Stranger();

	IStranger provide() {
		return stranger;
	}
}

/**
 * İ���˽ӿ�
 */
interface IStranger {
	
	public void operation3();
}

/**
 * ��ĳ�˶��Ե�İ������
 */
class Stranger implements IStranger {

	public void operation3() {
		// some code here
	}
}