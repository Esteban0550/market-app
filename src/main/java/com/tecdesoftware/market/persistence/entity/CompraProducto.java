package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_producto")
public class CompraProducto {

    @Id
    @Column(name = "id_compra_producto") // Esto depende de cómo se llama la columna en tu DB
    private Integer id;

    private Integer cantidad;

    private Double total;

    private Boolean estado;

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total)  {
    }
}
