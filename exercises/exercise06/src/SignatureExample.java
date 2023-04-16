import java.security.*;

public class SignatureExample {

    public static void main(String[] args) throws Exception {

        // Generate key pairs for Alice
        KeyPair aliceKeyPair = generateRSAKeyPair();
        PrivateKey alicePrivateKey = aliceKeyPair.getPrivate();
        PublicKey alicePublicKey = aliceKeyPair.getPublic();

        // Alice signs a message with her private key
        String message = "Hello Bob!";
        byte[] signature = signMessage(message, alicePrivateKey);

        // Bob verifies the signature with Alice's public key
        boolean isVerified = verifySignature(message, signature, alicePublicKey);
        if (isVerified) {
            System.out.println("Signature is valid");
        } else {
            System.out.println("Signature is invalid");
        }
    }

    public static KeyPair generateRSAKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048); // key size of 2048 bits
        return keyPairGenerator.generateKeyPair();
    }

    public static byte[] signMessage(String message, PrivateKey privateKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(message.getBytes());
        return signature.sign();
    }

    public static boolean verifySignature(String message, byte[] signature, PublicKey publicKey) throws Exception {
        Signature sig = Signature.getInstance("SHA256withRSA");
        sig.initVerify(publicKey);
        sig.update(message.getBytes());
        return sig.verify(signature);
    }
}
