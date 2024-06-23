
import java.time.Duration;
import java.util.Map;
import java.time.LocalDateTime;
public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {

  private final AccuWeatherAPI api;
  private final Duration periodoValidez;
  private final String direccion;

  private LocalDateTime proximaExpiracion;


  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoValidez, String direccion) {
    this.api = api;
    this.periodoValidez = periodoValidez;
    this.direccion = direccion;
  }

    //TODO;
  /*
    public Map<String,Object> obtenerCondicionesClimaticas() {
      if(this.expiro()){
        proximaExpiracion = LocalDateTime.now().plus(this.periodoValidez);

      }

    }
*/
  private LocalDateTime proximaExpiracion() {
    return LocalDateTime.now().plus(this.periodoValidez);
  }

  private Boolean expiro(){
    return proximaExpiracion().isAfter(LocalDateTime.now());
  }

}
