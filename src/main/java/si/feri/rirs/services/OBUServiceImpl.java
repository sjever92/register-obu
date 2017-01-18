package si.feri.rirs.services;


import org.springframework.stereotype.Service;
import si.feri.rirs.util.DateConverter;
import si.um.feri.sua.registerobu.Oseba;
import si.um.feri.sua.registerobu.RegisterOBUService;
import si.um.feri.sua.registerobu.RegisterOBUService_Service;
import si.um.feri.sua.registerobu.Vozilo;
import java.util.*;

@Service
public class OBUServiceImpl implements OBUService {

    private RegisterOBUService registerOBUService;

    public OBUServiceImpl() {
        registerOBUService = new RegisterOBUService_Service().getRegisterOBUService();
    }

    @Override
    public Vozilo getCar(String id) {
        return registerOBUService.najdiVozilo(new Vozilo()).get(0);
    }

    @Override
    public List<Vozilo> listCars() {
        return registerOBUService.najdiVozilo(new Vozilo());
    }

    @Override
    public void addCar(String proizvajalec, String model, Integer leto, String gorivo, String vrsta, Integer steviloSedezev) {
        Vozilo vozilo = new Vozilo();
        vozilo.setProizvajalec(proizvajalec);
        vozilo.setModel(model);
        vozilo.setDatumVeljavnostiRegistracije(DateConverter.getCurrentDate());
        vozilo.setGorivo(gorivo);
        vozilo.setLetoProizvodnje(leto);
        vozilo.setSteviloSedezev(steviloSedezev);
        vozilo.setVrsta(vrsta);
        vozilo.setIdVozila(generateRandomID(proizvajalec, model));

        registerOBUService.dodajVozilo(vozilo, null, null, null);
    }

    @Override
    public void addPerson(String imeInPriimek, String emso, Integer davcna, Date datumRojstva) {
        Oseba oseba = new Oseba();
        oseba.setImeInPriimek(imeInPriimek);
        oseba.setEmso(emso);
        oseba.setDavcnaStevilka(davcna);
        oseba.setDatumRojstva(DateConverter.convert(datumRojstva));

        registerOBUService.dodajOsebo(oseba);
    }

    private String generateRandomID(String znamka, String model) {
        return (znamka + "-" + model + "-" + new Random().nextInt()).toUpperCase();
    }
}
