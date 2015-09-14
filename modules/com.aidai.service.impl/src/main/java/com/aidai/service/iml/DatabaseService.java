package com.aidai.service.iml;

import framework.generic.dao.IbatisGenericDao;

public class DatabaseService {
	private IbatisGenericDao sqlDao;
	
	public void setsqlDao(IbatisGenericDao sqlDao) {
		this.sqlDao = sqlDao;
	}
	
	public void unsetsqlDao(IbatisGenericDao sqlDao) {
		this.sqlDao = null;
	}
}
