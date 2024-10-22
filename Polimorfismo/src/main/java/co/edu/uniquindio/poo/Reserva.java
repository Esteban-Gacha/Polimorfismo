package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private double costoTotal;
    private LocalDate fechaDeReserva;
    private LocalTime hora;
    private int dias;
    private Cliente cliente;

    public Reserva(double costoTotal, LocalDate fechaDeReserva, LocalTime hora, int dias, Cliente cliente){
        this.costoTotal=costoTotal;
        this.fechaDeReserva=fechaDeReserva;
        this.hora=hora;
        this.dias=dias;
        this.cliente=cliente;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaDeReserva() {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(LocalDate fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva [costoTotal=" + costoTotal + ", fechaDeReserva=" + fechaDeReserva + ", hora=" + hora + ", dias="
                + dias + ", cliente=" + cliente + "]";
    }
    
    
    
}
