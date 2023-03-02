package br.com.example.school.infra.student;

import br.com.example.school.domain.student.CellPhone;
import br.com.example.school.domain.student.Student;
import br.com.example.school.domain.student.StudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryJDBCImpl implements StudentRepository {

    private final Connection connection;

    //Principio da inversao de dependencia, Letra D do solid
    public StudentRepositoryJDBCImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void enroll(Student student) {
        try{
            String sql = "insert into student values(?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getDocument().getValue());
            ps.setString(2, student.getName());
            ps.setString(3, student.getMail().getAddress());
            ps.execute();

            sql = "insert into cellphone values(?, ?)";
            ps = connection.prepareStatement(sql);

            for (CellPhone cellphone :
                    student.getCellPhone()) {
                ps.setString(1, cellphone.getDdd());
                ps.setString(2, cellphone.getNumber());
                ps.execute();
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public Student findByDocument(String document) {
        return null;
        //implementar solucao aqui...
    }

    @Override
    public List<Student> listAllStudentsMatriculated() {
        return null;
        //implementar solucao aqui...
    }
}
