package com.patient.management.system.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.db4o.query.Query;
import com.db4o.query.QueryComparator;

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

	public static boolean insert(Object entity) {
		boolean isSuccess = true;
		try {
			getDb().store(entity);
			getDb().commit();
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
			System.out.println(e.toString());
		}
		if (isSuccess) {
			System.out.println("Them moi thanh cong :" + entity.getClass().getSimpleName() + ":" + entity);
		}
		return isSuccess;
	}

	public static boolean update(Object entity) {
		boolean isSuccess = true;
		try {
			getDb().store(entity);
			getDb().commit();
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
			System.out.println(e.toString());
		}
		if (isSuccess) {
			System.out.println("Cap nhat thanh cong :" + entity);
		}
		return isSuccess;
	}

	public static List<? extends Object> selectAll(Object type) {
		List<? extends Object> returnList = new ArrayList<Object>();
		try {
			ObjectSet<Object> result = getDb().queryByExample(type);
			returnList = new ArrayList<Object>(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
//		System.out.println("Lay tat ca du lieu voi tieu chi " + type + ": " + returnList);
		return returnList;
	}

	public static boolean delete(Object entity) {
		boolean isSuccess = true;
		try {
			getDb().delete(entity);
			getDb().commit();
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
			System.out.println(e.toString());
		}
		if (isSuccess) {
			System.out.println("Xoa thanh cong :" + entity);
		}
		return isSuccess;
	}

	public static List<? extends Object> selectByPredicate(Predicate<? extends Object> predicate) {
		List<? extends Object> returnList = new ArrayList<Object>();
		try {
			returnList = new ArrayList<Object>(getDb().query(predicate));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("Du lieu sau khi dung Predicate  :" + returnList);
		return returnList;
	}

	public static List<? extends Object> selectByPredicate(Predicate<? extends Object> predicate,
			QueryComparator queryComparator) {
		List<? extends Object> returnList = new ArrayList<Object>();
		try {
			returnList = new ArrayList<Object>(getDb().query(predicate, queryComparator));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("Du lieu sau khi dung Predicate  :" + returnList);
		return returnList;
	}

	public static List<? extends Object> selectByQuery(Query query) {
		List<? extends Object> returnList = new ArrayList<Object>();
		try {
			returnList = new ArrayList<Object>(query.execute());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("Du lieu sau khi dung Query :" + returnList);
		return returnList;
	}
}
