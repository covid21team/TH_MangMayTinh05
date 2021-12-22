/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCPClient3;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author PHU
 */
public class ThreadChat implements Runnable {

    private Scanner in = null;
    private Socket socket = null;
    public frmClient chat = null;
    ServerSocket server = null;
    private int randomInt;

    public ThreadChat() {
        try {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 9 + 7;
            randomInt = (int) randomDouble;
            server = new ServerSocket(randomInt);
            System.out.println("PORT: "+randomInt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Thread(this).start();
    }

    public void run() {
        try {
            chat.Hienthi_Port(randomInt+"");
            while(true){
                while((socket=server.accept())!=null){
                    this.in = new Scanner(this.socket.getInputStream());
                    String chuoi = in.nextLine().trim();
                    chat.Hienthi(chuoi+"\n");
                }
            }
        } catch (Exception e) {
                
        }finally{
            try{socket.close();}catch(Exception e){}
        }

    }

}
