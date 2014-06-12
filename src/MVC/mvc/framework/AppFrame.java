/**
 * 
 */
package mvc.framework;

import java.util.List;

import mvc.framework.model.IModel;
import mvc.framework.view.View;
import mvc.util.CenteredFrame;

/**
 * Ӧ�ó���JFrame����
 * 
 * ���ฺ����װMVC�����������ʹ��������ܹ�������Ϣ����
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-10-15
 */
public abstract class AppFrame extends CenteredFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5242642963087026877L;
	
	private IModel model;// ģ��
	// ��ͼ�б�(ÿ����ͼ�Ŀ�����Ӧ�ö��Ѿ���������ͼ��)
	private List<View> views;

	public AppFrame() {
		super();
		init();
	}

	/**
	 * @param title
	 *            ����
	 */
	public AppFrame(String title) {
		super(title);
		init();
	}
	
	/**
	 * ��ʼ��
	 */
	private void init() {
		this.model = createModel();
		this.views = createViews();
		initialize();
		initUI();
	}

	/**
	 * ����ʹ�õ�ģ��
	 */
	protected abstract IModel createModel();

	/**
	 * ����������ͼ���б�
	 */
	protected abstract List<View> createViews();

	/**
	 * ��ʼ�� ����ͼȫ��ע�ᵽģ����
	 */
	private void initialize() {
		for (View view : getViews()) {
			view.setModel(getModel());
		}
	}
	
	/**
	 * ��ʼ��UI
	 */
	protected abstract void initUI();

	/**
	 * @return ģ��
	 */
	public IModel getModel() {
		return model;
	}

	/**
	 * @return ��ͼ�б�
	 */
	public List<View> getViews() {
		return views;
	}
}