/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptopgraphylearning;

/**
 *
 * @author Rebecca Dupuis
 */
public class CryptopgraphyLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String code = "z";
        
        int key = 1;
        
        CaesarCipher cipher = new CaesarCipher();
        StringBuilder encrypted = cipher.encrypt(code, key);
        StringBuilder decrypted = cipher.decrypt(encrypted.toString(), key);
        
        System.out.println(encrypted);
        System.out.println(decrypted);
        
    }
    
}
