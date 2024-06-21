public class Prenda {

    private TipoPrenda tipoPrenda;
  
    private Material material;

    private Color colorPrincipal;

    private Color colorSecundario;

    private Trama trama;

    private TipoFormalidad tipoFormalidad;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrincipal, Color colorSecundario,Trama trama,TipoFormalidad tipoFormalidad) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
        this.tipoFormalidad = tipoFormalidad;
    }
}

