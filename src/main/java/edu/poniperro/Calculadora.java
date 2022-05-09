package edu.poniperro;

public class Calculadora implements ICalculadora{

    
    /** coge dos numeros y devuelve su suma
     * @param num1
     * @param num2
     * @return double
     */
    @Override
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    
    /** coge dos numeros y devuelve su resta
     * @param num1
     * @param num2
     * @return double
     */
    @Override
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    
    /** coge dos numeros y devuelve su multiplicación
     * @param num1
     * @param num2
     * @return double
     */
    @Override
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    
    /** coge dos numeros y devuelve s
     * @param num1
     * @param num2
     * @return double
     */
    @Override
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
