package com.patient.management.system.entities;

/**
 * * The Class CoQuan.
 * Class cơ quan lưu trữ thông tin về cơ quan mà những bệnh nhân có BHYT thuộc một cơ quan nào đó
 * @author dung.nguyen.trung
 */
public class CoQuan {
	
	/** The ten co quan. */
	private String tenCoQuan;
	
	/** The dien thoai co quan. */
	private String dienThoaiCoQuan;
	
	/** The fax co quan. */
	private String faxCoQuan;

	/**
	 * Gets the ten co quan.
	 * 
	 * @return the ten co quan
	 */
	public String getTenCoQuan() {
		return tenCoQuan;
	}

	/**
	 * Sets the ten co quan.
	 * 
	 * @param tenCoQuan
	 *            the new ten co quan
	 */
	public void setTenCoQuan(String tenCoQuan) {
		this.tenCoQuan = tenCoQuan;
	}

	/**
	 * Gets the dien thoai co quan.
	 * 
	 * @return the dien thoai co quan
	 */
	public String getDienThoaiCoQuan() {
		return dienThoaiCoQuan;
	}

	/**
	 * Sets the dien thoai co quan.
	 * 
	 * @param dienThoaiCoQuan
	 *            the new dien thoai co quan
	 */
	public void setDienThoaiCoQuan(String dienThoaiCoQuan) {
		this.dienThoaiCoQuan = dienThoaiCoQuan;
	}

	/**
	 * Gets the fax co quan.
	 * 
	 * @return the fax co quan
	 */
	public String getFaxCoQuan() {
		return faxCoQuan;
	}

	/**
	 * Sets the fax co quan.
	 * 
	 * @param faxCoQuan
	 *            the new fax co quan
	 */
	public void setFaxCoQuan(String faxCoQuan) {
		this.faxCoQuan = faxCoQuan;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CoQuan [tenCoQuan=" + tenCoQuan + ", dienThoaiCoQuan=" + dienThoaiCoQuan + ", faxCoQuan=" + faxCoQuan
				+ "]";
	}

}
