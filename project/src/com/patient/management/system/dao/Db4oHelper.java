package com.patient.management.system.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.patient.management.system.entities.AbtractEntities;

public class Db4oHelper {
	public static final String DB4O_DB_PATH = "C:\\Users\\Admin15\\Desktop\\checking\\cao-hoc\\CSDLHDT\\project\\object-orient-database-homework\\project\\db\\db40.db";
	private static ObjectContainer db = null;

	public static void deleteDb() {
		try {
			new File(DB4O_DB_PATH).delete();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}

	public static ObjectContainer getDb() {
		if (db == null || db.ext().isClosed()) {
			db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB4O_DB_PATH);
		}
		return db;
	}

	public static void closeDb() {
		if (db != null && !db.ext().isClosed()) {
			db.close();
		}
	}

	public static boolean insert(AbtractEntities entity) {
		boolean isSuccess = true;
		try {
			getDb().store(entity);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
			System.out.println(e.toString());
		}
		if (isSuccess) {
			System.out.println("Inserted successfully :" + entity);
		}
		return isSuccess;
	}

	public static boolean update(AbtractEntities entity) {
		boolean isSuccess = true;
		try {
			getDb().store(entity);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
			System.out.println(e.toString());
		}
		if (isSuccess) {
			System.out.println("Updated successfully :" + entity);
		}
		return isSuccess;
	}

	public static List<AbtractEntities> selectAll(AbtractEntities type) {
		List<AbtractEntities> returnList = new ArrayList<AbtractEntities>();
		try {
			ObjectSet<AbtractEntities> result = getDb().queryByExample(type);
			returnList = new ArrayList<AbtractEntities>(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("get all data  :" + returnList);
		return returnList;
	}

	public static boolean delete(AbtractEntities entity) {
		boolean isSuccess = true;
		try {
			getDb().delete(entity);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
			System.out.println(e.toString());
		}
		if (isSuccess) {
			System.out.println("Deleted successfully :" + entity);
		}
		return isSuccess;
	}

	public static List<? extends AbtractEntities> selectByPredicate(Predicate<? extends AbtractEntities> predicate) {
		List<? extends AbtractEntities> returnList = new ArrayList<AbtractEntities>();
		try {
			returnList = new ArrayList<AbtractEntities>(getDb().query(predicate));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("get data by predicate  :" + returnList);
		return returnList;
	}
}
