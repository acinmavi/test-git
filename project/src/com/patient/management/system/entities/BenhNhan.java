package com.patient.management.system.entities;


/**
 * * The Class BenhNhan.
 * class bệnh nhân lưu trữ tất cả các thông tin về bệnh nhân 
 * @author dung.nguyen.trung
 */
public class BenhNhan extends Nguoi{

	@Override
	public String toString() {
		return "BenhNhan [ho=" + ho + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh
				+ ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + "]";
	}

}
