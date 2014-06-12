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
 * Ӣ�� ��ͼ
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-11-3
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
			label = ComponentBuilder.buildCommonLabel("Ӣ��");
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
	 * ����ģ�͵��׻����Ӣ��Ȼ��ˢ����ʾ
	 * 
	 * @see mvc.framework.view.View#updateView()
	 */
	public void updateView() {
		LengthAppModel model = (LengthAppModel) getModel();
		double meter = model.getMeter();
		getTextField().setText(meter / 0.3048 + "");
	}
}