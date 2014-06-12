/**
 * 
 */
package mvc.framework.model;

import java.util.ArrayList;
import java.util.List;

import mvc.framework.view.IView;

/**
 * MVC结构中的模型默认实现
 * 
 * 子类中添加实际意义的成员和方法
 * 该基类主要构建了模型和视图的联系
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-10-15
 */
public abstract class Model implements IModel {

	private List<IView> views;// 注册的视图列表
	
	public Model() {
		// do nothing
	}

	private List<IView> getViews(){
		if(views == null){
			views = new ArrayList<IView>();
		}
		return views;
	}
	
	/**
	 * 向模型中注册参数视图
	 * 
	 * @see mvc.framework.model.IModel#addView(mvc.framework.view.IView)
	 */
	public void addView(IView view) {
		getViews().add(view);
	}
	
	/**
	 * 删除模型中注册的参数视图 
	 *
	 * @see mvc.framework.model.IModel#deleteView(mvc.framework.view.IView)
	 */
	public void deleteView(IView view) {
		getViews().remove(view);
	}

	/**
	 * 通知视图模型变更(视图根据模型更新自己)
	 * 
	 * @see mvc.framework.model.IModel#notifyViews()
	 */
	public void notifyViews() {
		if (views == null || views.size() == 0) return;
		for (IView view : views) {
			view.updateView();
		}
	}
}