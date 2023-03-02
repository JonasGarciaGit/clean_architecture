package br.com.example.school.domain.student;

public interface PasswordEncryption {
    String encryptPassword(String password);
    boolean authenticatePasswordEncrypted(String passwordEncrypted, String password);
}
