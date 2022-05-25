package com.ty.user.keystore.service;

import com.ty.user.keystore.dao.keyStoreDao;
import com.ty.user.keystore.dto.KeyStore;

public class KeyStoreService {
	keyStoreDao keyStoreDao=new keyStoreDao();
	public int saveKey(KeyStore keyStore,int uid) {
		return keyStoreDao.saveKey(keyStore, uid);
	}
}
