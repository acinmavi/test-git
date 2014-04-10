package com.patient.management.system.entities;

/**
 * * The Class CanBo.
 * Class cán bộ là thực thể chuyên biệt hóa của thực thể bảo hiểm y tế thuộc cơ quan nào đó
 * @author dung.nguyen.trung
 */
public class CanBo {
	
	/** The benh nhan. */
	private BenhNhan benhNhan;
	
	/** The co quan. */
	private CoQuan coQuan;

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
	 * Gets the co quan.
	 * 
	 * @return the co quan
	 */
	public CoQuan getCoQuan() {
		return coQuan;
	}

	/**
	 * Sets the co quan.
	 * 
	 * @param coQuan
	 *            the new co quan
	 */
	public void setCoQuan(CoQuan coQuan) {
		this.coQuan = coQuan;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CanBo [benhNhan=" + benhNhan + ", coQuan=" + coQuan + "]";
	}

}
