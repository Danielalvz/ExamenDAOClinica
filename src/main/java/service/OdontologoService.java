package service;

import dao.OdontologoDAOH2;
import dao.iDao;
import model.Odontologo;

import java.util.List;

public class OdontologoService {
    //relacion de asociacion directa con el DAO
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoiDao= new OdontologoDAOH2();
    }
    public Odontologo guardarOdontologo(Odontologo odontologo) {
        return odontologoiDao.guardar(odontologo);
    }
    public List<Odontologo> buscarTodos(){
        return odontologoiDao.buscarTodos();
    }
}
