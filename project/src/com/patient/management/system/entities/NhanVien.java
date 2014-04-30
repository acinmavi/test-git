package com.patient.management.system.entities;

/**
 * * The Class NhanVien. Class nhân viên lưu trữ tất cả thông tin về nhân viên
 * (Bác sĩ)
 * 
 * @author dung.nguyen.trung
 */
public class NhanVien extends Nguoi {

	/** The khoa. */
	private String khoa;

	/** The chuyen mon. */
	private String chuyenMon;

	/** The chuc vu. */
	private String chucVu;

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Override
	public String toString() {
		return super.toString() + "NhanVien [khoa=" + khoa + ", chuyenMon="
				+ chuyenMon + ", chucVu=" + chucVu + "]";
	}

}
