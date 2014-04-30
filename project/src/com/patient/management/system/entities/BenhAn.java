package com.patient.management.system.entities;

import java.util.Date;

/**
 * * The Class BenhAn.
 * Bệnh án
 * @author dung.nguyen.trung
 */
public class BenhAn{
	private abc.DonThuoc DonThuoc ;
	private abc.NhanVien NhanVien;
	private abc.BenhNhan BenhNhan;
	private abc.Benh Benh;
	private abc.NoiDieuTri NoiDieuTri;
	
	
	/** The kham benh. */
	private DonThuoc donThuoc;
	
	/** The nhan vien. */
	private NhanVien nhanVien;
	
	/** The benh nhan. */
	private BenhNhan benhNhan;
	
	/** The benh. */
	private Benh benh;
	
	/** The noi dieu tri. */
	private NoiDieuTri noiDieuTri;
	
	/** The ngay vao. */
	private Date ngayVao;
	
	/** The ngay ra. */
	private Date ngayRa;
	
	/** The tinh trang ra. */
	private String tinhTrangRa;

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
	 * Gets the noi dieu tri.
	 * 
	 * @return the noi dieu tri
	 */
	public NoiDieuTri getNoiDieuTri() {
		return noiDieuTri;
	}

	/**
	 * Sets the noi dieu tri.
	 * 
	 * @param noiDieuTri
	 *            the new noi dieu tri
	 */
	public void setNoiDieuTri(NoiDieuTri noiDieuTri) {
		this.noiDieuTri = noiDieuTri;
	}

	/**
	 * Gets the ngay vao.
	 * 
	 * @return the ngay vao
	 */
	public Date getNgayVao() {
		return ngayVao;
	}

	/**
	 * Sets the ngay vao.
	 * 
	 * @param ngayVao
	 *            the new ngay vao
	 */
	public void setNgayVao(Date ngayVao) {
		this.ngayVao = ngayVao;
	}

	/**
	 * Gets the ngay ra.
	 * 
	 * @return the ngay ra
	 */
	public Date getNgayRa() {
		return ngayRa;
	}

	/**
	 * Sets the ngay ra.
	 * 
	 * @param ngayRa
	 *            the new ngay ra
	 */
	public void setNgayRa(Date ngayRa) {
		this.ngayRa = ngayRa;
	}

	/**
	 * Gets the tinh trang ra.
	 * 
	 * @return the tinh trang ra
	 */
	public String getTinhTrangRa() {
		return tinhTrangRa;
	}

	/**
	 * Sets the tinh trang ra.
	 * 
	 * @param tinhTrangRa
	 *            the new tinh trang ra
	 */
	public void setTinhTrangRa(String tinhTrangRa) {
		this.tinhTrangRa = tinhTrangRa;
	}


	public DonThuoc getDonThuoc() {
		return donThuoc;
	}

	public void setDonThuoc(DonThuoc donThuoc) {
		this.donThuoc = donThuoc;
	}

	@Override
	public String toString() {
		return "BenhAn [donThuoc=" + donThuoc + ", nhanVien=" + nhanVien
				+ ", benhNhan=" + benhNhan + ", benh=" + benh + ", noiDieuTri="
				+ noiDieuTri + ", ngayVao=" + ngayVao + ", ngayRa=" + ngayRa
				+ ", tinhTrangRa=" + tinhTrangRa + "]";
	}

	

}
