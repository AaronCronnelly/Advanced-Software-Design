package ie.atu.sw;

public class Runner {
	public static void main(String[] args) throws Throwable{
		CypherFactory cFactory = CypherFactory.getInstance();
		Cypherable cypher = cFactory.getCypher(CypherType.AES);
		
		
		
		byte[] s = cypher.encrypt(new String("Attack the castle wall at dawn!").getBytes("UTF-8"));
		System.out.println(new String(s));
		System.out.println(new String(cypher.decrypt(s)));
	}
}