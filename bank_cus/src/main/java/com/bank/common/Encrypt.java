package com.bank.common;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.util.encoders.Hex;

public class Encrypt {

	/**
	 * MD5方法
	 * 
	 * @param text 明文
	 * @param key  密钥
	 * @return 密文
	 */
	public static String md5(String text, String key) {
		String encodeStr = DigestUtils.md5Hex(text + key);
		return encodeStr;
	}

	/**
	 * MD5验证方法
	 * 
	 * @param text 明文
	 * @param key  密钥
	 * @param md5  密文
	 * @return true/false
	 * @throws Exception
	 */
	public static boolean verifyIgnoreCase(String text, String key, String md5) {
		String md5Text = md5(text, key);
		if (md5Text.equalsIgnoreCase(md5)) {
			return true;
		}
		return false;
	}

	/**
	 * MD5验证方法
	 * 
	 * @param text 明文
	 * @param key  密钥
	 * @param md5  密文
	 * @return true/false
	 * @throws Exception
	 */
	public static boolean verify(String text, String key, String md5) {
		String md5Text = md5(text, key);
		if (md5Text.equals(md5)) {
			return true;
		}
		return false;
	}

	// SHA3-224 算法
	public static String sha3224(byte[] bytes) {
		Digest digest = new SHA3Digest(224);
		digest.update(bytes, 0, bytes.length);
		byte[] rsData = new byte[digest.getDigestSize()];
		digest.doFinal(rsData, 0);
		return Hex.toHexString(rsData);
	}

	// SHA3-256 算法
	public static String sha3256(byte[] bytes) {
		Digest digest = new SHA3Digest(256);
		digest.update(bytes, 0, bytes.length);
		byte[] rsData = new byte[digest.getDigestSize()];
		digest.doFinal(rsData, 0);
		return Hex.toHexString(rsData);
	}

	// SHA3-384 算法
	public static String sha3384(byte[] bytes) {
		Digest digest = new SHA3Digest(384);
		digest.update(bytes, 0, bytes.length);
		byte[] rsData = new byte[digest.getDigestSize()];
		digest.doFinal(rsData, 0);
		return Hex.toHexString(rsData);
	}

	// SHA3-512 算法
	public static String sha3512(byte[] bytes) {
		Digest digest = new SHA3Digest(512);
		digest.update(bytes, 0, bytes.length);
		byte[] rsData = new byte[digest.getDigestSize()];
		digest.doFinal(rsData, 0);
		return Hex.toHexString(rsData);
	}
	
	/**
     * 获取密钥
     *
     * @return 密钥
     * @throws NoSuchAlgorithmException
     */
    public static byte[] initKey(String password) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128,new SecureRandom(password.getBytes())); //192,256
        SecretKey secretKey = keyGenerator.generateKey();
        return secretKey.getEncoded();
    }
 
    /**
     * AES加密
     *
     * @param data 要加密的数据
     * @param key  加密所使用的密钥
     * @return 加密后的数据
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(data);
    }
 
    /**
     * AES解密
     *
     * @param data 要解密的数据
     * @param key  解密所使用的密钥
     * @return 解密后的数据, 即源数据
     * @throws Exception
     */
    public static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return cipher.doFinal(data);
    }

    /**
     * 将二进制转换成16进制
     * 
     * @param buf
     * @return
     */
    public static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * 将16进制转换为二进制
     * 
     * @param hexStr
     * @return
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
    

}
