/**
 * 
 */
package mvc.framework.model;

import mvc.framework.view.IView;

/**
 * MVC�ṹ�е�ģ�ͽӿ�
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-10-15
 */
public interface IModel {

	/**
	 * ��ģ����ע�������ͼ
	 * 
	 * @param view
	 *            ��ͼ
	 */
	public void addView(IView view);
	
	/**
	 * ɾ��ģ����ע��Ĳ�����ͼ
	 * 
	 * @param view
	 *            ��ͼ
	 */
	public void deleteView(IView view);

	/**
	 * ֪ͨ��ͼģ�ͱ��
	 */
	public void notifyViews();
}