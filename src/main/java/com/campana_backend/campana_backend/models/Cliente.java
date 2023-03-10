package com.campana_backend.campana_backend.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    private String numero_obligacion;

    private String cedula;

    private String cliente;

    
    private String fecha_credito;

    private String sede;

    private String asesor_cartera;

    private String telefono_asesor;

    private float interese_mora;

    private float honorarios_abogado;

    private float capital_mora;

    private float total_mora_pagar;

    private float total_capital;

    private float total_pagar;

    private float porcentaje_descuento;

    private boolean aplica_descuento_honorario;

    private float valor_descuento;
    
    private float minimo_pagar_amnistia;

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumero_obligacion() {
        return numero_obligacion;
    }

    public void setNumero_obligacion(String numero_obligacion) {
        this.numero_obligacion = numero_obligacion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha_credito() {
        return fecha_credito;
    }

    public void setFecha_credito(String fecha_credito) {
        this.fecha_credito = fecha_credito;
    }

    

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getAsesor_cartera() {
        return asesor_cartera;
    }

    public void setAsesor_cartera(String asesor_cartera) {
        this.asesor_cartera = asesor_cartera;
    }

    public String getTelefono_asesor() {
        return telefono_asesor;
    }

    public void setTelefono_asesor(String telefono_asesor) {
        this.telefono_asesor = telefono_asesor;
    }

    public float getInterese_mora() {
        return interese_mora;
    }

    public void setInterese_mora(float interese_mora) {
        this.interese_mora = interese_mora;
    }

    public float getHonorarios_abogado() {
        return honorarios_abogado;
    }

    public void setHonorarios_abogado(float honorarios_abogado) {
        this.honorarios_abogado = honorarios_abogado;
    }

    public float getCapital_mora() {
        return capital_mora;
    }

    public void setCapital_mora(float capital_mora) {
        this.capital_mora = capital_mora;
    }

    public float getTotal_mora_pagar() {
        return total_mora_pagar;
    }

    public void setTotal_mora_pagar(float total_mora_pagar) {
        this.total_mora_pagar = total_mora_pagar;
    }

    public float getTotal_capital() {
        return total_capital;
    }

    public void setTotal_capital(float total_capital) {
        this.total_capital = total_capital;
    }

    public float getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(float total_pagar) {
        this.total_pagar = total_pagar;
    }

    public float getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(float porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }

    public boolean isAplica_descuento_honorario() {
        return aplica_descuento_honorario;
    }

    public void setAplica_descuento_honorario(boolean aplica_descuento_honorario) {
        this.aplica_descuento_honorario = aplica_descuento_honorario;
    }

    public float getValor_descuento() {
        return valor_descuento;
    }

    public void setValor_descuento(float valor_descuento) {
        this.valor_descuento = valor_descuento;
    }

    public float getMinimo_pagar_amnistia() {
        return minimo_pagar_amnistia;
    }

    public void setMinimo_pagar_amnistia(float minimo_pagar_amnistia) {
        this.minimo_pagar_amnistia = minimo_pagar_amnistia;
    }
    
    
    
    
    


}
