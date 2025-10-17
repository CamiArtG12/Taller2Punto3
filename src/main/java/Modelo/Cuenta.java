/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author CamiLaNekoUwU_Gamer
 */
public class Cuenta {
    private int numero;
    private String nombreDueno;
    private Fecha fechaApertura;
    private double saldo;

    public Cuenta(int numero, String nombreDueno, Fecha fechaApertura, double saldo) {
        this.numero = numero;
        this.nombreDueno = nombreDueno;
        this.fechaApertura = fechaApertura;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public Fecha getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Fecha fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void consignar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }
    
}
