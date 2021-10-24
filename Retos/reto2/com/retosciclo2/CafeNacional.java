package com.retosciclo2;

public class CafeNacional extends Cafe {
    // Constantes y Atributos
    private boolean TOSTADO = false;
    private boolean tostado;

    // Constructor
    public CafeNacional() {
        // Código
        this.peso = this.PESO_BASE;
        this.calidadC = this.CALIDAD_C_BASE;
        this.precioBase = this.PRECIO_BASE;
        this.tostado = this.TOSTADO;
        this.tipoCafe = "nacional";
    }

    public CafeNacional(Double precioBase, Integer peso) {
        this.peso = peso;
        this.calidadC = this.CALIDAD_C_BASE;
        this.precioBase = precioBase;
        this.tostado = this.TOSTADO;
        this.tipoCafe = "nacional";
    }

    public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado) {
        // Código
        this.peso = peso;
        this.calidadC = calidadC;
        this.precioBase = precioBase;
        this.tostado = tostado;
        this.tipoCafe = "nacional";
    }

    // Métodos
    public Double calcularPrecio() {
        // Código
        Double adicion = 0.0;
        adicion = super.calcularPrecio();
        if (this.tostado == true) {
            adicion += 50;
        }
        return adicion;
    }
}
