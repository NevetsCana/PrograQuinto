/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naveespacial;

/**
 *
 * @author SERVER_PC
 */
public class Vehiculo {

    String nombre;
    String tipoCombustible;
    String marca;
    double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //alexander 
        if (nombre.endsWith("t")) {
            // steven
            this.nombre = "termina en t";
        } else {
            this.nombre = nombre;

        }
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
