/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import com.sun.istack.logging.Logger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import ws.WsCalc1;
import ws.WsCalc1_Service;
import ws.WsCalc2;
import ws.WsCalc2_Service;

/**
 *
 * @author Estefa
 */
public class WsCalcClient {

   
    String urlCalc1 = "http://localhost:8080/WsCalc1Server/wsCalc1";
    String urlCalc2 = "http://localhost:8080/WsCalc2Server/wsCalc2";
    
    WsCalc1 calc1 = null;
    WsCalc2 calc2 = null;
    
    WsCalc1_Service calc1serv = null;
    WsCalc2_Service calc2serv = null;
    
    public WsCalcClient(){
        try {
             calc1serv = new  WsCalc1_Service(new URL(urlCalc1));
             calc2serv = new  WsCalc2_Service(new URL(urlCalc2));
    
             calc1 = calc1serv.getWsCalc1Port();
             calc2 = calc2serv.getWsCalc2Port();
            
            
        } catch (MalformedURLException ex) {
             System.err.println("Caught MalformedURLException: " + ex.getMessage());
            //Logger.getLogger(WsCalcClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public int sumar(int a, int b){
    return calc1.sumar(a, b);
    }
    public int restar(int a, int b){
        return calc2.restar(a, b);
    }
    public int multiplicar(int a, int b){
        return calc1.multiplicar(a, b);
    }
    public int dividir(int a, int b){
        return calc2.dividir(a, b);
    }
    
    
    
    
    
  
}
