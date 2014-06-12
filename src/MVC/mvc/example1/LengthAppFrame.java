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
 * ���Ȼ�����ʾFrame
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-10-15
 */
public class LengthAppFrame extends AppFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6188884184166645296L;

	public LengthAppFrame() {
		super("���Ȼ���");
	}

	/**
	 * ��ʼ��UI����view���뵽frame��
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
	 * ����model
	 *
	 * @see mvc.framework.AppFrame#createModel()
	 */
	protected IModel createModel() {
		return new LengthAppModel();
	}

	/**
	 * ����view�б�
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