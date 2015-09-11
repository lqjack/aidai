package com.aidai.service.iml;

import frame.model.IUser;
import frame.service.IDatabaseService;
import framework.generic.dao.IbatisGenericDao;

public class DatabaseService implements IDatabaseService {
	private IbatisGenericDao sqlDao;
	
	public void setsqlDao(IbatisGenericDao sqlDao) {
		this.sqlDao = sqlDao;
	}
	
	public void unsetsqlDao(IbatisGenericDao sqlDao) {
		this.sqlDao = null;
	}

	public IUser getHero() {
		IUser user = null;
		try {
			user = (IUser) sqlDao.getRecord("hero.select", user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
