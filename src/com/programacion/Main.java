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

        Pizza clasica = new Pizza();
        String mostrar2 = clasica.toString();
        System.out.println(mostrar2);

        Pizza especial = new Pizza("integral", true, 3, false, "", true, false, true, false, true, true);
        String mostrar3 = especial.toString();
        System.out.println(mostrar3);


    }
}
