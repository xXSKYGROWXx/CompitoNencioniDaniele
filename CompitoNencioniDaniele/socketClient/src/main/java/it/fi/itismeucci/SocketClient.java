package main.java.it.fi.itismeucci;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class SocketClient {
    public Socket socket;
    public DataInputStream in;
    public DataOutputStream out;
    public Scanner keyboard = new Scanner(System.in);
    public String userString;
    public String serverString;

    public Socket connect() throws IOException
    {
        this.socket = new Socket(InetAddress.getLocalHost(), 3390);
        this.in = new DataInputStream(socket.getInputStream());
        this.out = new DataOutputStream(socket.getOutputStream());
        return socket;
    }
    
    public void firstSend() throws IOException
    {
        Messaggio messaggio = new Messaggio();
        out.writeBytes(Messaggio() + '\n');
        serverString = in.readLine();
        System.out.print("Risposta dal server: " + '\n' + serverString);
    }

    public void send() throws IOException
    {
        System.out.print("Inserisci la stringa da trasmettere al server" + '\n');
        this.userString = this.keyboard.next();
        out.writeBytes(userString + '\n');
        serverString = in.readLine();
        System.out.print("Risposta dal server: " + '\n' + serverString);
        socket.close();
    }
}
