/**
 * 
 */
package mvc.example1.view;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import mvc.example1.model.LengthAppModel;
import mvc.framework.view.View;
import mvc.util.ComponentBuilder;

/**
 * 码 视图
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-11-3
 */
public class YardView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7510531644747346727L;

	private JLabel label;
	private JTextField textField;

	public YardView() {
		super();
		initUI();
	}

	private void initUI() {
		setLayout(new FlowLayout(FlowLayout.LEADING));
		add(getLabel());
		add(getTextField());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = ComponentBuilder.buildCommonLabel("码");
		}
		return label;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = ComponentBuilder.buildCommonTextField();
		}
		return textField;
	}

	/**
	 * 根据模型的米换算成英尺然后刷新显示
	 * 
	 * @see mvc.framework.view.View#updateView()
	 */
	public void updateView() {
		LengthAppModel model = (LengthAppModel) getModel();
		double meter = model.getMeter();
		getTextField().setText(meter / 0.9144 + "");
	}
}