/**
 * 
 */
package principle.LoD.used;

/**
 * ĳ��������ʾ��
 * <p>
 * �����������ѭ�����ط���
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
		 * ������ʵ������������ط���ģ�
		 * Someone��Stranger֮�����ϵ�Ѿ�û���ˣ�Someoneͨ�������Լ�������Friend�����forward()����
		 * ������ԭ����Ҫ����Stranger������ܹ����������飬����Someone����Ҫ֪��Stranger�Ĵ���
		 */
		friend.forward();
	}
}

/**
 * ĳ�˵�������
 */
class Friend {

	// Friend����һ��Stranger��������Friend��Stranger������
	private Stranger stranger = new Stranger();

	/**
	 * ����ת��
	 * <p>
	 * ����ʹ���˵���ת����ʹ�õ��õľ���ϸ�ڱ�������Friend�ڲ�
	 * �Ӷ�ʹSomeone��Stanger֮���ֱ����ϵ�ͱ�ʡ�Ե��ˣ�ʹ��ϵͳ�ڲ�����϶Ƚ���
	 * ��ϵͳ��ĳ������Ҫ�޸�ʱ��������ֱ��Ӱ�������������ǣ�������Ӱ�쵽���ಿ��
	 */
	void forward() {
		stranger.operation3();
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