package com.app.service2;

import com.app.Exception.BusinessException;

public interface AppService {
	public boolean isValidPrimeNumber(int n);
	public boolean isValidMobileNumber(String mobile ) throws BusinessException;

}
