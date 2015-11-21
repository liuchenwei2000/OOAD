/**
 * 
 */
package principle.LoD.DIP;

/**
 * 某人朋友演示类
 * <p>
 * 使用依赖倒置原则可以克服狭义迪米特法则的缺点
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
		 * 方法的实现遵循依赖倒置原则：
		 * Someone和IStranger建立了朋友关系，这样的好处是Friend可以随时将具体IStranger对象换掉
		 * 只要新的具体IStranger具有相同的抽象类型，那么Someone就无法区分它们
		 * 这就允许IStranger的具体实现可以独立于Someone而变化，从而使它们脱耦
		 */
		IStranger stanger = friend.provide();
		stanger.operation3();
	}
}

/**
 * 某人的朋友类
 */
class Friend {

	// Friend持有一个Stranger对象，所以Friend和Stranger是朋友
	private IStranger stranger = new Stranger();

	IStranger provide() {
		return stranger;
	}
}

/**
 * 陌生人接口
 */
interface IStranger {
	
	public void operation3();
}

/**
 * 对某人而言的陌生人类
 */
class Stranger implements IStranger {

	public void operation3() {
		// some code here
	}
}
