public class PrendaBorrador {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private Trama trama;


 public Prenda crearPrenda(){
     return new Prenda(tipoPrenda,material,colorPrincipal,colorSecundario,trama);

 }

}
