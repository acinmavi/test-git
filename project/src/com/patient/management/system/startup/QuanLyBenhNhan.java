package com.patient.management.system.startup;

import java.util.List;
import java.util.Scanner;

import com.db4o.query.Predicate;
import com.patient.management.system.dao.Db4oHelper;
import com.patient.management.system.entities.Benh;
import com.patient.management.system.entities.Huyen;
import com.patient.management.system.entities.Tinh;
import com.patient.management.system.entities.Xa;

public class QuanLyBenhNhan {
	static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while (true) {
			System.out.println("Chon :");
			System.out.println("1.Tinh");
			System.out.println("2.Huyen");
			System.out.println("3.Xa");
			System.out.println("4.Exit");

			String in = input.nextLine();
			if ("1".equalsIgnoreCase(in)) {
				duLieuTinh();
			} else if ("2".equalsIgnoreCase(in)) {
				duLieuHuyen();
			} else if ("3".equalsIgnoreCase(in)) {
				duLieuXa();
			} else if ("4".equalsIgnoreCase(in)) {
				System.out.println("Exiting....");
				System.exit(0);
			} else {
				System.out.println("Du lieu khong hop le.");
			}
		}
	}

	public static void duLieuTinh() {
		while (true) {
			System.out.println("==========TINH==========");
			System.out.println("1.Liet ke danh sach tinh");
			System.out.println("2.Them moi tinh");
			System.out.println("3.Xoa du lieu tinh");
			System.out.println("4.Exit");
			System.out.println("==========TINH==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<Tinh> lsTinh = (List<Tinh>) Db4oHelper.selectAll(new Tinh());
				System.out.println("Danh sach tinh:");
				for (int i = 0; i < lsTinh.size(); i++) {
					System.out.println((i + 1) + "." + lsTinh.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu tinh");
				System.out.println("Nhap ten tinh:");
				String tenTinh = input.nextLine();
				Tinh tinh = new Tinh();
				tinh.setTenTinh(tenTinh);
				Db4oHelper.insert(tinh);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<Tinh> lsTinh = (List<Tinh>) Db4oHelper.selectAll(new Tinh());
				System.out.println("Chon tinh can xoa:");
				for (int i = 0; i < lsTinh.size(); i++) {
					System.out.println((i + 1) + "." + lsTinh.get(i).getTenTinh());
				}
				int tinh = 0;
				String temp = input.nextLine();
				try {
					tinh = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsTinh.get(tinh - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}

	}

	public static void duLieuHuyen() {
		while (true) {
			System.out.println("==========HUYEN==========");
			System.out.println("1.Liet ke danh sach huyen");
			System.out.println("2.Them moi huyen");
			System.out.println("3.Xoa du lieu huyen");
			System.out.println("4.Exit");
			System.out.println("==========HUYEN==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<Huyen> lsHuyen = (List<Huyen>) Db4oHelper.selectAll(new Huyen());
				System.out.println("Danh sach huyen:");
				for (int i = 0; i < lsHuyen.size(); i++) {
					System.out.println((i + 1) + "." + lsHuyen.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu huyen");
				System.out.println("Nhap ten huyen:");
				String tenHuyen = input.nextLine();
				Huyen huyen = new Huyen();
				huyen.setTenHuyen(tenHuyen);
				List<Tinh> lsTinh = (List<Tinh>) Db4oHelper.selectAll(new Tinh());
				System.out.println("Huyen nay la thuoc tinh :");
				for (int i = 0; i < lsTinh.size(); i++) {
					System.out.println((i + 1) + "." + lsTinh.get(i).getTenTinh());
				}
				int tinh = 0;
				String temp = input.nextLine();
				try {
					tinh = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				huyen.setTinh(lsTinh.get(tinh - 1));
				Db4oHelper.insert(huyen);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<Huyen> lsHuyen = (List<Huyen>) Db4oHelper.selectAll(new Huyen());
				System.out.println("Chon huyen can xoa:");
				for (int i = 0; i < lsHuyen.size(); i++) {
					System.out.println((i + 1) + "." + lsHuyen.get(i).getTenHuyen());
				}
				int huyen = 0;
				String temp = input.nextLine();
				try {
					huyen = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsHuyen.get(huyen - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}

	}

	public static void duLieuXa() {
		while (true) {
			System.out.println("==========XA==========");
			System.out.println("1.Liet ke danh sach xa");
			System.out.println("2.Them moi xa");
			System.out.println("3.Xoa du lieu xa");
			System.out.println("4.Exit");
			System.out.println("==========XA==========");
			String chon = input.nextLine();
			if ("1".equalsIgnoreCase(chon)) {
				List<Xa> lsXa = (List<Xa>) Db4oHelper.selectAll(new Xa());
				System.out.println("Danh sach xa:");
				for (int i = 0; i < lsXa.size(); i++) {
					System.out.println((i + 1) + "." + lsXa.get(i));
				}
			} else if ("2".equalsIgnoreCase(chon)) {
				System.out.println("Nhap du lieu xa");
				System.out.println("Nhap ten xa:");
				String tenXa = input.nextLine();
				Xa xa = new Xa();
				xa.setTenXa(tenXa);
				List<Huyen> lsHuyen = (List<Huyen>) Db4oHelper.selectAll(new Huyen());
				System.out.println("xa nay la thuoc huyen :");
				for (int i = 0; i < lsHuyen.size(); i++) {
					System.out.println((i + 1) + "." + lsHuyen.get(i).getTenHuyen());
				}
				int huyen = 0;
				String temp = input.nextLine();
				try {
					huyen = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					return;
				}
				xa.setHuyen(lsHuyen.get(huyen - 1));
				Db4oHelper.insert(xa);
			} else if ("3".equalsIgnoreCase(chon)) {
				List<Xa> lsXa = (List<Xa>) Db4oHelper.selectAll(new Xa());
				System.out.println("Chon xa can xoa:");
				for (int i = 0; i < lsXa.size(); i++) {
					System.out.println((i + 1) + "." + lsXa.get(i).getTenXa());
				}
				int xa = 0;
				String temp = input.nextLine();
				try {
					xa = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("Du lieu khong hop le.");
					break;
				}
				Db4oHelper.delete(lsXa.get(xa - 1));
			} else if ("4".equalsIgnoreCase(chon)) {
				break;
			} else {
				System.out.println("Du lieu khong hop le");
			}
		}

	}

}
