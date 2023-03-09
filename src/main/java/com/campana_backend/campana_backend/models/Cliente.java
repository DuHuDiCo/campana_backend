
package com.campana_backend.campana_backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    
    private String nombre;
    
    private String cedula;
    
    private String sede;
    
    private String asesor_cartera;
    
    private String telefono_asesor;
    
    private float saldo_mora;
    
    private float saldo_total;
    
    private float valor_con_descuento;
    
    private float interese_mora;
    
    private float honorarios_abogado;
    
    private float porcentaje_descuento;

    public Cliente() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public float getSaldo_mora() {
        return saldo_mora;
    }

    public void setSaldo_mora(float saldo_mora) {
        this.saldo_mora = saldo_mora;
    }

    public float getSaldo_total() {
        return saldo_total;
    }

    public void setSaldo_total(float saldo_total) {
        this.saldo_total = saldo_total;
    }

    public float getValor_con_descuento() {
        return valor_con_descuento;
    }

    public void setValor_con_descuento(float valor_con_descuento) {
        this.valor_con_descuento = valor_con_descuento;
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

    public float getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(float porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }
    
    
    
    

}
