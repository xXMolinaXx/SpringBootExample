package com.molina.estudiantes;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ud_producto")
    private Integer idProducto;
    private String nombre;
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Column(name ="precio_ventas")
    private Double precioVentas;
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_categoria",insertable = false, updatable = false)
    private Categoria categoria;
    @OneToMany(mappedBy = "productos")
    private List<CompraProducto> compraProducto;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVentas() {
        return precioVentas;
    }

    public void setPrecioVentas(Double precioVentas) {
        this.precioVentas = precioVentas;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
