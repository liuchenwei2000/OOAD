/**
 * 
 */
package principle.LoD;

/**
 * ĳ��������ʾ��
 * <p>
 * �����������Υ�������ط����
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
		 * ������ʵ���ǲ���������ط���ģ�
		 * ��Ϊ��������Stranger���󣬶�Stranger����Someone������
		 */
		Stranger stranger = friend.provide();
		stranger.operation3();
	}
}

/**
 * ĳ�˵�������
 */
class Friend {

	// Friend����һ��Stranger��������Friend��Stranger������
	private Stranger stranger = new Stranger();

	Stranger provide() {
		return stranger;
	}
}

/**
 * ��ĳ�˶��Ե�İ������
 */
class Stranger {

	void operation3() {
		// some code here
	}
}