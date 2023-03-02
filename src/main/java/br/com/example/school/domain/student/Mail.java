package br.com.example.school.domain.student;

//Este eh um VALUE OBJECT pois nao temos atributo de identificacao
public class Mail {
    private String address;

    public Mail(String address) {
//        if (address == null || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$"))
//            throw new IllegalArgumentException("Invalid mail.");

        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
