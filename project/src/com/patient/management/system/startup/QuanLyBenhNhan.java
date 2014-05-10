package com.patient.management.system.startup;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.patient.management.system.dao.Db4oHelper;
import com.patient.management.system.entities.Benh;
import com.patient.management.system.entities.BenhAn;
import com.patient.management.system.entities.BenhNhan;
import com.patient.management.system.entities.DonThuoc;
import com.patient.management.system.entities.Nguoi;
import com.patient.management.system.entities.NhanVien;
import com.patient.management.system.entities.NoiDieuTri;
import com.patient.management.system.entities.PhieuKham;
import com.patient.management.system.entities.Thuoc;

public class QuanLyBenhNhan {
	static Scanner input = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
				System.out.println("6.Du lieu phieu kham");
				System.out.println("7.Du lieu don thuoc");
				System.out.println("8.Du lieu benh an");
				System.out.println("9.Khoi tao du lieu");
				System.out.println("10.Xoa tat ca du lieu");
				System.out.println("0.Exit");

				String in = input.nextLine();
				if ("1".equalsIgnoreCase(in)) {
					duLieuThuoc();
				} else if ("2".equalsIgnoreCase(in)) {
					duLieuBenhNhan();
				} else if ("3".equalsIgnoreCase(in)) {
					duLieuNhanVien();
				} else if ("4".equalsIgnoreCase(in)) {
					duLieuNoiDieuTri();
				} else if ("5".equalsIgnoreCase(in)) {
					duLieuBenh();
				} else if ("6".equalsIgnoreCase(in)) {
					duLieuPhieuKham();
				} else if ("7".equalsIgnoreCase(in)) {
					duLieuDonThuoc();
				} else if ("8".equalsIgnoreCase(in)) {
					duLieuBenhAn();
				} else if ("0".equalsIgnoreCase(in)) {
					System.out.println("Exiting....");
					System.exit(0);
				} else if ("9".equalsIgnoreCase(in)) {
					khoiTaoDuLieu();
				} else if ("10".equalsIgnoreCase(in)) {
					Db4oHelper.deleteDb();
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
				List<BenhNhan> lsBenhNhan2 = Db4oHelper.getDb().queryByExample(new Nguoi());
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

	public static void duLieuPhieuKham() throws ParseException {
		while (true) {
			System.out.println("==========PhieuKham==========");
			System.out.println("1.Liet ke danh sach PhieuKham");
			System.out.println("2.Them moi PhieuKham");
			System.out.println("3.Xoa du lieu PhieuKham");
			System.out.println("4.Exit");
			System.out.println("==========PhieuKham==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<PhieuKham> lsPhieuKham = (List<PhieuKham>) Db4oHelper.selectAll(new PhieuKham());
				System.out.println("Danh sach PhieuKham:");
				for (int i = 0; i < lsPhieuKham.size(); i++) {
					System.out.println((i + 1) + "." + lsPhieuKham.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu PhieuKham");
				System.out.println("Nhap ngay kham:");
				String ngayKham = input.nextLine();

				List<NhanVien> lsNhanVien = (List<NhanVien>) Db4oHelper.selectAll(new NhanVien());
				System.out.println("PhieuKham nay la cua NhanVien :");
				for (int i = 0; i < lsNhanVien.size(); i++) {
					System.out.println((i + 1) + "." + lsNhanVien.get(i).getTen());
				}
				int noNhanVien = 0;
				String temp = input.nextLine();
				try {
					noNhanVien = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				NhanVien nv = lsNhanVien.get(noNhanVien - 1);

				List<BenhNhan> lsBenhNhan = (List<BenhNhan>) Db4oHelper.selectAll(new BenhNhan());
				System.out.println("PhieuKham nay la cua BenhNhan :");
				for (int i = 0; i < lsBenhNhan.size(); i++) {
					System.out.println((i + 1) + "." + lsBenhNhan.get(i).getTen());
				}
				int noBenhNhan = 0;
				temp = input.nextLine();
				try {
					noBenhNhan = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				BenhNhan bn = lsBenhNhan.get(noBenhNhan - 1);

				System.out.println("Nhap vi tri kham:");
				String viTriKham = input.nextLine();
				System.out.println("Nhap noi dung kham:");
				String noiDungKham = input.nextLine();
				System.out.println("Nhap chi phi kham:");
				String chiPhi = input.nextLine();

				PhieuKham phieuKham = new PhieuKham();
				phieuKham.setNgayKham(sdf.parse(ngayKham));
				phieuKham.setNhanVien(nv);
				phieuKham.setBenhNhan(bn);
				phieuKham.setViTriKham(viTriKham);
				phieuKham.setNoiDungKham(noiDungKham);
				phieuKham.setChiPhiKham(new BigDecimal(chiPhi));

				Db4oHelper.insert(phieuKham);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<PhieuKham> lsPhieuKham = (List<PhieuKham>) Db4oHelper.selectAll(new PhieuKham());
				System.out.println("Chon PhieuKham can xoa:");
				for (int i = 0; i < lsPhieuKham.size(); i++) {
					System.out.println((i + 1) + "." + lsPhieuKham.get(i));
				}
				int PhieuKham = 0;
				String temp = input.nextLine();
				try {
					PhieuKham = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsPhieuKham.get(PhieuKham - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}

	}

	public static void duLieuDonThuoc() throws ParseException {
		while (true) {
			System.out.println("==========DonThuoc==========");
			System.out.println("1.Liet ke danh sach DonThuoc");
			System.out.println("2.Them moi DonThuoc");
			System.out.println("3.Xoa du lieu DonThuoc");
			System.out.println("4.Exit");
			System.out.println("==========DonThuoc==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<DonThuoc> lsDonThuoc = (List<DonThuoc>) Db4oHelper.selectAll(new DonThuoc());
				System.out.println("Danh sach DonThuoc:");
				for (int i = 0; i < lsDonThuoc.size(); i++) {
					System.out.println((i + 1) + "." + lsDonThuoc.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu DonThuoc");

				List<NhanVien> lsNhanVien = (List<NhanVien>) Db4oHelper.selectAll(new NhanVien());
				System.out.println("NhanVien :");
				for (int i = 0; i < lsNhanVien.size(); i++) {
					System.out.println((i + 1) + "." + lsNhanVien.get(i).getTen());
				}
				int noNhanVien = 0;
				String temp = input.nextLine();
				try {
					noNhanVien = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				NhanVien nv = lsNhanVien.get(noNhanVien - 1);

				List<BenhNhan> lsBenhNhan = (List<BenhNhan>) Db4oHelper.selectAll(new BenhNhan());
				System.out.println("BenhNhan :");
				for (int i = 0; i < lsBenhNhan.size(); i++) {
					System.out.println((i + 1) + "." + lsBenhNhan.get(i).getTen());
				}
				int noBenhNhan = 0;
				temp = input.nextLine();
				try {
					noBenhNhan = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				BenhNhan bn = lsBenhNhan.get(noBenhNhan - 1);

				List<Benh> lsBenh = (List<Benh>) Db4oHelper.selectAll(new Benh());
				System.out.println("Benh :");
				for (int i = 0; i < lsBenh.size(); i++) {
					System.out.println((i + 1) + "." + lsBenh.get(i).getTenBenh());
				}
				int noBenh = 0;
				temp = input.nextLine();
				try {
					noBenh = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				Benh benh = lsBenh.get(noBenh - 1);

				List<Thuoc> lsThuoc = (List<Thuoc>) Db4oHelper.selectAll(new Thuoc());
				System.out.println("Thuoc :");
				for (int i = 0; i < lsThuoc.size(); i++) {
					System.out.println((i + 1) + "." + lsThuoc.get(i).getTenThuoc());
				}
				int noThuoc = 0;
				temp = input.nextLine();
				try {
					noThuoc = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				Thuoc thuoc = lsThuoc.get(noThuoc - 1);

				List<PhieuKham> lsPhieuKham = (List<PhieuKham>) Db4oHelper.selectAll(new PhieuKham());
				System.out.println("DonPhieuKham nay la cua PhieuKham :");
				for (int i = 0; i < lsPhieuKham.size(); i++) {
					System.out.println((i + 1) + "." + lsPhieuKham.get(i));
				}
				int noPhieuKham = 0;
				temp = input.nextLine();
				try {
					noPhieuKham = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				PhieuKham PhieuKham = lsPhieuKham.get(noPhieuKham - 1);

				System.out.println("Nhap so luong thuoc:");
				String soLuong = input.nextLine();
				System.out.println("Nhap lieu dung:");
				String lieuDung = input.nextLine();

				DonThuoc donThuoc = new DonThuoc();
				donThuoc.setBenh(benh);
				donThuoc.setBenhNhan(bn);
				donThuoc.setKhamBenh(PhieuKham);
				donThuoc.setLieuDung(lieuDung);
				donThuoc.setNhanVien(nv);
				donThuoc.setSoLuong(Integer.parseInt(soLuong));
				donThuoc.setThuoc(thuoc);
				Db4oHelper.insert(donThuoc);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<DonThuoc> lsDonThuoc = (List<DonThuoc>) Db4oHelper.selectAll(new DonThuoc());
				System.out.println("Chon DonThuoc can xoa:");
				for (int i = 0; i < lsDonThuoc.size(); i++) {
					System.out.println((i + 1) + "." + lsDonThuoc.get(i));
				}
				int DonThuoc = 0;
				String temp = input.nextLine();
				try {
					DonThuoc = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsDonThuoc.get(DonThuoc - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}

	}

	public static void duLieuBenhAn() throws ParseException {
		while (true) {
			System.out.println("==========BenhAn==========");
			System.out.println("1.Liet ke danh sach BenhAn");
			System.out.println("2.Them moi BenhAn");
			System.out.println("3.Xoa du lieu BenhAn");
			System.out.println("4.Exit");
			System.out.println("==========BenhAn==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<BenhAn> lsBenhAn = (List<BenhAn>) Db4oHelper.selectAll(new BenhAn());
				System.out.println("Danh sach BenhAn:");
				for (int i = 0; i < lsBenhAn.size(); i++) {
					System.out.println((i + 1) + "." + lsBenhAn.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu BenhAn");

				List<DonThuoc> lsDonThuoc = (List<DonThuoc>) Db4oHelper.selectAll(new DonThuoc());
				System.out.println("DonThuoc :");
				for (int i = 0; i < lsDonThuoc.size(); i++) {
					System.out.println((i + 1) + "." + lsDonThuoc.get(i));
				}
				int noDonThuoc = 0;
				String temp = input.nextLine();
				try {
					noDonThuoc = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				DonThuoc donThuoc = lsDonThuoc.get(noDonThuoc - 1);

				List<NhanVien> lsNhanVien = (List<NhanVien>) Db4oHelper.selectAll(new NhanVien());
				System.out.println("NhanVien :");
				for (int i = 0; i < lsNhanVien.size(); i++) {
					System.out.println((i + 1) + "." + lsNhanVien.get(i).getTen());
				}
				int noNhanVien = 0;
				temp = input.nextLine();
				try {
					noNhanVien = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				NhanVien nv = lsNhanVien.get(noNhanVien - 1);

				List<BenhNhan> lsBenhNhan = (List<BenhNhan>) Db4oHelper.selectAll(new BenhNhan());
				System.out.println("BenhNhan :");
				for (int i = 0; i < lsBenhNhan.size(); i++) {
					System.out.println((i + 1) + "." + lsBenhNhan.get(i).getTen());
				}
				int noBenhNhan = 0;
				temp = input.nextLine();
				try {
					noBenhNhan = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				BenhNhan bn = lsBenhNhan.get(noBenhNhan - 1);

				List<Benh> lsBenh = (List<Benh>) Db4oHelper.selectAll(new Benh());
				System.out.println("Benh :");
				for (int i = 0; i < lsBenh.size(); i++) {
					System.out.println((i + 1) + "." + lsBenh.get(i).getTenBenh());
				}
				int noBenh = 0;
				temp = input.nextLine();
				try {
					noBenh = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				Benh benh = lsBenh.get(noBenh - 1);

				List<NoiDieuTri> lsNoiDieuTri = (List<NoiDieuTri>) Db4oHelper.selectAll(new NoiDieuTri());
				System.out.println("NoiDieuTri :");
				for (int i = 0; i < lsNoiDieuTri.size(); i++) {
					System.out.println((i + 1) + "." + lsNoiDieuTri.get(i).getTenNoiDieuTri());
				}
				int noNoiDieuTri = 0;
				temp = input.nextLine();
				try {
					noNoiDieuTri = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				NoiDieuTri noiDieuTri = lsNoiDieuTri.get(noNoiDieuTri - 1);

				System.out.println("Nhap ngay vao:");
				String ngayVao = input.nextLine();
				System.out.println("Nhap ngay ra:");
				String ngayRa = input.nextLine();
				System.out.println("Nhap tinh trang ra:");
				String tinhTrangRa = input.nextLine();

				BenhAn benhAn = new BenhAn();
				benhAn.setBenh(benh);
				benhAn.setBenhNhan(bn);
				benhAn.setDonThuoc(donThuoc);
				benhAn.setNgayRa(sdf.parse(ngayRa));
				benhAn.setNgayVao(sdf.parse(ngayVao));
				benhAn.setNhanVien(nv);
				benhAn.setNoiDieuTri(noiDieuTri);
				benhAn.setTinhTrangRa(tinhTrangRa);

				Db4oHelper.insert(benhAn);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<BenhAn> lsBenhAn = (List<BenhAn>) Db4oHelper.selectAll(new BenhAn());
				System.out.println("Chon BenhAn can xoa:");
				for (int i = 0; i < lsBenhAn.size(); i++) {
					System.out.println((i + 1) + "." + lsBenhAn.get(i));
				}
				int BenhAn = 0;
				String temp = input.nextLine();
				try {
					BenhAn = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsBenhAn.get(BenhAn - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}
	}

	public static void khoiTaoDuLieu() {
		try {
			char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
			for (char c : alphabet) {
				Thuoc thuoc = new Thuoc();
				thuoc.setTenThuoc("Thuoc " + String.valueOf(c).toUpperCase());
				thuoc.setDonGia(new BigDecimal(randInt(1000, 100000)));
				System.out.println("Khoi tao : " + thuoc);
				Db4oHelper.insert(thuoc);

				Benh benh = new Benh();
				benh.setTenBenh("Benh " + String.valueOf(c).toUpperCase());
				System.out.println("Khoi tao : " + benh);
				Db4oHelper.insert(benh);

				BenhNhan benhNhan = new BenhNhan();
				benhNhan.setDiaChi("Dia Chi " + String.valueOf(c).toUpperCase());
				benhNhan.setGioiTinh(randInt(0, 1));
				benhNhan.setHo("Nguyen Van");
				benhNhan.setTen(String.valueOf(c).toUpperCase());
				benhNhan.setNgaySinh(getRandomTimeBetweenTwoDates());
				benhNhan.setSoDienThoai(makeRandomPhoneNumber());
				System.out.println("Khoi tao : " + benhNhan);
				Db4oHelper.insert(benhNhan);

				NhanVien nhanVien = new NhanVien();
				nhanVien.setDiaChi("Dia Chi " + String.valueOf(c).toUpperCase());
				nhanVien.setGioiTinh(randInt(0, 1));
				nhanVien.setHo("Nguyen Van");
				nhanVien.setTen(String.valueOf(c).toUpperCase());
				nhanVien.setNgaySinh(getRandomTimeBetweenTwoDates());
				nhanVien.setSoDienThoai(makeRandomPhoneNumber());
				nhanVien.setKhoa("Khoa " + String.valueOf(c).toUpperCase());
				nhanVien.setChucVu("Chuc " + String.valueOf(c).toUpperCase());
				nhanVien.setChuyenMon("Chuyen Mon " + String.valueOf(c).toUpperCase());
				System.out.println("Khoi tao : " + nhanVien);
				Db4oHelper.insert(nhanVien);

				NoiDieuTri noiDieuTri = new NoiDieuTri();
				noiDieuTri.setTenNoiDieuTri("Noi Dieu Tri " + String.valueOf(c).toUpperCase());
				noiDieuTri.setDonGia(randInt(100000, 1000000) + "/ngay");
				System.out.println("Khoi tao : " + noiDieuTri);
				Db4oHelper.insert(noiDieuTri);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int randInt(int min, int max) {

		// Usually this should be a field rather than a method variable so
		// that it is not re-seeded every call.
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public static Date getRandomTimeBetweenTwoDates() {
		long beginTime = Timestamp.valueOf("1989-01-01 00:00:00").getTime();
		long endTime = Timestamp.valueOf("2013-12-31 00:58:00").getTime();
		long diff = endTime - beginTime + 1;
		return new Date(beginTime + (long) (Math.random() * diff));
	}

	public static String makeRandomPhoneNumber() {
		Random rand = new Random();
		int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		int num2 = rand.nextInt(743);
		int num3 = rand.nextInt(10000);

		DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		String phoneNumber = df3.format(num1) + "-" + df3.format(num2) + "-" + df4.format(num3);
		return phoneNumber;
	}
}
