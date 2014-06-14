package com.patient.management.system.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * * The Class BenhAn. Bệnh án
 * 
 * @author dung.nguyen.trung
 */
public class BenhAn {

	/** The kham benh. */
	private List<DonThuoc> donThuocs;

	/** The nhan vien. */
	private NhanVien nhanVien;

	/** The benh nhan. */
	private BenhNhan benhNhan;

	/** The benh. */
	private List<Benh> benhs;

	/** The noi dieu tri. */
	private List<NoiDieuTri> noiDieuTris;

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

	public List<DonThuoc> getDonThuocs() {
		return donThuocs;
	}

	public void setDonThuocs(List<DonThuoc> donThuocs) {
		this.donThuocs = donThuocs;
	}

	public void themDonThuoc(DonThuoc donThuoc) {
		if (donThuocs == null) {
			donThuocs = new ArrayList<DonThuoc>();
		}
		this.donThuocs.add(donThuoc);
	}

	public List<Benh> getBenhs() {
		return benhs;
	}

	public void setBenhs(List<Benh> benhs) {
		this.benhs = benhs;
	}

	public void themBenh(Benh benh) {
		if (benhs == null) {
			benhs = new ArrayList<Benh>();
		}
		this.benhs.add(benh);
	}

	public List<NoiDieuTri> getNoiDieuTris() {
		return noiDieuTris;
	}

	public void setNoiDieuTris(List<NoiDieuTri> noiDieuTris) {
		this.noiDieuTris = noiDieuTris;
	}

	public void themNoiDieuTri(NoiDieuTri noiDieuTri) {
		if (noiDieuTris == null) {
			noiDieuTris = new ArrayList<NoiDieuTri>();
		}
		this.noiDieuTris.add(noiDieuTri);
	}

	@Override
	public String toString() {
		return "BenhAn [donThuocs=" + donThuocs + ", nhanVien=" + nhanVien + ", benhNhan=" + benhNhan + ", benhs="
				+ benhs + ", noiDieuTris=" + noiDieuTris + ", ngayVao=" + ngayVao + ", ngayRa=" + ngayRa
				+ ", tinhTrangRa=" + tinhTrangRa + "]";
	}

}
