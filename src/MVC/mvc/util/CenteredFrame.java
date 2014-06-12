/**
 * 
 */
package mvc.util;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * ������ʾ��JFrame
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-11-3
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
	 * ����JFrame������ʾ
	 */
	public void setCenter() {
		int windowWidth = getWidth(); // ��ô��ڿ�
		int windowHeight = getHeight(); // ��ô��ڸ�
		Toolkit kit = Toolkit.getDefaultToolkit(); // ���幤�߰�
		Dimension screenSize = kit.getScreenSize(); // ��ȡ��Ļ�ĳߴ�
		int screenWidth = screenSize.width; // ��ȡ��Ļ�Ŀ�
		int screenHeight = screenSize.height; // ��ȡ��Ļ�ĸ�
		setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2
				- windowHeight / 2);// ���ô��ھ�����ʾ
	}

	/**
	 * ��ʾ����(Ĭ�Ͼ�����ʾ)
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