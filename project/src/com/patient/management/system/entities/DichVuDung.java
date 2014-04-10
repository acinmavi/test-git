package com.patient.management.system.entities;

/**
 * * The Class DichVuDung.
 * dịch vụ dùng 
 * @author dung.nguyen.trung
 */
public class DichVuDung  extends AbtractEntities{
	
	/** The kham benh. */
	private KhamBenh khamBenh;
	
	/** The nhan vien. */
	private NhanVien nhanVien;
	
	/** The benh nhan. */
	private BenhNhan benhNhan;
	
	/** The benh. */
	private Benh benh;
	
	/** The vi tri. */
	private ViTri viTri;
	
	/** The noi dieu tri. */
	private NoiDieuTri noiDieuTri;
	
	/** The dich vu. */
	private DichVu dichVu;
	
	/** The lan dung. */
	private int lanDung;

	/**
	 * Gets the kham benh.
	 * 
	 * @return the kham benh
	 */
	public KhamBenh getKhamBenh() {
		return khamBenh;
	}

	/**
	 * Sets the kham benh.
	 * 
	 * @param khamBenh
	 *            the new kham benh
	 */
	public void setKhamBenh(KhamBenh khamBenh) {
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
	 * Gets the dich vu.
	 * 
	 * @return the dich vu
	 */
	public DichVu getDichVu() {
		return dichVu;
	}

	/**
	 * Sets the dich vu.
	 * 
	 * @param dichVu
	 *            the new dich vu
	 */
	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}

	/**
	 * Gets the lan dung.
	 * 
	 * @return the lan dung
	 */
	public int getLanDung() {
		return lanDung;
	}

	/**
	 * Sets the lan dung.
	 * 
	 * @param lanDung
	 *            the new lan dung
	 */
	public void setLanDung(int lanDung) {
		this.lanDung = lanDung;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DichVuDung [khamBenh=" + khamBenh + ", nhanVien=" + nhanVien + ", benhNhan=" + benhNhan + ", benh="
				+ benh + ", viTri=" + viTri + ", noiDieuTri=" + noiDieuTri + ", dichVu=" + dichVu + ", lanDung="
				+ lanDung + "]";
	}

}
