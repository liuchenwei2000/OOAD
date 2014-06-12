/**
 * 
 */
package mvc.framework.model;

import java.util.ArrayList;
import java.util.List;

import mvc.framework.view.IView;

/**
 * MVC�ṹ�е�ģ��Ĭ��ʵ��
 * 
 * ���������ʵ������ĳ�Ա�ͷ���
 * �û�����Ҫ������ģ�ͺ���ͼ����ϵ
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-10-15
 */
public abstract class Model implements IModel {

	private List<IView> views;// ע�����ͼ�б�
	
	public Model() {
		// do nothing
	}

	private List<IView> getViews(){
		if(views == null){
			views = new ArrayList<IView>();
		}
		return views;
	}
	
	/**
	 * ��ģ����ע�������ͼ
	 * 
	 * @see mvc.framework.model.IModel#addView(mvc.framework.view.IView)
	 */
	public void addView(IView view) {
		getViews().add(view);
	}
	
	/**
	 * ɾ��ģ����ע��Ĳ�����ͼ 
	 *
	 * @see mvc.framework.model.IModel#deleteView(mvc.framework.view.IView)
	 */
	public void deleteView(IView view) {
		getViews().remove(view);
	}

	/**
	 * ֪ͨ��ͼģ�ͱ��(��ͼ����ģ�͸����Լ�)
	 * 
	 * @see mvc.framework.model.IModel#notifyViews()
	 */
	public void notifyViews() {
		if (views == null || views.size() == 0) return;
		for (IView view : views) {
			view.updateView();
		}
	}
}