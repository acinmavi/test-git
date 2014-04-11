package com.patient.management.system.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * * The Class KhamBenh.
 * Class Khám bệnh là mối kết hợp giữa các thực thể nhân viên, bệnh nhân,
 *  bệnh, vị trí nên nó nhận tất cả các khóa của các thực thể tham gia vào mối kết hợp 
 *  các giá trị của các trường này được lấy tương ứng từ các bảng tương ứng
 * @author dung.nguyen.trung
 */
public class KhamBenh{
	
	/** The nhan vien. */
	private NhanVien nhanVien;
	
	/** The benh nhan. */
	private BenhNhan benhNhan;
	
	/** The benh. */
	private Benh benh;
	
	/** The vi tri. */
	private ViTri viTri;
	
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

	/**
	 * Gets the benh.
	 * 
	 * @return the benh
	 */
	public Benh getBenh() {
		return benh;
	}

	/**
	 * Sets the benh.
	 * 
	 * @param benh
	 *            the new benh
	 */
	public void setBenh(Benh benh) {
		this.benh = benh;
	}

	/**
	 * Gets the vi tri.
	 * 
	 * @return the vi tri
	 */
	public ViTri getViTri() {
		return viTri;
	}

	/**
	 * Sets the vi tri.
	 * 
	 * @param viTri
	 *            the new vi tri
	 */
	public void setViTri(ViTri viTri) {
		this.viTri = viTri;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "KhamBenh [nhanVien=" + nhanVien + ", benhNhan=" + benhNhan + ", benh=" + benh + ", viTri=" + viTri
				+ ", ngayKham=" + ngayKham + ", noiDungKham=" + noiDungKham + ", chiPhiKham=" + chiPhiKham + "]";
	}

}
