/**
 * 
 */
package mvc.example1.model;

import mvc.framework.model.Model;

/**
 * ���Ȼ���model
 * 
 * @author ����ΰ
 *
 * �������ڣ�2008-11-3
 */
public class LengthAppModel extends Model {

	private double meter;// Ĭ�ϵ�λ�� ��

	public LengthAppModel() {
		super();
		this.meter = 0;
	}

	/**
	 * @return ��
	 */
	public double getMeter() {
		return meter;
	}

	/**
	 * �����µ����ݻ�֪ͨ��ͼ
	 * 
	 * @param meter
	 *            ��
	 */
	public void setMeter(double meter) {
		this.meter = meter;
		notifyViews();
	}
}