/**
 * 
 */
package mvc.framework.controller;

import mvc.framework.view.IView;

/**
 * MVC结构中的控制器默认实现
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-10-15
 */
public abstract class Controller implements IController {

	private IView view;// 所属的视图

	/**
	 * 为视图创建一个控制器
	 * 
	 * @param view
	 *            视图
	 */
	public Controller(IView view) {
		this.view = view;
	}

	/**
	 * @return 所属的视图
	 */
	public IView getView() {
		return view;
	}
}
