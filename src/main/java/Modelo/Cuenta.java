/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * Clase que representa una cuenta bancaria genérica
 * Contiene los atributos y métodos comunes a todas las cuentas
 */
public class Cuenta {
    protected String numeroCuenta;
    protected String nombreDueno;
    protected double saldo;
    protected int diaApertura;
    protected int mesApertura;
    protected int anioApertura;
    
    /**
     * Constructor de la clase Cuenta
     */
    public Cuenta(String numeroCuenta, String nombreDueno, int diaApertura, 
                  int mesApertura, int anioApertura) {
        this.numeroCuenta = numeroCuenta;
        this.nombreDueno = nombreDueno;
        this.saldo = 0.0;
        this.diaApertura = diaApertura;
        this.mesApertura = mesApertura;
        this.anioApertura = anioApertura;
    }
    
    /**
     * Sobrecarga: Constructor con saldo inicial
     */
    public Cuenta(String numeroCuenta, String nombreDueno, double saldoInicial,
                  int diaApertura, int mesApertura, int anioApertura) {
        this(numeroCuenta, nombreDueno, diaApertura, mesApertura, anioApertura);
        this.saldo = saldoInicial;
    }
    
    /**
     * Método para realizar consignaciones
     */
    public void consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }
    
    /**
     * Método para realizar retiros
     */
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }
    
    /**
     * Obtiene el saldo actual
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Obtiene el número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    /**
     * Obtiene el nombre del dueño
     */
    public String getNombreDueno() {
        return nombreDueno;
    }
    
    /**
     * Imprime todos los datos de la cuenta
     */
    public void imprimirDatos() {
        System.out.println("════════════════════════════════");
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + nombreDueno);
        System.out.println("Saldo: $" + String.format("%.2f", saldo));
        System.out.println("Fecha Apertura: " + diaApertura + "/" + mesApertura + "/" + anioApertura);
    }
}
