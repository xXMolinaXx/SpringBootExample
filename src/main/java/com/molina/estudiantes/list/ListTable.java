package com.molina.estudiantes.list;
import jakarta.persistence.*;

@Entity
@Table(name = "listas")
public class ListTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idListas;
    private String nombreListas;
    private String descripcion;
//    @OneToMany(mappedBy = "listaIdListas")
//    private java.util.List<ElementosLista> elementosLista;

    public Integer getIdListas() {
        return idListas;
    }

    public void setIdListas(Integer idListas) {
        this.idListas = idListas;
    }

    public String getNombreListas() {
        return nombreListas;
    }

    public void setNombreListas(String nombreListas) {
        this.nombreListas = nombreListas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
