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
class Direccion {
    private String principal;
    private String secundaria;
    public String getPrincipal(){
        return principal;
    }
    public void setPrincipal(String principal){
        this.principal=principal;
    }
    public String getSecundaria(){
        return secundaria;
    }
    public void setSecundaria(String secundaria){
        this.secundaria=secundaria;
    }
    public Direccion(){
        principal=" ";
        secundaria=" ";
    }

    
}
