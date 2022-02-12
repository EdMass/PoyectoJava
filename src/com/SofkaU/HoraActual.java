package com.SofkaU;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HoraActual {

    static String darFechaHora(){
        LocalDateTime x = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss");
        return x.format(formato);
    }
}
