public class Material {
   // ALGODON,POLIESTER,CUERO
    String nombreMaterial;

    Trama trama;

    public Material(String nombreMaterial, Trama trama) {
        if(trama == null){
            this.trama = Trama.LISA;
        }else{
            this.trama = trama;
        }
        this.nombreMaterial = nombreMaterial;

    }
}
