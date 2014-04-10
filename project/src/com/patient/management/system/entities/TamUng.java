package com.patient.management.system.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * * The Class TamUng.
 * Class Tạm ứng lưu trữ thông tin về số tiền mà bệnh nhân đã tạm ứng cho bệnh viện, 
 * số lần tạm ứng, mỗi lần số tiền là bao nhiêu
 * @author dung.nguyen.trung
 */
public class TamUng  extends AbtractEntities{
	
	/** The so lan tam ung. */
	private int soLanTamUng;
	
	/** The so tien. */
	private BigDecimal soTien;
	
	/** The ngay tam ung. */
	private Date ngayTamUng;
	
	/** The benh nhan. */
	private BenhNhan benhNhan;

	/**
	 * Gets the so lan tam ung.
	 * 
	 * @return the so lan tam ung
	 */
	public int getSoLanTamUng() {
		return soLanTamUng;
	}

	/**
	 * Sets the so lan tam ung.
	 * 
	 * @param soLanTamUng
	 *            the new so lan tam ung
	 */
	public void setSoLanTamUng(int soLanTamUng) {
		this.soLanTamUng = soLanTamUng;
	}

	/**
	 * Gets the so tien.
	 * 
	 * @return the so tien
	 */
	public BigDecimal getSoTien() {
		return soTien;
	}

	/**
	 * Sets the so tien.
	 * 
	 * @param soTien
	 *            the new so tien
	 */
	public void setSoTien(BigDecimal soTien) {
		this.soTien = soTien;
	}

	/**
	 * Gets the ngay tam ung.
	 * 
	 * @return the ngay tam ung
	 */
	public Date getNgayTamUng() {
		return ngayTamUng;
	}

	/**
	 * Sets the ngay tam ung.
	 * 
	 * @param ngayTamUng
	 *            the new ngay tam ung
	 */
	public void setNgayTamUng(Date ngayTamUng) {
		this.ngayTamUng = ngayTamUng;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TamUng [soLanTamUng=" + soLanTamUng + ", soTien=" + soTien + ", ngayTamUng=" + ngayTamUng
				+ ", benhNhan=" + benhNhan + "]";
	}

}
