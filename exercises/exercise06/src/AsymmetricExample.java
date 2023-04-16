import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class AsymmetricExample {
    public static void main(String[] args) throws Exception {
        // Generate Alice's RSA key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair aliceKeyPair = keyGen.generateKeyPair();

        // Generate Bob's RSA key pair
        KeyPair bobKeyPair = keyGen.generateKeyPair();

        // Alice sends a message to Bob
        String message = "Hello Bob, this is Alice!";
        byte[] encryptedMessage = encrypt(message.getBytes(), bobKeyPair.getPublic());

        // Bob receives the encrypted message and decrypts it
        byte[] decryptedMessage = decrypt(encryptedMessage, bobKeyPair.getPrivate());
        System.out.println("Bob received message: " + new String(decryptedMessage));

    }

    // Encrypt a message using RSA public key
    public static byte[] encrypt(byte[] message, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(message);
    }

    // Decrypt a message using RSA private key
    public static byte[] decrypt(byte[] encryptedMessage, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(encryptedMessage);
    }
}