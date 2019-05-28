package com.gm.provaliste;

import java.util.Calendar;
import java.util.Date;

public class DettaglioRecord
{

    public String Titolo;
    public String TitoloSecondario;

    public DettaglioRecord()
    {
         Titolo="";
         TitoloSecondario="";
    }
    public DettaglioRecord(String t,String ts)
    {
         Titolo=t;
         TitoloSecondario=ts;
    }
}