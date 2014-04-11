package com.patient.management.system.entities;

import java.util.List;

/**
 * * Class tỉnh lưu trữ thông tin về tỉnh mà bệnh nhân và Nhân Viên đang sống
 * 
 * @author dung.nguyen.trung
 */
public class Tinh{

	/** The ten tinh. */
	private String tenTinh;

	/**
	 * Gets the ten tinh.
	 * 
	 * @return the ten tinh
	 */
	public String getTenTinh() {
		return tenTinh;
	}

	/**
	 * Sets the ten tinh.
	 * 
	 * @param tenTinh
	 *            the new ten tinh
	 */
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tinh [tenTinh=" + tenTinh + "]";
	}

}
