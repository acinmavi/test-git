package com.patient.management.system.entities;

/**
 * * The Class Xa.
 * Class xã cùng với bảng huyện và bảng tỉnh lưu trữ thông tin địa chỉ của bệnh nhân cũng như nhân viên
 * @author dung.nguyen.trung
 */
public class Xa {
	
	/** The ten xa. */
	private String tenXa;
	
	/** The huyen. */
	private Huyen huyen;

	/**
	 * Gets the ten xa.
	 * 
	 * @return the ten xa
	 */
	public String getTenXa() {
		return tenXa;
	}

	/**
	 * Sets the ten xa.
	 * 
	 * @param tenXa
	 *            the new ten xa
	 */
	public void setTenXa(String tenXa) {
		this.tenXa = tenXa;
	}

	/**
	 * Gets the huyen.
	 * 
	 * @return the huyen
	 */
	public Huyen getHuyen() {
		return huyen;
	}

	/**
	 * Sets the huyen.
	 * 
	 * @param huyen
	 *            the new huyen
	 */
	public void setHuyen(Huyen huyen) {
		this.huyen = huyen;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Xa [tenXa=" + tenXa + ", huyen=" + huyen + "]";
	}

}
