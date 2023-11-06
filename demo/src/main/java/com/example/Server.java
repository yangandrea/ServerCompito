package com.example;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server extends Thread{
    ArrayList inse=new ArrayList<String>();
    String car;
    Socket s;
    public Server(Socket s){
        this.s = s;
    }
    public void run()
    {
        try {
        System.out.println("Server avviato");
        System.out.println("Un client si è connesso");
    
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        do {
            
        } while (car != "esci");
           
    } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println("Errore durante l'istanza del server !");
        System.exit(1);
    }
    }
}