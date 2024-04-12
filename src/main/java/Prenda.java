public class Prenda {

    private TipoPrenda tipoPrenda;
    private Categoria categoria;
    private Tela tela;

    private Color colorPrincipal;

    private String marca;

    public Prenda(TipoPrenda tipoPrenda, Categoria categoria, Tela tela, Color colorPrincipal) {

    if(tipoPrenda !=null && categoria != null && tela != null && colorPrincipal != null){
        this.tipoPrenda = tipoPrenda;
        this.categoria = categoria;
        this.tela = tela;
        this.colorPrincipal = colorPrincipal;
    }else{
        System.out.print("Completar tipoPrenda,categoria,tela y color principal para que sea una prenda valida!");

    }

    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
