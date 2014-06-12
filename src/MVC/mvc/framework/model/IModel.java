/**
 * 
 */
package mvc.framework.model;

import mvc.framework.view.IView;

/**
 * MVC结构中的模型接口
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-10-15
 */
public interface IModel {

	/**
	 * 向模型中注册参数视图
	 * 
	 * @param view
	 *            视图
	 */
	public void addView(IView view);
	
	/**
	 * 删除模型中注册的参数视图
	 * 
	 * @param view
	 *            视图
	 */
	public void deleteView(IView view);

	/**
	 * 通知视图模型变更
	 */
	public void notifyViews();
}