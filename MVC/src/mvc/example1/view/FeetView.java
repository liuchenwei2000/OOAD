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
 * 英尺 视图
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-11-3
 */
public class FeetView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8112883303121546966L;

	private JLabel label;
	private JTextField textField;

	public FeetView() {
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
			label = ComponentBuilder.buildCommonLabel("英尺");
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
		getTextField().setText(meter / 0.3048 + "");
	}
}
