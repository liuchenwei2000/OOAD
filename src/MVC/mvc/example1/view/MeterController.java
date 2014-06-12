/**
 * 
 */
package mvc.example1.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.example1.model.LengthAppModel;
import mvc.framework.controller.Controller;
import mvc.framework.view.IView;

/**
 * ����ͼ�Ŀ�����
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-11-3
 */
public class MeterController extends Controller implements ActionListener{

	/**
	 * @param view
	 *            ��������ͼ
	 */
	public MeterController(IView view) {
		super(view);
	}

	/**
	 * ��ͼ���¼�����
	 *
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(getMeterView().getButton())) {
			String meter = getMeterView().getMeter();
			getMeterModel().setMeter(Double.parseDouble(meter));
		}
	}

	private MeterView getMeterView() {
		return (MeterView) getView();
	}

	private LengthAppModel getMeterModel() {
		return (LengthAppModel) getMeterView().getModel();
	}
}