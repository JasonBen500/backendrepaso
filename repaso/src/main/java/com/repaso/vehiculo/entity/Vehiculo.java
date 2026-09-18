package com.repaso.vehiculo.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ENTIDAD ENTREGADA POR EL CATEDRATICO - NO MODIFICAR.
 * Mapea la tabla "vehiculo" de la base de datos repaso.
 */
@Entity
@Table(name = "vehiculo_10")
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VEHICULO_10")
    private Integer idVehiculo;

    @Column(name = "ESTADO_10")
    private Boolean estado;

    @Size(max = 10)
    @Column(name = "PLACA_10")
    private String placa;

    @Size(max = 50)
    @Column(name = "MARCA_10")
    private String marca;

    @Size(max = 50)
    @Column(name = "MODELO_10")
    private String modelo;

    @Size(max = 30)
    @Column(name = "COLOR_10")
    private String color;

    @Column(name = "PRECIO_DIA_10")
    private BigDecimal precioDia;

    public Vehiculo() {
    }

    public Vehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(BigDecimal precioDia) {
        this.precioDia = precioDia;
    }

    @Override
    public String toString() {
        return "com.repaso.vehiculo.entity.Vehiculo[ idVehiculo=" + idVehiculo + " ]";
    }

}
