package ie.atu.sw;

public class CaesarCypher implements Cypherable {
	private CypherKey key;

	public String encrypt(String plainText) throws CypherException {
		return new String(encrypt(plainText.getBytes()));
	}

	public byte[] encrypt(byte[] plainText) throws CypherException {
		return doCypher(plainText, false);
	}

	public String decrypt(String cypherText) throws CypherException {
		return new String(encrypt(cypherText.getBytes()));

	}

	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return doCypher(cypherText, false);
		
	}

	private byte[] doCypher(byte[] bytes, boolean cncrypt) throws CypherException {
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] -= Integer.parseInt(key.getKey());
			if (encrypt) {
				bytes[i] += Integer.parseInt(key.getKey());
			} else {
				bytes[i] -= Integer.parseInt(key.getKey());
			}
		}
		return bytes;
	}

	public CypherKey getKey() {
		return key;
	}

	public void setKey(CypherKey key) {
		this.key = key;
	}

	@SuppressWarnings("removal")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public class CaesarCypherKeyImpl implements CypherKey {
		private int key;

		@Override
		public void setKey(String key) throws CypherException {
			// CasarCypher this.key =7//Refers to teh container;s instance variable
			this.key = Integer.parseInt(key);// Refers to the inner class instance variable

		}

		@Override
		public String getKey() {
			// TODO Auto-generated method stub
			return "" + key;
		}
	}
}
