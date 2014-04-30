package com.patient.management.system.entities;

import java.util.Date;

public class Nguoi {
	/** The ho benh nhan. */
	private String ho;
	
	/** The ten benh nhan. */
	private String ten;
	
	/** The ngay sinh. */
	private Date ngaySinh;
	
	/** The gioi tinh. */
	private int gioiTinh;
	
	private String diaChi;
	
	/** The so dien thoai. */
	private String soDienThoai;

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Override
	public String toString() {
		return "Nguoi [ho=" + ho + ", ten=" + ten + ", ngaySinh=" + ngaySinh
				+ ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi
				+ ", soDienThoai=" + soDienThoai + "]";
	}
	
	
}
