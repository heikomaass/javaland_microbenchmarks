package de.heikomaass.javaland;

import java.util.List;

public class ZahlungsInfoDto {
    private List<String> zahlungsmittel;

    public List<String> getZahlungsmittel() {
        return zahlungsmittel;
    }

    public void setZahlungsmittel(List<String> zahlungsmittel) {
        this.zahlungsmittel = zahlungsmittel;
    }
}
