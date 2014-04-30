package com.patient.management.system.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * * The Class KhamBenh. Class Khám bệnh là mối kết hợp giữa các thực thể nhân
 * viên, bệnh nhân, bệnh, vị trí nên nó nhận tất cả các khóa của các thực thể
 * tham gia vào mối kết hợp các giá trị của các trường này được lấy tương ứng từ
 * các bảng tương ứng
 * 
 * @author dung.nguyen.trung
 */
public class PhieuKham {

	/** The nhan vien. */
	private NhanVien nhanVien;

	/** The benh nhan. */
	private BenhNhan benhNhan;

	/** The vi tri. */
	private String viTriKham;

	/** The ngay kham. */
	private Date ngayKham;

	/** The noi dung kham. */
	private String noiDungKham;

	/** The chi phi kham. */
	private BigDecimal chiPhiKham;

	/**
	 * Gets the nhan vien.
	 * 
	 * @return the nhan vien
	 */
	public NhanVien getNhanVien() {
		return nhanVien;
	}

	/**
	 * Sets the nhan vien.
	 * 
	 * @param nhanVien
	 *            the new nhan vien
	 */
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	/**
	 * Gets the benh nhan.
	 * 
	 * @return the benh nhan
	 */
	public BenhNhan getBenhNhan() {
		return benhNhan;
	}

	/**
	 * Sets the benh nhan.
	 * 
	 * @param benhNhan
	 *            the new benh nhan
	 */
	public void setBenhNhan(BenhNhan benhNhan) {
		this.benhNhan = benhNhan;
	}

	public String getViTriKham() {
		return viTriKham;
	}

	public void setViTriKham(String viTriKham) {
		this.viTriKham = viTriKham;
	}

	/**
	 * Gets the ngay kham.
	 * 
	 * @return the ngay kham
	 */
	public Date getNgayKham() {
		return ngayKham;
	}

	/**
	 * Sets the ngay kham.
	 * 
	 * @param ngayKham
	 *            the new ngay kham
	 */
	public void setNgayKham(Date ngayKham) {
		this.ngayKham = ngayKham;
	}

	/**
	 * Gets the noi dung kham.
	 * 
	 * @return the noi dung kham
	 */
	public String getNoiDungKham() {
		return noiDungKham;
	}

	/**
	 * Sets the noi dung kham.
	 * 
	 * @param noiDungKham
	 *            the new noi dung kham
	 */
	public void setNoiDungKham(String noiDungKham) {
		this.noiDungKham = noiDungKham;
	}

	/**
	 * Gets the chi phi kham.
	 * 
	 * @return the chi phi kham
	 */
	public BigDecimal getChiPhiKham() {
		return chiPhiKham;
	}

	/**
	 * Sets the chi phi kham.
	 * 
	 * @param chiPhiKham
	 *            the new chi phi kham
	 */
	public void setChiPhiKham(BigDecimal chiPhiKham) {
		this.chiPhiKham = chiPhiKham;
	}

	@Override
	public String toString() {
		return "PhieuKham [nhanVien=" + nhanVien + ", benhNhan=" + benhNhan
				+ ", viTriKham=" + viTriKham + ", ngayKham=" + ngayKham
				+ ", noiDungKham=" + noiDungKham + ", chiPhiKham=" + chiPhiKham
				+ "]";
	}

}
