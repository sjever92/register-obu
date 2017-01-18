package si.feri.rirs.commands;


import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.Date;

public class AddCarCommand {

    @NotEmpty
    private String proizvajalec;

    @NotEmpty
    private String model;

    @NotEmpty
    @Size(min = 1970, max = 2017)
    private Integer leto;

    @NotEmpty
    private String gorivo;

    @NotEmpty
    private String vrsta;

    @NotEmpty
    @Size(min = 1)
    private Integer steviloSedezev;

    public String getProizvajalec() {
        return proizvajalec;
    }

    public void setProizvajalec(String proizvajalec) {
        this.proizvajalec = proizvajalec;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getLeto() {
        return leto;
    }

    public void setLeto(Integer leto) {
        this.leto = leto;
    }

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public Integer getSteviloSedezev() {
        return steviloSedezev;
    }

    public void setSteviloSedezev(Integer steviloSedezev) {
        this.steviloSedezev = steviloSedezev;
    }
}
