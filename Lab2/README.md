#README

##Lab 2
##By Aaron (G00403528)

###Encryption
We are taking a string, and encrypting it, we do this by having a encryption and decryption algoritms. The text is taken and encrypted, in this case we have a cypherType enum file that holds different cypher types 'AEX', 'DES', 'TRIPLEDE', 'RSA'. The cypher type is linked to the CypherFactory class in which we have a switch that has a different types in it. In the runner we then have the CypherType.AES, so in this case we are using a AES encryption type. We take in the String, print it out in a encrypted form, and then print out the decrypted form.


###CypherFactory Class
In the cypherFactory class we are creationg a  static instance of the construtor. When then have getInstance method where we return a the construtor. we then we have a getCypher method, within this we take the pass in teh cyphertype from the runner and use a switch statment to match the runner to the encryption type.
