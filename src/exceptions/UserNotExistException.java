/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author aluno
 */
public class UserNotExistException extends Exception{
    public UserNotExistException(){
        super("Erro: usuario nao existe");
    }
    
    public UserNotExistException(String s){
        super(s);
    }
}
