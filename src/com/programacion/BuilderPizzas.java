package com.programacion;

public class BuilderPizzas {

    Pizza  _pizza;

    /**
     * Metodo que devuelve el objeto terminado
     * @return
     */
    public Pizza build(){
        return _pizza;
    }

    /**
     * Constructor
     */
    public BuilderPizzas(){
        _pizza = new Pizza();
    }

    // metodos para la personalizacion de la pizza
    public BuilderPizzas setTipoMasa(String tipoMasa) {
        _pizza.setMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizzas setTipoSalsa(String tipoSalsa) {
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setExtraQueso(boolean extraQueso){
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    public BuilderPizzas setPiña(boolean piña){
        _pizza.setPiña(piña);
        return this;
    }

    public BuilderPizzas setChampiñones(boolean champiñones){
        _pizza.setChampiñones(champiñones);
        return this;
    }

    public BuilderPizzas setJamon(boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }

    @Override
    public String toString() {
        return "BuilderPizzas{" +
                "_pizza=" + _pizza +
                '}';
    }
}
