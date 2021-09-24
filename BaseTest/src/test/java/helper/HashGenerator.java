package helper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {

    public static String encrypt(String data) throws NoSuchAlgorithmException {
        String encryptString = null;
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(data.getBytes());
            byte[] bytes = m.digest();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            encryptString = sb.toString();
//        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return encryptString;
    }

}
