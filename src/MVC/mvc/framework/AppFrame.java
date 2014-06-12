/**
 * 
 */
package mvc.framework;

import java.util.List;

import mvc.framework.model.IModel;
import mvc.framework.view.View;
import mvc.util.CenteredFrame;

/**
 * 应用程序JFrame基类
 * 
 * 该类负责组装MVC的三个组件，使三个组件能够进行消息传递
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-10-15
 */
public abstract class AppFrame extends CenteredFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5242642963087026877L;
	
	private IModel model;// 模型
	// 视图列表(每个视图的控制器应该都已经包含在视图中)
	private List<View> views;

	public AppFrame() {
		super();
		init();
	}

	/**
	 * @param title
	 *            标题
	 */
	public AppFrame(String title) {
		super(title);
		init();
	}
	
	/**
	 * 初始化
	 */
	private void init() {
		this.model = createModel();
		this.views = createViews();
		initialize();
		initUI();
	}

	/**
	 * 创建使用的模型
	 */
	protected abstract IModel createModel();

	/**
	 * 创建所有视图的列表
	 */
	protected abstract List<View> createViews();

	/**
	 * 初始化 将视图全部注册到模型中
	 */
	private void initialize() {
		for (View view : getViews()) {
			view.setModel(getModel());
		}
	}
	
	/**
	 * 初始化UI
	 */
	protected abstract void initUI();

	/**
	 * @return 模型
	 */
	public IModel getModel() {
		return model;
	}

	/**
	 * @return 视图列表
	 */
	public List<View> getViews() {
		return views;
	}
}