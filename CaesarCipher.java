/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptopgraphylearning;
import java.lang.StringBuilder;

/**
 *
 * @author Rebecca Dupuis
 */
public class CaesarCipher 
{    
    public CaesarCipher()
    {
    }
    
    public StringBuilder encrypt(String message, int key)
    {
        StringBuilder build = new StringBuilder();
        
        for(int i = 0; i < message.length(); i++)
        {
            char add = (char) (( (int)message.charAt(i) + key - 97) % 26 +97);
            build.append(add);
            
        }
        
        return build;
        
    }
    
    public StringBuilder decrypt(String message, int key)
    {
        
        StringBuilder build = new StringBuilder();
        
        for(int i = 0; i < message.length(); i++)
        {
            char add = (char) (( (int)message.charAt(i) - key - 97) % 26 +97);
            build.append(add);
            
        }
        
        return build;
        
    }
    
}
