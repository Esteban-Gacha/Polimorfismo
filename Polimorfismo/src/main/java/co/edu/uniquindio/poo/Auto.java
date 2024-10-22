package co.edu.uniquindio.poo;

public class Auto extends Vehiculo {

    private int numeroPuertas;
    private int diasReserva;

    public Auto(String matricula, String marca, String modelo, int añoFabricacion, double tarifaBase,int numeroPuertas, int diasReserva){
        super(matricula, marca, modelo, añoFabricacion,tarifaBase);
        this.numeroPuertas=numeroPuertas;
        this.diasReserva=diasReserva;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getDiasReserva() {
        return diasReserva;
    }

    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }

    @Override
    public String toString() {
        return "Auto [numeroPuertas=" + numeroPuertas + ", diasReserva=" + diasReserva + "]";
    }
    

    
    
}
