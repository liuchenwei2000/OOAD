/**
 * 
 */
package mvc.util;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * �������������
 *
 * @author ����ΰ
 *
 * ����ʱ�䣺2008-9-11
 */
public class ComponentBuilder {
	
	/** ����� ��� */
	public static final int WIDTH = 140;
	/** һ��ؼ� �߶� */
	public static final int HEIGHT = 21;
	
	/**
	 * ���ر�ǩ������Ĺ������(ˮƽ����)
	 * 
	 * @param label
	 *            ��ǩ
	 * @param textField
	 *            �����
	 */
	public static JPanel buildLabelComponentPanel(JLabel label, JComponent com) {
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(com);
		return panel;
	}

	/**
	 * ���������Ͱ�ť���(ˮƽ����)
	 * 
	 * @param textField
	 *            �����
	 * @param button
	 *            ��ť
	 */
	public static JPanel buildTextFieldButtonPanel(JTextField textField, JButton button) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(textField);
		panel.add(button);
		return panel;
	}
	
	/**
	 * ���ظ������ƹ����Ĺ��ñ�ǩ 
	 * (�������ҿ��롢14����ͨ����)
	 * 
	 * @param name
	 *            ��ǩ��
	 */
	public static JLabel buildCommonLabel(String name) {
		JLabel label = new JLabel(name);
		label.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		label.setHorizontalAlignment(SwingConstants.LEADING);
		label.setFont(new Font("����", Font.PLAIN, 14));
		return label;
	}

	/**
	 * @return ���ع��������
	 */
	public static JTextField buildCommonTextField() {
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		textField.setBorder(BorderFactory.createLineBorder());
		return textField;
	}
	
	/**
	 * @return ���ع������������
	 */
	public static JPasswordField buildCommonPasswordField() {
		JPasswordField pwField = new JPasswordField();
		pwField.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		pwField.setBorder(BorderFactory.createLineBorder());
		return pwField;
	}
	
	/**
	 * @return ���ع��ð�ť
	 */
	public static JButton buildCommonButton(String name) {
		JButton button = new JButton(name);
		button.setFont(new Font("����", Font.PLAIN, 12));
		return button;
	}
}