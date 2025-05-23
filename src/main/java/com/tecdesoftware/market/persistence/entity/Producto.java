package com.tecdesoftware.market.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table (name  = "productos")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private int idProducto;

    private Integer nombre;

    @Column(name = "id_categoria")
    private int idCategoria;

    @Column (name = "codigo_barras")
    private String codigoBarras;

    @Column (name = "precio_venta")
    private double precioVenta;

    @Column (name = "camtidad_stock")
    private int camtidadStock;

   private Boolean estado;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCamtidadStock() {
        return camtidadStock;
    }

    public void setCamtidadStock(int camtidadStock) {
        this.camtidadStock = camtidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
