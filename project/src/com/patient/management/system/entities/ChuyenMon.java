package com.patient.management.system.entities;

/**
 * * The Class ChuyenMon.
 * Class chuyên môn lưu trữ thông tin về chuyên môn của nhân viên
 * @author dung.nguyen.trung
 */
public class ChuyenMon {
	
	/** The ten chuyen mon. */
	private String tenChuyenMon;

	/**
	 * Gets the ten chuyen mon.
	 * 
	 * @return the ten chuyen mon
	 */
	public String getTenChuyenMon() {
		return tenChuyenMon;
	}

	/**
	 * Sets the ten chuyen mon.
	 * 
	 * @param tenChuyenMon
	 *            the new ten chuyen mon
	 */
	public void setTenChuyenMon(String tenChuyenMon) {
		this.tenChuyenMon = tenChuyenMon;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChuyenMon [tenChuyenMon=" + tenChuyenMon + "]";
	}

}
