package com.patient.management.system.startup;

import java.util.List;

import com.db4o.query.Predicate;
import com.patient.management.system.dao.Db4oHelper;
import com.patient.management.system.entities.Benh;
import com.patient.management.system.entities.ViTri;

public class StartUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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

		ViTri vitri1 = new ViTri();
		vitri1.setTenViTri("ViTriA");
		Db4oHelper.insert(vitri1);

		ViTri vitri2 = new ViTri();
		vitri2.setTenViTri("ViTriB");
		Db4oHelper.insert(vitri2);
		Db4oHelper.selectAll(new ViTri());

		List<ViTri> lsViTri = (List<ViTri>) Db4oHelper.selectByPredicate(new Predicate<ViTri>() {

			@Override
			public boolean match(ViTri compare) {
				return compare.getTenViTri().contains("B");
			}
		});
		for (ViTri viTri : lsViTri) {
			viTri.setTenViTri(viTri.getTenViTri() + "-Updated");
			Db4oHelper.update(viTri);
		}
		Db4oHelper.selectAll(new ViTri());

		for (ViTri viTri : lsViTri) {
			Db4oHelper.delete(viTri);
		}
		Db4oHelper.selectAll(new ViTri());

		Db4oHelper.closeDb();
	}
}
