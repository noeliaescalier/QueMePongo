public class PrendaBorrador {
    private TipoPrenda tipoPrenda;
  
    private Material material;

    private Trama trama = Trama.LISA;

    private Color colorPrincipal;

    private Color colorSecundario;

    private TipoFormalidad tipoFormalidad;


    public void especificarTipo(TipoPrenda tipoPrenda){
        if(tipoPrenda == null){
            throw new IllegalArgumentException("El tipo de prenda no puede ser nulo.");
        }
    }

    public void especificarMaterial(Material material) {
        if(material == null){
            throw new IllegalArgumentException("El material no puede ser nulo.");
        }
    }

    public void especificarColorPrincipal(Color colorPrincipal){
        if(colorPrincipal == null){
            throw new IllegalArgumentException("El color principal no puede ser nulo.");
        }
    }

    public void especificarTrama(Trama trama) {
        if(trama == null) {
            trama =Trama.LISA;
        }else{
            this.trama = trama;
        }
    }
    public void especificarColorSecundario (Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public void especificarFormalidad(TipoFormalidad tipoFormalidad){
        this.tipoFormalidad = tipoFormalidad;
    }
    public Prenda crearPrenda() {
        if(tipoPrenda == null){
            throw new IllegalArgumentException("El tipo de prenda es obligatorio.");
        }

        if(material == null){
            throw new IllegalArgumentException("El material es obligatorio.");
        }

        if(colorPrincipal == null){
            throw new IllegalArgumentException("El color principal es obligatorio.");

        }
        return new Prenda(tipoPrenda,material,colorPrincipal,colorSecundario,trama,tipoFormalidad);
    }

}
