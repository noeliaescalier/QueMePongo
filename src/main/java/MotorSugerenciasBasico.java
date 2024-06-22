import java.util.List;
import com.google.common.collect.Lists;
public class MotorSugerenciasBasico implements MotorSugerencias {

  public List<Atuendo> generarSugerencias(List<Prenda> prendas,Integer edad) {
    List<Prenda> superiores = prendas.stream().filter(prenda -> prenda.esSuperior()).toList();
    List<Prenda> inferiores = prendas.stream().filter(prenda -> prenda.esInferior()).toList();
    List<Prenda> calzados = prendas.stream().filter(prenda -> prenda.esCalzado()).toList();
    List<List<Prenda>> combinacionesDeSugerencias = Lists.cartesianProduct(superiores,inferiores,calzados);
    return combinacionesDeSugerencias.stream().map(combinacionDeSugerencia -> new Atuendo(combinacionDeSugerencia.get(0),combinacionDeSugerencia.get(1),combinacionDeSugerencia.get(2))).toList();
  }
}
