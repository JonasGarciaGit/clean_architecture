package br.com.example.school.infra.student;

import br.com.example.school.domain.student.PasswordEncryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptationImpl implements PasswordEncryption {
    @Override
    public String encryptPassword(String password) {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100,16).substring(1));
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException("Failed to encrypt password!");
        }
    }

    @Override
    public boolean authenticatePasswordEncrypted(String passwordEncrypted, String password) {
        return passwordEncrypted.equals(encryptPassword(password));
    }
}
