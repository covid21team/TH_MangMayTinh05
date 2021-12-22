/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCPClient3;

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

}
public ThreadChat(){
    try{
       server = new ServerSocket(1234);
}catch(Exception e){
    e.printStackTrace();
}
new Thread(this).start();
    

}public void run(){
    try{
}catch(Exception e){

}

}
