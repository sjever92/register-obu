package si.feri.rirs.commands;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

public class AddPersonCommand {

    @NotEmpty
    private String imeInPriimek;

    @NotEmpty
    private Integer davcnaStevilka;

    @NotEmpty
    private String emso;

    @NotEmpty
    private String datumRojstva;

    public String getImeInPriimek() {
        return imeInPriimek;
    }

    public void setImeInPriimek(String imeInPriimek) {
        this.imeInPriimek = imeInPriimek;
    }

    public Integer getDavcnaStevilka() {
        return davcnaStevilka;
    }

    public void setDavcnaStevilka(Integer davcnaStevilka) {
        this.davcnaStevilka = davcnaStevilka;
    }

    public String getEmso() {
        return emso;
    }

    public void setEmso(String emso) {
        this.emso = emso;
    }

    public String getDatumRojstva() {
        return datumRojstva;
    }

    public void setDatumRojstva(String datumRojstva) {
        this.datumRojstva = datumRojstva;
    }
}
