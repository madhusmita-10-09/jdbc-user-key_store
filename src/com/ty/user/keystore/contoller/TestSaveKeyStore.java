package com.ty.user.keystore.contoller;

import com.ty.user.keystore.dto.KeyStore;
import com.ty.user.keystore.service.KeyStoreService;

public class TestSaveKeyStore {
	public static void main(String[] args) {
		KeyStore keyStore=new KeyStore();
		keyStore.setPid(1);
		keyStore.setKey("facebook");
		keyStore.setValue("fb@123");
		keyStore.setDescription("www.facebook.com");
		keyStore.setComment("This is my facebook password");
		
		KeyStoreService keyStoreService=new KeyStoreService();
		int res=keyStoreService.saveKey(keyStore, 1);
		if(res>0) 
			System.out.println("Key And Values saved");
			else
			System.out.println("Not Saved");
	}
}
