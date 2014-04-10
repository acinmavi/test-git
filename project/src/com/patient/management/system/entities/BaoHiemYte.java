package com.patient.management.system.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * * The Class BaoHiemYte.
 * Class Bảo hiểm y tế lưu thông tin về BHYT của các bệnh nhân có thẻ BHYT
 * @author dung.nguyen.trung
 */
public class BaoHiemYte extends AbtractEntities{
	
	/** The benh nhan. */
	private BenhNhan benhNhan;
	
	/** The so the bhyt. */
	private String soTheBHYT;
	
	/** The ngay bat dau. */
	private Date ngayBatDau;
	
	/** The ngay ket thuc. */
	private Date ngayKetThuc;
	
	/** The phan tram. */
	private BigDecimal phanTram;

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

	/**
	 * Gets the so the bhyt.
	 * 
	 * @return the so the bhyt
	 */
	public String getSoTheBHYT() {
		return soTheBHYT;
	}

	/**
	 * Sets the so the bhyt.
	 * 
	 * @param soTheBHYT
	 *            the new so the bhyt
	 */
	public void setSoTheBHYT(String soTheBHYT) {
		this.soTheBHYT = soTheBHYT;
	}

	/**
	 * Gets the ngay bat dau.
	 * 
	 * @return the ngay bat dau
	 */
	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	/**
	 * Sets the ngay bat dau.
	 * 
	 * @param ngayBatDau
	 *            the new ngay bat dau
	 */
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	/**
	 * Gets the ngay ket thuc.
	 * 
	 * @return the ngay ket thuc
	 */
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	/**
	 * Sets the ngay ket thuc.
	 * 
	 * @param ngayKetThuc
	 *            the new ngay ket thuc
	 */
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	/**
	 * Gets the phan tram.
	 * 
	 * @return the phan tram
	 */
	public BigDecimal getPhanTram() {
		return phanTram;
	}

	/**
	 * Sets the phan tram.
	 * 
	 * @param phanTram
	 *            the new phan tram
	 */
	public void setPhanTram(BigDecimal phanTram) {
		this.phanTram = phanTram;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaoHiemYte [benhNhan=" + benhNhan + ", soTheBHYT=" + soTheBHYT + ", ngayBatDau=" + ngayBatDau
				+ ", ngayKetThuc=" + ngayKetThuc + ", phanTram=" + phanTram + "]";
	}

}
