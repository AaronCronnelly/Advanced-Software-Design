package ie.atu.sw;

import java.security.*;
import javax.crypto.*;

public class RSACypher extends AbstractCypher{
	private KeyPair keyRing;
	
	public RSACypher() throws Throwable{
		super();
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA"); 
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		super.setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		// TODO Auto-generated method stub
		return super.encrypt(plainText, keyRing.getPublic());
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		// TODO Auto-generated method stub
		return super.encrypt(cypherText, keyRing.getPrivate());
	}
	
	
}