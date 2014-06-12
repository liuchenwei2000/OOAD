/**
 * 
 */
package mvc.framework.view;

import javax.swing.JPanel;

import mvc.framework.controller.IController;
import mvc.framework.model.IModel;

/**
 * MVC�ṹ�е���ͼĬ��ʵ��
 * 
 * ���������ʵ������Ŀؼ��Ͳ���
 * �û�����Ҫ��������ͼ��ģ�͡���������Ĺ�ϵ
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-10-15
 */
public abstract class View extends JPanel implements IView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5114765333100218744L;

	private IModel model;// ע���ģ��
	
	private IController controller;// �����Ŀ�����
	
	public View(){
		super();
	}

	/**
	 * @return ע���ģ��
	 */
	public IModel getModel() {
		return model;
	}

	/**
	 * ��ģ����ע�᱾��ͼ
	 * 
	 * @param model
	 */
	public void setModel(IModel model) {
		this.model = model;
		model.addView(this);
	}

	/**
	 * @return ��ͼ�Ŀ�����
	 */
	public IController getController() {
		return controller;
	}

	/**
	 * ����ͼ���ÿ�����
	 * 
	 * @param controller
	 *            ������
	 */
	public void setController(IController controller) {
		this.controller = controller;
	}

	/**
	 * ����ģ�͸�����ͼ(����ʵ�־�����·���)
	 *
	 * @see mvc.framework.view.IView#updateView()
	 */
	public abstract void updateView();
}