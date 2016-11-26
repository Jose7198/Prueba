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
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hospital h=new Hospital();
        Edificio e=new Edificio(h);
        Piso[] p=new Piso[3];
        for(int i=0;i<3;i++){
            p[i]=new Piso(e);
        }
        Medico[] m=new Medico[6];
        for(int i=0;i<6;i++){
            m[i]=new Medico(p[i/2]);
        }
        Paciente[] c=new Paciente[12];
        for(int i=0;i<12;i++){
            c[i]=new Paciente(m[i/2]);
        }
        m[0].Atender(c[0]);
        System.out.println(c[0].getDiagnostico());
        // TODO code application logic here
    }
    
}
