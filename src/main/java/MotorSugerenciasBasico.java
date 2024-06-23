import java.util.List;
import com.google.common.collect.Lists;
public class MotorSugerenciasBasico implements MotorSugerencias {

  public List<Atuendo> generarSugerencias(Usuario usuario) {
    List<Prenda> superiores = usuario.guardarropa.getPrendas().stream().filter(prenda -> prenda.esSuperior()).toList();
    List<Prenda> inferiores = usuario.guardarropa.getPrendas().stream().filter(prenda -> prenda.esInferior()).toList();
    List<Prenda> calzados = usuario.guardarropa.getPrendas().stream().filter(prenda -> prenda.esCalzado()).toList();
    List<List<Prenda>> combinacionesDeSugerencias = Lists.cartesianProduct(superiores,inferiores,calzados);
    return combinacionesDeSugerencias.stream().map(combinacionDeSugerencia -> new Atuendo(combinacionDeSugerencia.get(0),combinacionDeSugerencia.get(1),combinacionDeSugerencia.get(2))).toList();
  }
}
