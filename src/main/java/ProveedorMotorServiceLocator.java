public class ProveedorMotorServiceLocator {

  static ProveedorMotorServiceLocator INSTANCE;
  MotorSugerencias motorSugerencia;
  static ProveedorMotorServiceLocator getInstance() {
    return ProveedorMotorServiceLocator.INSTANCE;
  }
  public MotorSugerencias getMotor(){
    return motorSugerencia;
  }

  public void setMotor(MotorSugerencias motorSugerencia) {
    this.motorSugerencia = motorSugerencia;
  }
}
