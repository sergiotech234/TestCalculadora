public class Calculadora {
    //Creamos un constructor en el cual utilizaremos una excepcion
    public double calcular(int a, int b, String operacion) throws OperacionNoValidaException {
        //Creamos un switch con las distintas opciones 
        switch (operacion) {
            case "Suma":
                return a + b;
            case "Resta":
                return a - b;
            case "Multiplicacion":
                    return a * b;
            case "Division":
                if (b == 0) {
                    throw  new ArithmeticException("No se puede dividir por 0");
                    }
                    return (double) a / b;
                default:
                        throw  new OperacionNoValidaException("Operación no valida " +operacion);
        }
    }
}
