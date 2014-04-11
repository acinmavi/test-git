package com.patient.management.system.entities;

import java.util.Date;

/**
 * * The Class BenhNhan.
 * class bệnh nhân lưu trữ tất cả các thông tin về bệnh nhân 
 * @author dung.nguyen.trung
 */
public class BenhNhan{
	
	/** The ho benh nhan. */
	private String hoBenhNhan;
	
	/** The ten benh nhan. */
	private String tenBenhNhan;
	
	/** The ngay sinh. */
	private Date ngaySinh;
	
	/** The gioi tinh. */
	private int gioiTinh;
	
	/** The xa. */
	private Xa xa;

	/**
	 * Gets the ho benh nhan.
	 * 
	 * @return the ho benh nhan
	 */
	public String getHoBenhNhan() {
		return hoBenhNhan;
	}

	/**
	 * Sets the ho benh nhan.
	 * 
	 * @param hoBenhNhan
	 *            the new ho benh nhan
	 */
	public void setHoBenhNhan(String hoBenhNhan) {
		this.hoBenhNhan = hoBenhNhan;
	}

	/**
	 * Gets the ten benh nhan.
	 * 
	 * @return the ten benh nhan
	 */
	public String getTenBenhNhan() {
		return tenBenhNhan;
	}

	/**
	 * Sets the ten benh nhan.
	 * 
	 * @param tenBenhNhan
	 *            the new ten benh nhan
	 */
	public void setTenBenhNhan(String tenBenhNhan) {
		this.tenBenhNhan = tenBenhNhan;
	}

	/**
	 * Gets the ngay sinh.
	 * 
	 * @return the ngay sinh
	 */
	public Date getNgaySinh() {
		return ngaySinh;
	}

	/**
	 * Sets the ngay sinh.
	 * 
	 * @param ngaySinh
	 *            the new ngay sinh
	 */
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	/**
	 * Gets the gioi tinh.
	 * 
	 * @return the gioi tinh
	 */
	public int getGioiTinh() {
		return gioiTinh;
	}

	/**
	 * Sets the gioi tinh.
	 * 
	 * @param gioiTinh
	 *            the new gioi tinh
	 */
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	/**
	 * Gets the xa.
	 * 
	 * @return the xa
	 */
	public Xa getXa() {
		return xa;
	}

	/**
	 * Sets the xa.
	 * 
	 * @param xa
	 *            the new xa
	 */
	public void setXa(Xa xa) {
		this.xa = xa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BenhNhan [hoBenhNhan=" + hoBenhNhan + ", tenBenhNhan=" + tenBenhNhan + ", ngaySinh=" + ngaySinh
				+ ", gioiTinh=" + gioiTinh + ", xa=" + xa + "]";
	}

}
