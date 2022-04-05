/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Alumno extends Persona {

    private int proyecto;
    private int examen;
    private int cotidiano;
    private String nivel;
    
public Alumno(){


}

    public Alumno(int proyecto, int examen, int cotidiano, String nivel, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.proyecto = proyecto;
        this.examen = examen;
        this.cotidiano = cotidiano;
        this.nivel = nivel;
    }

    


    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }

    public int getCotidiano() {
        return cotidiano;
    }

    public void setCotidiano(int cotidiano) {
        this.cotidiano = cotidiano;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

public void  imprimirDatos(){
JOptionPane.showMessageDialog(null,"El nombre del alumno es: "+getNombre()
+"\n La edad es: "+getEdad()
+"\n El genero es: "+getGenero()
+"\n La nota del proyecto es: "+proyecto
+"\n La nota del primer parcial es: "+examen
+"\n El cotidiano es: "+cotidiano 
+"\n El grado del alumno es: "+nivel);
}

 public static void main(String[] args){

  Alumno notas= new Alumno();
int limite,i;
double suma=0,promedio,promedioTotal=0;
limite= Integer.parseInt(JOptionPane.showInputDialog("Digite la canatidad de alumnos: "));

for (i=1; i<=limite; i++){
  notas.setNombre(JOptionPane.showInputDialog("Ingrese nombre del alumno: "));
  notas.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del estudainte: ")));
  notas.setGenero(JOptionPane.showInputDialog("Ingrese genero del alumno").charAt(0));
  notas.setProyecto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota del proyecto:")));
  notas.setExamen(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota del examen:")));
  notas.setCotidiano(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota del cotidiano")));
  notas.setNivel(JOptionPane.showInputDialog("Ingrese nivel del alumno:"));
  promedio=((notas.getProyecto()+notas.getExamen()+notas.getCotidiano())/3);
  suma+=promedio;
  promedioTotal=(suma/limite);
  notas.imprimirDatos();
  JOptionPane.showMessageDialog(null,"El promedio del alumno es: "+promedio);
  JOptionPane.showMessageDialog(null,"El promedio total es: "+promedioTotal);

}
}

}
 

