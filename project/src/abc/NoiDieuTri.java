package abc;

import java.math.BigDecimal;

/**
 * * The Class NoiDieuTri.
 * Nơi điều trị là nơi mà bệnh nhân điều trị khi ở bệnh viện
 * @author dung.nguyen.trung
 */
public class NoiDieuTri{
	
	/** The ten noi dieu tri. */
	private String tenNoiDieuTri;
	
	/** The don gia. */
	private BigDecimal donGia;

	/**
	 * Gets the ten noi dieu tri.
	 * 
	 * @return the ten noi dieu tri
	 */
	public String getTenNoiDieuTri() {
		return tenNoiDieuTri;
	}

	/**
	 * Sets the ten noi dieu tri.
	 * 
	 * @param tenNoiDieuTri
	 *            the new ten noi dieu tri
	 */
	public void setTenNoiDieuTri(String tenNoiDieuTri) {
		this.tenNoiDieuTri = tenNoiDieuTri;
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
		return "NoiDieuTri [tenNoiDieuTri=" + tenNoiDieuTri + ", donGia=" + donGia + "]";
	}

}
