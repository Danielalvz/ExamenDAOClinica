package dao;

import model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements iDao<Odontologo>{
    private static final Logger logger= Logger.getLogger(OdontologoDAOH2.class);
    private static final String SQL_INSERT="INSERT INTO ODONTOLOGOS (MATRICULA, NOMBRE, APELLIDO) VALUES(?,?,?)";
    private static final String SQL_SELECT = "SELECT * FROM ODONTOLOGOS";
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        logger.info("inicando la operacion de guardado de ondotologo");
        Connection connection = null;
        try{
            connection= BD.getConnection();
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            psInsert.setString(1, odontologo.getMatrícula());
            psInsert.setString(2, odontologo.getNombre());
            psInsert.setString(3, odontologo.getApellido());
            psInsert.execute(); //CUANDO SE EJECUTE SE VAN A GENERAR ID
            ResultSet rs = psInsert.getGeneratedKeys();
            while (rs.next()){
                odontologo.setId(rs.getInt(1));
            }
            logger.info("Odontólogo guardado: " + odontologo);
        }catch (Exception e){
            logger.warn(e.getMessage());
            logger.error("Error al guardar el odontólogo", e);
        }
        return odontologo;
    }

    @Override
    public List<Odontologo> buscarTodos() {
        logger.info("inicando la operacion de buscar odontologos");
        Connection connection = null;
        List<Odontologo> odontologos = new ArrayList<>();
        Odontologo odontologo = null;

        try {
            connection= BD.getConnection();
            Statement statement= connection.createStatement();
            PreparedStatement psSelectt= connection.prepareStatement(SQL_SELECT);
            ResultSet rs = statement.executeQuery(SQL_SELECT);

            while (rs.next()) {
                odontologo= new Odontologo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                odontologos.add(odontologo);
            }
            logger.info("Lista de odontólogos obtenida: " + odontologos);

        } catch (Exception e) {
            logger.warn(e.getMessage());
            logger.error("Error al listar odontologos", e);
        }
        return odontologos;
    }

}
