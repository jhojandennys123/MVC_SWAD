/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Producto {

    private Long id;

    private String nombre;

    private String descripcion;

    private double precioCompra;

    private double precioVenta;

    private Categoria categoria;

    private Proveedor proveedor;

    private EstadoProducto estado;

    private List<ImagenProducto> listaImagenes;

    public Producto() {
        categoria = new Categoria();
        proveedor = new Proveedor();
        estado = new EstadoProducto();
        listaImagenes = new ArrayList<>();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }

    public List<ImagenProducto> getListaImagenes() {
        return listaImagenes;
    }

    public void setListaImagenes(List<ImagenProducto> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

}
