
import java.time.Duration;
import java.util.Map;
import java.time.LocalDateTime;
public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {

  private final AccuWeatherAPI api;
  private final Duration periodoValidez;
  private final String direccion;

  private LocalDateTime proximaExpiracion;
 //lo llamo condicionClimatica por si en el futuro tenga que guardar ademas de la temperatura algun otro dato
  private Integer condicionClimatica;


  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoValidez, String direccion) {
    this.api = api;
    this.periodoValidez = periodoValidez;
    this.direccion = direccion;
  }

    public Integer obtenerCondicionesClimaticas() {
      if(this.expiro()){
        condicionClimatica = consultarApiTemperatura(); ;
        proximaExpiracion = LocalDateTime.now().plus(this.periodoValidez);

      }
      return this.condicionClimatica;
    }


  private Boolean expiro(){
    return proximaExpiracion.isAfter(LocalDateTime.now());
  }

  public Integer consultarApiTemperatura(){
    Map<String, Object> respuestaClima = this.api.getWeather(this.direccion).get(0);
    Map<String, Object> temperatura = (Map<String, Object>) respuestaClima.get("Temperature");
    Integer valorDeTemperatura = (Integer) temperatura.get("Value");
    String unidadDeTemperatura = (String) temperatura.get("Unit");
    //TODO VER EL CALCULO CUANDO LA TEMPERATURA NO VENGA EN CELCIUS
    return  valorDeTemperatura;

  }

}
