/**
 * 
 */
package mvc.framework.view;

import javax.swing.JPanel;

import mvc.framework.controller.IController;
import mvc.framework.model.IModel;

/**
 * MVC结构中的视图默认实现
 * 
 * 子类中添加实际意义的控件和操作
 * 该基类主要构建了视图和模型、控制器间的关系
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-10-15
 */
public abstract class View extends JPanel implements IView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5114765333100218744L;

	private IModel model;// 注册的模型
	
	private IController controller;// 关联的控制器
	
	public View(){
		super();
	}

	/**
	 * @return 注册的模型
	 */
	public IModel getModel() {
		return model;
	}

	/**
	 * 向模型中注册本视图
	 * 
	 * @param model
	 */
	public void setModel(IModel model) {
		this.model = model;
		model.addView(this);
	}

	/**
	 * @return 视图的控制器
	 */
	public IController getController() {
		return controller;
	}

	/**
	 * 给视图设置控制器
	 * 
	 * @param controller
	 *            控制器
	 */
	public void setController(IController controller) {
		this.controller = controller;
	}

	/**
	 * 根据模型更新视图(子类实现具体更新方法)
	 *
	 * @see mvc.framework.view.IView#updateView()
	 */
	public abstract void updateView();
}
