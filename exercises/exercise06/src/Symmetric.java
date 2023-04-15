import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.spec.GCMParameterSpec;

public class Symmetric {
    public static void main(String[] args) throws Exception{
        //Creating a KeyGenerator object
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");

        //Initializing the KeyGenerator
        keyGen.init(256);

        //Creating/Generating a key
        Key key = keyGen.generateKey();

        // Create a random initialization vector
        SecureRandom random = new SecureRandom();
        byte[] iv = new byte[12];
        random.nextBytes(iv);

        // Create an AES/GCM/NoPadding cipher for encryption
        Cipher encryptCipher = Cipher.getInstance("AES/GCM/NoPadding");
        encryptCipher.init(Cipher.ENCRYPT_MODE, key, new GCMParameterSpec(128, iv));

        // Alice send msg to Bob
        String OriginMsg = "Hi Bob this is Alice";
        byte[] encryptedMsg = encryptCipher.doFinal(OriginMsg.getBytes());
        System.out.println(Arrays.toString(encryptedMsg));

        // Create an AES/GCM/NoPadding cipher for decryption
        Cipher decryptCipher = Cipher.getInstance("AES/GCM/NoPadding");
        decryptCipher.init(Cipher.DECRYPT_MODE, key, new GCMParameterSpec(128, iv));

        // Bob received the encrypted message and decrypted it
        byte[] decryptedMsg = decryptCipher.doFinal(encryptedMsg);
        String decryptedText = new String(decryptedMsg);

        // Print the original and decrypted messages
        System.out.println("Original message: " + OriginMsg);
        System.out.println("Decrypted message: " + decryptedText);

    }
}
