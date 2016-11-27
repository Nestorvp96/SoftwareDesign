package java.iteso.mx;

import java.net.*;
import java.util.*;

/**
 * Created by CesarAlejandro on 11/26/2016.
 */
public class Receiver implements Runnable { // Esta clase funciona mas como un view al recibir los mensajes de los diferentes clientes
    Socket Server;
    public ArrayList<String> OutBox;

    public Receiver(Socket X) {
        Server = X;
        OutBox = new ArrayList<String>();
    }

    public void run() {
        try {

            Scanner op = new Scanner(Server.getInputStream());
            while (true) {
                String strMsg = op.nextLine();
                System.out.println(strMsg);
                op.close();
            }

        } catch (Exception e) {

        }
    }
}