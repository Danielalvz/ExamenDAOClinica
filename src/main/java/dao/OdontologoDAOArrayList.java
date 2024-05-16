package dao;

import model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOArrayList implements iDao<Odontologo> {
    private static final Logger logger= Logger.getLogger(OdontologoDAOArrayList.class);
    private  List<Odontologo> listaOdontologos = new ArrayList<>();
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        listaOdontologos.add(odontologo);
        logger.info("Odontólogo guardado: " + odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> buscarTodos() {
        logger.info("Lista de odontólogos obtenida: " + listaOdontologos);
        return listaOdontologos;
    }
}
