

public class Atuendo {

    private Prenda parteSuperior;
    private Prenda parteInferior;
    private Prenda calzado;

    public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calzado = calzado;
    }

    public Boolean esAptaParaTemperatura(Integer temperatura){
        return this.parteSuperior.esAptaParaTemperatura(temperatura) && this.parteInferior.esAptaParaTemperatura(temperatura)
            && this.calzado.esAptaParaTemperatura(temperatura);
    }
}
