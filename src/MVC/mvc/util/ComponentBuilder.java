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
 * 公用组件工具类
 *
 * @author 刘晨伟
 *
 * 创建时间：2008-9-11
 */
public class ComponentBuilder {
	
	/** 输入框 宽度 */
	public static final int WIDTH = 140;
	/** 一般控件 高度 */
	public static final int HEIGHT = 21;
	
	/**
	 * 返回标签和组件的公用面板(水平布局)
	 * 
	 * @param label
	 *            标签
	 * @param textField
	 *            输入框
	 */
	public static JPanel buildLabelComponentPanel(JLabel label, JComponent com) {
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(com);
		return panel;
	}

	/**
	 * 返回输入框和按钮面板(水平布局)
	 * 
	 * @param textField
	 *            输入框
	 * @param button
	 *            按钮
	 */
	public static JPanel buildTextFieldButtonPanel(JTextField textField, JButton button) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(textField);
		panel.add(button);
		return panel;
	}
	
	/**
	 * 返回根据名称构建的公用标签 
	 * (内容向右靠齐、14号普通宋体)
	 * 
	 * @param name
	 *            标签名
	 */
	public static JLabel buildCommonLabel(String name) {
		JLabel label = new JLabel(name);
		label.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		label.setHorizontalAlignment(SwingConstants.LEADING);
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		return label;
	}

	/**
	 * @return 返回公用输入框
	 */
	public static JTextField buildCommonTextField() {
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		textField.setBorder(BorderFactory.createLineBorder());
		return textField;
	}
	
	/**
	 * @return 返回公用密码输入框
	 */
	public static JPasswordField buildCommonPasswordField() {
		JPasswordField pwField = new JPasswordField();
		pwField.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		pwField.setBorder(BorderFactory.createLineBorder());
		return pwField;
	}
	
	/**
	 * @return 返回公用按钮
	 */
	public static JButton buildCommonButton(String name) {
		JButton button = new JButton(name);
		button.setFont(new Font("宋体", Font.PLAIN, 12));
		return button;
	}
}