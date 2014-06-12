/**
 * 
 */
package principle.LoD.used;

/**
 * 某人朋友演示类
 * <p>
 * 本例的设计遵循迪米特法则
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-1-31
 */
public class SomeoneFriendDemo {

}

/**
 * 某人类
 */
class Someone {

	/**
	 * 方法的参数是Friend对象，所以Someone和Friend是朋友
	 */
	void operation1(Friend friend) {
		/*
		 * 方法的实现是满足迪米特法则的：
		 * Someone和Stranger之间的联系已经没有了，Someone通过调用自己的朋友Friend对象的forward()方法
		 * 做到了原来需要调用Stranger对象才能够做到的事情，并且Someone不需要知道Stranger的存在
		 */
		friend.forward();
	}
}

/**
 * 某人的朋友类
 */
class Friend {

	// Friend持有一个Stranger对象，所以Friend和Stranger是朋友
	private Stranger stranger = new Stranger();

	/**
	 * 调用转发
	 * <p>
	 * 由于使用了调用转发，使得调用的具体细节被隐藏在Friend内部
	 * 从而使Someone与Stanger之间的直接联系就被省略掉了，使得系统内部的耦合度降低
	 * 在系统的某个类需要修改时，仅仅会直接影响这个类的朋友们，而不会影响到其余部分
	 */
	void forward() {
		stranger.operation3();
	}
}

/**
 * 对某人而言的陌生人类
 */
class Stranger {

	void operation3() {
		// some code here
	}
}