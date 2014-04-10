package com.patient.management.system.entities;

import java.util.List;

/**
 * * The Class Huyen. Class huyện lưu trữ thông tin về huyện mà bệnh nhân và
 * Nhân Viên đang sống
 * 
 * @author dung.nguyen.trung
 */
public class Huyen {

	private List<Xa> dsXa;

	/** The ten huyen. */
	private String tenHuyen;

	/** The tinh. */
	private Tinh tinh;

	/**
	 * Gets the ten huyen.
	 * 
	 * @return the ten huyen
	 */
	public String getTenHuyen() {
		return tenHuyen;
	}

	/**
	 * Sets the ten huyen.
	 * 
	 * @param tenHuyen
	 *            the new ten huyen
	 */
	public void setTenHuyen(String tenHuyen) {
		this.tenHuyen = tenHuyen;
	}

	/**
	 * Gets the tinh.
	 * 
	 * @return the tinh
	 */
	public Tinh getTinh() {
		return tinh;
	}

	/**
	 * Sets the tinh.
	 * 
	 * @param tinh
	 *            the new tinh
	 */
	public void setTinh(Tinh tinh) {
		this.tinh = tinh;
	}

	public List<Xa> getDsXa() {
		return dsXa;
	}

	public void setDsXa(List<Xa> dsXa) {
		this.dsXa = dsXa;
	}

	@Override
	public String toString() {
		return "Huyen [dsXa=" + dsXa + ", tenHuyen=" + tenHuyen + ", tinh=" + tinh + "]";
	}

}
