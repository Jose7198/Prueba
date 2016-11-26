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
public class Medico extends Persona{
    private Piso piso;

    /**
     *
     * @param piso1
     */
    public Medico(Piso piso1){
        piso=piso1;
    }
    public void Atender(Paciente paciente){
        paciente.setDiagnostico("Atendido");
    }

    
}
