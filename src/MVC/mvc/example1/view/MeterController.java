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
 * 米视图的控制器
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-11-3
 */
public class MeterController extends Controller implements ActionListener{

	/**
	 * @param view
	 *            关联的视图
	 */
	public MeterController(IView view) {
		super(view);
	}

	/**
	 * 视图的事件处理
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
