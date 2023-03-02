package br.com.example.school.domain.student;

//Parecido com o padrao builder
public class StudentFactory {
    private Student student;

    public StudentFactory withNameDocumentMail(String name, String document, String mail){
        this.student = new Student(new CPF(document), name, new Mail(mail));
        return this;
    }
    public StudentFactory withCellphone(String ddd, String number){
        this.student.addCellphone(new CellPhone(ddd, number));
        return this;
    }

    public Student create(){
        return this.student;
    }

    //exemplo do uso tipo builder
//    public static void main(String[] args) {
//        StudentFactory studentFactory = new StudentFactory();
//        Student student = studentFactory
//                .withNameDocumentMail("","","")
//                .withCellphone("", "")
//                .create();
//    }

}
