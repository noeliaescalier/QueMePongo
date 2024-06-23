import com.google.common.collect.*;

import java.util.*;

public class MotorSugerenciasSegunTemperatura {

  private ServicioMeteorologico servicioMeteorologico;

  public List<Atuendo> generarSugerencias(Usuario usuario){
    Integer temperatura = servicioMeteorologico.obtenerCondicionesClimaticas();
    List<Prenda> superiores = usuario.guardarropa.getPrendas().stream().filter(prenda -> prenda.esAptaParaTemperatura(temperatura)).toList();
    List<Prenda> inferiores = usuario.guardarropa.getPrendas().stream().filter(prenda -> prenda.esAptaParaTemperatura(temperatura)).toList();
    List<Prenda> calzados = usuario.guardarropa.getPrendas().stream().filter(prenda -> prenda.esAptaParaTemperatura(temperatura)).toList();

    List<List<Prenda>> combinacionesDeSugerencia = Lists.cartesianProduct(superiores,inferiores,calzados);

    return combinacionesDeSugerencia.stream().map(combinacionSugerencia -> new Atuendo(combinacionSugerencia.get(0),combinacionSugerencia.get(1),combinacionSugerencia.get(2))).toList();
  }

}
