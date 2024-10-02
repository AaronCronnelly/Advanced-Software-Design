package ie.atu.sw;



public class CypherRunner {
	public static void main(String[] args) throws CypherException {
		CaesarCypher cc = new CaesarCypher();
		CypherKey ck=cc.new CaesarCypherKeyImpl();
		cc.setKey(ck);
	 	
		String s="Happy Days";
		String t = cc.encrypt(s);
		
		System.out.println(t);
		System.out.println(cc.decrypt(t));
		
		
	}
}
