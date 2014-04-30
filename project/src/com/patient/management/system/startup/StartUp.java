package com.patient.management.system.startup;

import java.util.List;

import com.db4o.query.Predicate;
import com.db4o.query.Query;
import com.patient.management.system.dao.Db4oHelper;
import com.patient.management.system.entities.Benh;
import com.patient.management.system.entities.Thuoc;

public class StartUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testHelperClass();
	}
	
	public static void testObject(){
		Db4oHelper.deleteDb();
		Db4oHelper.closeDb();
	}
	
	
	public static void testHelperClass(){
		Db4oHelper.deleteDb();

		Benh benh1 = new Benh();
		benh1.setTenBenh("SIDA");
		Db4oHelper.insert(benh1);

		Benh benh2 = new Benh();
		benh2.setTenBenh("HIV");
		Db4oHelper.insert(benh2);

		Db4oHelper.selectAll(new Benh());

		List<Benh> lsBenh = (List<Benh>) Db4oHelper.selectByPredicate(new Predicate<Benh>() {

			@Override
			public boolean match(Benh compare) {
				return compare.getTenBenh().equalsIgnoreCase("SIDA");
			}
		});
		for (Benh benh : lsBenh) {
			benh.setTenBenh(benh.getTenBenh() + "-Updated");
			Db4oHelper.update(benh);
		}
		Db4oHelper.selectAll(new Benh());

		for (Benh benh : lsBenh) {
			Db4oHelper.delete(benh);
		}
		Db4oHelper.selectAll(new Benh());

		Benh benh3 = new Benh();
		benh3.setTenBenh("DEP");
		Db4oHelper.insert(benh3);
		Db4oHelper.selectAll(new Benh());
		Query query = Db4oHelper.getDb().query();
		query.constrain(Benh.class);
		query.descend("tenBenh").constrain("DEP");
		lsBenh = (List<Benh>) Db4oHelper.selectByQuery(query);
		for (Benh benh : lsBenh) {
			benh.setTenBenh(benh.getTenBenh() + "-Updated");
			Db4oHelper.update(benh);
		}
		Db4oHelper.selectAll(new Benh());

		System.out.println("===================================================");
		Thuoc Thuoc1 = new Thuoc();
		Thuoc1.setTenThuoc("ThuocA");
		Db4oHelper.insert(Thuoc1);

		Thuoc Thuoc2 = new Thuoc();
		Thuoc2.setTenThuoc("ThuocB");
		Db4oHelper.insert(Thuoc2);
		Db4oHelper.selectAll(new Thuoc());

		List<Thuoc> lsThuoc = (List<Thuoc>) Db4oHelper.selectByPredicate(new Predicate<Thuoc>() {

			@Override
			public boolean match(Thuoc compare) {
				return compare.getTenThuoc().contains("B");
			}
		});
		for (Thuoc Thuoc : lsThuoc) {
			Thuoc.setTenThuoc(Thuoc.getTenThuoc() + "-Updated");
			Db4oHelper.update(Thuoc);
		}
		Db4oHelper.selectAll(new Thuoc());

		for (Thuoc Thuoc : lsThuoc) {
			Db4oHelper.delete(Thuoc);
		}
		Db4oHelper.selectAll(new Thuoc());
		Thuoc Thuoc3 = new Thuoc();
		Thuoc3.setTenThuoc("ThuocC");
		Db4oHelper.insert(Thuoc3);
		Db4oHelper.selectAll(new Thuoc());

		query = Db4oHelper.getDb().query();
		query.constrain(Thuoc.class);
		query.descend("tenThuoc").orderDescending();
		lsThuoc = (List<Thuoc>) Db4oHelper.selectByQuery(query);
		for (Thuoc Thuoc : lsThuoc) {
			Thuoc.setTenThuoc(Thuoc.getTenThuoc() + "-Updated");
			Db4oHelper.update(Thuoc);
		}
		Db4oHelper.selectAll(new Thuoc());
		Db4oHelper.closeDb();
	}
}
