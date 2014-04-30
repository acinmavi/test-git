package com.patient.management.system.entities;

/**
 * * The Class ThuocDung.
 * thuốc dùng
 * @author dung.nguyen.trung
 */
public class DonThuoc{
	
	/** The kham benh. */
	private PhieuKham khamBenh;
	
	/** The nhan vien. */
	private NhanVien nhanVien;
	
	/** The benh nhan. */
	private BenhNhan benhNhan;
	
	/** The benh. */
	private Benh benh;
	
	/** The thuoc. */
	private Thuoc thuoc;
	
	/** The so luong. */
	private int soLuong;
	
	/** The lieu dung. */
	private String lieuDung;

	/**
	 * Gets the kham benh.
	 * 
	 * @return the kham benh
	 */
	public PhieuKham getKhamBenh() {
		return khamBenh;
	}

	/**
	 * Sets the kham benh.
	 * 
	 * @param khamBenh
	 *            the new kham benh
	 */
	public void setKhamBenh(PhieuKham khamBenh) {
		this.khamBenh = khamBenh;
	}

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
	 * Gets the thuoc.
	 * 
	 * @return the thuoc
	 */
	public Thuoc getThuoc() {
		return thuoc;
	}

	/**
	 * Sets the thuoc.
	 * 
	 * @param thuoc
	 *            the new thuoc
	 */
	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}

	/**
	 * Gets the so luong.
	 * 
	 * @return the so luong
	 */
	public int getSoLuong() {
		return soLuong;
	}

	/**
	 * Sets the so luong.
	 * 
	 * @param soLuong
	 *            the new so luong
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	/**
	 * Gets the lieu dung.
	 * 
	 * @return the lieu dung
	 */
	public String getLieuDung() {
		return lieuDung;
	}

	/**
	 * Sets the lieu dung.
	 * 
	 * @param lieuDung
	 *            the new lieu dung
	 */
	public void setLieuDung(String lieuDung) {
		this.lieuDung = lieuDung;
	}

	@Override
	public String toString() {
		return "DonThuoc [khamBenh=" + khamBenh + ", nhanVien=" + nhanVien
				+ ", benhNhan=" + benhNhan + ", benh=" + benh + ", thuoc="
				+ thuoc + ", soLuong=" + soLuong + ", lieuDung=" + lieuDung
				+ "]";
	}

	
}
