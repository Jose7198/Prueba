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
public class Paciente extends Persona {
    private final Medico medico;
    private String diagnostico;
    public void setDiagnostico(String b){
        diagnostico=b;
    }
    public String getDiagnostico(){
        return diagnostico;
    }
    public Paciente(Medico medico1){
        medico=medico1;
    }
}
