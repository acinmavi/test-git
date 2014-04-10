package com.patient.management.system.entities;

import java.math.BigDecimal;

/**
 * * The Class DichVu.
 * Class  dịch vụ lưu trữ những thông tin về những dịch vụ mà bệnh viện có
 * @author dung.nguyen.trung
 */
public class DichVu  extends AbtractEntities{
	
	/** The ten dich vu. */
	private String tenDichVu;
	
	/** The don gia. */
	private BigDecimal donGia;

	/**
	 * Gets the ten dich vu.
	 * 
	 * @return the ten dich vu
	 */
	public String getTenDichVu() {
		return tenDichVu;
	}

	/**
	 * Sets the ten dich vu.
	 * 
	 * @param tenDichVu
	 *            the new ten dich vu
	 */
	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	/**
	 * Gets the don gia.
	 * 
	 * @return the don gia
	 */
	public BigDecimal getDonGia() {
		return donGia;
	}

	/**
	 * Sets the don gia.
	 * 
	 * @param donGia
	 *            the new don gia
	 */
	public void setDonGia(BigDecimal donGia) {
		this.donGia = donGia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DichVu [tenDichVu=" + tenDichVu + ", donGia=" + donGia + "]";
	}

}
