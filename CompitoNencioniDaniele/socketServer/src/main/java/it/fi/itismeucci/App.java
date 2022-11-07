package it.fi.itismeucci;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{
    public static void main( String[] args ) throws StreamReadException, IOException
    {
        //creazione biglietti
        Biglietto b1 = new Biglietto("palco-1a");
        Biglietto b2 = new Biglietto("palco-2a");
        Biglietto b3 = new Biglietto("palco-1b");
        Biglietto b4 = new Biglietto("tribuna-1a");
        Biglietto b5 = new Biglietto("tribuna-1b");

        //creazione arraylist
        ArrayList<Biglietto> biglietti = new ArrayList<>();

        //aggiunta biglietti
        biglietti.add(b1);
        biglietti.add(b2);
        biglietti.add(b3);
        biglietti.add(b4);
        biglietti.add(b5);

        //scrittura biglietti in messaggio
        Messaggio messaggio = new Messaggio();
        messaggio.setBiglietti(biglietti);

        //serializzazione
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(new Biglietto());

        SocketServer server = new SocketServer();
        server.listen();
        server.firstCommunicate();

        //deserializzazione
        Biglietto value
            = xmlMapper.readValue("<Biglietto><x>1</x><y>2</y></Biglietto>\n", Biglietto.class); 
    }
}
