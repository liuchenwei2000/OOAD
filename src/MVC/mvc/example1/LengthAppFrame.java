/**
 * 
 */
package mvc.example1;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import mvc.example1.model.LengthAppModel;
import mvc.example1.view.FeetView;
import mvc.example1.view.MeterController;
import mvc.example1.view.MeterView;
import mvc.example1.view.YardView;
import mvc.framework.AppFrame;
import mvc.framework.model.IModel;
import mvc.framework.view.View;

/**
 * 长度换算演示Frame
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-10-15
 */
public class LengthAppFrame extends AppFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6188884184166645296L;

	public LengthAppFrame() {
		super("长度换算");
	}

	/**
	 * 初始化UI，将view加入到frame中
	 *
	 * @see mvc.framework.AppFrame#initUI()
	 */
	protected void initUI() {
		setLayout(new GridLayout(getViews().size(), 1));
		for (View view : getViews()) {
			add(view);
		}
	}

	/**
	 * 创建model
	 *
	 * @see mvc.framework.AppFrame#createModel()
	 */
	protected IModel createModel() {
		return new LengthAppModel();
	}

	/**
	 * 创建view列表
	 *
	 * @see mvc.framework.AppFrame#createViews()
	 */
	protected List<View> createViews() {
		List<View> views = new ArrayList<View>();
		MeterView mview = new MeterView();
		mview.setController(new MeterController(mview));
		views.add(mview);
		views.add(new FeetView());
		views.add(new YardView());
		return views;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new LengthAppFrame().setVisible(true);
	}
}