package com.programacion;

public class Main {

    public static void main(String[] args) {
        Pizza americana = new Pizza();
        americana.setMasa("fina");
        americana.setRelleno(true);
        americana.setTipo(1);
        americana.setSalsa(true);
        americana.setTipoSalsa("barbacoa");
        americana.setCebolla(false);
        americana.setSinGluten(false);
        americana.setExtraQueso(true);
        americana.setPiña(false);
        americana.setChampiñones(false);
        americana.setJamon(true);
        String mostrar = americana.toString();
        System.out.println(mostrar);

        Pizza especial = new Pizza();
        especial.setMasa("normal");
        especial.setRelleno(false);
        especial.setTipo(3);
        especial.setSalsa(false);
        especial.setCebolla(true);
        especial.setSinGluten(false);
        especial.setExtraQueso(true);
        especial.setPiña(false);
        especial.setChampiñones(true);
        especial.setJamon(true);
        String mostrar2 = especial.toString();
        System.out.println(mostrar2);


    }
}
