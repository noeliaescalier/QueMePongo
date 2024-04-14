public class Prenda {

    private TipoPrenda tipoPrenda;
    private Material material;

    private Color colorPrincipal;

    private Color colorSecundario;

    private String marca;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrincipal,Color colorSecundario) {

        if(tipoPrenda == null){
            throw new IllegalArgumentException("El tipo de prenda es obligatorio.");
        }

        if(material == null){
            throw new IllegalArgumentException("El material es obligatorio.");
        }

        if(colorPrincipal == null){
            throw new IllegalArgumentException("El color principal es obligatorio.");

        }


    }

}

