/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import logic.Calculator2;

/**
 *
 * @author Estefa
 */
@WebService(serviceName = "wsCalc2")
public class wsCalc2 {

    /**
     * This is a sample web service operation
     */
    Calculator2 calc2 = new Calculator2();
    
    @WebMethod(operationName = "restar")
    public int restar(@WebParam(name = "a") int a, @WebParam(name = "b") int b ){
        return calc2.restar(a, b);
    }
    
     @WebMethod(operationName = "dividir")
    public int dividir(@WebParam(name = "a") int a, @WebParam(name = "b") int b ) {
        return calc2.dividir(a, b);
    }   
}
