package com.arkcloud.utils;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

/**
 * 
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
@Service
public class PasswordHelper {
	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	private String algorithmName = "md5";
	private int hashIterations = 2;

	public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

	public String encryptOperatorPassword(String password, String account) {

		String salt = randomNumberGenerator.nextBytes().toHex();
		String credentialSalt = salt + account;
		String newPassword = new SimpleHash(algorithmName, password, ByteSource.Util.bytes(credentialSalt),
				hashIterations).toHex();
		return newPassword;
	}
}
