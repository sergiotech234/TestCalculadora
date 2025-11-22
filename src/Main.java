public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
//Utilizamos la excepcion try para que aparezcan los erroes
        try{
            System.out.println("Resultado: " +calculadora.calcular(10,5,"Suma"));
            System.out.println("Resultado: " +calculadora.calcular(10,5,"Resta"));
            System.out.println("Resultado: " +calculadora.calcular(10,5,"prueba"));
        } catch (OperacionNoValidaException e) {
            System.out.println("Error: "+ e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
