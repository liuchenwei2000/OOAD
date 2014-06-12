/**
 * 
 */
package mvc.example1.model;

import mvc.framework.model.Model;

/**
 * 长度换算model
 * 
 * @author 刘晨伟
 *
 * 创建日期：2008-11-3
 */
public class LengthAppModel extends Model {

	private double meter;// 默认单位是 米

	public LengthAppModel() {
		super();
		this.meter = 0;
	}

	/**
	 * @return 米
	 */
	public double getMeter() {
		return meter;
	}

	/**
	 * 设置新的数据会通知视图
	 * 
	 * @param meter
	 *            米
	 */
	public void setMeter(double meter) {
		this.meter = meter;
		notifyViews();
	}
}