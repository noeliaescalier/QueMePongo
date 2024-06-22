import com.google.common.collect.*;

import java.util.List;
public class MotorSugerenciasSegunFormalidad implements MotorSugerencias {

  public List<Atuendo> generarSugerencias(List<Prenda> prendas, Integer edad){

    List<Prenda> prendasValidas = edad > 55 ? prendas.stream().filter(prenda -> !prenda.esInformal()).toList() : prendas;

    List<Prenda> superiores = prendasValidas.stream().filter(prenda -> prenda.esSuperior()).toList();
    List<Prenda> inferiores = prendasValidas.stream().filter(prenda -> prenda.esInferior()).toList();
    List<Prenda> calzados = prendasValidas.stream().filter(prenda -> prenda.esCalzado()).toList();

    List<List<Prenda>> combinacionesDeSugerencia = Lists.cartesianProduct(superiores,inferiores,calzados);

    return combinacionesDeSugerencia.stream().map(combinacionSugerencia -> new Atuendo(combinacionSugerencia.get(0),combinacionSugerencia.get(1),combinacionSugerencia.get(2))).toList();
  }

}
