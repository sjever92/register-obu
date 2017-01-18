package si.feri.rirs.domain;

public class Car {

    private String id;
    private String znamka;
    private String model;
    private Integer letnik;
    private String gorivo;

    public Car(String id, String znamka, String model, Integer letnik, String gorivo) {
        this.id = id;
        this.znamka = znamka;
        this.model = model;
        this.letnik = letnik;
        this.gorivo = gorivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZnamka() {
        return znamka;
    }

    public void setZnamka(String znamka) {
        this.znamka = znamka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getLetnik() {
        return letnik;
    }

    public void setLetnik(Integer letnik) {
        this.letnik = letnik;
    }

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }
}
