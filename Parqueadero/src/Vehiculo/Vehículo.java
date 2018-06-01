/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Estudiantes
 */
public class Vehículo implements Ivehículo
{
    private String placa;
    private String propietario;
    private float cilindraje; 
    
    Vehículo miVehículo = new Vehículo();

    @Override
    public String ingresarVehículo() {
        String dato;
        float cilindrajes;
        System.out.println("INGRESE LOS SIGUIENTES DATOS");
        dato = miVehículo.getPlaca();
        String datos = miVehículo.getPropietario();
        cilindrajes = miVehículo.getCilindraje();
        return placa;
    }

    @Override
    public String retirarVehículo() {
        System.out.println("EL VALOR A PAGAR ES");
        return "se ha demorado";
        
    }

    @Override
    public float consultarCupos() {
        return 253;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
