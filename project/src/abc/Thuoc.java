package abc;

import java.math.BigDecimal;

/**
 * * The Class Thuoc.
 * 
 * @author dung.nguyen.trung
 */
public class Thuoc{
	
	/** The ten thuoc. */
	private String tenThuoc;
	
	/** The don gia. */
	private BigDecimal donGia;

	/**
	 * Gets the ten thuoc.
	 * 
	 * @return the ten thuoc
	 */
	public String getTenThuoc() {
		return tenThuoc;
	}

	/**
	 * Sets the ten thuoc.
	 * 
	 * @param tenThuoc
	 *            the new ten thuoc
	 */
	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
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
		return "Thuoc [tenThuoc=" + tenThuoc + ", donGia=" + donGia + "]";
	}

}
