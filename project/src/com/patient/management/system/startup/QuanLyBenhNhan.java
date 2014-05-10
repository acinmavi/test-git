package com.patient.management.system.startup;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.patient.management.system.dao.Db4oHelper;
import com.patient.management.system.entities.Benh;
import com.patient.management.system.entities.BenhNhan;
import com.patient.management.system.entities.NhanVien;
import com.patient.management.system.entities.NoiDieuTri;
import com.patient.management.system.entities.Thuoc;

public class QuanLyBenhNhan {
	static Scanner input = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("Chon :");
				System.out.println("1.Du lieu Thuoc");
				System.out.println("2.Du lieu benh nhan");
				System.out.println("3.Du lieu nhan vien");
				System.out.println("4.Du lieu noi dieu tri");
				System.out.println("5.Du lieu benh");
				System.out.println("0.Exit");

				String in = input.nextLine();
				if ("1".equalsIgnoreCase(in)) {
					duLieuThuoc();
				} else if ("2".equalsIgnoreCase(in)) {
					duLieuBenhNhan();
				} else if ("3".equalsIgnoreCase(in)) {
					duLieuNhanVien();
				} else if ("4".equalsIgnoreCase(in)) {
					duLieuNhanVien();
				} else if ("5".equalsIgnoreCase(in)) {
					duLieuNhanVien();
				} else if ("0".equalsIgnoreCase(in)) {
					System.out.println("Exiting....");
					System.exit(0);
				} else {
					System.out.println("Du lieu khong hop le.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void duLieuThuoc() {
		while (true) {
			System.out.println("==========Thuoc==========");
			System.out.println("1.Liet ke danh sach Thuoc");
			System.out.println("2.Them moi Thuoc");
			System.out.println("3.Xoa du lieu Thuoc");
			System.out.println("4.Exit");
			System.out.println("==========Thuoc==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<Thuoc> lsThuoc = (List<Thuoc>) Db4oHelper.selectAll(new Thuoc());
				System.out.println("Danh sach Thuoc:");
				for (int i = 0; i < lsThuoc.size(); i++) {
					System.out.println((i + 1) + "." + lsThuoc.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu Thuoc");
				System.out.println("Nhap ten Thuoc:");
				String tenThuoc = input.nextLine();
				System.out.println("Nhap gia Thuoc:");
				String giaThuoc = input.nextLine();
				Thuoc thuoc = new Thuoc();
				thuoc.setTenThuoc(tenThuoc);
				thuoc.setDonGia(new BigDecimal(giaThuoc));
				Db4oHelper.insert(thuoc);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<Thuoc> lsThuoc = (List<Thuoc>) Db4oHelper.selectAll(new Thuoc());
				System.out.println("Chon Thuoc can xoa:");
				for (int i = 0; i < lsThuoc.size(); i++) {
					System.out.println((i + 1) + "." + lsThuoc.get(i).getTenThuoc());
				}
				int Thuoc = 0;
				String temp = input.nextLine();
				try {
					Thuoc = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsThuoc.get(Thuoc - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}

	}

	public static void duLieuBenhNhan() throws Exception {
		while (true) {
			System.out.println("==========BenhNhan==========");
			System.out.println("1.Liet ke danh sach BenhNhan");
			System.out.println("2.Them moi BenhNhan");
			System.out.println("3.Xoa du lieu BenhNhan");
			System.out.println("4.Exit");
			System.out.println("==========BenhNhan==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<BenhNhan> lsBenhNhan = (List<BenhNhan>) Db4oHelper.selectAll(new BenhNhan());
				System.out.println("Danh sach BenhNhan:");
				for (int i = 0; i < lsBenhNhan.size(); i++) {
					System.out.println((i + 1) + "." + lsBenhNhan.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu BenhNhan");
				System.out.println("Nhap ho :");
				String ho = input.nextLine();
				System.out.println("Nhap ten :");
				String ten = input.nextLine();
				System.out.println("Nhap ngay sinh :");
				String ngaySinh = input.nextLine();
				System.out.println("Nhap gioi tinh(0-nu;1-nam) :");
				String gioiTinh = input.nextLine();
				System.out.println("Nhap dia chi :");
				String diaChi = input.nextLine();
				System.out.println("Nhap SDT :");
				String sdt = input.nextLine();

				BenhNhan benhNhan = new BenhNhan();
				benhNhan.setTen(ten);
				benhNhan.setHo(ho);
				benhNhan.setNgaySinh(sdf.parse(ngaySinh));
				benhNhan.setDiaChi(diaChi);
				benhNhan.setGioiTinh(Integer.parseInt(gioiTinh));
				benhNhan.setSoDienThoai(sdt);

				Db4oHelper.insert(benhNhan);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<BenhNhan> lsBenhNhan = (List<BenhNhan>) Db4oHelper.selectAll(new BenhNhan());
				System.out.println("Chon BenhNhan can xoa:");
				for (int i = 0; i < lsBenhNhan.size(); i++) {
					System.out.println((i + 1) + "." + lsBenhNhan.get(i).getTen());
				}
				int BenhNhan = 0;
				String temp = input.nextLine();
				try {
					BenhNhan = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsBenhNhan.get(BenhNhan - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}

	}

	public static void duLieuNhanVien() throws Exception {
		while (true) {
			System.out.println("==========NhanVien==========");
			System.out.println("1.Liet ke danh sach NhanVien");
			System.out.println("2.Them moi NhanVien");
			System.out.println("3.Xoa du lieu NhanVien");
			System.out.println("4.Exit");
			System.out.println("==========NhanVien==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<NhanVien> lsNhanVien = (List<NhanVien>) Db4oHelper.selectAll(new NhanVien());
				System.out.println("Danh sach NhanVien:");
				for (int i = 0; i < lsNhanVien.size(); i++) {
					System.out.println((i + 1) + "." + lsNhanVien.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu NhanVien");
				System.out.println("Nhap ho :");
				String ho = input.nextLine();
				System.out.println("Nhap ten :");
				String ten = input.nextLine();
				System.out.println("Nhap ngay sinh :");
				String ngaySinh = input.nextLine();
				System.out.println("Nhap gioi tinh(0-nu;1-nam) :");
				String gioiTinh = input.nextLine();
				System.out.println("Nhap dia chi :");
				String diaChi = input.nextLine();
				System.out.println("Nhap SDT :");
				String sdt = input.nextLine();

				System.out.println("Nhap khoa :");
				String khoa = input.nextLine();
				System.out.println("Nhap chuyen mon :");
				String chuyenMon = input.nextLine();
				System.out.println("Nhap chucVu :");
				String chucVu = input.nextLine();

				NhanVien nhanVien = new NhanVien();
				nhanVien.setTen(ten);
				nhanVien.setHo(ho);
				nhanVien.setNgaySinh(sdf.parse(ngaySinh));
				nhanVien.setDiaChi(diaChi);
				nhanVien.setGioiTinh(Integer.parseInt(gioiTinh));
				nhanVien.setSoDienThoai(sdt);
				nhanVien.setKhoa(khoa);
				nhanVien.setChuyenMon(chuyenMon);
				nhanVien.setChucVu(chucVu);

				Db4oHelper.insert(nhanVien);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<NhanVien> lsNhanVien = (List<NhanVien>) Db4oHelper.selectAll(new NhanVien());
				System.out.println("Chon NhanVien can xoa:");
				for (int i = 0; i < lsNhanVien.size(); i++) {
					System.out.println((i + 1) + "." + lsNhanVien.get(i).getTen());
				}
				int NhanVien = 0;
				String temp = input.nextLine();
				try {
					NhanVien = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsNhanVien.get(NhanVien - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}
	}

	public static void duLieuNoiDieuTri() {
		while (true) {
			System.out.println("==========NoiDieuTri==========");
			System.out.println("1.Liet ke danh sach NoiDieuTri");
			System.out.println("2.Them moi NoiDieuTri");
			System.out.println("3.Xoa du lieu NoiDieuTri");
			System.out.println("4.Exit");
			System.out.println("==========NoiDieuTri==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<NoiDieuTri> lsNoiDieuTri = (List<NoiDieuTri>) Db4oHelper.selectAll(new NoiDieuTri());
				System.out.println("Danh sach NoiDieuTri:");
				for (int i = 0; i < lsNoiDieuTri.size(); i++) {
					System.out.println((i + 1) + "." + lsNoiDieuTri.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu NoiDieuTri");
				System.out.println("Nhap ten :");
				String tenNoiDieuTri = input.nextLine();
				System.out.println("Nhap don gia :");
				String giaNoiDieuTri = input.nextLine();
				NoiDieuTri noiDieuTri = new NoiDieuTri();
				noiDieuTri.setTenNoiDieuTri(tenNoiDieuTri);
				noiDieuTri.setDonGia(giaNoiDieuTri);
				Db4oHelper.insert(noiDieuTri);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<NoiDieuTri> lsNoiDieuTri = (List<NoiDieuTri>) Db4oHelper.selectAll(new NoiDieuTri());
				System.out.println("Chon NoiDieuTri can xoa:");
				for (int i = 0; i < lsNoiDieuTri.size(); i++) {
					System.out.println((i + 1) + "." + lsNoiDieuTri.get(i).getTenNoiDieuTri());
				}
				int NoiDieuTri = 0;
				String temp = input.nextLine();
				try {
					NoiDieuTri = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsNoiDieuTri.get(NoiDieuTri - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}
	}

	public static void duLieuBenh() {
		while (true) {
			System.out.println("==========Benh==========");
			System.out.println("1.Liet ke danh sach Benh");
			System.out.println("2.Them moi Benh");
			System.out.println("3.Xoa du lieu Benh");
			System.out.println("4.Exit");
			System.out.println("==========Benh==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<Benh> lsBenh = (List<Benh>) Db4oHelper.selectAll(new Benh());
				System.out.println("Danh sach Benh:");
				for (int i = 0; i < lsBenh.size(); i++) {
					System.out.println((i + 1) + "." + lsBenh.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu Benh");
				System.out.println("Nhap ten Benh:");
				String tenBenh = input.nextLine();
				Benh benh = new Benh();
				benh.setTenBenh(tenBenh);
				Db4oHelper.insert(benh);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<Benh> lsBenh = (List<Benh>) Db4oHelper.selectAll(new Benh());
				System.out.println("Chon Benh can xoa:");
				for (int i = 0; i < lsBenh.size(); i++) {
					System.out.println((i + 1) + "." + lsBenh.get(i).getTenBenh());
				}
				int Benh = 0;
				String temp = input.nextLine();
				try {
					Benh = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsBenh.get(Benh - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}

	}

	//
	// public static void duLieuHuyen() {
	// while (true) {
	// System.out.println("==========HUYEN==========");
	// System.out.println("1.Liet ke danh sach huyen");
	// System.out.println("2.Them moi huyen");
	// System.out.println("3.Xoa du lieu huyen");
	// System.out.println("4.Exit");
	// System.out.println("==========HUYEN==========");
	// String chon = input.nextLine();
	// if ("1".equalsIgnoreCase(chon)) {
	// List<Huyen> lsHuyen = (List<Huyen>) Db4oHelper.selectAll(new Huyen());
	// System.out.println("Danh sach huyen:");
	// for (int i = 0; i < lsHuyen.size(); i++) {
	// System.out.println((i + 1) + "." + lsHuyen.get(i));
	// }
	// } else if ("2".equalsIgnoreCase(chon)) {
	// System.out.println("Nhap du lieu huyen");
	// System.out.println("Nhap ten huyen:");
	// String tenHuyen = input.nextLine();
	// Huyen huyen = new Huyen();
	// huyen.setTenHuyen(tenHuyen);
	// List<Thuoc> lsThuoc = (List<Thuoc>) Db4oHelper.selectAll(new Thuoc());
	// System.out.println("Huyen nay la thuoc Thuoc :");
	// for (int i = 0; i < lsThuoc.size(); i++) {
	// System.out.println((i + 1) + "." + lsThuoc.get(i).getTenThuoc());
	// }
	// int Thuoc = 0;
	// String temp = input.nextLine();
	// try {
	// Thuoc = Integer.parseInt(temp);
	// } catch (NumberFormatException e) {
	// System.out.println("Du lieu khong hop le.");
	// return;
	// }
	// huyen.setThuoc(lsThuoc.get(Thuoc - 1));
	// Db4oHelper.insert(huyen);
	// } else if ("3".equalsIgnoreCase(chon)) {
	// List<Huyen> lsHuyen = (List<Huyen>) Db4oHelper.selectAll(new Huyen());
	// System.out.println("Chon huyen can xoa:");
	// for (int i = 0; i < lsHuyen.size(); i++) {
	// System.out.println((i + 1) + "." + lsHuyen.get(i).getTenHuyen());
	// }
	// int huyen = 0;
	// String temp = input.nextLine();
	// try {
	// huyen = Integer.parseInt(temp);
	// } catch (NumberFormatException e) {
	// System.out.println("Du lieu khong hop le.");
	// break;
	// }
	// Db4oHelper.delete(lsHuyen.get(huyen - 1));
	// } else if ("4".equalsIgnoreCase(chon)) {
	// break;
	// } else {
	// System.out.println("Du lieu khong hop le");
	// }
	// }
	//
	// }
	//
	// public static void duLieuXa() {
	// while (true) {
	// System.out.println("==========XA==========");
	// System.out.println("1.Liet ke danh sach xa");
	// System.out.println("2.Them moi xa");
	// System.out.println("3.Xoa du lieu xa");
	// System.out.println("4.Exit");
	// System.out.println("==========XA==========");
	// String chon = input.nextLine();
	// if ("1".equalsIgnoreCase(chon)) {
	// List<Xa> lsXa = (List<Xa>) Db4oHelper.selectAll(new Xa());
	// System.out.println("Danh sach xa:");
	// for (int i = 0; i < lsXa.size(); i++) {
	// System.out.println((i + 1) + "." + lsXa.get(i));
	// }
	// } else if ("2".equalsIgnoreCase(chon)) {
	// System.out.println("Nhap du lieu xa");
	// System.out.println("Nhap ten xa:");
	// String tenXa = input.nextLine();
	// Xa xa = new Xa();
	// xa.setTenXa(tenXa);
	// List<Huyen> lsHuyen = (List<Huyen>) Db4oHelper.selectAll(new Huyen());
	// System.out.println("xa nay la thuoc huyen :");
	// for (int i = 0; i < lsHuyen.size(); i++) {
	// System.out.println((i + 1) + "." + lsHuyen.get(i).getTenHuyen());
	// }
	// int huyen = 0;
	// String temp = input.nextLine();
	// try {
	// huyen = Integer.parseInt(temp);
	// } catch (NumberFormatException e) {
	// System.out.println("Du lieu khong hop le.");
	// return;
	// }
	// xa.setHuyen(lsHuyen.get(huyen - 1));
	// Db4oHelper.insert(xa);
	// } else if ("3".equalsIgnoreCase(chon)) {
	// List<Xa> lsXa = (List<Xa>) Db4oHelper.selectAll(new Xa());
	// System.out.println("Chon xa can xoa:");
	// for (int i = 0; i < lsXa.size(); i++) {
	// System.out.println((i + 1) + "." + lsXa.get(i).getTenXa());
	// }
	// int xa = 0;
	// String temp = input.nextLine();
	// try {
	// xa = Integer.parseInt(temp);
	// } catch (NumberFormatException e) {
	// System.out.println("Du lieu khong hop le.");
	// break;
	// }
	// Db4oHelper.delete(lsXa.get(xa - 1));
	// } else if ("4".equalsIgnoreCase(chon)) {
	// break;
	// } else {
	// System.out.println("Du lieu khong hop le");
	// }
	// }
	//
	// }

}
