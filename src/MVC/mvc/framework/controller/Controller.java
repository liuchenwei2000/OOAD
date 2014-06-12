/**
 * 
 */
package mvc.framework.controller;

import mvc.framework.view.IView;

/**
 * MVC�ṹ�еĿ�����Ĭ��ʵ��
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-10-15
 */
public abstract class Controller implements IController {

	private IView view;// ��������ͼ

	/**
	 * Ϊ��ͼ����һ��������
	 * 
	 * @param view
	 *            ��ͼ
	 */
	public Controller(IView view) {
		this.view = view;
	}

	/**
	 * @return ��������ͼ
	 */
	public IView getView() {
		return view;
	}
}