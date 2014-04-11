package com.patient.management.system.entities;

import java.util.Date;

/**
 * * The Class NhanVien.
 * Class nhân viên lưu trữ tất cả thông tin về nhân viên (Bác sĩ)	
 * @author dung.nguyen.trung
 */
public class NhanVien{
	
	/** The ho ten nv. */
	private String hoTenNV;
	
	/** The ngay sinh. */
	private Date ngaySinh;
	
	/** The gioi tinh. */
	private int gioiTinh;
	
	/** The so nha nv. */
	private String soNhaNV;
	
	/** The so dien thoai. */
	private String soDienThoai;
	
	/** The xa. */
	private Xa xa;
	
	/** The khoa. */
	private Khoa khoa;
	
	/** The chuyen mon. */
	private ChuyenMon chuyenMon;
	
	/** The chuc vu. */
	private ChucVu chucVu;

	/**
	 * Gets the ho ten nv.
	 * 
	 * @return the ho ten nv
	 */
	public String getHoTenNV() {
		return hoTenNV;
	}

	/**
	 * Sets the ho ten nv.
	 * 
	 * @param hoTenNV
	 *            the new ho ten nv
	 */
	public void setHoTenNV(String hoTenNV) {
		this.hoTenNV = hoTenNV;
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
	 * Gets the so nha nv.
	 * 
	 * @return the so nha nv
	 */
	public String getSoNhaNV() {
		return soNhaNV;
	}

	/**
	 * Sets the so nha nv.
	 * 
	 * @param soNhaNV
	 *            the new so nha nv
	 */
	public void setSoNhaNV(String soNhaNV) {
		this.soNhaNV = soNhaNV;
	}

	/**
	 * Gets the so dien thoai.
	 * 
	 * @return the so dien thoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}

	/**
	 * Sets the so dien thoai.
	 * 
	 * @param soDienThoai
	 *            the new so dien thoai
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
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

	/**
	 * Gets the khoa.
	 * 
	 * @return the khoa
	 */
	public Khoa getKhoa() {
		return khoa;
	}

	/**
	 * Sets the khoa.
	 * 
	 * @param khoa
	 *            the new khoa
	 */
	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	/**
	 * Gets the chuyen mon.
	 * 
	 * @return the chuyen mon
	 */
	public ChuyenMon getChuyenMon() {
		return chuyenMon;
	}

	/**
	 * Sets the chuyen mon.
	 * 
	 * @param chuyenMon
	 *            the new chuyen mon
	 */
	public void setChuyenMon(ChuyenMon chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

	/**
	 * Gets the chuc vu.
	 * 
	 * @return the chuc vu
	 */
	public ChucVu getChucVu() {
		return chucVu;
	}

	/**
	 * Sets the chuc vu.
	 * 
	 * @param chucVu
	 *            the new chuc vu
	 */
	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NhanVien [hoTenNV=" + hoTenNV + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", soNhaNV="
				+ soNhaNV + ", soDienThoai=" + soDienThoai + ", xa=" + xa + ", khoa=" + khoa + ", chuyenMon="
				+ chuyenMon + ", chucVu=" + chucVu + "]";
	}

}
