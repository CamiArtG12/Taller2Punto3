/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author CamiLaNekoUwU_Gamer
 */

import modelo.Cuenta;
import java.util.ArrayList;

/**
 * ArrayListCuentas - Vista (según tu UML)
 * Maneja la colección de cuentas
 * 
 * Atributos según UML:
 * - cuentas: ArrayList<Cuenta>
 * 
 * Métodos según UML:
 * + agregarCuenta(cuenta: Cuenta): void
 * + getCuentas(): ArrayList<Cuenta>
 * + buscarCuenta(numero: int): Cuenta
 */
public class ArrayListCuenta {
    // Atributo según tu UML
    private ArrayList<Cuenta> cuentas;
    
    /**
     * Constructor
     */
    public ArrayListCuenta() {
        this.cuentas = new ArrayList<>();
    }
    
    /**
     * Agrega una cuenta a la lista
     * Según UML: + agregarCuenta(cuenta: Cuenta): void
     */
    public void agregarCuenta(Cuenta cuenta) {
        // Verifica que no exista una cuenta con el mismo número
        if (buscarCuenta(cuenta.getNumeroCuenta()) != null) {
            System.out.println("✗ Ya existe una cuenta con ese número");
            return;
        }
        cuentas.add(cuenta);
    }
    
    /**
     * Obtiene todas las cuentas
     * Según UML: + getCuentas(): ArrayList<Cuenta>
     */
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    /**
     * Busca una cuenta por número
     * Según UML: + buscarCuenta(numero: int): Cuenta
     * Nota: Se recibe String en lugar de int para manejar números como "001"
     */
    public Cuenta buscarCuenta(String numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }
    
    /**
     * Sobrecarga: buscarCuenta con int (por si se necesita)
     */
    public Cuenta buscarCuenta(int numero) {
        return buscarCuenta(String.valueOf(numero));
    }
    
    /**
     * Muestra todas las cuentas registradas
     * Método adicional para facilitar la Vista
     */
    public void mostrarTodasLasCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("\n📋 No hay cuentas registradas");
            return;
        }
        
        System.out.println("\n╔═══════════════════════════════════════════╗");
        System.out.println("║     LISTADO DE CUENTAS DEL BANCO         ║");
        System.out.println("╚═══════════════════════════════════════════╝");
        
        for (int i = 0; i < cuentas.size(); i++) {
            Cuenta cuenta = cuentas.get(i);
            System.out.println("\n[Cuenta #" + (i + 1) + "]");
            cuenta.imprimirDatos();
        }
    }
    
    /**
     * Obtiene la cantidad de cuentas
     */
    public int getCantidadCuentas() {
        return cuentas.size();
    }
}