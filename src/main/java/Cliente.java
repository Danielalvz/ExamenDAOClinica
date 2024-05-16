import dao.BD;
import model.Odontologo;
import service.OdontologoService;

public class Cliente {
     public static void main(String[] args) {
          BD.crearTablas();
          Odontologo od1 = new Odontologo("5454", "Armando", "Casas");
          OdontologoService odontologoService = new OdontologoService();
          odontologoService.guardarOdontologo(od1);

     }
}
