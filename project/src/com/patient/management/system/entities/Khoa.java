package com.patient.management.system.entities;

/**
 * * The Class Khoa.
 * Class Khoa lưu trữ thông tin về khoa mà nhân viên (Bác sĩ) đang làm việc
 * @author dung.nguyen.trung
 */
public class Khoa  extends AbtractEntities{
	
	/** The ten khoa. */
	private String tenKhoa;

	/**
	 * Gets the ten khoa.
	 * 
	 * @return the ten khoa
	 */
	public String getTenKhoa() {
		return tenKhoa;
	}

	/**
	 * Sets the ten khoa.
	 * 
	 * @param tenKhoa
	 *            the new ten khoa
	 */
	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Khoa [tenKhoa=" + tenKhoa + "]";
	}

}
