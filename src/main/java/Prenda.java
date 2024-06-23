public class Prenda {

    private TipoPrenda tipoPrenda;
  
    private Material material;

    private Color colorPrincipal;

    private Color colorSecundario;

    private Trama trama;

    private TipoFormalidad tipoFormalidad;

    private Integer temperaturaMaxima;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrincipal, Color colorSecundario,Trama trama,TipoFormalidad tipoFormalidad,Integer temperaturaMaxima) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
        this.tipoFormalidad = tipoFormalidad;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Boolean esSuperior(){
        return this.tipoPrenda.getCategoria().equals(Categoria.PARTE_SUPERIOR);
    }
    public Boolean esInferior(){
        return this.tipoPrenda.getCategoria().equals(Categoria.PARTE_INFERIOR);
    }
    public Boolean esCalzado(){
        return this.tipoPrenda.getCategoria().equals(Categoria.CALZADO);
    }

    public Boolean esInformal(){
        return this.tipoFormalidad.equals(TipoFormalidad.INFORMAL);
    }

    public Boolean esAptaParaTemperatura(Integer temperatura){
        return temperatura < this.temperaturaMaxima;
    }




}

