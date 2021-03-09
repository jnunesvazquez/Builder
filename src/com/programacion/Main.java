package com.programacion;

public class Main {

    public static void main(String[] args) {
        /*Pizza americana = new Pizza();
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
        System.out.println(mostrar3);*/

        //Pizza base = new BuilderPizzas().build();
        //Pizza personalizada = new BuilderPizzas().setCebolla(true).setSalsa(true).build();
        Pizza especial = new BuilderPizzas()
                .setSalsa(true)
                .setTipoMasa("fina")
                .setRelleno(false)
                .setJamon(true)
                .setExtraQueso(true)
                .setTipoSalsa("carbonara")
                .setChampiñones(true)
                .setPiña(false)
                .setSinGluten(false)
                .setCebolla(true)
                .build();

        // aunque el toString no está definida, nos valen estas lineas para poner
        // un punto de ruptura y hacer debug
        // asi podemos ver los objetos creados
        System.out.println(especial.toString());
    }
}
