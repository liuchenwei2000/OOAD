/**
 * 
 */
package mvc.example1.view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mvc.framework.controller.IController;
import mvc.framework.view.View;
import mvc.util.ComponentBuilder;

/**
 * �� ��ͼ
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-11-3
 */
public class MeterView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9091879024836176243L;
	
	private JLabel label;
	private JTextField textField;
	private JButton button;

	public MeterView() {
		super();
		initUI();
	}

	private void initUI() {
		setLayout(new FlowLayout(FlowLayout.LEADING));
		add(getLabel());
		add(getTextField());
		add(getButton());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = ComponentBuilder.buildCommonLabel("��");
		}
		return label;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = ComponentBuilder.buildCommonTextField();
		}
		return textField;
	}

	protected JButton getButton() {
		if (button == null) {
			button = ComponentBuilder.buildCommonButton("����");
		}
		return button;
	}

	public String getMeter() {
		return getTextField().getText();
	}

	public void setController(IController controller) {
		super.setController(controller);
		getButton().addActionListener((ActionListener) controller);
	}

	/**
	 * û�ж���
	 * 
	 * @see mvc.framework.view.View#updateView()
	 */
	public void updateView() {

	}
}