package com.patient.management.system.entities;

/**
 * * The Class ChucVu.
 * class chức vụ lưu trữ thông tin về chức vụ của Nhân Viên
 * @author dung.nguyen.trung
 */
public class ChucVu {
	
	/** The ten chuc vu. */
	private String tenChucVu;

	/**
	 * Gets the ten chuc vu.
	 * 
	 * @return the ten chuc vu
	 */
	public String getTenChucVu() {
		return tenChucVu;
	}

	/**
	 * Sets the ten chuc vu.
	 * 
	 * @param tenChucVu
	 *            the new ten chuc vu
	 */
	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChucVu [tenChucVu=" + tenChucVu + "]";
	}

}
