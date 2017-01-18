package si.feri.rirs.services;

import si.um.feri.sua.registerobu.Vozilo;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Date;
import java.util.List;

public interface OBUService {

    Vozilo getCar(String id);

    List<Vozilo> listCars();

    void addCar(String proizvajalec, String model, Integer leto, String gorivo, String vrsta, Integer steviloSedezev);

    void addPerson(String imeInPriimek, String emso, Integer davcna, Date datumRojstva);
}
