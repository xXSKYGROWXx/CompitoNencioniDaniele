package main.java.it.fi.itismeucci;

import java.io.*;
import java.net.*;

public class SocketServer {
    public ServerSocket server;
    public Socket client;
    public String recv;
    public String modifiedRecv;
    public BufferedReader in;
    public DataOutputStream out;

    public Socket listen() throws IOException
    {
        this.server = new ServerSocket(3390);
        this.client = server.accept();
        this.server.close();
        this.in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        this.out = new DataOutputStream(client.getOutputStream());
        return client;
    }

    public void firstCommunicate() throws IOException
    {
        this.recv = in.readLine();
        if(in.readLine() == "/exit"){
            this.client.close();
            this.socket.close();
        }
        System.out.print("Stringa ricevuta: " + this.recv);
        this.modifiedRecv = messaggio.setBiglietti(biglietti);
        out.writeBytes(this.modifiedRecv + '\n');
    }

    public void Communicate() throws IOException
    {
        this.recv = in.readLine();
        if(in.readLine() == "/exit"){
            this.client.close();
            this.socket.close();
        }
        if(in.readLine() != messaggio.setBiglietti(biglietti)){
            System.out.println("Biglietto venduto. Lista biglietti disponibili: ");
            out.writeBytes(messaggio.setBiglietti(biglietti) + "\n");
        }
        System.out.print("Biglietti acquistati: " + this.recv);
        this.modifiedRecv = messaggio.setBiglietti(biglietti) && messaggio.setBiglietti(biglietti) = messaggio.setBiglietti(biglietti) - in.readLine();
        out.writeBytes(this.modifiedRecv + '\n');
    }

}
