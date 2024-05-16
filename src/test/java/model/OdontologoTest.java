package model;

import dao.BD;
import dao.OdontologoDAOArrayList;
import dao.OdontologoDAOH2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoTest {

//    @Test
//    public void listarTodosLosOdontologosH2() {
//        OdontologoDAOArrayList odontologoDAO = new OdontologoDAOArrayList();
//        Odontologo od = new Odontologo("2156". "Armando", "Casas");
//
//        List<Odontologo> odontologos = OdontologoDAOArrayList.buscarTodos();
//        Assertions.assertNotNull(odontologos);
//    }
    @Test
    public void buscarTodos(){
        BD.crearTablas();
        OdontologoService odontologoService= new OdontologoService();
        Odontologo odontologo= odontologoService.buscarTodos();
        Assertions.assertTrue(odontologo != null);
    }

}