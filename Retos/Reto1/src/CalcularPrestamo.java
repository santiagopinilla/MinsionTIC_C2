public class CalcularPrestamo {

    // Atributos
      private int pTiempo;
      private double pMonto;
      private double pInteres;
      private double diferencia;
  
    // Constructores
      public CalcularPrestamo(int pTiempo, double pMonto, double pInteres) {
          this.pMonto = pMonto;
          this.pInteres = pInteres;
          this.pTiempo = pTiempo;
      }
  
      public CalcularPrestamo() {
          this.pMonto = 0;
          this.pInteres = 0;
          this.pTiempo = 0;
      }
  
    // Métodos
      public double calcularInteresSimple() {
          double interesSimple = 0;
          interesSimple = this.pMonto * (this.pInteres / 100) * this.pTiempo;
          return Math.round(interesSimple);
      }
  
      public double calcularInteresCompuesto() {
          double interesCompuesto = 0;
          interesCompuesto = this.pMonto * ((Math.pow((1 + (this.pInteres / 100)), this.pTiempo)) - 1);
          return Math.round(interesCompuesto);
      }
  
      public double compararPrestamo(int pTiempo, double pMonto, double pInteres) {
          this.pMonto = pMonto;
          this.pInteres = pInteres;
          this.pTiempo = pTiempo;
          this.diferencia = calcularInteresCompuesto() - calcularInteresSimple();
          return this.diferencia;
      }
  
      public double compararPrestamo() {
          this.diferencia = calcularInteresCompuesto() - calcularInteresSimple();
          return this.diferencia;
      }
  
      public static void main ( String[] args) {
          // Instanciación de clases y uso de métodos (solo para pruebas, no debe cargarse al evaluador)
          CalcularPrestamo resultadoInversion = new CalcularPrestamo();
  
          System.out.println(resultadoInversion.calcularInteresSimple());
          System.out.println(resultadoInversion.calcularInteresCompuesto());
          System.out.println(resultadoInversion.compararPrestamo(24,5000000,4.2));
          }
  
  
  }
  