package com.app.service2.impl;

import com.app.Exception.BusinessException;
import com.app.service2.AppService;

public class AppServiceImpl implements AppService {

	@Override
	public boolean isValidPrimeNumber(int n) {
		// TODO Auto-generated method stub
		boolean b = false;
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;
	}

	@Override
	public boolean isValidMobileNumber(String mobile) {
		// TODO Auto-generated method stub
		boolean b=false;
		if(mobile!=null && mobile.matches("\\+1-[0-9]{10}")) {
			b=true;
		}else {
			throw new BusinessException("Entered mobilenumber "+mobile+" is Invalid");
		}
		return b;
	}
	

}
