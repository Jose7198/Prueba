/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author JoseLuis
 */
public class Edificio {
    private Direccion direccion;
    private Hospital hospital;
    public Edificio(Hospital hospital1){
        hospital=hospital1;
        direccion=new Direccion();
    } 
}
