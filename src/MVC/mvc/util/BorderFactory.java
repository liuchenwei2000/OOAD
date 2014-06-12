/**
 * 
 */
package mvc.util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * Border����
 *
 * @author ����ΰ
 *
 * ����ʱ�䣺2008-10-9
 */
public class BorderFactory {

	/** ���޵���ɫ */
	private static final Color FRESH = new Color(0X7f9db9);

	private BorderFactory() {
		// no instance
	}

	/**
	 * ���� ʹ����������ɫ��TitledBorder
	 * 
	 * @param title
	 *            ����
	 */
	public static TitledBorder createTitledBorder(String title) {
		TitledBorder border = new TitledBorder(title);
		border.setTitleFont(new Font("����", Font.PLAIN, 12));
		border.setTitleColor(FRESH);
		return border;
	}

	/**
	 * @return ʹ����������ɫ��LineBorder
	 */
	public static LineBorder createLineBorder() {
		return new LineBorder(FRESH);
	}

	/**
	 * @return ���޵���ɫ
	 */
	public static Color getFreshColor() {
		return FRESH;
	}
}