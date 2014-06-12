/**
 * 
 */
package mvc.util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * Border工厂
 *
 * @author 刘晨伟
 *
 * 创建时间：2008-10-9
 */
public class BorderFactory {

	/** 鲜艳的颜色 */
	private static final Color FRESH = new Color(0X7f9db9);

	private BorderFactory() {
		// no instance
	}

	/**
	 * 返回 使用了鲜艳颜色的TitledBorder
	 * 
	 * @param title
	 *            标题
	 */
	public static TitledBorder createTitledBorder(String title) {
		TitledBorder border = new TitledBorder(title);
		border.setTitleFont(new Font("宋体", Font.PLAIN, 12));
		border.setTitleColor(FRESH);
		return border;
	}

	/**
	 * @return 使用了鲜艳颜色的LineBorder
	 */
	public static LineBorder createLineBorder() {
		return new LineBorder(FRESH);
	}

	/**
	 * @return 鲜艳的颜色
	 */
	public static Color getFreshColor() {
		return FRESH;
	}
}