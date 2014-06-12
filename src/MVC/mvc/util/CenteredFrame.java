/**
 * 
 */
package mvc.util;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 居中显示的JFrame
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-11-3
 */
public abstract class CenteredFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 768162128544187442L;

	public CenteredFrame() {
		super();
	}

	public CenteredFrame(String title) {
		super(title);
	}

	/**
	 * 设置JFrame居中显示
	 */
	public void setCenter() {
		int windowWidth = getWidth(); // 获得窗口宽
		int windowHeight = getHeight(); // 获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸
		int screenWidth = screenSize.width; // 获取屏幕的宽
		int screenHeight = screenSize.height; // 获取屏幕的高
		setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2
				- windowHeight / 2);// 设置窗口居中显示
	}

	/**
	 * 显示设置(默认居中显示)
	 * 
	 * @see java.awt.Component#setVisible(boolean)
	 */
	public void setVisible(boolean b) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setCenter();
		super.setVisible(b);
	}
}