package si.feri.rirs.util;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateConverter {

    public static XMLGregorianCalendar getCurrentDate() {
        return convert(new Date());
    }

    public static XMLGregorianCalendar convert(Date date) {
        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);

            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (DatatypeConfigurationException e) {
            return null;
        }
    }

    public static Date convert(String date) {
        return Date.from(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")).atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
