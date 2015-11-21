/**
 * 
 */
package principle.LoD;

/**
 * 某人朋友演示类
 * <p>
 * 本例的设计是违反迪米特法则的
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
		 * 方法的实现是不满足迪米特法则的：
		 * 因为它引用了Stranger对象，而Stranger不是Someone的朋友
		 */
		Stranger stranger = friend.provide();
		stranger.operation3();
	}
}

/**
 * 某人的朋友类
 */
class Friend {

	// Friend持有一个Stranger对象，所以Friend和Stranger是朋友
	private Stranger stranger = new Stranger();

	Stranger provide() {
		return stranger;
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
